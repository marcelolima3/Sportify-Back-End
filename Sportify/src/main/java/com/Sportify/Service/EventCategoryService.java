package com.Sportify.Service;

import com.Sportify.DAO.competition.ModalityDAO;
import com.Sportify.Entities.competition.Modality;
import com.Sportify.Entities.event.EventCategory;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EventCategoryService {
    @Autowired private ModalityDAO modalityDAO;

    public List<EventCategory> getModalityEventCategories(int id){
        try {
            Modality m = modalityDAO.getModalityByORMID(id);
            return Arrays.asList(m._eventCategories.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

}
