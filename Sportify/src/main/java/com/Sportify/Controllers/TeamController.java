package com.Sportify.Controllers;

import com.Sportify.Entities.subentities.Team;
import com.Sportify.Service.TeamService;
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
@RequestMapping("/sports/modalities")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @JsonView(TeamView.Public.class)
    @RequestMapping(value = "/{idM}/teams", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Team> getModalityTeams(@PathVariable("idM") int id){
        return teamService.getModalityTeams(id);
    }

}
