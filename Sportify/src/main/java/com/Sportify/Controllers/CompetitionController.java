package com.Sportify.Controllers;

import com.Sportify.Entities.competition.Competition;
import com.Sportify.Entities.competition.MatchEvent;
import com.Sportify.Service.CompetitionService;
import com.Sportify.Views.JSONViews.competition.CompetitionView;
import com.Sportify.Views.JSONViews.competition.MatchEventView;
import com.fasterxml.jackson.annotation.JsonView;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/sports/modalities")
public class CompetitionController {

    @Autowired
    private CompetitionService competitionService;

    @JsonView(CompetitionView.Public.class)
    @RequestMapping(value = "/competitions/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Competition getCompetition(@PathVariable("id") int id){
        return competitionService.getCompetition(id);
    }

    @JsonView(CompetitionView.Public.class)
    @RequestMapping(value = "/{idM}/competitions", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Competition> getModalityCompetitions(@PathVariable("idM") int id){
        return competitionService.getModalityCompetitions(id);
    }

    @JsonView(CompetitionView.Public.class)
    @RequestMapping(value = "/{idM}/competitions", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Competition createCompetition(@PathVariable("idM") int modalityID, @RequestBody Competition competition){
        try {
            return competitionService.createCompetition(modalityID, competition);
        } catch (PersistentException e) {
            e.printStackTrace();
            return null;
        }
    }

}
