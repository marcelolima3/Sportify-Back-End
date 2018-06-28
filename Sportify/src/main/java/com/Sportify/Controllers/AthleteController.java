package com.Sportify.Controllers;

import com.Sportify.Entities.subentities.Athlete;
import com.Sportify.Entities.subentities.SubscriptionEntity;
import com.Sportify.Service.AthleteService;
import com.Sportify.Views.JSONViews.subentities.AthleteView;
import com.Sportify.Views.JSONViews.subentities.SubscriptionEntityView;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.theme.AbstractThemeResolver;

import java.util.List;

@RestController
@RequestMapping("/sports/modalities")
public class AthleteController {

    @Autowired
    private AthleteService athleteService;

    @JsonView(AthleteView.Public.class)
    @RequestMapping(value = "/{idM}/athletes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Athlete> getModalityAthletes(@PathVariable("idM") int id){
        return athleteService.getModalityAthletes(id);
    }

    @JsonView(AthleteView.Public.class)
    @RequestMapping(value = "/teams/{idT}/athletes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Athlete> getTeamAthletes(@PathVariable("idT") int id){
        return athleteService.getTeamAthletes(id);
    }

    @JsonView(AthleteView.Public.class)
    @RequestMapping(value = "/teams/{idT}/athletes", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Athlete createAthlete(@PathVariable("idT") int id, @RequestBody Athlete athlete){
        return athleteService.createAthlete(id, athlete);
    }
}
