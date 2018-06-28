package com.Sportify.Controllers;


import com.Sportify.Entities.competition.Competition;
import com.Sportify.Entities.competition.MatchEvent;
import com.Sportify.Entities.competition.Modality;
import com.Sportify.Entities.event.Event;
import com.Sportify.Entities.event.EventCategory;
import com.Sportify.Entities.subentities.Athlete;
import com.Sportify.Entities.subentities.Team;
import com.Sportify.Service.ModalityService;
import com.Sportify.Views.JSONViews.competition.CompetitionView;
import com.Sportify.Views.JSONViews.competition.MatchEventView;
import com.Sportify.Views.JSONViews.competition.ModalityView;
import com.Sportify.Views.JSONViews.event.EventView;
import com.Sportify.Views.JSONViews.subentities.AthleteView;
import com.Sportify.Views.JSONViews.subentities.TeamView;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sports")
public class ModalityController {
    @Autowired
    private ModalityService modalityService;

    @JsonView(ModalityView.Public.class)
    @RequestMapping(value = "/{id}/modalities", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Modality> getSportModalities(@PathVariable("id") int id){
        return modalityService.getSportModalities(id);
    }

    @JsonView(CompetitionView.Public.class)
    @RequestMapping(value = "/{idS}/modalities/{idM}/competitions", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Competition> getModalityCompetitions(@PathVariable("idM") int id){
        return modalityService.getModalityCompetitions(id);
    }

    @JsonView(TeamView.Public.class)
    @RequestMapping(value = "/{idS}/modalities/{idM}/teams", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Team> getModalityTeams(@PathVariable("idM") int id){
        return modalityService.getModalityTeams(id);
    }

    @JsonView(AthleteView.Public.class)
    @RequestMapping(value = "/{idS}/modalities/{idM}/athletes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Athlete> getModalityAthletes(@PathVariable("idM") int id){
        return modalityService.getModalityAthletes(id);
    }

    @JsonView(MatchEventView.Public.class)
    @RequestMapping(value = "/{idS}/modalities/{idM}/competitions/{idC}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MatchEvent> getCompetitionMatchEvents(@PathVariable("idC") int id){
        return modalityService.getCompetitionMatchEvents(id);
    }

    @JsonView(EventView.Public.class)
    @RequestMapping(value = "/{idS}/modalities/{idM}/events", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EventCategory> getModalityEventCategories(@PathVariable("idM") int id){
        return modalityService.getModalityEventCategories(id);
    }
}
