/**
 * Licensee: Ricardo(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListEAClassDiagramData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Modality...");
		sportify.competition.Modality[] competitionModalitys = sportify.competition.ModalityDAO.listModalityByQuery(null, null);
		int length = Math.min(competitionModalitys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(competitionModalitys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Team...");
		sportify.subentities.Team[] subEntitiesTeams = sportify.subentities.TeamDAO.listTeamByQuery(null, null);
		length = Math.min(subEntitiesTeams.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(subEntitiesTeams[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing NotificationTracker...");
		sportify.user.NotificationTracker[] userNotificationTrackers = sportify.user.NotificationTrackerDAO.listNotificationTrackerByQuery(null, null);
		length = Math.min(userNotificationTrackers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(userNotificationTrackers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing EventCategory...");
		sportify.event.EventCategory[] eventEventCategorys = sportify.event.EventCategoryDAO.listEventCategoryByQuery(null, null);
		length = Math.min(eventEventCategorys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eventEventCategorys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PrepaidCard...");
		sportify.user.PrepaidCard[] userPrepaidCards = sportify.user.PrepaidCardDAO.listPrepaidCardByQuery(null, null);
		length = Math.min(userPrepaidCards.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(userPrepaidCards[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Competition...");
		sportify.competition.Competition[] competitionCompetitions = sportify.competition.CompetitionDAO.listCompetitionByQuery(null, null);
		length = Math.min(competitionCompetitions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(competitionCompetitions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Subscription...");
		sportify.user.Subscription[] userSubscriptions = sportify.user.SubscriptionDAO.listSubscriptionByQuery(null, null);
		length = Math.min(userSubscriptions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(userSubscriptions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Match...");
		sportify.competition.Match[] competitionMatchs = sportify.competition.MatchDAO.listMatchByQuery(null, null);
		length = Math.min(competitionMatchs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(competitionMatchs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Event...");
		sportify.event.Event[] eventEvents = sportify.event.EventDAO.listEventByQuery(null, null);
		length = Math.min(eventEvents.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eventEvents[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing User...");
		sportify.user.User[] userUsers = sportify.user.UserDAO.listUserByQuery(null, null);
		length = Math.min(userUsers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(userUsers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing InvoicePayment...");
		sportify.user.InvoicePayment[] userInvoicePayments = sportify.user.InvoicePaymentDAO.listInvoicePaymentByQuery(null, null);
		length = Math.min(userInvoicePayments.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(userInvoicePayments[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Invoice...");
		sportify.user.Invoice[] userInvoices = sportify.user.InvoiceDAO.listInvoiceByQuery(null, null);
		length = Math.min(userInvoices.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(userInvoices[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Athlete...");
		sportify.subentities.Athlete[] subEntitiesAthletes = sportify.subentities.AthleteDAO.listAthleteByQuery(null, null);
		length = Math.min(subEntitiesAthletes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(subEntitiesAthletes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Sport...");
		sportify.competition.Sport[] competitionSports = sportify.competition.SportDAO.listSportByQuery(null, null);
		length = Math.min(competitionSports.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(competitionSports[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing MonthlyBill...");
		sportify.user.MonthlyBill[] userMonthlyBills = sportify.user.MonthlyBillDAO.listMonthlyBillByQuery(null, null);
		length = Math.min(userMonthlyBills.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(userMonthlyBills[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Modality by Criteria...");
		sportify.competition.ModalityCriteria lcompetitionModalityCriteria = new sportify.competition.ModalityCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcompetitionModalityCriteria.ID.eq();
		lcompetitionModalityCriteria.setMaxResults(ROW_COUNT);
		sportify.competition.Modality[] competitionModalitys = lcompetitionModalityCriteria.listModality();
		int length =competitionModalitys== null ? 0 : Math.min(competitionModalitys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(competitionModalitys[i]);
		}
		System.out.println(length + " Modality record(s) retrieved."); 
		
		System.out.println("Listing Team by Criteria...");
		sportify.subentities.TeamCriteria subEntitiesTeamCriteria = new sportify.subentities.TeamCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//subEntitiesTeamCriteria.ID.eq();
		subEntitiesTeamCriteria.setMaxResults(ROW_COUNT);
		sportify.subentities.Team[] subEntitiesTeams = subEntitiesTeamCriteria.listTeam();
		length =subEntitiesTeams== null ? 0 : Math.min(subEntitiesTeams.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(subEntitiesTeams[i]);
		}
		System.out.println(length + " Team record(s) retrieved."); 
		
		System.out.println("Listing NotificationTracker by Criteria...");
		sportify.user.NotificationTrackerCriteria luserNotificationTrackerCriteria = new sportify.user.NotificationTrackerCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//luserNotificationTrackerCriteria.ID.eq();
		luserNotificationTrackerCriteria.setMaxResults(ROW_COUNT);
		sportify.user.NotificationTracker[] userNotificationTrackers = luserNotificationTrackerCriteria.listNotificationTracker();
		length =userNotificationTrackers== null ? 0 : Math.min(userNotificationTrackers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(userNotificationTrackers[i]);
		}
		System.out.println(length + " NotificationTracker record(s) retrieved."); 
		
		System.out.println("Listing EventCategory by Criteria...");
		sportify.event.EventCategoryCriteria leventEventCategoryCriteria = new sportify.event.EventCategoryCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//leventEventCategoryCriteria.ID.eq();
		leventEventCategoryCriteria.setMaxResults(ROW_COUNT);
		sportify.event.EventCategory[] eventEventCategorys = leventEventCategoryCriteria.listEventCategory();
		length =eventEventCategorys== null ? 0 : Math.min(eventEventCategorys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(eventEventCategorys[i]);
		}
		System.out.println(length + " EventCategory record(s) retrieved."); 
		
		System.out.println("Listing PrepaidCard by Criteria...");
		sportify.user.PrepaidCardCriteria luserPrepaidCardCriteria = new sportify.user.PrepaidCardCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//luserPrepaidCardCriteria.ID.eq();
		luserPrepaidCardCriteria.setMaxResults(ROW_COUNT);
		sportify.user.PrepaidCard[] userPrepaidCards = luserPrepaidCardCriteria.listPrepaidCard();
		length =userPrepaidCards== null ? 0 : Math.min(userPrepaidCards.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(userPrepaidCards[i]);
		}
		System.out.println(length + " PrepaidCard record(s) retrieved."); 
		
		System.out.println("Listing Competition by Criteria...");
		sportify.competition.CompetitionCriteria lcompetitionCompetitionCriteria = new sportify.competition.CompetitionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcompetitionCompetitionCriteria.ID.eq();
		lcompetitionCompetitionCriteria.setMaxResults(ROW_COUNT);
		sportify.competition.Competition[] competitionCompetitions = lcompetitionCompetitionCriteria.listCompetition();
		length =competitionCompetitions== null ? 0 : Math.min(competitionCompetitions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(competitionCompetitions[i]);
		}
		System.out.println(length + " Competition record(s) retrieved."); 
		
		System.out.println("Listing Subscription by Criteria...");
		sportify.user.SubscriptionCriteria luserSubscriptionCriteria = new sportify.user.SubscriptionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//luserSubscriptionCriteria.ID.eq();
		luserSubscriptionCriteria.setMaxResults(ROW_COUNT);
		sportify.user.Subscription[] userSubscriptions = luserSubscriptionCriteria.listSubscription();
		length =userSubscriptions== null ? 0 : Math.min(userSubscriptions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(userSubscriptions[i]);
		}
		System.out.println(length + " Subscription record(s) retrieved."); 
		
		System.out.println("Listing Match by Criteria...");
		sportify.competition.MatchCriteria lcompetitionMatchCriteria = new sportify.competition.MatchCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcompetitionMatchCriteria.ID.eq();
		lcompetitionMatchCriteria.setMaxResults(ROW_COUNT);
		sportify.competition.Match[] competitionMatchs = lcompetitionMatchCriteria.listMatch();
		length =competitionMatchs== null ? 0 : Math.min(competitionMatchs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(competitionMatchs[i]);
		}
		System.out.println(length + " Match record(s) retrieved."); 
		
		System.out.println("Listing Event by Criteria...");
		sportify.event.EventCriteria leventEventCriteria = new sportify.event.EventCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//leventEventCriteria.ID.eq();
		leventEventCriteria.setMaxResults(ROW_COUNT);
		sportify.event.Event[] eventEvents = leventEventCriteria.listEvent();
		length =eventEvents== null ? 0 : Math.min(eventEvents.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(eventEvents[i]);
		}
		System.out.println(length + " Event record(s) retrieved."); 
		
		System.out.println("Listing User by Criteria...");
		sportify.user.UserCriteria luserUserCriteria = new sportify.user.UserCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//luserUserCriteria.ID.eq();
		luserUserCriteria.setMaxResults(ROW_COUNT);
		sportify.user.User[] userUsers = luserUserCriteria.listUser();
		length =userUsers== null ? 0 : Math.min(userUsers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(userUsers[i]);
		}
		System.out.println(length + " User record(s) retrieved."); 
		
		System.out.println("Listing InvoicePayment by Criteria...");
		sportify.user.InvoicePaymentCriteria luserInvoicePaymentCriteria = new sportify.user.InvoicePaymentCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//luserInvoicePaymentCriteria.ID.eq();
		luserInvoicePaymentCriteria.setMaxResults(ROW_COUNT);
		sportify.user.InvoicePayment[] userInvoicePayments = luserInvoicePaymentCriteria.listInvoicePayment();
		length =userInvoicePayments== null ? 0 : Math.min(userInvoicePayments.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(userInvoicePayments[i]);
		}
		System.out.println(length + " InvoicePayment record(s) retrieved."); 
		
		System.out.println("Listing Invoice by Criteria...");
		sportify.user.InvoiceCriteria luserInvoiceCriteria = new sportify.user.InvoiceCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//luserInvoiceCriteria.ID.eq();
		luserInvoiceCriteria.setMaxResults(ROW_COUNT);
		sportify.user.Invoice[] userInvoices = luserInvoiceCriteria.listInvoice();
		length =userInvoices== null ? 0 : Math.min(userInvoices.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(userInvoices[i]);
		}
		System.out.println(length + " Invoice record(s) retrieved."); 
		
		System.out.println("Listing Athlete by Criteria...");
		sportify.subentities.AthleteCriteria subEntitiesAthleteCriteria = new sportify.subentities.AthleteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//subEntitiesAthleteCriteria.ID.eq();
		subEntitiesAthleteCriteria.setMaxResults(ROW_COUNT);
		sportify.subentities.Athlete[] subEntitiesAthletes = subEntitiesAthleteCriteria.listAthlete();
		length =subEntitiesAthletes== null ? 0 : Math.min(subEntitiesAthletes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(subEntitiesAthletes[i]);
		}
		System.out.println(length + " Athlete record(s) retrieved."); 
		
		System.out.println("Listing Sport by Criteria...");
		sportify.competition.SportCriteria lcompetitionSportCriteria = new sportify.competition.SportCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcompetitionSportCriteria.ID.eq();
		lcompetitionSportCriteria.setMaxResults(ROW_COUNT);
		sportify.competition.Sport[] competitionSports = lcompetitionSportCriteria.listSport();
		length =competitionSports== null ? 0 : Math.min(competitionSports.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(competitionSports[i]);
		}
		System.out.println(length + " Sport record(s) retrieved."); 
		
		System.out.println("Listing MonthlyBill by Criteria...");
		sportify.user.MonthlyBillCriteria luserMonthlyBillCriteria = new sportify.user.MonthlyBillCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//luserMonthlyBillCriteria.ID.eq();
		luserMonthlyBillCriteria.setMaxResults(ROW_COUNT);
		sportify.user.MonthlyBill[] userMonthlyBills = luserMonthlyBillCriteria.listMonthlyBill();
		length =userMonthlyBills== null ? 0 : Math.min(userMonthlyBills.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(userMonthlyBills[i]);
		}
		System.out.println(length + " MonthlyBill record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListEAClassDiagramData listEAClassDiagramData = new ListEAClassDiagramData();
			try {
				listEAClassDiagramData.listTestData();
				//listEAClassDiagramData.listByCriteria();
			}
			finally {
				sportify.competition.EAClassDiagramPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
