package com.Sportify.Service;

import com.Sportify.DAO.competition.ModalityDAO;
import com.Sportify.Entities.competition.Modality;
import com.Sportify.Entities.subentities.Team;
import org.orm.PersistentException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TeamService {

    public List<Team> getModalityTeams(int id){
        try {
            Modality m = ModalityDAO.getModalityByORMID(id);
            return Arrays.asList(m.teams.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

}
