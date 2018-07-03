package com.Sportify.Service;

import com.Sportify.DAO.EAClassDiagramPersistentManager;
import com.Sportify.DAO.competition.CompetitionDAO;
import com.Sportify.DAO.competition.MatchEventDAO;
import com.Sportify.DAO.event.EventCategoryDAO;
import com.Sportify.DAO.subentities.AthleteDAO;
import com.Sportify.DAO.user.SubscriptionDAO;
import com.Sportify.Entities.competition.Competition;
import com.Sportify.Entities.competition.MatchEvent;
import com.Sportify.Entities.event.Event;
import com.Sportify.Entities.event.EventCategory;
import com.Sportify.Entities.subentities.Athlete;
import com.Sportify.Entities.user.NotificationTracker;
import com.Sportify.Entities.user.Subscription;
import com.Sportify.PubSub.Notifier;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service
public class MatchEventService {
    @Autowired private CompetitionDAO competitionDAO;
    @Autowired private MatchEventDAO matchEventDAO;
    @Autowired private AthleteDAO athleteDAO;
    @Autowired private SubscriptionDAO subscriptionDAO;
    @Autowired private EventCategoryDAO eventCategoryDAO;

    public List<MatchEvent> getCompetitionMatches(int competitionID){
        try {
            Competition competition = competitionDAO.getCompetitionByORMID(competitionID);
            return Arrays.asList(competition.matchEvents.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public MatchEvent createMatch(int competitionID, MatchEvent match) throws PersistentException {
        try {
            Competition competition = competitionDAO.getCompetitionByORMID(competitionID);
            competition.matchEvents.add(match);
            competitionDAO.save(competition);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return match;
    }

    public void addAthleteToMatch(int matchID, Athlete athlete) throws PersistentException {
        try {
            MatchEvent m = matchEventDAO.getMatchEventByORMID(matchID);
            Athlete a = athleteDAO.getAthleteByORMID(athlete.getID());
            m.athletes.add(a);
            matchEventDAO.save(m);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    public void submitEvent(int matchID, Event event) throws PersistentException {
        try {
            MatchEvent m = matchEventDAO.getMatchEventByORMID(matchID);
            EventCategory ec = eventCategoryDAO.getEventCategoryByORMID(event.getCategory().getID());
            event.setCategory(ec);
            m.events.add(event);

            Notifier notifier = new Notifier();

            for(Subscription s : m.subscriptions.toArray()){
                sendNotification(s, event, notifier, ec, m);
            }

            for(Athlete a : m.athletes.toArray()){
                for(Subscription sa : a.subscriptions.toArray()){
                    sendNotification(sa, event, notifier, ec, m);
                }
                for(Subscription st : a.getTeam().subscriptions.toArray()){
                    sendNotification(st, event, notifier, ec, m);
                }
            }
            matchEventDAO.save(m);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    public void sendNotification(Subscription s, Event event, Notifier notifier, EventCategory ec, MatchEvent m) throws PersistentException {
        List<Integer> list = subscriptionDAO.querySubscription("ID = " + s.getID(), null);
        NotificationTracker nt = s.get_tracker();
        nt.notificationHistory.add(event);
        if(nt.getNotificationPolicy().equals("default")){
            notifier.sendMessage("" + list.get(0), ec.getName(), event.getTextFormat());
        }
        else if(event.getCategory().getName().equals("After Match") || event.getCategory().getName().equals("Results")){
            m.setActive(false);
            notifier.sendMessage("" + list.get(0), ec.getName(), m.getDescription()+ " is over! \nYou can now consult the notifications.");
        }
    }
}
