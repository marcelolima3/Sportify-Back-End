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
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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
}
