package com.Sportify.Service;

import com.Sportify.DAO.competition.ModalityDAO;
import com.Sportify.DAO.competition.SportDAO;
import com.Sportify.Entities.competition.Modality;
import com.Sportify.Entities.competition.Sport;
import com.Sportify.Entities.notPresist.BreadCumbResponse;
import com.Sportify.Entities.notPresist.BreadCumbResquest;
import com.Sportify.Managers.CompetitionsManagement;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class SportService {
    @Autowired private SportDAO sportDAO;
    @Autowired private ModalityDAO modalityDAO;

    public Sport getSport(int id){
        try {
            return sportDAO.getSportByORMID(id);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Sport> getAllSports(){
        try {
            return (List<Sport>) sportDAO.querySport(null, null);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public BreadCumbResponse getBreadCumbInfo(BreadCumbResquest req) {
        try{
            Sport sport = sportDAO.getSportByORMID(req.getId());
            BreadCumbResponse bcr = new BreadCumbResponse(sport.getID(), sport.getName(), sport.getOnlySport());
            if(!req.isSport()){
                Modality m = modalityDAO.getModalityByORMID(req.getModalityID());
                bcr.setModalityName(m.getName());
                bcr.setModalityID(m.getID());
            }
            return bcr;
        }
        catch (PersistentException e){e.printStackTrace();}
        return null;
    }

}
