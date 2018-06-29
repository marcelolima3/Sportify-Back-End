package com.Sportify.Controllers;


import com.Sportify.Entities.competition.Modality;
import com.Sportify.Service.ModalityService;
import com.Sportify.Views.JSONViews.competition.ModalityView;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
