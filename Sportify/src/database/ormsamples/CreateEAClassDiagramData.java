package database.ormsamples; /**
 * Licensee: tr3s(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
import sportify.models.*;
import sportify.models.competition.*;
import sportify.models.event.*;
import sportify.models.user.*;

public class CreateEAClassDiagramData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
		try {
			User user = UserDAO.createUser();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : subscriptions, paymentManager
			UserDAO.save(user);
			InvoicePayment invoicePayment = InvoicePaymentDAO.createInvoicePayment();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : payments
			InvoicePaymentDAO.save(invoicePayment);
			PrepaidCard prepaidCard = PrepaidCardDAO.createPrepaidCard();
			// Initialize the properties of the persistent object here
			PrepaidCardDAO.save(prepaidCard);
			MonthlyBill monthlyBill = MonthlyBillDAO.createMonthlyBill();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : payments
			MonthlyBillDAO.save(monthlyBill);
			Subscription subscription = SubscriptionDAO.createSubscription();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : subscribedEvents
			SubscriptionDAO.save(subscription);
			Sport sport = SportDAO.createSport();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : modalities, competitions
			SportDAO.save(sport);
			Competition competition = CompetitionDAO.createCompetition();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : matches
			CompetitionDAO.save(competition);
			Event leventEvent = EventDAO.createEvent();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : category
			EventDAO.save(leventEvent);
			NotificationTracker notificationTracker = NotificationTrackerDAO.createNotificationTracker();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : notificationHistory
			NotificationTrackerDAO.save(notificationTracker);
			EventCategory leventEventCategory = EventCategoryDAO.createEventCategory();
			// Initialize the properties of the persistent object here
			EventCategoryDAO.save(leventEventCategory);
			Invoice invoice = InvoiceDAO.createInvoice();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : subscriptions, ID, attribute
			InvoiceDAO.save(invoice);
			Athlete athlete = AthleteDAO.createAthlete();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : matches, team
			AthleteDAO.save(athlete);
			Team team = TeamDAO.createTeam();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : athletes
			TeamDAO.save(team);
			Match match = MatchDAO.createMatch();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : athletes, events
			MatchDAO.save(match);
			Modality modality = ModalityDAO.createModality();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : teams, competitions, events
			ModalityDAO.save(modality);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateEAClassDiagramData createEAClassDiagramData = new CreateEAClassDiagramData();
			try {
				createEAClassDiagramData.createTestData();
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
