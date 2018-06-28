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
import com.Sportify.DAO.subentities.SubscriptionEntityDAO;
import com.Sportify.DAO.subentities.TeamDAO;
import com.Sportify.DAO.user.UserDAO;
import com.Sportify.Entities.competition.Competition;
import com.Sportify.Entities.competition.Modality;
import com.Sportify.Entities.competition.Sport;
import com.Sportify.Entities.payment.InvoicePayment;
import com.Sportify.Entities.payment.PaymentMethod;
import com.Sportify.Entities.subentities.Athlete;
import com.Sportify.Entities.subentities.SubscriptionEntity;
import com.Sportify.Entities.subentities.Team;
import com.Sportify.Entities.user.Subscription;
import com.Sportify.Entities.user.User;
import com.Sportify.Managers.CompetitionsManagement;
import com.Sportify.Managers.UsersManagement;
import org.orm.*;

import java.util.*;


public class Populate {

    public void createTestData() throws PersistentException {
        PersistentTransaction t = EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
        try {
            PaymentMethod paymentMethod = new InvoicePayment(10);
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
            int id = usersManagement.registerUser("Dinis", "mail3@gmail.com", "root", new InvoicePayment(10));
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

    public void createTeam() throws PersistentException {
        Modality modality = ModalityDAO.getModalityByORMID(1);

        Team benfica = new Team("Benfica");
        HashSet<Athlete> atletas = new HashSet<Athlete>();
        Athlete atleta = new Athlete("João Pereira", "Portuguese", "Male");
        atleta.setTeam(benfica);
        benfica.setORM_Athletes(atletas);

        modality.teams.add(benfica);
        ModalityDAO.save(modality);
    }

    public void populate() throws PersistentException {

        populateAthletics();
        populateFootball();
        testUsersManagement();

        List<String> sports_list = Arrays.asList(
                "Basketball",
                "Tennis",
                "Baseball",
                "Cycling",
                "Volleyball",
                "Golf",
                "Badminton"
                );

        List<Team> teams_list = Arrays.asList(
                new Team("Cleveland Cavaliers"),
                new Team("Roger Federer"),
                new Team("New York Yankees"),
                new Team("S.L. Benfica"),
                new Team("S.L. Benfica"),
                new Team("Tiger Woods"),
                new Team("SC Braga")
                );

        List<Athlete> athletes_list = Arrays.asList(
                new Athlete("LeBron James", "American", "Male"),
                new Athlete("Roger Federer", "Swiss", "Male"),
                new Athlete("Aaron Judge", "American", "Male"),
                new Athlete("Rui Costa", "Portuguese", "Male"),
                new Athlete("Miroslav", "Bulgarian", "Male"),
                new Athlete("Tiger Woods", "American", "Male"),
                new Athlete("Rúben Vieira", "Portuguese", "Male")
                );

        PersistentTransaction t = EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
        try {
            for(int i = 0; i < 7; i++){
                Sport sport = new Sport(sports_list.get(i));
                HashSet<Modality> sport_modalities = new HashSet<Modality>();
                Modality modality = new Modality(sports_list.get(i));
                HashSet<Team> teams = new HashSet<Team>();
                Team team = teams_list.get(i);
                Athlete athlete = athletes_list.get(i);
                athlete.setTeam(team);
                teams.add(team);
                modality.setORM_Teams(teams);
                sport_modalities.add(modality);
                sport.setORM_Modalities(sport_modalities);
                SportDAO.save(sport);
            }
        }
        catch (PersistentException e){
            e.printStackTrace();
        }
    }

    public void populateAthletics() throws PersistentException {
        PersistentTransaction t = EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
        try {
            Sport sport_athletics = new Sport("Athletics");
            HashSet<Modality> athletics_modalities = new HashSet<Modality>();

            Modality modality_sprint = new Modality("Sprint");
            HashSet<Team> sprint_teams = new HashSet<Team>();

            Team team_benfica_sprint = new Team("S.L. Benfica");
            Athlete athlete_benfica_print_1 = new Athlete("João Pereira", "Portuguese", "Male");
            athlete_benfica_print_1.setTeam(team_benfica_sprint);
            Athlete athlete_benfica_print_2 = new Athlete("Maria Silva", "Portuguese", "Female");
            athlete_benfica_print_2.setTeam(team_benfica_sprint);
            Athlete athlete_benfica_print_3 = new Athlete("Luísa Rocha", "Portuguese", "Female");
            athlete_benfica_print_3.setTeam(team_benfica_sprint);
            sprint_teams.add(team_benfica_sprint);

            Team team_porto_sprint = new Team("FC Porto");
            Athlete athlete_porto_print_1 = new Athlete("Ana Miranda", "Portuguese", "Female");
            athlete_porto_print_1.setTeam(team_porto_sprint);
            Athlete athlete_porto_print_2 = new Athlete("Maria Peixoto", "Portuguese", "Female");
            athlete_porto_print_2.setTeam(team_porto_sprint);
            Athlete athlete_porto_print_3 = new Athlete("Carlos Rocha", "Portuguese", "Male");
            athlete_porto_print_3.setTeam(team_porto_sprint);
            sprint_teams.add(team_porto_sprint);

            Team team_sporting_sprint = new Team("Sporting CP");
            Athlete athlete_sporting_print_1 = new Athlete("Manuel Pereira", "Portuguese", "Male");
            athlete_sporting_print_1.setTeam(team_sporting_sprint);
            Athlete athlete_sporting_print_2 = new Athlete("António Sá", "Portuguese", "Male");
            athlete_sporting_print_2.setTeam(team_sporting_sprint);
            Athlete athlete_sporting_print_3 = new Athlete("José Pedro", "Portuguese", "Male");
            athlete_sporting_print_3.setTeam(team_sporting_sprint);
            sprint_teams.add(team_sporting_sprint);

            modality_sprint.setORM_Teams(sprint_teams);
            athletics_modalities.add(modality_sprint);

            Modality modality_hurdling = new Modality("Hurdling");
            HashSet hurdling_teams = new HashSet<Team>();
            athletics_modalities.add(modality_hurdling);

            Team team_benfica_hurdling = new Team("S.L. Benfica");
            Athlete hurdling_athlete_benfica_print_1 = new Athlete("Luís António", "Portuguese", "Male");
            hurdling_athlete_benfica_print_1.setTeam(team_benfica_hurdling);
            Athlete hurdling_athlete_benfica_print_2 = new Athlete("Mariana Silva", "Portuguese", "Female");
            hurdling_athlete_benfica_print_2.setTeam(team_benfica_hurdling);
            Athlete hurdling_athlete_benfica_print_3 = new Athlete("Teresa Rocha", "Portuguese", "Female");
            hurdling_athlete_benfica_print_3.setTeam(team_benfica_hurdling);
            hurdling_teams.add(team_benfica_hurdling);

            Team team_porto_hurdling = new Team("FC Porto");
            Athlete hurdling_athlete_porto_print_1 = new Athlete("Ana Guedes", "Portuguese", "Female");
            hurdling_athlete_porto_print_1.setTeam(team_porto_hurdling);
            Athlete hurdling_athlete_porto_print_2 = new Athlete("Maria Pires", "Portuguese", "Female");
            hurdling_athlete_porto_print_2.setTeam(team_porto_hurdling);
            Athlete hurdling_athlete_porto_print_3 = new Athlete("Carlos Costa", "Portuguese", "Male");
            hurdling_athlete_porto_print_3.setTeam(team_porto_hurdling);
            hurdling_teams.add(team_porto_hurdling);

            Team team_sporting_hurdling = new Team("Sporting CP");
            Athlete hurdling_athlete_sporting_print_1 = new Athlete("Manuel Ferreira", "Portuguese", "Male");
            hurdling_athlete_sporting_print_1.setTeam(team_sporting_hurdling);
            Athlete hurdling_athlete_sporting_print_2 = new Athlete("João Sá", "Portuguese", "Male");
            hurdling_athlete_sporting_print_2.setTeam(team_sporting_hurdling);
            Athlete hurdling_athlete_sporting_print_3 = new Athlete("Bruno Pedro", "Portuguese", "Male");
            hurdling_athlete_sporting_print_3.setTeam(team_sporting_hurdling);
            hurdling_teams.add(team_sporting_hurdling);

            modality_hurdling.setORM_Teams(hurdling_teams);

            sport_athletics.setORM_Modalities(athletics_modalities);
            SportDAO.save(sport_athletics);

        } catch (PersistentException e){
            e.printStackTrace();
        }
    }

    public void populateFootball() throws PersistentException {
        PersistentTransaction t = EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
        try {
            Sport sport_football = new Sport("Football");
            HashSet<Modality> sport_modalities = new HashSet<Modality>();

            Modality modality = new Modality("Football");
            HashSet<Team> teams = new HashSet<Team>();

            Team benfica = new Team("S.L. Benfica");
            Athlete benfica_athlete = new Athlete("Luisão", "Brazilian", "Male");
            benfica_athlete.setTeam(benfica);
            teams.add(benfica);

            Team porto = new Team("FC Porto");
            Athlete porto_athlete = new Athlete("Herrera", "Mexican", "Male");
            porto_athlete.setTeam(porto);
            teams.add(porto);

            Team sporting = new Team("Sporting CP");
            Athlete sporting_athlete = new Athlete("Fábio Coentão", "Portuguese", "Male");
            sporting_athlete.setTeam(sporting);
            teams.add(sporting);

            Team braga = new Team("S.C. Braga");
            Athlete braga_athlete = new Athlete("Paulinho", "Portuguese", "Male");
            braga_athlete.setTeam(braga);
            teams.add(braga);

            Team real_madrid = new Team("Real Madrid C.F.");
            Athlete real_madrid_athlete = new Athlete("Cristiano Ronaldo", "Portuguese", "Male");
            real_madrid_athlete.setTeam(real_madrid);
            teams.add(real_madrid);

            Team juventus = new Team("Juventus F.C.");
            Athlete juventus_athlete = new Athlete("Buffon", "Italian", "Male");
            juventus_athlete.setTeam(juventus);
            teams.add(juventus);

            Team manchester_city = new Team("Manchester City F.C.");
            Athlete manchester_city_athlete = new Athlete("David Silva", "Spanish","Male");
            manchester_city_athlete.setTeam(manchester_city);
            teams.add(manchester_city);

            modality.setORM_Teams(teams);
            sport_modalities.add(modality);
            sport_football.setORM_Modalities(sport_modalities);
            SportDAO.save(sport_football);
        }
        catch (PersistentException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        try {
            Populate createAAData = new Populate();
            try {
                createAAData.populate();
            } finally {
                EAClassDiagramPersistentManager.instance().disposePersistentManager();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
