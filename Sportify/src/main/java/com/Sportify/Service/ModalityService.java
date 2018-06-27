package com.Sportify.Service;


import com.Sportify.Entities.competition.Competition;
import com.Sportify.Entities.competition.MatchEvent;
import com.Sportify.Entities.competition.Modality;
import com.Sportify.Entities.event.EventCategory;
import com.Sportify.Entities.subentities.Athlete;
import com.Sportify.Entities.subentities.Team;
import com.Sportify.Managers.CompetitionsManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModalityService {
    @Autowired
    private CompetitionsManagement competitionsManagement;

    public List<Modality> getSportModalities(int id){
        return competitionsManagement.getSportModalities(id);
    }

    public List<Competition> getModalityCompetitions(int id){
        return competitionsManagement.getModalityCompetitions(id);
    }

    public List<Team> getModalityTeams(int id){
        return competitionsManagement.getModalityTeams(id);
    }

    public List<Athlete> getModalityAthletes(int id){
        return competitionsManagement.getModalityAthletes(id);
    }

    public List<MatchEvent> getCompetitionMatchEvents(int id){
        return competitionsManagement.getCompetitionMatchEvents(id);
    }

    public List<EventCategory> getModalityEventCategories(int id){
        return competitionsManagement.getModalityEventCategories(id);
    }
}
