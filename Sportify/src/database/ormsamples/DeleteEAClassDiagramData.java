package database.ormsamples; /**
 * Licensee: tr3s(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
import sportify.models.*;
import sportify.models.competition.*;
import sportify.models.event.*;
import sportify.models.user.*;

public class DeleteEAClassDiagramData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
		try {
			User user = UserDAO.loadUserByQuery(null, null);
			// Delete the persistent object
			UserDAO.delete(user);
			InvoicePayment invoicePayment = InvoicePaymentDAO.loadInvoicePaymentByQuery(null, null);
			// Delete the persistent object
			InvoicePaymentDAO.delete(invoicePayment);
			PrepaidCard prepaidCard = PrepaidCardDAO.loadPrepaidCardByQuery(null, null);
			// Delete the persistent object
			PrepaidCardDAO.delete(prepaidCard);
			MonthlyBill monthlyBill = MonthlyBillDAO.loadMonthlyBillByQuery(null, null);
			// Delete the persistent object
			MonthlyBillDAO.delete(monthlyBill);
			Subscription subscription = SubscriptionDAO.loadSubscriptionByQuery(null, null);
			// Delete the persistent object
			SubscriptionDAO.delete(subscription);
			Sport sport = SportDAO.loadSportByQuery(null, null);
			// Delete the persistent object
			SportDAO.delete(sport);
			Competition competition = CompetitionDAO.loadCompetitionByQuery(null, null);
			// Delete the persistent object
			CompetitionDAO.delete(competition);
			Event leventEvent = EventDAO.loadEventByQuery(null, null);
			// Delete the persistent object
			EventDAO.delete(leventEvent);
			NotificationTracker notificationTracker = NotificationTrackerDAO.loadNotificationTrackerByQuery(null, null);
			// Delete the persistent object
			NotificationTrackerDAO.delete(notificationTracker);
			EventCategory leventEventCategory = EventCategoryDAO.loadEventCategoryByQuery(null, null);
			// Delete the persistent object
			EventCategoryDAO.delete(leventEventCategory);
			Invoice invoice = InvoiceDAO.loadInvoiceByQuery(null, null);
			// Delete the persistent object
			InvoiceDAO.delete(invoice);
			Athlete athlete = AthleteDAO.loadAthleteByQuery(null, null);
			// Delete the persistent object
			AthleteDAO.delete(athlete);
			Team team = TeamDAO.loadTeamByQuery(null, null);
			// Delete the persistent object
			TeamDAO.delete(team);
			Match match = MatchDAO.loadMatchByQuery(null, null);
			// Delete the persistent object
			MatchDAO.delete(match);
			Modality modality = ModalityDAO.loadModalityByQuery(null, null);
			// Delete the persistent object
			ModalityDAO.delete(modality);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteEAClassDiagramData deleteEAClassDiagramData = new DeleteEAClassDiagramData();
			try {
				deleteEAClassDiagramData.deleteTestData();
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
