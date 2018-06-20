/**
 * Licensee: Ricardo(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteEAClassDiagramData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = sportify.competition.EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
		try {
			sportify.competition.Modality lcompetitionModality = sportify.competition.ModalityDAO.loadModalityByQuery(null, null);
			// Delete the persistent object
			sportify.competition.ModalityDAO.delete(lcompetitionModality);
			sportify.subentities.Team subEntitiesTeam = sportify.subentities.TeamDAO.loadTeamByQuery(null, null);
			// Delete the persistent object
			sportify.subentities.TeamDAO.delete(subEntitiesTeam);
			sportify.user.NotificationTracker luserNotificationTracker = sportify.user.NotificationTrackerDAO.loadNotificationTrackerByQuery(null, null);
			// Delete the persistent object
			sportify.user.NotificationTrackerDAO.delete(luserNotificationTracker);
			sportify.event.EventCategory leventEventCategory = sportify.event.EventCategoryDAO.loadEventCategoryByQuery(null, null);
			// Delete the persistent object
			sportify.event.EventCategoryDAO.delete(leventEventCategory);
			sportify.user.PrepaidCard luserPrepaidCard = sportify.user.PrepaidCardDAO.loadPrepaidCardByQuery(null, null);
			// Delete the persistent object
			sportify.user.PrepaidCardDAO.delete(luserPrepaidCard);
			sportify.competition.Competition lcompetitionCompetition = sportify.competition.CompetitionDAO.loadCompetitionByQuery(null, null);
			// Delete the persistent object
			sportify.competition.CompetitionDAO.delete(lcompetitionCompetition);
			sportify.user.Subscription luserSubscription = sportify.user.SubscriptionDAO.loadSubscriptionByQuery(null, null);
			// Delete the persistent object
			sportify.user.SubscriptionDAO.delete(luserSubscription);
			sportify.competition.Match lcompetitionMatch = sportify.competition.MatchDAO.loadMatchByQuery(null, null);
			// Delete the persistent object
			sportify.competition.MatchDAO.delete(lcompetitionMatch);
			sportify.event.Event leventEvent = sportify.event.EventDAO.loadEventByQuery(null, null);
			// Delete the persistent object
			sportify.event.EventDAO.delete(leventEvent);
			sportify.user.User luserUser = sportify.user.UserDAO.loadUserByQuery(null, null);
			// Delete the persistent object
			sportify.user.UserDAO.delete(luserUser);
			sportify.user.InvoicePayment luserInvoicePayment = sportify.user.InvoicePaymentDAO.loadInvoicePaymentByQuery(null, null);
			// Delete the persistent object
			sportify.user.InvoicePaymentDAO.delete(luserInvoicePayment);
			sportify.user.Invoice luserInvoice = sportify.user.InvoiceDAO.loadInvoiceByQuery(null, null);
			// Delete the persistent object
			sportify.user.InvoiceDAO.delete(luserInvoice);
			sportify.subentities.Athlete subEntitiesAthlete = sportify.subentities.AthleteDAO.loadAthleteByQuery(null, null);
			// Delete the persistent object
			sportify.subentities.AthleteDAO.delete(subEntitiesAthlete);
			sportify.competition.Sport lcompetitionSport = sportify.competition.SportDAO.loadSportByQuery(null, null);
			// Delete the persistent object
			sportify.competition.SportDAO.delete(lcompetitionSport);
			sportify.user.MonthlyBill luserMonthlyBill = sportify.user.MonthlyBillDAO.loadMonthlyBillByQuery(null, null);
			// Delete the persistent object
			sportify.user.MonthlyBillDAO.delete(luserMonthlyBill);
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
				sportify.competition.EAClassDiagramPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
