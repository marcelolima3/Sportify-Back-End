package com.Sportify.Service;

import com.Sportify.DAO.competition.CompetitionDAO;
import com.Sportify.DAO.competition.MatchEventDAO;
import com.Sportify.DAO.event.EventCategoryDAO;
import com.Sportify.DAO.subentities.AthleteDAO;
import com.Sportify.Entities.competition.Competition;
import com.Sportify.Entities.competition.MatchEvent;
import com.Sportify.Entities.event.Event;
import com.Sportify.Entities.event.EventCategory;
import com.Sportify.Entities.subentities.Athlete;
import com.Sportify.Entities.user.Subscription;
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
            //EventCategory ec = EventCategoryDAO.getEventCategoryByORMID(eventCategoryID);
            //event.setCategory(ec);
            m.events.add(event);

            for(Subscription s : m.subscriptions.toArray()){
                s.get_tracker().notificationHistory.add(event);
            }

            for(Athlete a : m.athletes.toArray()){
                for(Subscription sa : a.subscriptions.toArray()){
                    sa.get_tracker().notificationHistory.add(event);
                }
                for(Subscription st : a.getTeam().subscriptions.toArray()){
                    st.get_tracker().notificationHistory.add(event);
                }
            }

            MatchEventDAO.save(m);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }
}
