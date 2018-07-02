package com.Sportify.Service;

import com.Sportify.DAO.EAClassDiagramPersistentManager;
import com.Sportify.DAO.competition.ModalityDAO;
import com.Sportify.DAO.subentities.TeamDAO;
import com.Sportify.Entities.competition.Modality;
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
public class TeamService {
    @Autowired private ModalityDAO modalityDAO;
    @Autowired private TeamDAO teamDAO;

    public Team getModalityTeam(int id){

        try {
            return teamDAO.getTeamByORMID(id);

        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Team> getModalityTeams(int id){
        try {
            Modality m = modalityDAO.getModalityByORMID(id);
            return Arrays.asList(m.teams.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public Team createTeam(int modalityID, Team team) throws PersistentException {
        try {
            Modality modality = modalityDAO.getModalityByORMID(modalityID);
            team.setORM_Athletes(new HashSet());
            modality.teams.add(team);
            modalityDAO.save(modality);
            return team;
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }

}
