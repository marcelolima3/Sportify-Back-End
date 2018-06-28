package com.Sportify.Controllers;


import com.Sportify.Entities.competition.Sport;
import com.Sportify.Service.SportService;
import com.Sportify.Views.JSONViews.competition.SportView;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sports")
public class SportController {
    @Autowired
    private SportService sportService;

    @JsonView(SportView.Public.class)
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Sport> getAllSports(){
        return sportService.getAllSports();
    }
}
