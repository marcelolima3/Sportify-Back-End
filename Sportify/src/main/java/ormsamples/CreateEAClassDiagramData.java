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
public class CreateEAClassDiagramData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
		try {
			com.Sportify.Entities.competition.Modality lcompetitionModality = ModalityDAO.createModality();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : teams, competitions, _eventCategories
			ModalityDAO.save(lcompetitionModality);
			com.Sportify.Entities.subentities.Team lsubEntitiesTeam = TeamDAO.createTeam();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : athletes
			TeamDAO.save(lsubEntitiesTeam);
			com.Sportify.Entities.user.NotificationTracker luserNotificationTracker = NotificationTrackerDAO.createNotificationTracker();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : notificationHistory
			NotificationTrackerDAO.save(luserNotificationTracker);
			com.Sportify.Entities.event.EventCategory leventEventCategory = EventCategoryDAO.createEventCategory();
			// Initialize the properties of the persistent object here
			EventCategoryDAO.save(leventEventCategory);
			com.Sportify.Entities.payment.PrepaidCard lpaymentPrepaidCard = PrepaidCardDAO.createPrepaidCard();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : numRecharges, cardNumber
			PrepaidCardDAO.save(lpaymentPrepaidCard);
			com.Sportify.Entities.competition.Competition lcompetitionCompetition = CompetitionDAO.createCompetition();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : matchEvents
			CompetitionDAO.save(lcompetitionCompetition);
			com.Sportify.Entities.user.Subscription luserSubscription = SubscriptionDAO.createSubscription();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : subscribedEvents, subscribedEntity, _tracker
			SubscriptionDAO.save(luserSubscription);
			com.Sportify.Entities.competition.MatchEvent lcompetitionMatchEvent = MatchEventDAO.createMatchEvent();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : athletes, events
			MatchEventDAO.save(lcompetitionMatchEvent);
			com.Sportify.Entities.event.Event leventEvent = EventDAO.createEvent();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : category
			EventDAO.save(leventEvent);
			com.Sportify.Entities.user.User luserUser = UserDAO.createUser();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : subscriptions, paymentManager
			UserDAO.save(luserUser);
			com.Sportify.Entities.payment.InvoicePayment lpaymentInvoicePayment = InvoicePaymentDAO.createInvoicePayment();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : payments
			InvoicePaymentDAO.save(lpaymentInvoicePayment);
			com.Sportify.Entities.payment.Invoice lpaymentInvoice = InvoiceDAO.createInvoice();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : subscriptions
			InvoiceDAO.save(lpaymentInvoice);
			com.Sportify.Entities.subentities.Athlete lsubEntitiesAthlete = AthleteDAO.createAthlete();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : matchEvents, team
			AthleteDAO.save(lsubEntitiesAthlete);
			com.Sportify.Entities.competition.Sport lcompetitionSport = SportDAO.createSport();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : modalities, competitions
			SportDAO.save(lcompetitionSport);
			com.Sportify.Entities.payment.MonthlyBill lpaymentMonthlyBill = MonthlyBillDAO.createMonthlyBill();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : payments
			MonthlyBillDAO.save(lpaymentMonthlyBill);
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
