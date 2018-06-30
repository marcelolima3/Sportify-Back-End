package com.Sportify.Controllers;

import com.Sportify.Entities.event.EventCategory;
import com.Sportify.Service.EventCategoryService;
import com.Sportify.Views.JSONViews.event.EventView;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/sports/modalities")
public class EventCategoryController {

    @Autowired
    private EventCategoryService eventCategoryService;

    @JsonView(EventView.Public.class)
    @RequestMapping(value = "/{idM}/event_categories", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EventCategory> getModalityEventCategories(@PathVariable("idM") int id){
        return eventCategoryService.getModalityEventCategories(id);
    }

}
