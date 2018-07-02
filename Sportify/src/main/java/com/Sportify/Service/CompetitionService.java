package com.Sportify.Service;

import com.Sportify.DAO.EAClassDiagramPersistentManager;
import com.Sportify.DAO.competition.CompetitionDAO;
import com.Sportify.DAO.competition.ModalityDAO;
import com.Sportify.Entities.competition.Competition;
import com.Sportify.Entities.competition.MatchEvent;
import com.Sportify.Entities.competition.Modality;
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
public class CompetitionService {
    @Autowired private ModalityDAO modalityDAO;
    @Autowired private CompetitionDAO competitionDAO;

    public Competition getCompetition(int id){
        try {
            return competitionDAO.getCompetitionByORMID(id);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Competition> getModalityCompetitions(int id){
        try {
            Modality m = modalityDAO.getModalityByORMID(id);
            return Arrays.asList(m.competitions.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public List<MatchEvent> getCompetitionMatchEvents(int id){
        try {
            Competition c = competitionDAO.getCompetitionByORMID(id);
            return Arrays.asList(c.matchEvents.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public Competition createCompetition(int modalityID, Competition competition) throws PersistentException {
        try {
            Modality modality = modalityDAO.getModalityByORMID(modalityID);
            competition.setORM_MatchEvents(new HashSet());
            modality.competitions.add(competition);
            modalityDAO.save(modality);
            return competition;
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }
}
