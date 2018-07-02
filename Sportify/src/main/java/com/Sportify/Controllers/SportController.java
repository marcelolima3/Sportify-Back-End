package com.Sportify.Controllers;


import com.Sportify.Entities.competition.Sport;
import com.Sportify.Entities.notPresist.BreadCumbResponse;
import com.Sportify.Entities.notPresist.BreadCumbResquest;
import com.Sportify.Service.SportService;
import com.Sportify.Views.JSONViews.competition.SportView;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/sports")
public class SportController {

    @Autowired
    private SportService sportService;

    @JsonView(SportView.Public.class)
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Sport getSport(@PathVariable("id") int id){
        return sportService.getSport(id);
    }

    @JsonView(SportView.Public.class)
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Sport> getAllSports(){
        return sportService.getAllSports();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public BreadCumbResponse getBreadCumbInfo(@RequestBody BreadCumbResquest req){
        System.out.println(req.getId());
        return sportService.getBreadCumbInfo(req);
    }
}
