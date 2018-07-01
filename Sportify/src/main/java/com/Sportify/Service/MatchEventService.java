package com.Sportify.Service;

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
import com.Sportify.Entities.user.Subscription;
import com.Sportify.PubSub.Notifier;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MatchEventService {
    @Autowired private CompetitionDAO competitionDAO;
    @Autowired private MatchEventDAO matchEventDAO;
    @Autowired private AthleteDAO athleteDAO;
    @Autowired private SubscriptionDAO subscriptionDAO;

    public List<MatchEvent> getCompetitionMatches(int competitionID){
        try {
            Competition competition = competitionDAO.getCompetitionByORMID(competitionID);
            return Arrays.asList(competition.matchEvents.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public MatchEvent createMatch(int competitionID, MatchEvent match){
        try {
            Competition competition = competitionDAO.getCompetitionByORMID(competitionID);

            competition.matchEvents.add(match);
            competitionDAO.save(competition);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return match;
    }

    public void addAthleteToMatch(int matchID, Athlete athlete){
        try {
            MatchEvent m = matchEventDAO.getMatchEventByORMID(matchID);
            Athlete a = athleteDAO.getAthleteByORMID(athlete.getID());
            m.athletes.add(a);
            matchEventDAO.save(m);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    public void submitEvent(int matchID, Event event){
        try {
            MatchEvent m = MatchEventDAO.getMatchEventByORMID(matchID);
            EventCategory ec = EventCategoryDAO.getEventCategoryByORMID(event.getCategory().getID());
            event.setCategory(ec);
            m.events.add(event);
            Notifier notifier = new Notifier();

            for(Subscription s : m.subscriptions.toArray()){
                s.get_tracker().notificationHistory.add(event);
                List<Integer> list = subscriptionDAO.querySubscription("ID = "+ s.getID(), null);
                notifier.sendMessage(""+list.get(0), event.getTextFormat());
            }

            for(Athlete a : m.athletes.toArray()){
                for(Subscription sa : a.subscriptions.toArray()){
                    sa.get_tracker().notificationHistory.add(event);
                    List<Integer> list = subscriptionDAO.querySubscription("ID = "+ sa.getID(), null);
                    notifier.sendMessage(""+list.get(0), event.getTextFormat());
                }
                for(Subscription st : a.getTeam().subscriptions.toArray()){
                    st.get_tracker().notificationHistory.add(event);
                    List<Integer> list = subscriptionDAO.querySubscription("ID = "+ st.getID(), null);
                    notifier.sendMessage(""+list.get(0), event.getTextFormat());
                }
            }

            MatchEventDAO.save(m);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }
}
