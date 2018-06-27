package ormsamples;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dinispeixoto
 */
import com.Sportify.DAO.EAClassDiagramPersistentManager;
import com.Sportify.DAO.competition.ModalityDAO;
import com.Sportify.DAO.competition.SportDAO;
import com.Sportify.DAO.user.UserDAO;
import com.Sportify.Entities.competition.Competition;
import com.Sportify.Entities.competition.Modality;
import com.Sportify.Entities.competition.Sport;
import com.Sportify.Entities.payment.InvoicePayment;
import com.Sportify.Entities.payment.PaymentMethod;
import com.Sportify.Entities.user.User;
import com.Sportify.Managers.CompetitionsManagement;
import com.Sportify.Managers.UsersManagement;
import org.orm.*;

import java.math.BigDecimal;
import java.util.*;

public class Populate {

    public void createTestData() throws PersistentException {
        PersistentTransaction t = EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
        try {
            PaymentMethod paymentMethod = new InvoicePayment(new BigDecimal(10));
            User user = new User(paymentMethod, "Dinis", "mail@mail.com", "root");
            UserDAO.save(user);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }
    }

    public void testUsersManagement() throws PersistentException {
        PersistentTransaction t = EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
        try {
            UsersManagement usersManagement = new UsersManagement();
            int id = usersManagement.registerUser("Dinis", "mail3@gmail.com", "root", new InvoicePayment(new BigDecimal(10)));
            System.out.println("ID: " + id);
            t.commit();
        }
        catch (Exception e){
            t.rollback();
        }
    }

    public void testCompetitions() throws PersistentException {
        PersistentTransaction t = EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
        try {
            Competition competition = new Competition("Competition100", "location", new Date(), new Date(), "asdas");

            Modality modality = new Modality("Modality100");
            modality.competitions.add(competition);

            Set<Modality> modalities = new HashSet<Modality>();
            ((HashSet) modalities).add(modality);

            Sport sport = new Sport("Sport100");
            sport.setORM_Modalities(modalities);

            SportDAO.save(sport);

            CompetitionsManagement competitionsManagement = new CompetitionsManagement();
            competitionsManagement.createCompetition(1, "Competition1", "Braga", new Date(), new Date(), "Description");
            competitionsManagement.createMatch(1, "Description1", new Date(), new Date(), "Braga");

            t.commit();
        } catch (Exception e) {
            e.printStackTrace();
            t.rollback();
        }
    }

    public void populateSports() throws PersistentException {
        PersistentTransaction t = EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
        try {
            List<String> sports_list = Arrays.asList("Athletics","Basketball","Baseball","Tennis","Cycling","Volleyball","Football","Golf", "Badminton");
            List<String> modalities_list = Arrays.asList("Sprint","Hurdling");

            List<Sport> final_sports_list = new ArrayList<Sport>();
            List<Modality> final_modalities_list = new ArrayList<Modality>();

            for(String sport_name: sports_list) {
                Sport sport = new Sport(sport_name);
                if(sport_name.equals("Athletics")) {
                    HashSet<Modality> modalities = new HashSet<Modality>();
                    for (String modality_name : modalities_list) {
                        Modality modality = new Modality(modality_name);
                        modalities.add(modality);
                        sport.setORM_Modalities(modalities);
                        final_modalities_list.add(modality);
                    }
                }
                else {
                    HashSet<Modality> modalities = new HashSet<Modality>();
                    Modality modality = new Modality(sport_name);
                    modalities.add(modality);
                    sport.setORM_Modalities(modalities);
                    final_modalities_list.add(modality);
                }
                final_sports_list.add(sport);
                SportDAO.save(sport);
            }

            Sport sport_athletics = new Sport("Athletics");
            Modality modality_sprint = new Modality("Sprint");
            Modality modality_hurdling = new Modality("Hurdling");





        } catch (PersistentException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Populate createAAData = new Populate();
            try {
                createAAData.populateSports();
            } finally {
                EAClassDiagramPersistentManager.instance().disposePersistentManager();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
