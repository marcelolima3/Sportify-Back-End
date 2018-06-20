/**
 * Licensee: Ricardo(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateEAClassDiagramData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = sportify.competition.EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
		try {
			sportify.competition.Modality lcompetitionModality = sportify.competition.ModalityDAO.createModality();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : teams, competitions
			sportify.competition.ModalityDAO.save(lcompetitionModality);
			sportify.subentities.Team subEntitiesTeam = sportify.subentities.TeamDAO.createTeam();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : athletes
			sportify.subentities.TeamDAO.save(subEntitiesTeam);
			sportify.user.NotificationTracker luserNotificationTracker = sportify.user.NotificationTrackerDAO.createNotificationTracker();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : notificationHistory
			sportify.user.NotificationTrackerDAO.save(luserNotificationTracker);
			sportify.event.EventCategory leventEventCategory = sportify.event.EventCategoryDAO.createEventCategory();
			// Initialize the properties of the persistent object here
			sportify.event.EventCategoryDAO.save(leventEventCategory);
			sportify.user.PrepaidCard luserPrepaidCard = sportify.user.PrepaidCardDAO.createPrepaidCard();
			// Initialize the properties of the persistent object here
			sportify.user.PrepaidCardDAO.save(luserPrepaidCard);
			sportify.competition.Competition lcompetitionCompetition = sportify.competition.CompetitionDAO.createCompetition();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : matches
			sportify.competition.CompetitionDAO.save(lcompetitionCompetition);
			sportify.user.Subscription luserSubscription = sportify.user.SubscriptionDAO.createSubscription();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : subscribedEvents
			sportify.user.SubscriptionDAO.save(luserSubscription);
			sportify.competition.Match lcompetitionMatch = sportify.competition.MatchDAO.createMatch();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : athletes, events
			sportify.competition.MatchDAO.save(lcompetitionMatch);
			sportify.event.Event leventEvent = sportify.event.EventDAO.createEvent();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : category
			sportify.event.EventDAO.save(leventEvent);
			sportify.user.User luserUser = sportify.user.UserDAO.createUser();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : subscriptions, paymentManager
			sportify.user.UserDAO.save(luserUser);
			sportify.user.InvoicePayment luserInvoicePayment = sportify.user.InvoicePaymentDAO.createInvoicePayment();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : payments
			sportify.user.InvoicePaymentDAO.save(luserInvoicePayment);
			sportify.user.Invoice luserInvoice = sportify.user.InvoiceDAO.createInvoice();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : subscriptions
			sportify.user.InvoiceDAO.save(luserInvoice);
			sportify.subentities.Athlete subEntitiesAthlete = sportify.subentities.AthleteDAO.createAthlete();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : matches, team
			sportify.subentities.AthleteDAO.save(subEntitiesAthlete);
			sportify.competition.Sport lcompetitionSport = sportify.competition.SportDAO.createSport();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : modalities, competitions
			sportify.competition.SportDAO.save(lcompetitionSport);
			sportify.user.MonthlyBill luserMonthlyBill = sportify.user.MonthlyBillDAO.createMonthlyBill();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : payments
			sportify.user.MonthlyBillDAO.save(luserMonthlyBill);
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
				sportify.competition.EAClassDiagramPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
