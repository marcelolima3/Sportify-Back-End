package com.Sportify.Service;

import com.Sportify.Entities.competition.Sport;
import com.Sportify.Managers.CompetitionsManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportService {
    @Autowired
    private CompetitionsManagement competitionsManagement = new CompetitionsManagement();

    public List<Sport> getAllSports(){
        return competitionsManagement.getAllSports();
    }
}
