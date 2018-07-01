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
import com.Sportify.DAO.competition.CompetitionDAO;
import com.Sportify.DAO.competition.ModalityDAO;
import com.Sportify.DAO.competition.SportDAO;
import com.Sportify.DAO.user.UserDAO;
import com.Sportify.Entities.competition.Competition;
import com.Sportify.Entities.competition.MatchEvent;
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

    public void testUsersManagement() throws PersistentException {
        try {
            UsersManagement usersManagement = new UsersManagement();
            usersManagement.registerUser("Dinis", "mail3@gmail.com", "root", new InvoicePayment(0));
            //System.out.println("ID: " + id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static EventCategory eventCategory_PersonalRecord = new EventCategory("Personal Record", 0.2, 2);
    public static EventCategory eventCategory_MatchRecord = new EventCategory("Match Record", 0.2, 2);
    public static EventCategory eventCategory_BeforeMatch = new EventCategory("Before Match", 0.2, 2);
    public static EventCategory eventCategory_AfterMatch = new EventCategory("After Match", 0.2, 2);
    public static EventCategory eventCategory_Goal = new EventCategory("Goal", 0.2, 2);
    public static EventCategory eventCategory_Fault = new EventCategory("Fault", 0.2, 2);
    public static EventCategory eventCategory_FinalResult = new EventCategory("Final Result", 0.2, 2);

    public void populate() throws PersistentException {

        testUsersManagement();
        populateAthletics();
        populateFootball();

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
                new Athlete("LeBron James", "American", "Male", "https://image.flaticon.com/icons/svg/166/166355.svg"),
                new Athlete("Roger Federer", "Swiss", "Male", "https://image.flaticon.com/icons/svg/166/166368.svg"),
                new Athlete("Aaron Judge", "American", "Male", "https://image.flaticon.com/icons/svg/166/166366.svg"),
                new Athlete("Rui Costa", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166346.svg"),
                new Athlete("Miroslav", "Bulgarian", "Male", "https://image.flaticon.com/icons/svg/166/166344.svg"),
                new Athlete("Tiger Woods", "American", "Male", "https://image.flaticon.com/icons/svg/166/166353.svg"),
                new Athlete("Rúben Vieira", "Portuguese", "Male",  "https://image.flaticon.com/icons/svg/166/166368.svg")
                );

        try {
            for(int i = 0; i < 7; i++){
                Sport sport = sports_list.get(i);
                HashSet<Modality> sport_modalities = new HashSet<Modality>();
                Modality modality = new Modality(sports_list.get(i).getName(), sports_list.get(i).getImgUrl());
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

        try {
            Sport sport_athletics = new Sport("Athletics", "https://image.flaticon.com/icons/svg/123/123500.svg", true);
            HashSet<Modality> athletics_modalities = new HashSet<Modality>();

            Modality modality_sprint = new Modality("Sprint", "https://image.flaticon.com/icons/svg/502/502112.svg");

            modality_sprint._eventCategories.add(eventCategory_BeforeMatch);
            modality_sprint._eventCategories.add(eventCategory_AfterMatch);
            modality_sprint._eventCategories.add(eventCategory_PersonalRecord);
            modality_sprint._eventCategories.add(eventCategory_MatchRecord);

            Competition competition_sprint_1 = new Competition("European Athletics Championships 100m Sprint Men","France", new Date(2018,7,1), new Date(2018, 7, 10), "100m Sprint Men");
            Competition competition_sprint_2 = new Competition("European Athletics Championships 100m Sprint Women","France", new Date(2018,7,1), new Date(2018, 7, 10), "100m Sprint Women");

            MatchEvent matchEvent_sprint_1 = new MatchEvent("100m Sprint Men Finals", new Date(), new Date(), "France", true);
            MatchEvent matchEvent_sprint_2 = new MatchEvent("100m Sprint Women Finals", new Date(), new Date(), "France", true);


            HashSet<Team> sprint_teams = new HashSet<Team>();

            Team team_benfica_sprint = new Team("S.L. Benfica", "https://seeklogo.com/images/S/sport-lisboa-e-benfica-logo-149703CDAB-seeklogo.com.png");
            Athlete athlete_benfica_print_1 = new Athlete("João Pereira", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
            athlete_benfica_print_1.setTeam(team_benfica_sprint);
            matchEvent_sprint_1.athletes.add(athlete_benfica_print_1);
            Athlete athlete_benfica_print_2 = new Athlete("Maria Silva", "Portuguese", "Female", "https://image.flaticon.com/icons/svg/166/166357.svg");
            athlete_benfica_print_2.setTeam(team_benfica_sprint);
            matchEvent_sprint_2.athletes.add(athlete_benfica_print_2);
            Athlete athlete_benfica_print_3 = new Athlete("Luísa Rocha", "Portuguese", "Female", "https://image.flaticon.com/icons/svg/166/166357.svg");
            athlete_benfica_print_3.setTeam(team_benfica_sprint);
            matchEvent_sprint_2.athletes.add(athlete_benfica_print_3);
            sprint_teams.add(team_benfica_sprint);

            Team team_porto_sprint = new Team("FC Porto", "https://seeklogo.com/images/F/F_C__Porto-logo-3BB4DAAEA2-seeklogo.com.png");
            Athlete athlete_porto_print_1 = new Athlete("Ana Miranda", "Portuguese", "Female", "https://image.flaticon.com/icons/svg/166/166357.svg");
            athlete_porto_print_1.setTeam(team_porto_sprint);
            matchEvent_sprint_2.athletes.add(athlete_porto_print_1);
            Athlete athlete_porto_print_2 = new Athlete("Maria Peixoto", "Portuguese", "Female", "https://image.flaticon.com/icons/svg/166/166357.svg");
            athlete_porto_print_2.setTeam(team_porto_sprint);
            matchEvent_sprint_2.athletes.add(athlete_porto_print_2);
            Athlete athlete_porto_print_3 = new Athlete("Carlos Rocha", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
            athlete_porto_print_3.setTeam(team_porto_sprint);
            matchEvent_sprint_1.athletes.add(athlete_porto_print_3);
            sprint_teams.add(team_porto_sprint);

            Team team_sporting_sprint = new Team("Sporting CP", "https://seeklogo.com/images/S/sporting-lisbon-sporting-clube-de-portugal-logo-87718592BF-seeklogo.com.png");
            Athlete athlete_sporting_print_1 = new Athlete("Manuel Pereira", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
            athlete_sporting_print_1.setTeam(team_sporting_sprint);
            matchEvent_sprint_1.athletes.add(athlete_sporting_print_1);
            Athlete athlete_sporting_print_2 = new Athlete("António Sá", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
            athlete_sporting_print_2.setTeam(team_sporting_sprint);
            matchEvent_sprint_1.athletes.add(athlete_sporting_print_2);
            Athlete athlete_sporting_print_3 = new Athlete("José Pedro", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
            athlete_sporting_print_3.setTeam(team_sporting_sprint);
            matchEvent_sprint_1.athletes.add(athlete_sporting_print_3);
            sprint_teams.add(team_sporting_sprint);

            modality_sprint.setORM_Teams(sprint_teams);

            competition_sprint_1.matchEvents.add(matchEvent_sprint_1);
            competition_sprint_2.matchEvents.add(matchEvent_sprint_2);

            modality_sprint.competitions.add(competition_sprint_1);
            modality_sprint.competitions.add(competition_sprint_2);

            athletics_modalities.add(modality_sprint);

            Modality modality_hurdling = new Modality("Hurdling", "https://image.flaticon.com/icons/svg/674/674729.svg");

            modality_hurdling._eventCategories.add(eventCategory_BeforeMatch);
            modality_hurdling._eventCategories.add(eventCategory_AfterMatch);
            modality_hurdling._eventCategories.add(eventCategory_PersonalRecord);
            modality_hurdling._eventCategories.add(eventCategory_MatchRecord);

            Competition competition_hurdling_1 = new Competition("European Athletics Championships 200m Hurdles Men","France", new Date(2018,7,1), new Date(2018, 7, 10), "200m Hurdles Men");
            Competition competition_hurdling_2 = new Competition("European Athletics Championships 200m Hurdles Women","France", new Date(2018,7,1), new Date(2018, 7, 10), "200m Hurdles Women");

            MatchEvent matchEvent_hurdling_1 = new MatchEvent("200m Hurdles Men Finals", new Date(), new Date(), "France", true);
            MatchEvent matchEvent_hurdling_2 = new MatchEvent("200m Hurdles Women Finals", new Date(), new Date(), "France", true);

            HashSet hurdling_teams = new HashSet<Team>();
            athletics_modalities.add(modality_hurdling);

            Team team_benfica_hurdling = new Team("S.L. Benfica", "https://seeklogo.com/images/S/sport-lisboa-e-benfica-logo-149703CDAB-seeklogo.com.png");
            Athlete hurdling_athlete_benfica_print_1 = new Athlete("Luís António", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
            hurdling_athlete_benfica_print_1.setTeam(team_benfica_hurdling);
            matchEvent_hurdling_1.athletes.add(hurdling_athlete_benfica_print_1);
            Athlete hurdling_athlete_benfica_print_2 = new Athlete("Mariana Silva", "Portuguese", "Female", "https://image.flaticon.com/icons/svg/166/166357.svg");
            hurdling_athlete_benfica_print_2.setTeam(team_benfica_hurdling);
            matchEvent_hurdling_2.athletes.add(hurdling_athlete_benfica_print_2);
            Athlete hurdling_athlete_benfica_print_3 = new Athlete("Teresa Rocha", "Portuguese", "Female", "https://image.flaticon.com/icons/svg/166/166357.svg");
            hurdling_athlete_benfica_print_3.setTeam(team_benfica_hurdling);
            matchEvent_hurdling_2.athletes.add(hurdling_athlete_benfica_print_3);
            hurdling_teams.add(team_benfica_hurdling);

            Team team_porto_hurdling = new Team("FC Porto", "https://seeklogo.com/images/F/F_C__Porto-logo-3BB4DAAEA2-seeklogo.com.png");
            Athlete hurdling_athlete_porto_print_1 = new Athlete("Ana Guedes", "Portuguese", "Female", "https://image.flaticon.com/icons/svg/166/166357.svg");
            hurdling_athlete_porto_print_1.setTeam(team_porto_hurdling);
            matchEvent_hurdling_2.athletes.add(hurdling_athlete_porto_print_1);
            Athlete hurdling_athlete_porto_print_2 = new Athlete("Maria Pires", "Portuguese", "Female", "https://image.flaticon.com/icons/svg/166/166357.svg");
            hurdling_athlete_porto_print_2.setTeam(team_porto_hurdling);
            matchEvent_hurdling_2.athletes.add(hurdling_athlete_porto_print_2);
            Athlete hurdling_athlete_porto_print_3 = new Athlete("Carlos Costa", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
            hurdling_athlete_porto_print_3.setTeam(team_porto_hurdling);
            matchEvent_hurdling_1.athletes.add(hurdling_athlete_porto_print_3);
            hurdling_teams.add(team_porto_hurdling);

            Team team_sporting_hurdling = new Team("Sporting CP", "https://seeklogo.com/images/S/sporting-lisbon-sporting-clube-de-portugal-logo-87718592BF-seeklogo.com.png");
            Athlete hurdling_athlete_sporting_print_1 = new Athlete("Manuel Ferreira", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
            hurdling_athlete_sporting_print_1.setTeam(team_sporting_hurdling);
            matchEvent_hurdling_1.athletes.add(hurdling_athlete_sporting_print_1);
            Athlete hurdling_athlete_sporting_print_2 = new Athlete("João Sá", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
            hurdling_athlete_sporting_print_2.setTeam(team_sporting_hurdling);
            matchEvent_hurdling_1.athletes.add(hurdling_athlete_sporting_print_2);
            Athlete hurdling_athlete_sporting_print_3 = new Athlete("Bruno Pedro", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166362.svg");
            hurdling_athlete_sporting_print_3.setTeam(team_sporting_hurdling);
            matchEvent_hurdling_1.athletes.add(hurdling_athlete_sporting_print_3);
            hurdling_teams.add(team_sporting_hurdling);

            modality_hurdling.setORM_Teams(hurdling_teams);

            competition_hurdling_1.matchEvents.add(matchEvent_hurdling_1);
            competition_hurdling_2.matchEvents.add(matchEvent_hurdling_2);

            modality_hurdling.competitions.add(competition_hurdling_1);
            modality_hurdling.competitions.add(competition_hurdling_2);

            sport_athletics.setORM_Modalities(athletics_modalities);
            SportDAO.save(sport_athletics);

        } catch (PersistentException e){
            e.printStackTrace();
        }
    }

    public void populateFootball() throws PersistentException {
        try {
            Sport sport_football = new Sport("Football", "https://image.flaticon.com/icons/svg/123/123495.svg", false);
            HashSet<Modality> sport_modalities = new HashSet<Modality>();

            Modality modality = new Modality("Football", "https://image.flaticon.com/icons/svg/123/123495.svg");

            modality._eventCategories.add(eventCategory_BeforeMatch);
            modality._eventCategories.add(eventCategory_Goal);
            modality._eventCategories.add(eventCategory_Fault);
            modality._eventCategories.add(eventCategory_FinalResult);


            Competition competition_liga = new Competition("Primeira Liga","Portugal", new Date(2017,9,10), new Date(2018, 8, 13), "Liga NOS");
            Competition competition_champions = new Competition("Champions League","Europe", new Date(2017, 11, 1), new Date(2018, 8, 10), "Champions League");

            MatchEvent matchEvent_football_liga_1 = new MatchEvent("S.L. Benfica vs FC Porto", new Date(), new Date(), "Portugal", true);
            MatchEvent matchEvent_football_liga_2 = new MatchEvent("Sporting CP vs S.C. Braga", new Date(), new Date(), "Portugal", true);

            MatchEvent matchEvent_football_champions_1 = new MatchEvent("Real Madrid vs Juventus", new Date(), new Date(), "Spain", true);
            MatchEvent matchEvent_football_champions_2 = new MatchEvent("Manchester City vs Benfica", new Date(), new Date(), "England", true);

            HashSet<Team> teams = new HashSet<Team>();

            Team benfica = new Team("S.L. Benfica", "https://seeklogo.com/images/S/sport-lisboa-e-benfica-logo-149703CDAB-seeklogo.com.png");
            Athlete benfica_athlete = new Athlete("Luisão", "Brazilian", "Male", "https://image.flaticon.com/icons/svg/166/166344.svg");
            benfica_athlete.setTeam(benfica);
            matchEvent_football_liga_1.athletes.add(benfica_athlete);
            matchEvent_football_liga_2.athletes.add(benfica_athlete);
            //matchEvent_football_champions_2.athletes.add(benfica_athlete);
            teams.add(benfica);

            Team porto = new Team("FC Porto", "https://seeklogo.com/images/F/F_C__Porto-logo-3BB4DAAEA2-seeklogo.com.png");
            Athlete porto_athlete = new Athlete("Herrera", "Mexican", "Male", "https://image.flaticon.com/icons/svg/166/166344.svg");
            porto_athlete.setTeam(porto);
            matchEvent_football_liga_1.athletes.add(porto_athlete);
            teams.add(porto);

            Team sporting = new Team("Sporting CP", "https://seeklogo.com/images/S/sporting-lisbon-sporting-clube-de-portugal-logo-87718592BF-seeklogo.com.png");
            Athlete sporting_athlete = new Athlete("Fábio Coentão", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166344.svg");
            sporting_athlete.setTeam(sporting);
            matchEvent_football_liga_2.athletes.add(sporting_athlete);
            teams.add(sporting);

            Team braga = new Team("S.C. Braga", "https://seeklogo.com/images/S/Sporting_Clube_de_Braga-logo-3E6C00F285-seeklogo.com.png");
            Athlete braga_athlete = new Athlete("Paulinho", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166344.svg");
            braga_athlete.setTeam(braga);
            matchEvent_football_liga_2.athletes.add(braga_athlete);
            teams.add(braga);

            Team real_madrid = new Team("Real Madrid C.F.", "https://www.freeiconspng.com/uploads/real-madrid-logo-png-32.png");
            Athlete real_madrid_athlete = new Athlete("Cristiano Ronaldo", "Portuguese", "Male", "https://image.flaticon.com/icons/svg/166/166344.svg");
            real_madrid_athlete.setTeam(real_madrid);
            matchEvent_football_champions_1.athletes.add(real_madrid_athlete);
            teams.add(real_madrid);

            Team juventus = new Team("Juventus F.C.", "https://seeklogo.com/images/J/juventus-2017-new-logo-40FBF543AF-seeklogo.com.png");
            Athlete juventus_athlete = new Athlete("Buffon", "Italian", "Male", "https://image.flaticon.com/icons/svg/166/166344.svg");
            juventus_athlete.setTeam(juventus);
            matchEvent_football_champions_1.athletes.add(juventus_athlete);
            teams.add(juventus);

            Team manchester_city = new Team("Manchester City F.C.", "https://seeklogo.com/images/M/manchester-city-fc-new-logo-4C45133019-seeklogo.com.png");
            Athlete manchester_city_athlete = new Athlete("David Silva", "Spanish","Male", "https://image.flaticon.com/icons/svg/166/166344.svg");
            manchester_city_athlete.setTeam(manchester_city);
            matchEvent_football_champions_2.athletes.add(manchester_city_athlete);
            teams.add(manchester_city);

            competition_liga.matchEvents.add(matchEvent_football_liga_1);
            competition_liga.matchEvents.add(matchEvent_football_liga_2);
            competition_champions.matchEvents.add(matchEvent_football_champions_1);
            competition_champions.matchEvents.add(matchEvent_football_champions_2);

            modality.competitions.add(competition_liga);
            modality.competitions.add(competition_champions);

            modality.setORM_Teams(teams);
            sport_modalities.add(modality);
            sport_football.setORM_Modalities(sport_modalities);
            SportDAO.save(sport_football);
        }
        catch (PersistentException e){
            e.printStackTrace();
        }
    }

    public static void test(){
        Sport sport_football = new Sport("Football", "https://image.flaticon.com/icons/svg/123/123495.svg", false);
        Modality modality = new Modality("Football", "https://image.flaticon.com/icons/svg/123/123495.svg");
        Competition competition_liga = new Competition("Primeira Liga","Portugal", new Date(2017,9,10), new Date(2018, 8, 13), "Liga NOS");
        Team benfica = new Team("S.L. Benfica", "https://seeklogo.com/images/S/sport-lisboa-e-benfica-logo-149703CDAB-seeklogo.com.png");
        Athlete benfica_athlete = new Athlete("Luisão", "Brazilian", "Male", "https://image.flaticon.com/icons/svg/166/166344.svg");
        MatchEvent matchEvent_football_liga_1 = new MatchEvent("S.L. Benfica vs FC Porto", new Date(), new Date(), "Portugal", true);

        benfica.athletes.add(benfica_athlete);
        modality.teams.add(benfica);
        matchEvent_football_liga_1.athletes.add(benfica_athlete);
        competition_liga.matchEvents.add(matchEvent_football_liga_1);
        modality.competitions.add(competition_liga);
        sport_football.modalities.add(modality);

        try {
            SportDAO.save(sport_football);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        try {
            PersistentTransaction t = EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
            Populate createAAData = new Populate();
            t.commit();
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
