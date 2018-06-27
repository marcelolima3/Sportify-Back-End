/**
 * Licensee: Ricardo(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import com.Sportify.DAO.EAClassDiagramPersistentManager;
import com.Sportify.DAO.competition.CompetitionDAO;
import com.Sportify.DAO.competition.MatchEventDAO;
import com.Sportify.DAO.competition.ModalityDAO;
import com.Sportify.DAO.competition.SportDAO;
import com.Sportify.DAO.event.EventCategoryDAO;
import com.Sportify.DAO.event.EventDAO;
import com.Sportify.DAO.payment.InvoiceDAO;
import com.Sportify.DAO.payment.InvoicePaymentDAO;
import com.Sportify.DAO.payment.MonthlyBillDAO;
import com.Sportify.DAO.payment.PrepaidCardDAO;
import com.Sportify.DAO.subentities.AthleteDAO;
import com.Sportify.DAO.subentities.TeamDAO;
import com.Sportify.DAO.user.NotificationTrackerDAO;
import com.Sportify.DAO.user.SubscriptionDAO;
import com.Sportify.DAO.user.UserDAO;
import org.orm.*;
public class ListEAClassDiagramData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Modality...");
		com.Sportify.Entities.competition.Modality[] competitionModalitys = ModalityDAO.listModalityByQuery(null, null);
		int length = Math.min(competitionModalitys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(competitionModalitys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Team...");
		com.Sportify.Entities.subentities.Team[] subEntitiesTeams = TeamDAO.listTeamByQuery(null, null);
		length = Math.min(subEntitiesTeams.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(subEntitiesTeams[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing NotificationTracker...");
		com.Sportify.Entities.user.NotificationTracker[] userNotificationTrackers = NotificationTrackerDAO.listNotificationTrackerByQuery(null, null);
		length = Math.min(userNotificationTrackers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(userNotificationTrackers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing EventCategory...");
		com.Sportify.Entities.event.EventCategory[] eventEventCategorys = EventCategoryDAO.listEventCategoryByQuery(null, null);
		length = Math.min(eventEventCategorys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eventEventCategorys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PrepaidCard...");
		com.Sportify.Entities.payment.PrepaidCard[] paymentPrepaidCards = PrepaidCardDAO.listPrepaidCardByQuery(null, null);
		length = Math.min(paymentPrepaidCards.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(paymentPrepaidCards[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Competition...");
		com.Sportify.Entities.competition.Competition[] competitionCompetitions = CompetitionDAO.listCompetitionByQuery(null, null);
		length = Math.min(competitionCompetitions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(competitionCompetitions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Subscription...");
		com.Sportify.Entities.user.Subscription[] userSubscriptions = SubscriptionDAO.listSubscriptionByQuery(null, null);
		length = Math.min(userSubscriptions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(userSubscriptions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing MatchEvent...");
		com.Sportify.Entities.competition.MatchEvent[] competitionMatchEvents = MatchEventDAO.listMatchEventByQuery(null, null);
		length = Math.min(competitionMatchEvents.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(competitionMatchEvents[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Event...");
		com.Sportify.Entities.event.Event[] eventEvents = EventDAO.listEventByQuery(null, null);
		length = Math.min(eventEvents.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eventEvents[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing User...");
		com.Sportify.Entities.user.User[] userUsers = UserDAO.listUserByQuery(null, null);
		length = Math.min(userUsers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(userUsers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing InvoicePayment...");
		com.Sportify.Entities.payment.InvoicePayment[] paymentInvoicePayments = InvoicePaymentDAO.listInvoicePaymentByQuery(null, null);
		length = Math.min(paymentInvoicePayments.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(paymentInvoicePayments[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Invoice...");
		com.Sportify.Entities.payment.Invoice[] paymentInvoices = InvoiceDAO.listInvoiceByQuery(null, null);
		length = Math.min(paymentInvoices.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(paymentInvoices[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Athlete...");
		com.Sportify.Entities.subentities.Athlete[] subEntitiesAthletes = AthleteDAO.listAthleteByQuery(null, null);
		length = Math.min(subEntitiesAthletes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(subEntitiesAthletes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Sport...");
		com.Sportify.Entities.competition.Sport[] competitionSports = SportDAO.listSportByQuery(null, null);
		length = Math.min(competitionSports.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(competitionSports[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing MonthlyBill...");
		com.Sportify.Entities.payment.MonthlyBill[] paymentMonthlyBills = MonthlyBillDAO.listMonthlyBillByQuery(null, null);
		length = Math.min(paymentMonthlyBills.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(paymentMonthlyBills[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Modality by Criteria...");
		com.Sportify.Entities.competition.ModalityCriteria lcompetitionModalityCriteria = new com.Sportify.Entities.competition.ModalityCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcompetitionModalityCriteria.ID.eq();
		lcompetitionModalityCriteria.setMaxResults(ROW_COUNT);
		com.Sportify.Entities.competition.Modality[] competitionModalitys = lcompetitionModalityCriteria.listModality();
		int length =competitionModalitys== null ? 0 : Math.min(competitionModalitys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(competitionModalitys[i]);
		}
		System.out.println(length + " Modality record(s) retrieved."); 
		
		System.out.println("Listing Team by Criteria...");
		com.Sportify.Entities.subentities.TeamCriteria lsubEntitiesTeamCriteria = new com.Sportify.Entities.subentities.TeamCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsubEntitiesTeamCriteria.ID.eq();
		lsubEntitiesTeamCriteria.setMaxResults(ROW_COUNT);
		com.Sportify.Entities.subentities.Team[] subEntitiesTeams = lsubEntitiesTeamCriteria.listTeam();
		length =subEntitiesTeams== null ? 0 : Math.min(subEntitiesTeams.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(subEntitiesTeams[i]);
		}
		System.out.println(length + " Team record(s) retrieved."); 
		
		System.out.println("Listing NotificationTracker by Criteria...");
		com.Sportify.Entities.user.NotificationTrackerCriteria luserNotificationTrackerCriteria = new com.Sportify.Entities.user.NotificationTrackerCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//luserNotificationTrackerCriteria.ID.eq();
		luserNotificationTrackerCriteria.setMaxResults(ROW_COUNT);
		com.Sportify.Entities.user.NotificationTracker[] userNotificationTrackers = luserNotificationTrackerCriteria.listNotificationTracker();
		length =userNotificationTrackers== null ? 0 : Math.min(userNotificationTrackers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(userNotificationTrackers[i]);
		}
		System.out.println(length + " NotificationTracker record(s) retrieved."); 
		
		System.out.println("Listing EventCategory by Criteria...");
		com.Sportify.Entities.event.EventCategoryCriteria leventEventCategoryCriteria = new com.Sportify.Entities.event.EventCategoryCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//leventEventCategoryCriteria.ID.eq();
		leventEventCategoryCriteria.setMaxResults(ROW_COUNT);
		com.Sportify.Entities.event.EventCategory[] eventEventCategorys = leventEventCategoryCriteria.listEventCategory();
		length =eventEventCategorys== null ? 0 : Math.min(eventEventCategorys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(eventEventCategorys[i]);
		}
		System.out.println(length + " EventCategory record(s) retrieved."); 
		
		System.out.println("Listing PrepaidCard by Criteria...");
		com.Sportify.Entities.payment.PrepaidCardCriteria lpaymentPrepaidCardCriteria = new com.Sportify.Entities.payment.PrepaidCardCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpaymentPrepaidCardCriteria.ID.eq();
		lpaymentPrepaidCardCriteria.setMaxResults(ROW_COUNT);
		com.Sportify.Entities.payment.PrepaidCard[] paymentPrepaidCards = lpaymentPrepaidCardCriteria.listPrepaidCard();
		length =paymentPrepaidCards== null ? 0 : Math.min(paymentPrepaidCards.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(paymentPrepaidCards[i]);
		}
		System.out.println(length + " PrepaidCard record(s) retrieved."); 
		
		System.out.println("Listing Competition by Criteria...");
		com.Sportify.Entities.competition.CompetitionCriteria lcompetitionCompetitionCriteria = new com.Sportify.Entities.competition.CompetitionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcompetitionCompetitionCriteria.ID.eq();
		lcompetitionCompetitionCriteria.setMaxResults(ROW_COUNT);
		com.Sportify.Entities.competition.Competition[] competitionCompetitions = lcompetitionCompetitionCriteria.listCompetition();
		length =competitionCompetitions== null ? 0 : Math.min(competitionCompetitions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(competitionCompetitions[i]);
		}
		System.out.println(length + " Competition record(s) retrieved."); 
		
		System.out.println("Listing Subscription by Criteria...");
		com.Sportify.Entities.user.SubscriptionCriteria luserSubscriptionCriteria = new com.Sportify.Entities.user.SubscriptionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//luserSubscriptionCriteria.ID.eq();
		luserSubscriptionCriteria.setMaxResults(ROW_COUNT);
		com.Sportify.Entities.user.Subscription[] userSubscriptions = luserSubscriptionCriteria.listSubscription();
		length =userSubscriptions== null ? 0 : Math.min(userSubscriptions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(userSubscriptions[i]);
		}
		System.out.println(length + " Subscription record(s) retrieved."); 
		
		System.out.println("Listing MatchEvent by Criteria...");
		com.Sportify.Entities.competition.MatchEventCriteria lcompetitionMatchEventCriteria = new com.Sportify.Entities.competition.MatchEventCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcompetitionMatchEventCriteria.ID.eq();
		lcompetitionMatchEventCriteria.setMaxResults(ROW_COUNT);
		com.Sportify.Entities.competition.MatchEvent[] competitionMatchEvents = lcompetitionMatchEventCriteria.listMatchEvent();
		length =competitionMatchEvents== null ? 0 : Math.min(competitionMatchEvents.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(competitionMatchEvents[i]);
		}
		System.out.println(length + " MatchEvent record(s) retrieved."); 
		
		System.out.println("Listing Event by Criteria...");
		com.Sportify.Entities.event.EventCriteria leventEventCriteria = new com.Sportify.Entities.event.EventCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//leventEventCriteria.ID.eq();
		leventEventCriteria.setMaxResults(ROW_COUNT);
		com.Sportify.Entities.event.Event[] eventEvents = leventEventCriteria.listEvent();
		length =eventEvents== null ? 0 : Math.min(eventEvents.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(eventEvents[i]);
		}
		System.out.println(length + " Event record(s) retrieved."); 
		
		System.out.println("Listing User by Criteria...");
		com.Sportify.Entities.user.UserCriteria luserUserCriteria = new com.Sportify.Entities.user.UserCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//luserUserCriteria.ID.eq();
		luserUserCriteria.setMaxResults(ROW_COUNT);
		com.Sportify.Entities.user.User[] userUsers = luserUserCriteria.listUser();
		length =userUsers== null ? 0 : Math.min(userUsers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(userUsers[i]);
		}
		System.out.println(length + " User record(s) retrieved."); 
		
		System.out.println("Listing InvoicePayment by Criteria...");
		com.Sportify.Entities.payment.InvoicePaymentCriteria lpaymentInvoicePaymentCriteria = new com.Sportify.Entities.payment.InvoicePaymentCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpaymentInvoicePaymentCriteria.ID.eq();
		lpaymentInvoicePaymentCriteria.setMaxResults(ROW_COUNT);
		com.Sportify.Entities.payment.InvoicePayment[] paymentInvoicePayments = lpaymentInvoicePaymentCriteria.listInvoicePayment();
		length =paymentInvoicePayments== null ? 0 : Math.min(paymentInvoicePayments.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(paymentInvoicePayments[i]);
		}
		System.out.println(length + " InvoicePayment record(s) retrieved."); 
		
		System.out.println("Listing Invoice by Criteria...");
		com.Sportify.Entities.payment.InvoiceCriteria lpaymentInvoiceCriteria = new com.Sportify.Entities.payment.InvoiceCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpaymentInvoiceCriteria.ID.eq();
		lpaymentInvoiceCriteria.setMaxResults(ROW_COUNT);
		com.Sportify.Entities.payment.Invoice[] paymentInvoices = lpaymentInvoiceCriteria.listInvoice();
		length =paymentInvoices== null ? 0 : Math.min(paymentInvoices.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(paymentInvoices[i]);
		}
		System.out.println(length + " Invoice record(s) retrieved."); 
		
		System.out.println("Listing Athlete by Criteria...");
		com.Sportify.Entities.subentities.AthleteCriteria lsubEntitiesAthleteCriteria = new com.Sportify.Entities.subentities.AthleteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsubEntitiesAthleteCriteria.ID.eq();
		lsubEntitiesAthleteCriteria.setMaxResults(ROW_COUNT);
		com.Sportify.Entities.subentities.Athlete[] subEntitiesAthletes = lsubEntitiesAthleteCriteria.listAthlete();
		length =subEntitiesAthletes== null ? 0 : Math.min(subEntitiesAthletes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(subEntitiesAthletes[i]);
		}
		System.out.println(length + " Athlete record(s) retrieved."); 
		
		System.out.println("Listing Sport by Criteria...");
		com.Sportify.Entities.competition.SportCriteria lcompetitionSportCriteria = new com.Sportify.Entities.competition.SportCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcompetitionSportCriteria.ID.eq();
		lcompetitionSportCriteria.setMaxResults(ROW_COUNT);
		com.Sportify.Entities.competition.Sport[] competitionSports = lcompetitionSportCriteria.listSport();
		length =competitionSports== null ? 0 : Math.min(competitionSports.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(competitionSports[i]);
		}
		System.out.println(length + " Sport record(s) retrieved."); 
		
		System.out.println("Listing MonthlyBill by Criteria...");
		com.Sportify.Entities.payment.MonthlyBillCriteria lpaymentMonthlyBillCriteria = new com.Sportify.Entities.payment.MonthlyBillCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpaymentMonthlyBillCriteria.ID.eq();
		lpaymentMonthlyBillCriteria.setMaxResults(ROW_COUNT);
		com.Sportify.Entities.payment.MonthlyBill[] paymentMonthlyBills = lpaymentMonthlyBillCriteria.listMonthlyBill();
		length =paymentMonthlyBills== null ? 0 : Math.min(paymentMonthlyBills.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(paymentMonthlyBills[i]);
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
				EAClassDiagramPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
