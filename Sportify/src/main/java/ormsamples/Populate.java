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
import com.Sportify.Entities.event.EventCategory;
import com.Sportify.Entities.payment.InvoicePayment;
import com.Sportify.Entities.payment.PaymentMethod;
import com.Sportify.Entities.subentities.Athlete;
import com.Sportify.Entities.subentities.Team;
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
            int id = usersManagement.registerUser("Dinis", "mail3@gmail.com", "root", new InvoicePayment(0));
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

        Team benfica = new Team("Benfica", "img");
        HashSet<Athlete> atletas = new HashSet<Athlete>();
        Athlete atleta = new Athlete("João Pereira", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166357.svg");
        atleta.setTeam(benfica);
        benfica.setORM_Athletes(atletas);

        modality.teams.add(benfica);
        ModalityDAO.save(modality);
    }

    public static EventCategory eventCategory_PersonalRecord = new EventCategory("Personal Record", 0.2, 2);
    public static EventCategory eventCategory_BeforeMatch = new EventCategory("Before Match", 0.2, 2);
    public static EventCategory eventCategory_AfterMatch = new EventCategory("After Match", 0.2, 2);
    public static EventCategory eventCategory_Goal = new EventCategory("Goal", 0.2, 2);
    public static EventCategory eventCategory_Fault = new EventCategory("Fault", 0.2, 2);
    public static EventCategory eventCategory_Results = new EventCategory("Results", 0.2, 2);

    public void populate() throws PersistentException {

        populateAthletics();
        populateFootball();
        testUsersManagement();

        List<Sport> sports_list = Arrays.asList(
                new Sport("Basketball", "https://image.flaticon.com/icons/svg/123/123520.svg", false),
                new Sport("Tennis", "https://image.flaticon.com/icons/svg/123/123514.svg", false),
                new Sport("Baseball", "https://image.flaticon.com/icons/svg/123/123518.svg", false),
                new Sport("Cycling", "https://image.flaticon.com/icons/svg/123/123505.svg", false),
                new Sport("Volleyball", "https://image.flaticon.com/icons/svg/123/123510.svg", false),
                new Sport("Golf", "https://image.flaticon.com/icons/svg/123/123524.svg", false),
                new Sport("Badminton", "https://image.flaticon.com/icons/svg/123/123509.svg", false)
                );

        List<Team> teams_list = Arrays.asList(
                new Team("Cleveland Cavaliers", "https://seeklogo.com/images/C/cleveland-cavaliers-logo-B89008E8AA-seeklogo.com.png"),
                new Team("Roger Federer", "https://seeklogo.com/images/R/roger-federer-logo-F69633952B-seeklogo.com.png"),
                new Team("New York Yankees", "https://seeklogo.com/images/N/new-york-yankees-logo-766DC138B6-seeklogo.com.png"),
                new Team("S.L. Benfica", "https://seeklogo.com/images/S/sport-lisboa-e-benfica-logo-149703CDAB-seeklogo.com.png"),
                new Team("S.L. Benfica", "https://seeklogo.com/images/S/sport-lisboa-e-benfica-logo-149703CDAB-seeklogo.com.png"),
                new Team("Tiger Woods", "https://seeklogo.com/images/T/Tiger_Woods-logo-34FB839F89-seeklogo.com.png"),
                new Team("SC Braga", "https://seeklogo.com/images/S/Sporting_Clube_de_Braga-logo-3E6C00F285-seeklogo.com.png")
                );

        List<Athlete> athletes_list = Arrays.asList(
                new Athlete("LeBron James", "American", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg"),
                new Athlete("Roger Federer", "Swiss", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg"),
                new Athlete("Aaron Judge", "American", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg"),
                new Athlete("Rui Costa", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166344.svg"),
                new Athlete("Miroslav", "Bulgarian", "Male", "https://image.flaticon.com/icons/svg/166/166344.svg"),
                new Athlete("Tiger Woods", "American", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg"),
                new Athlete("Rúben Vieira", "Portuguese", "Male",  "https://image.flaticon.com/icons/svg/166/166344.svg")
                );

        PersistentTransaction t = EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
        try {
            for(int i = 0; i < 7; i++){
                Sport sport = sports_list.get(i);
                HashSet<Modality> sport_modalities = new HashSet<Modality>();
                Modality modality = new Modality(sports_list.get(i).getName());
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
            Sport sport_athletics = new Sport("Athletics", "https://image.flaticon.com/icons/svg/123/123500.svg", true);
            HashSet<Modality> athletics_modalities = new HashSet<Modality>();

            Modality modality_sprint = new Modality("Sprint");

            modality_sprint._eventCategories.add(eventCategory_BeforeMatch);
            modality_sprint._eventCategories.add(eventCategory_AfterMatch);
            modality_sprint._eventCategories.add(eventCategory_PersonalRecord);
            modality_sprint._eventCategories.add(eventCategory_Results);

            HashSet<Team> sprint_teams = new HashSet<Team>();

            Team team_benfica_sprint = new Team("S.L. Benfica", "https://seeklogo.com/images/S/sport-lisboa-e-benfica-logo-149703CDAB-seeklogo.com.png");
            Athlete athlete_benfica_print_1 = new Athlete("João Pereira", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
            athlete_benfica_print_1.setTeam(team_benfica_sprint);
            Athlete athlete_benfica_print_2 = new Athlete("Maria Silva", "Portuguese", "Female", "https://image.flaticon.com/icons/svg/166/166357.svg");
            athlete_benfica_print_2.setTeam(team_benfica_sprint);
            Athlete athlete_benfica_print_3 = new Athlete("Luísa Rocha", "Portuguese", "Female", "https://image.flaticon.com/icons/svg/166/166357.svg");
            athlete_benfica_print_3.setTeam(team_benfica_sprint);
            sprint_teams.add(team_benfica_sprint);

            Team team_porto_sprint = new Team("FC Porto", "https://seeklogo.com/images/F/F_C__Porto-logo-3BB4DAAEA2-seeklogo.com.png");
            Athlete athlete_porto_print_1 = new Athlete("Ana Miranda", "Portuguese", "Female", "https://image.flaticon.com/icons/svg/166/166357.svg");
            athlete_porto_print_1.setTeam(team_porto_sprint);
            Athlete athlete_porto_print_2 = new Athlete("Maria Peixoto", "Portuguese", "Female", "https://image.flaticon.com/icons/svg/166/166357.svg");
            athlete_porto_print_2.setTeam(team_porto_sprint);
            Athlete athlete_porto_print_3 = new Athlete("Carlos Rocha", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
            athlete_porto_print_3.setTeam(team_porto_sprint);
            sprint_teams.add(team_porto_sprint);

            Team team_sporting_sprint = new Team("Sporting CP", "https://seeklogo.com/images/S/sporting-lisbon-sporting-clube-de-portugal-logo-87718592BF-seeklogo.com.png");
            Athlete athlete_sporting_print_1 = new Athlete("Manuel Pereira", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
            athlete_sporting_print_1.setTeam(team_sporting_sprint);
            Athlete athlete_sporting_print_2 = new Athlete("António Sá", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
            athlete_sporting_print_2.setTeam(team_sporting_sprint);
            Athlete athlete_sporting_print_3 = new Athlete("José Pedro", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
            athlete_sporting_print_3.setTeam(team_sporting_sprint);
            sprint_teams.add(team_sporting_sprint);

            modality_sprint.setORM_Teams(sprint_teams);
            athletics_modalities.add(modality_sprint);

            Modality modality_hurdling = new Modality("Hurdling");

            modality_sprint._eventCategories.add(eventCategory_BeforeMatch);
            modality_sprint._eventCategories.add(eventCategory_AfterMatch);
            modality_sprint._eventCategories.add(eventCategory_PersonalRecord);
            modality_sprint._eventCategories.add(eventCategory_Results);

            HashSet hurdling_teams = new HashSet<Team>();
            athletics_modalities.add(modality_hurdling);

            Team team_benfica_hurdling = new Team("S.L. Benfica", "https://seeklogo.com/images/S/sport-lisboa-e-benfica-logo-149703CDAB-seeklogo.com.png");
            Athlete hurdling_athlete_benfica_print_1 = new Athlete("Luís António", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
            hurdling_athlete_benfica_print_1.setTeam(team_benfica_hurdling);
            Athlete hurdling_athlete_benfica_print_2 = new Athlete("Mariana Silva", "Portuguese", "Female", "https://image.flaticon.com/icons/svg/166/166357.svg");
            hurdling_athlete_benfica_print_2.setTeam(team_benfica_hurdling);
            Athlete hurdling_athlete_benfica_print_3 = new Athlete("Teresa Rocha", "Portuguese", "Female", "https://image.flaticon.com/icons/svg/166/166357.svg");
            hurdling_athlete_benfica_print_3.setTeam(team_benfica_hurdling);
            hurdling_teams.add(team_benfica_hurdling);

            Team team_porto_hurdling = new Team("FC Porto", "https://seeklogo.com/images/F/F_C__Porto-logo-3BB4DAAEA2-seeklogo.com.png");
            Athlete hurdling_athlete_porto_print_1 = new Athlete("Ana Guedes", "Portuguese", "Female", "https://image.flaticon.com/icons/svg/166/166357.svg");
            hurdling_athlete_porto_print_1.setTeam(team_porto_hurdling);
            Athlete hurdling_athlete_porto_print_2 = new Athlete("Maria Pires", "Portuguese", "Female", "https://image.flaticon.com/icons/svg/166/166357.svg");
            hurdling_athlete_porto_print_2.setTeam(team_porto_hurdling);
            Athlete hurdling_athlete_porto_print_3 = new Athlete("Carlos Costa", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
            hurdling_athlete_porto_print_3.setTeam(team_porto_hurdling);
            hurdling_teams.add(team_porto_hurdling);

            Team team_sporting_hurdling = new Team("Sporting CP", "https://seeklogo.com/images/S/sporting-lisbon-sporting-clube-de-portugal-logo-87718592BF-seeklogo.com.png");
            Athlete hurdling_athlete_sporting_print_1 = new Athlete("Manuel Ferreira", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
            hurdling_athlete_sporting_print_1.setTeam(team_sporting_hurdling);
            Athlete hurdling_athlete_sporting_print_2 = new Athlete("João Sá", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
            hurdling_athlete_sporting_print_2.setTeam(team_sporting_hurdling);
            Athlete hurdling_athlete_sporting_print_3 = new Athlete("Bruno Pedro", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
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
            Sport sport_football = new Sport("Football", "https://image.flaticon.com/icons/svg/123/123495.svg", false);
            HashSet<Modality> sport_modalities = new HashSet<Modality>();

            Modality modality = new Modality("Football");

            modality._eventCategories.add(eventCategory_BeforeMatch);
            modality._eventCategories.add(eventCategory_Goal);
            modality._eventCategories.add(eventCategory_Fault);
            modality._eventCategories.add(eventCategory_Results);

            HashSet<Team> teams = new HashSet<Team>();

            Team benfica = new Team("S.L. Benfica", "img");
            Athlete benfica_athlete = new Athlete("Luisão", "Brazilian", "Male", "https://image.flaticon.com/icons/svg/166/166344.svg");
            benfica_athlete.setTeam(benfica);
            teams.add(benfica);

            Team porto = new Team("FC Porto", "img");
            Athlete porto_athlete = new Athlete("Herrera", "Mexican", "Male", "https://image.flaticon.com/icons/svg/166/166344.svg");
            porto_athlete.setTeam(porto);
            teams.add(porto);

            Team sporting = new Team("Sporting CP", "img");
            Athlete sporting_athlete = new Athlete("Fábio Coentão", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166344.svg");
            sporting_athlete.setTeam(sporting);
            teams.add(sporting);

            Team braga = new Team("S.C. Braga", "img");
            Athlete braga_athlete = new Athlete("Paulinho", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166344.svg");
            braga_athlete.setTeam(braga);
            teams.add(braga);

            Team real_madrid = new Team("Real Madrid C.F.", "img");
            Athlete real_madrid_athlete = new Athlete("Cristiano Ronaldo", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166344.svg");
            real_madrid_athlete.setTeam(real_madrid);
            teams.add(real_madrid);

            Team juventus = new Team("Juventus F.C.", "img");
            Athlete juventus_athlete = new Athlete("Buffon", "Italian", "Male", "https://image.flaticon.com/icons/svg/166/166344.svg");
            juventus_athlete.setTeam(juventus);
            teams.add(juventus);

            Team manchester_city = new Team("Manchester City F.C.", "img");
            Athlete manchester_city_athlete = new Athlete("David Silva", "Spanish","Male", "https://image.flaticon.com/icons/svg/166/166344.svg");
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
