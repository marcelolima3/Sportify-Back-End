package database.ormsamples; /**
 * Licensee: tr3s(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
import sportify.models.*;
import sportify.models.competition.*;
import sportify.models.event.*;
import sportify.models.user.*;

public class RetrieveAndUpdateEAClassDiagramData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
		try {
			User user = UserDAO.loadUserByQuery(null, null);
			// Update the properties of the persistent object
			UserDAO.save(user);
			InvoicePayment invoicePayment = InvoicePaymentDAO.loadInvoicePaymentByQuery(null, null);
			// Update the properties of the persistent object
			InvoicePaymentDAO.save(invoicePayment);
			PrepaidCard prepaidCard = PrepaidCardDAO.loadPrepaidCardByQuery(null, null);
			// Update the properties of the persistent object
			PrepaidCardDAO.save(prepaidCard);
			MonthlyBill monthlyBill = MonthlyBillDAO.loadMonthlyBillByQuery(null, null);
			// Update the properties of the persistent object
			MonthlyBillDAO.save(monthlyBill);
			Subscription subscription = SubscriptionDAO.loadSubscriptionByQuery(null, null);
			// Update the properties of the persistent object
			SubscriptionDAO.save(subscription);
			Sport sport = SportDAO.loadSportByQuery(null, null);
			// Update the properties of the persistent object
			SportDAO.save(sport);
			Competition competition = CompetitionDAO.loadCompetitionByQuery(null, null);
			// Update the properties of the persistent object
			CompetitionDAO.save(competition);
			Event leventEvent = EventDAO.loadEventByQuery(null, null);
			// Update the properties of the persistent object
			EventDAO.save(leventEvent);
			NotificationTracker notificationTracker = NotificationTrackerDAO.loadNotificationTrackerByQuery(null, null);
			// Update the properties of the persistent object
			NotificationTrackerDAO.save(notificationTracker);
			EventCategory leventEventCategory = EventCategoryDAO.loadEventCategoryByQuery(null, null);
			// Update the properties of the persistent object
			EventCategoryDAO.save(leventEventCategory);
			Invoice invoice = InvoiceDAO.loadInvoiceByQuery(null, null);
			// Update the properties of the persistent object
			InvoiceDAO.save(invoice);
			Athlete athlete = AthleteDAO.loadAthleteByQuery(null, null);
			// Update the properties of the persistent object
			AthleteDAO.save(athlete);
			Team team = TeamDAO.loadTeamByQuery(null, null);
			// Update the properties of the persistent object
			TeamDAO.save(team);
			Match match = MatchDAO.loadMatchByQuery(null, null);
			// Update the properties of the persistent object
			MatchDAO.save(match);
			Modality modality = ModalityDAO.loadModalityByQuery(null, null);
			// Update the properties of the persistent object
			ModalityDAO.save(modality);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving User by UserCriteria");
		UserCriteria userCriteria = new UserCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//userCriteria.ID.eq();
		System.out.println(userCriteria.uniqueUser());
		
		System.out.println("Retrieving InvoicePayment by InvoicePaymentCriteria");
		InvoicePaymentCriteria invoicePaymentCriteria = new InvoicePaymentCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//invoicePaymentCriteria.ID.eq();
		System.out.println(invoicePaymentCriteria.uniqueInvoicePayment());
		
		System.out.println("Retrieving PrepaidCard by PrepaidCardCriteria");
		PrepaidCardCriteria prepaidCardCriteria = new PrepaidCardCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//prepaidCardCriteria.ID.eq();
		System.out.println(prepaidCardCriteria.uniquePrepaidCard());
		
		System.out.println("Retrieving MonthlyBill by MonthlyBillCriteria");
		MonthlyBillCriteria monthlyBillCriteria = new MonthlyBillCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//monthlyBillCriteria.ID.eq();
		System.out.println(monthlyBillCriteria.uniqueMonthlyBill());
		
		System.out.println("Retrieving Subscription by SubscriptionCriteria");
		SubscriptionCriteria subscriptionCriteria = new SubscriptionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//subscriptionCriteria.ID.eq();
		System.out.println(subscriptionCriteria.uniqueSubscription());
		
		System.out.println("Retrieving Sport by SportCriteria");
		SportCriteria sportCriteria = new SportCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//sportCriteria.ID.eq();
		System.out.println(sportCriteria.uniqueSport());
		
		System.out.println("Retrieving Competition by CompetitionCriteria");
		CompetitionCriteria competitionCriteria = new CompetitionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//competitionCriteria.ID.eq();
		System.out.println(competitionCriteria.uniqueCompetition());
		
		System.out.println("Retrieving Event by EventCriteria");
		EventCriteria leventEventCriteria = new EventCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//leventEventCriteria.ID.eq();
		System.out.println(leventEventCriteria.uniqueEvent());
		
		System.out.println("Retrieving NotificationTracker by NotificationTrackerCriteria");
		NotificationTrackerCriteria notificationTrackerCriteria = new NotificationTrackerCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//notificationTrackerCriteria.ID.eq();
		System.out.println(notificationTrackerCriteria.uniqueNotificationTracker());
		
		System.out.println("Retrieving EventCategory by EventCategoryCriteria");
		EventCategoryCriteria leventEventCategoryCriteria = new EventCategoryCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//leventEventCategoryCriteria.ID.eq();
		System.out.println(leventEventCategoryCriteria.uniqueEventCategory());
		
		System.out.println("Retrieving Invoice by InvoiceCriteria");
		InvoiceCriteria invoiceCriteria = new InvoiceCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//invoiceCriteria.attribute2.eq();
		System.out.println(invoiceCriteria.uniqueInvoice());
		
		System.out.println("Retrieving sportify.models.Athlete by sportify.models.AthleteCriteria");
		AthleteCriteria athleteCriteria = new AthleteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//athleteCriteria.ID.eq();
		System.out.println(athleteCriteria.uniqueAthlete());
		
		System.out.println("Retrieving sportify.models.Team by sportify.models.TeamCriteria");
		TeamCriteria teamCriteria = new TeamCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//teamCriteria.ID.eq();
		System.out.println(teamCriteria.uniqueTeam());
		
		System.out.println("Retrieving Match by MatchCriteria");
		MatchCriteria matchCriteria = new MatchCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//matchCriteria.ID.eq();
		System.out.println(matchCriteria.uniqueMatch());
		
		System.out.println("Retrieving Modality by ModalityCriteria");
		ModalityCriteria modalityCriteria = new ModalityCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//modalityCriteria.ID.eq();
		System.out.println(modalityCriteria.uniqueModality());
		
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
