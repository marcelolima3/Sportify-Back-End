package com.Sportify.Service;


import com.Sportify.DAO.competition.SportDAO;
import com.Sportify.Entities.competition.Modality;
import com.Sportify.Entities.competition.Sport;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ModalityService {
    @Autowired private SportDAO sportDAO;

    public List<Modality> getSportModalities(int id){
        try {
            Sport s = sportDAO.getSportByORMID(id);
            return Arrays.asList(s.modalities.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
