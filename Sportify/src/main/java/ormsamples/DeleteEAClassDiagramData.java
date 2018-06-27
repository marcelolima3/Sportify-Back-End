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
public class DeleteEAClassDiagramData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
		try {
			com.Sportify.Entities.competition.Modality lcompetitionModality = ModalityDAO.loadModalityByQuery(null, null);
			// Delete the persistent object
			ModalityDAO.delete(lcompetitionModality);
			com.Sportify.Entities.subentities.Team lsubEntitiesTeam = TeamDAO.loadTeamByQuery(null, null);
			// Delete the persistent object
			TeamDAO.delete(lsubEntitiesTeam);
			com.Sportify.Entities.user.NotificationTracker luserNotificationTracker = NotificationTrackerDAO.loadNotificationTrackerByQuery(null, null);
			// Delete the persistent object
			NotificationTrackerDAO.delete(luserNotificationTracker);
			com.Sportify.Entities.event.EventCategory leventEventCategory = EventCategoryDAO.loadEventCategoryByQuery(null, null);
			// Delete the persistent object
			EventCategoryDAO.delete(leventEventCategory);
			com.Sportify.Entities.payment.PrepaidCard lpaymentPrepaidCard = PrepaidCardDAO.loadPrepaidCardByQuery(null, null);
			// Delete the persistent object
			PrepaidCardDAO.delete(lpaymentPrepaidCard);
			com.Sportify.Entities.competition.Competition lcompetitionCompetition = CompetitionDAO.loadCompetitionByQuery(null, null);
			// Delete the persistent object
			CompetitionDAO.delete(lcompetitionCompetition);
			com.Sportify.Entities.user.Subscription luserSubscription = SubscriptionDAO.loadSubscriptionByQuery(null, null);
			// Delete the persistent object
			SubscriptionDAO.delete(luserSubscription);
			com.Sportify.Entities.competition.MatchEvent lcompetitionMatchEvent = MatchEventDAO.loadMatchEventByQuery(null, null);
			// Delete the persistent object
			MatchEventDAO.delete(lcompetitionMatchEvent);
			com.Sportify.Entities.event.Event leventEvent = EventDAO.loadEventByQuery(null, null);
			// Delete the persistent object
			EventDAO.delete(leventEvent);
			com.Sportify.Entities.user.User luserUser = UserDAO.loadUserByQuery(null, null);
			// Delete the persistent object
			UserDAO.delete(luserUser);
			com.Sportify.Entities.payment.InvoicePayment lpaymentInvoicePayment = InvoicePaymentDAO.loadInvoicePaymentByQuery(null, null);
			// Delete the persistent object
			InvoicePaymentDAO.delete(lpaymentInvoicePayment);
			com.Sportify.Entities.payment.Invoice lpaymentInvoice = InvoiceDAO.loadInvoiceByQuery(null, null);
			// Delete the persistent object
			InvoiceDAO.delete(lpaymentInvoice);
			com.Sportify.Entities.subentities.Athlete lsubEntitiesAthlete = AthleteDAO.loadAthleteByQuery(null, null);
			// Delete the persistent object
			AthleteDAO.delete(lsubEntitiesAthlete);
			com.Sportify.Entities.competition.Sport lcompetitionSport = SportDAO.loadSportByQuery(null, null);
			// Delete the persistent object
			SportDAO.delete(lcompetitionSport);
			com.Sportify.Entities.payment.MonthlyBill lpaymentMonthlyBill = MonthlyBillDAO.loadMonthlyBillByQuery(null, null);
			// Delete the persistent object
			MonthlyBillDAO.delete(lpaymentMonthlyBill);
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
