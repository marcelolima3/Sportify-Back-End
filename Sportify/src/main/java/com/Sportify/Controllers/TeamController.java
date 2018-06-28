package com.Sportify.Controllers;

import com.Sportify.Entities.subentities.SubscriptionEntity;
import com.Sportify.Entities.subentities.Team;
import com.Sportify.Service.TeamService;
import com.Sportify.Views.JSONViews.subentities.TeamView;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sports/modalities")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @JsonView(TeamView.Public.class)
    @RequestMapping(value = "/{idM}/teams", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Team> getModalityTeams(@PathVariable("idM") int id){
        return teamService.getModalityTeams(id);
    }

    @JsonView(TeamView.Public.class)
    @RequestMapping(value = "/{idM}/teams", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Team createCompetition(@PathVariable("idM") int modalityID, @RequestBody Team team){
        return teamService.createTeam(modalityID, team);
    }
}