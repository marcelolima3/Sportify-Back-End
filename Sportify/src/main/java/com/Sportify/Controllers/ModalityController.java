package com.Sportify.Controllers;


import com.Sportify.Entities.competition.Competition;
import com.Sportify.Entities.competition.MatchEvent;
import com.Sportify.Entities.competition.Modality;
import com.Sportify.Entities.event.EventCategory;
import com.Sportify.Entities.subentities.Athlete;
import com.Sportify.Entities.subentities.Team;
import com.Sportify.Service.ModalityService;
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

    @RequestMapping(value = "/{id}/modalities", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Modality> getSportModalities(@PathVariable("id") int id){
        return modalityService.getSportModalities(id);
    }

    @RequestMapping(value = "/{idS}/modalities/{idM}/competitions", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Competition> getModalityCompetitions(@PathVariable("idM") int id){
        return modalityService.getModalityCompetitions(id);
    }

    @RequestMapping(value = "/{idS}/modalities/{idM}/teams", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Team> getModalityTeams(@PathVariable("idM") int id){
        return modalityService.getModalityTeams(id);
    }

    @RequestMapping(value = "/{idS}/modalities/{idM}/athletes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Athlete> getModalityAthletes(@PathVariable("idM") int id){
        return modalityService.getModalityAthletes(id);
    }

    @RequestMapping(value = "/{idS}/modalities/{idM}/competitions/{idC}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MatchEvent> getCompetitionMatchEvents(@PathVariable("idC") int id){
        return modalityService.getCompetitionMatchEvents(id);
    }

    @RequestMapping(value = "/{idS}/modalities/{idM}/events", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EventCategory> getModalityEventCategories(@PathVariable("idM") int id){
        return modalityService.getModalityEventCategories(id);
    }
}
