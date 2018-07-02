package com.Sportify.Service;

import com.Sportify.DAO.EAClassDiagramPersistentManager;
import com.Sportify.DAO.competition.ModalityDAO;
import com.Sportify.DAO.subentities.AthleteDAO;
import com.Sportify.DAO.subentities.TeamDAO;
import com.Sportify.Entities.competition.Modality;
import com.Sportify.Entities.subentities.Athlete;
import com.Sportify.Entities.subentities.Team;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service
public class AthleteService {
    @Autowired private ModalityDAO modalityDAO;
    @Autowired private TeamDAO teamDAO;
    @Autowired private AthleteDAO athleteDAO;

    public List<Athlete> getModalityAthletes(int id){
        List<Athlete> athletes = new ArrayList<>();
        try {
            Modality m = modalityDAO.getModalityByORMID(id);
            for(Team t : m.teams.toArray()){
                athletes.addAll(new ArrayList<>(Arrays.asList(t.athletes.toArray())));
            }
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return athletes;
    }

    public List<Athlete> getTeamAthletes(int id){
        try {
            Team t = teamDAO.getTeamByORMID(id);
            return Arrays.asList(t.athletes.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return  new ArrayList<>();
    }

    public Athlete createAthlete(int teamID, Athlete athlete) throws PersistentException {
        try {
            Team t = teamDAO.getTeamByORMID(teamID);
            athlete.setORM_MatchEvents(new HashSet());
            athlete.setTeam(t);
            athleteDAO.save(athlete);
            return athlete;
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }

}
