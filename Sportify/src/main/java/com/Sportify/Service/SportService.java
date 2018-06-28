package com.Sportify.Service;

import com.Sportify.DAO.competition.SportDAO;
import com.Sportify.Entities.competition.Sport;
import com.Sportify.Managers.CompetitionsManagement;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SportService {

    public List<Sport> getAllSports(){
        try {
            return (List<Sport>)SportDAO.querySport(null, null);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
