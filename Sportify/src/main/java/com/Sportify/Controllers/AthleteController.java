package com.Sportify.Controllers;

import com.Sportify.Entities.subentities.Athlete;
import com.Sportify.Service.AthleteService;
import com.Sportify.Views.JSONViews.subentities.AthleteView;
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
public class AthleteController {

    @Autowired
    private AthleteService athleteService;

    @JsonView(AthleteView.Public.class)
    @RequestMapping(value = "/{idM}/athletes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Athlete> getModalityAthletes(@PathVariable("idM") int id){
        return athleteService.getModalityAthletes(id);
    }
}
