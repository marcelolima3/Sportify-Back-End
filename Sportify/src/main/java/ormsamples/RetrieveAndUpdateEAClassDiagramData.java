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
public class RetrieveAndUpdateEAClassDiagramData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
		try {
			com.Sportify.Entities.competition.Modality lcompetitionModality = ModalityDAO.loadModalityByQuery(null, null);
			// Update the properties of the persistent object
			ModalityDAO.save(lcompetitionModality);
			com.Sportify.Entities.subentities.Team lsubEntitiesTeam = TeamDAO.loadTeamByQuery(null, null);
			// Update the properties of the persistent object
			TeamDAO.save(lsubEntitiesTeam);
			com.Sportify.Entities.user.NotificationTracker luserNotificationTracker = NotificationTrackerDAO.loadNotificationTrackerByQuery(null, null);
			// Update the properties of the persistent object
			NotificationTrackerDAO.save(luserNotificationTracker);
			com.Sportify.Entities.event.EventCategory leventEventCategory = EventCategoryDAO.loadEventCategoryByQuery(null, null);
			// Update the properties of the persistent object
			EventCategoryDAO.save(leventEventCategory);
			com.Sportify.Entities.payment.PrepaidCard lpaymentPrepaidCard = PrepaidCardDAO.loadPrepaidCardByQuery(null, null);
			// Update the properties of the persistent object
			PrepaidCardDAO.save(lpaymentPrepaidCard);
			com.Sportify.Entities.competition.Competition lcompetitionCompetition = CompetitionDAO.loadCompetitionByQuery(null, null);
			// Update the properties of the persistent object
			CompetitionDAO.save(lcompetitionCompetition);
			com.Sportify.Entities.user.Subscription luserSubscription = SubscriptionDAO.loadSubscriptionByQuery(null, null);
			// Update the properties of the persistent object
			SubscriptionDAO.save(luserSubscription);
			com.Sportify.Entities.competition.MatchEvent lcompetitionMatchEvent = MatchEventDAO.loadMatchEventByQuery(null, null);
			// Update the properties of the persistent object
			MatchEventDAO.save(lcompetitionMatchEvent);
			com.Sportify.Entities.event.Event leventEvent = EventDAO.loadEventByQuery(null, null);
			// Update the properties of the persistent object
			EventDAO.save(leventEvent);
			com.Sportify.Entities.user.User luserUser = UserDAO.loadUserByQuery(null, null);
			// Update the properties of the persistent object
			UserDAO.save(luserUser);
			com.Sportify.Entities.payment.InvoicePayment lpaymentInvoicePayment = InvoicePaymentDAO.loadInvoicePaymentByQuery(null, null);
			// Update the properties of the persistent object
			InvoicePaymentDAO.save(lpaymentInvoicePayment);
			com.Sportify.Entities.payment.Invoice lpaymentInvoice = InvoiceDAO.loadInvoiceByQuery(null, null);
			// Update the properties of the persistent object
			InvoiceDAO.save(lpaymentInvoice);
			com.Sportify.Entities.subentities.Athlete lsubEntitiesAthlete = AthleteDAO.loadAthleteByQuery(null, null);
			// Update the properties of the persistent object
			AthleteDAO.save(lsubEntitiesAthlete);
			com.Sportify.Entities.competition.Sport lcompetitionSport = SportDAO.loadSportByQuery(null, null);
			// Update the properties of the persistent object
			SportDAO.save(lcompetitionSport);
			com.Sportify.Entities.payment.MonthlyBill lpaymentMonthlyBill = MonthlyBillDAO.loadMonthlyBillByQuery(null, null);
			// Update the properties of the persistent object
			MonthlyBillDAO.save(lpaymentMonthlyBill);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Modality by ModalityCriteria");
		com.Sportify.Entities.competition.ModalityCriteria lcompetitionModalityCriteria = new com.Sportify.Entities.competition.ModalityCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcompetitionModalityCriteria.ID.eq();
		System.out.println(lcompetitionModalityCriteria.uniqueModality());
		
		System.out.println("Retrieving Team by TeamCriteria");
		com.Sportify.Entities.subentities.TeamCriteria lsubEntitiesTeamCriteria = new com.Sportify.Entities.subentities.TeamCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsubEntitiesTeamCriteria.ID.eq();
		System.out.println(lsubEntitiesTeamCriteria.uniqueTeam());
		
		System.out.println("Retrieving NotificationTracker by NotificationTrackerCriteria");
		com.Sportify.Entities.user.NotificationTrackerCriteria luserNotificationTrackerCriteria = new com.Sportify.Entities.user.NotificationTrackerCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//luserNotificationTrackerCriteria.ID.eq();
		System.out.println(luserNotificationTrackerCriteria.uniqueNotificationTracker());
		
		System.out.println("Retrieving EventCategory by EventCategoryCriteria");
		com.Sportify.Entities.event.EventCategoryCriteria leventEventCategoryCriteria = new com.Sportify.Entities.event.EventCategoryCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//leventEventCategoryCriteria.ID.eq();
		System.out.println(leventEventCategoryCriteria.uniqueEventCategory());
		
		System.out.println("Retrieving PrepaidCard by PrepaidCardCriteria");
		com.Sportify.Entities.payment.PrepaidCardCriteria lpaymentPrepaidCardCriteria = new com.Sportify.Entities.payment.PrepaidCardCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpaymentPrepaidCardCriteria.ID.eq();
		System.out.println(lpaymentPrepaidCardCriteria.uniquePrepaidCard());
		
		System.out.println("Retrieving Competition by CompetitionCriteria");
		com.Sportify.Entities.competition.CompetitionCriteria lcompetitionCompetitionCriteria = new com.Sportify.Entities.competition.CompetitionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcompetitionCompetitionCriteria.ID.eq();
		System.out.println(lcompetitionCompetitionCriteria.uniqueCompetition());
		
		System.out.println("Retrieving Subscription by SubscriptionCriteria");
		com.Sportify.Entities.user.SubscriptionCriteria luserSubscriptionCriteria = new com.Sportify.Entities.user.SubscriptionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//luserSubscriptionCriteria.ID.eq();
		System.out.println(luserSubscriptionCriteria.uniqueSubscription());
		
		System.out.println("Retrieving MatchEvent by MatchEventCriteria");
		com.Sportify.Entities.competition.MatchEventCriteria lcompetitionMatchEventCriteria = new com.Sportify.Entities.competition.MatchEventCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcompetitionMatchEventCriteria.ID.eq();
		System.out.println(lcompetitionMatchEventCriteria.uniqueMatchEvent());
		
		System.out.println("Retrieving Event by EventCriteria");
		com.Sportify.Entities.event.EventCriteria leventEventCriteria = new com.Sportify.Entities.event.EventCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//leventEventCriteria.ID.eq();
		System.out.println(leventEventCriteria.uniqueEvent());
		
		System.out.println("Retrieving User by UserCriteria");
		com.Sportify.Entities.user.UserCriteria luserUserCriteria = new com.Sportify.Entities.user.UserCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//luserUserCriteria.ID.eq();
		System.out.println(luserUserCriteria.uniqueUser());
		
		System.out.println("Retrieving InvoicePayment by InvoicePaymentCriteria");
		com.Sportify.Entities.payment.InvoicePaymentCriteria lpaymentInvoicePaymentCriteria = new com.Sportify.Entities.payment.InvoicePaymentCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpaymentInvoicePaymentCriteria.ID.eq();
		System.out.println(lpaymentInvoicePaymentCriteria.uniqueInvoicePayment());
		
		System.out.println("Retrieving Invoice by InvoiceCriteria");
		com.Sportify.Entities.payment.InvoiceCriteria lpaymentInvoiceCriteria = new com.Sportify.Entities.payment.InvoiceCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpaymentInvoiceCriteria.ID.eq();
		System.out.println(lpaymentInvoiceCriteria.uniqueInvoice());
		
		System.out.println("Retrieving Athlete by AthleteCriteria");
		com.Sportify.Entities.subentities.AthleteCriteria lsubEntitiesAthleteCriteria = new com.Sportify.Entities.subentities.AthleteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsubEntitiesAthleteCriteria.ID.eq();
		System.out.println(lsubEntitiesAthleteCriteria.uniqueAthlete());
		
		System.out.println("Retrieving Sport by SportCriteria");
		com.Sportify.Entities.competition.SportCriteria lcompetitionSportCriteria = new com.Sportify.Entities.competition.SportCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcompetitionSportCriteria.ID.eq();
		System.out.println(lcompetitionSportCriteria.uniqueSport());
		
		System.out.println("Retrieving MonthlyBill by MonthlyBillCriteria");
		com.Sportify.Entities.payment.MonthlyBillCriteria lpaymentMonthlyBillCriteria = new com.Sportify.Entities.payment.MonthlyBillCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpaymentMonthlyBillCriteria.ID.eq();
		System.out.println(lpaymentMonthlyBillCriteria.uniqueMonthlyBill());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateEAClassDiagramData retrieveAndUpdateEAClassDiagramData = new RetrieveAndUpdateEAClassDiagramData();
			try {
				retrieveAndUpdateEAClassDiagramData.retrieveAndUpdateTestData();
				//retrieveAndUpdateEAClassDiagramData.retrieveByCriteria();
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
