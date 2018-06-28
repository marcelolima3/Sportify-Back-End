package com.Sportify.Service;

import com.Sportify.DAO.competition.ModalityDAO;
import com.Sportify.Entities.competition.Modality;
import com.Sportify.Entities.subentities.Athlete;
import com.Sportify.Entities.subentities.Team;
import org.orm.PersistentException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service
public class AthleteService {

    public List<Athlete> getModalityAthletes(int id){
        List<Athlete> athletes = new ArrayList<>();
        try {
            Modality m = ModalityDAO.getModalityByORMID(id);
            for(Team t : m.teams.toArray()){
                athletes.addAll(new ArrayList<>(Arrays.asList(t.athletes.toArray())));
            }
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return athletes;
    }

    public Athlete createAthlete(int modalityID, Athlete athlete){
        return null; // has to be done
    }

}
