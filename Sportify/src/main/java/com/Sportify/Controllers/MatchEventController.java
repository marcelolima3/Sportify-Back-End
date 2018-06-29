package com.Sportify.Controllers;

import com.Sportify.Entities.competition.MatchEvent;
import com.Sportify.Entities.subentities.Athlete;
import com.Sportify.Service.MatchEventService;
import com.Sportify.Views.JSONViews.competition.MatchEventView;
import com.Sportify.Views.JSONViews.subentities.SubscriptionEntityView;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sports/modalities/competitions")
public class MatchEventController {
    @Autowired
    private MatchEventService matchEventService;

    @JsonView(MatchEventView.Public.class)
    @RequestMapping(value = "/{idC}/matches", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MatchEvent> getCompetitionMatches(@PathVariable("idC") int id){
        return matchEventService.getCompetitionMatches(id);
    }

    @JsonView(SubscriptionEntityView.Public.class)
    @RequestMapping(value = "/{idC}/matches", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public MatchEvent createMatch(@PathVariable("idC") int id, @RequestBody MatchEvent match){
        return matchEventService.createMatch(id, match);
    }

    @RequestMapping(value = "/matches/{idM}/athlete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addAthleteToMatch(@PathVariable("idM") int id, @RequestBody Athlete athlete){
        matchEventService.addAthleteToMatch(id, athlete);
    }
}
