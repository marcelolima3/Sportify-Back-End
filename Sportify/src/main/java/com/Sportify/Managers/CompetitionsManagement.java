package com.Sportify.Managers;

import com.Sportify.DAO.competition.CompetitionDAO;
import com.Sportify.DAO.competition.MatchEventDAO;
import com.Sportify.DAO.competition.ModalityDAO;
import com.Sportify.DAO.competition.SportDAO;
import com.Sportify.DAO.event.EventCategoryDAO;
import com.Sportify.DAO.event.EventDAO;
import com.Sportify.Entities.competition.Competition;
import com.Sportify.Entities.competition.MatchEvent;
import com.Sportify.Entities.competition.Modality;
import com.Sportify.Entities.competition.Sport;
import com.Sportify.Entities.event.Event;
import com.Sportify.Entities.event.EventCategory;
import com.Sportify.Entities.subentities.Athlete;
import com.Sportify.Entities.subentities.Team;
import com.Sportify.Entities.user.Subscription;
import org.orm.PersistentException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Repository
public class CompetitionsManagement {

    public CompetitionsManagement() { }

    public List<Sport> getAllSports(){
        try {
            return (List<Sport>)SportDAO.querySport(null, null);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public List<Modality> getSportModalities(int id){
        try {
            Sport s = SportDAO.getSportByORMID(id);
            return Arrays.asList(s.modalities.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public List<Competition> getModalityCompetitions(int id){
        try {
            Modality m = ModalityDAO.getModalityByORMID(id);
            return Arrays.asList(m.competitions.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public List<Team> getModalityTeams(int id){
        try {
            Modality m = ModalityDAO.getModalityByORMID(id);
            return Arrays.asList(m.teams.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public List<Athlete> getModalityAthletes(int id){
        List<Athlete> athletes = new ArrayList<>();
        try {
            Modality m = ModalityDAO.getModalityByORMID(id);
            for(Team t : m.teams.toArray()){
                athletes.addAll(Arrays.asList(t.athletes.toArray()));
            }
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return athletes;
    }

    public List<MatchEvent> getCompetitionMatchEvents(int id){
        try {
            Competition c = CompetitionDAO.getCompetitionByORMID(id);
            return Arrays.asList(c.matchEvents.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public List<EventCategory> getModalityEventCategories(int id){
        try {
            Modality m = ModalityDAO.getModalityByORMID(id);
            return Arrays.asList(m._eventCategories.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public void createCompetition(int modalityID, String name, String location, Date startDate, Date endDate, String description){
        try {
            Modality modality = ModalityDAO.getModalityByORMID(modalityID);

            Competition competition = new Competition();
            competition.setName(name);
            competition.setLocation(location);
            competition.setStartDate(startDate);
            competition.setEndDate(endDate);
            competition.setDescription(description);

            modality.competitions.add(competition);
            ModalityDAO.save(modality);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    public void removeCompetition(int competitionID){
        try{
            Competition competition = CompetitionDAO.getCompetitionByORMID(competitionID);
            competition.setActive(false);
            CompetitionDAO.save(competition);
        }
        catch (PersistentException e){
            e.printStackTrace();
        }
    }

    public void editCompetition(int competitionID, int modalityID, String name, String location, Date startDate, Date endDate, String description){
        try{
            Competition competition = CompetitionDAO.getCompetitionByORMID(competitionID);
            Modality modality = ModalityDAO.getModalityByORMID(modalityID);

            competition.setName(name);
            competition.setLocation(location);
            competition.setStartDate(startDate);
            competition.setEndDate(endDate);
            competition.setDescription(description);

            modality.competitions.add(competition);
            ModalityDAO.save(modality);
        }
        catch (PersistentException e){
            e.printStackTrace();
        }
    }

    public void createMatch(int competitionID, String description, Date startDate, Date endDate, String location){
        try {
            Competition competition = CompetitionDAO.getCompetitionByORMID(competitionID);

            MatchEvent matchEvent = new MatchEvent();
            matchEvent.setDescription(description);
            matchEvent.setLocation(location);
            matchEvent.setStartTime(startDate);
            matchEvent.setEndTime(endDate);
            matchEvent.setActive(true);

            competition.matchEvents.add(matchEvent);
            CompetitionDAO.save(competition);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    public void removeMatch(int matchID){
        try{
            MatchEvent matchEvent = MatchEventDAO.getMatchEventByORMID(matchID);
            matchEvent.setActive(false);
            MatchEventDAO.save(matchEvent);
        }
        catch (PersistentException e){
            e.printStackTrace();
        }
    }

    public void editMatch(int matchID, int competitionID, int modalityID, String name, String location, Date startDate, Date endDate, String description){
        try{
            MatchEvent matchEvent = MatchEventDAO.getMatchEventByORMID(matchID);
            Competition competition = CompetitionDAO.getCompetitionByORMID(competitionID);

            matchEvent.setDescription(description);
            matchEvent.setLocation(location);
            matchEvent.setStartTime(startDate);
            matchEvent.setEndTime(endDate);
            matchEvent.setActive(true);

            competition.matchEvents.add(matchEvent);
            CompetitionDAO.save(competition);
        }
        catch (PersistentException e){
            e.printStackTrace();
        }
    }

    public void submitEvent(int matchID, int eventCategoryID, String textFormat, String imageFormat, String videoFormat){
        try {
            MatchEvent m = MatchEventDAO.getMatchEventByORMID(matchID);
            EventCategory ec = EventCategoryDAO.getEventCategoryByORMID(eventCategoryID);
            Event e = new Event();
            e.setCategory(ec);
            e.setTextFormat(textFormat);
            e.setImageFormat(imageFormat);
            e.setVideoFormat(videoFormat);

            m.events.add(e);

            for(Subscription s : m.subscriptions.toArray()){
                s.get_tracker().notificationHistory.add(e);
            }

            MatchEventDAO.save(m);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }
}