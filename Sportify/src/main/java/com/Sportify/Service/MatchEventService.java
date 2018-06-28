package com.Sportify.Service;

import com.Sportify.DAO.competition.CompetitionDAO;
import com.Sportify.DAO.competition.MatchEventDAO;
import com.Sportify.DAO.subentities.AthleteDAO;
import com.Sportify.Entities.competition.Competition;
import com.Sportify.Entities.competition.MatchEvent;
import com.Sportify.Entities.subentities.Athlete;
import com.Sportify.Entities.subentities.SubscriptionEntity;
import org.orm.PersistentException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MatchEventService {

    public List<MatchEvent> getCompetitionMatches(int competitionID){
        try {
            Competition competition = CompetitionDAO.getCompetitionByORMID(competitionID);
            return Arrays.asList(competition.matchEvents.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public MatchEvent createMatch(int competitionID, MatchEvent match){
        try {
            Competition competition = CompetitionDAO.getCompetitionByORMID(competitionID);

            competition.matchEvents.add(match);
            CompetitionDAO.save(competition);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return match;
    }

    public void addAthleteToMatch(int matchID, Athlete athlete){
        try {
            MatchEvent m = MatchEventDAO.getMatchEventByORMID(matchID);
            Athlete a = AthleteDAO.getAthleteByORMID(athlete.getID());
            m.athletes.add(a);
            MatchEventDAO.save(m);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }
}
