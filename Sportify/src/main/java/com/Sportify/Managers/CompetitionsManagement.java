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

    public CompetitionsManagement() {
    }

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
            Modality m = ModalityDAO.getModalityByORMID(modalityID);
            Competition c = new Competition();
            c.setName(name);
            c.setLocation(location);
            c.setStartDate(startDate);
            c.setEndDate(endDate);
            c.setDescription(description);
            c.setActive(true);
            CompetitionDAO.save(c);
            m.competitions.add(c);
            ModalityDAO.save(m);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    public void createMatch(int competitionID, String description, Date startTime, Date endTime, String location){
        try {
            Competition c = CompetitionDAO.getCompetitionByORMID(competitionID);
            MatchEvent m = new MatchEvent();
            m.setDescription(description);
            m.setLocation(location);
            m.setStartTime(startTime);
            m.setEndTime(endTime);
            m.setActive(true);
            MatchEventDAO.save(m);
            c.matchEvents.add(m);
            CompetitionDAO.save(c);
        } catch (PersistentException e) {
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
            EventDAO.save(e);

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