package com.Sportify.Service;

import com.Sportify.DAO.competition.CompetitionDAO;
import com.Sportify.DAO.competition.ModalityDAO;
import com.Sportify.Entities.competition.Competition;
import com.Sportify.Entities.competition.MatchEvent;
import com.Sportify.Entities.competition.Modality;
import org.orm.PersistentException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service
public class CompetitionService {

    public List<Competition> getModalityCompetitions(int id){
        try {
            Modality m = ModalityDAO.getModalityByORMID(id);
            return Arrays.asList(m.competitions.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public List<MatchEvent> getCompetitionMatchEvents(int id){
        try {
            Competition c = CompetitionDAO.getCompetitionByORMID(id);
            return Arrays.asList(c.matchEvents.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public Competition createCompetition(int modalityID, Competition competition){
        try {
            Modality modality = ModalityDAO.getModalityByORMID(modalityID);
            competition.setORM_MatchEvents(new HashSet());
            modality.competitions.add(competition);
            ModalityDAO.save(modality);
            return competition;
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }
}
