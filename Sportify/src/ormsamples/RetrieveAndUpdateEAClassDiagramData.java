/**
 * Licensee: Ricardo(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateEAClassDiagramData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = sportify.competition.EAClassDiagramPersistentManager.instance().getSession().beginTransaction();
		try {
			sportify.competition.Modality lcompetitionModality = sportify.competition.ModalityDAO.loadModalityByQuery(null, null);
			// Update the properties of the persistent object
			sportify.competition.ModalityDAO.save(lcompetitionModality);
			sportify.subentities.Team subEntitiesTeam = sportify.subentities.TeamDAO.loadTeamByQuery(null, null);
			// Update the properties of the persistent object
			sportify.subentities.TeamDAO.save(subEntitiesTeam);
			sportify.user.NotificationTracker luserNotificationTracker = sportify.user.NotificationTrackerDAO.loadNotificationTrackerByQuery(null, null);
			// Update the properties of the persistent object
			sportify.user.NotificationTrackerDAO.save(luserNotificationTracker);
			sportify.event.EventCategory leventEventCategory = sportify.event.EventCategoryDAO.loadEventCategoryByQuery(null, null);
			// Update the properties of the persistent object
			sportify.event.EventCategoryDAO.save(leventEventCategory);
			sportify.user.PrepaidCard luserPrepaidCard = sportify.user.PrepaidCardDAO.loadPrepaidCardByQuery(null, null);
			// Update the properties of the persistent object
			sportify.user.PrepaidCardDAO.save(luserPrepaidCard);
			sportify.competition.Competition lcompetitionCompetition = sportify.competition.CompetitionDAO.loadCompetitionByQuery(null, null);
			// Update the properties of the persistent object
			sportify.competition.CompetitionDAO.save(lcompetitionCompetition);
			sportify.user.Subscription luserSubscription = sportify.user.SubscriptionDAO.loadSubscriptionByQuery(null, null);
			// Update the properties of the persistent object
			sportify.user.SubscriptionDAO.save(luserSubscription);
			sportify.competition.Match lcompetitionMatch = sportify.competition.MatchDAO.loadMatchByQuery(null, null);
			// Update the properties of the persistent object
			sportify.competition.MatchDAO.save(lcompetitionMatch);
			sportify.event.Event leventEvent = sportify.event.EventDAO.loadEventByQuery(null, null);
			// Update the properties of the persistent object
			sportify.event.EventDAO.save(leventEvent);
			sportify.user.User luserUser = sportify.user.UserDAO.loadUserByQuery(null, null);
			// Update the properties of the persistent object
			sportify.user.UserDAO.save(luserUser);
			sportify.user.InvoicePayment luserInvoicePayment = sportify.user.InvoicePaymentDAO.loadInvoicePaymentByQuery(null, null);
			// Update the properties of the persistent object
			sportify.user.InvoicePaymentDAO.save(luserInvoicePayment);
			sportify.user.Invoice luserInvoice = sportify.user.InvoiceDAO.loadInvoiceByQuery(null, null);
			// Update the properties of the persistent object
			sportify.user.InvoiceDAO.save(luserInvoice);
			sportify.subentities.Athlete subEntitiesAthlete = sportify.subentities.AthleteDAO.loadAthleteByQuery(null, null);
			// Update the properties of the persistent object
			sportify.subentities.AthleteDAO.save(subEntitiesAthlete);
			sportify.competition.Sport lcompetitionSport = sportify.competition.SportDAO.loadSportByQuery(null, null);
			// Update the properties of the persistent object
			sportify.competition.SportDAO.save(lcompetitionSport);
			sportify.user.MonthlyBill luserMonthlyBill = sportify.user.MonthlyBillDAO.loadMonthlyBillByQuery(null, null);
			// Update the properties of the persistent object
			sportify.user.MonthlyBillDAO.save(luserMonthlyBill);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Modality by ModalityCriteria");
		sportify.competition.ModalityCriteria lcompetitionModalityCriteria = new sportify.competition.ModalityCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcompetitionModalityCriteria.ID.eq();
		System.out.println(lcompetitionModalityCriteria.uniqueModality());
		
		System.out.println("Retrieving Team by TeamCriteria");
		sportify.subentities.TeamCriteria subEntitiesTeamCriteria = new sportify.subentities.TeamCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//subEntitiesTeamCriteria.ID.eq();
		System.out.println(subEntitiesTeamCriteria.uniqueTeam());
		
		System.out.println("Retrieving NotificationTracker by NotificationTrackerCriteria");
		sportify.user.NotificationTrackerCriteria luserNotificationTrackerCriteria = new sportify.user.NotificationTrackerCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//luserNotificationTrackerCriteria.ID.eq();
		System.out.println(luserNotificationTrackerCriteria.uniqueNotificationTracker());
		
		System.out.println("Retrieving EventCategory by EventCategoryCriteria");
		sportify.event.EventCategoryCriteria leventEventCategoryCriteria = new sportify.event.EventCategoryCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//leventEventCategoryCriteria.ID.eq();
		System.out.println(leventEventCategoryCriteria.uniqueEventCategory());
		
		System.out.println("Retrieving PrepaidCard by PrepaidCardCriteria");
		sportify.user.PrepaidCardCriteria luserPrepaidCardCriteria = new sportify.user.PrepaidCardCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//luserPrepaidCardCriteria.ID.eq();
		System.out.println(luserPrepaidCardCriteria.uniquePrepaidCard());
		
		System.out.println("Retrieving Competition by CompetitionCriteria");
		sportify.competition.CompetitionCriteria lcompetitionCompetitionCriteria = new sportify.competition.CompetitionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcompetitionCompetitionCriteria.ID.eq();
		System.out.println(lcompetitionCompetitionCriteria.uniqueCompetition());
		
		System.out.println("Retrieving Subscription by SubscriptionCriteria");
		sportify.user.SubscriptionCriteria luserSubscriptionCriteria = new sportify.user.SubscriptionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//luserSubscriptionCriteria.ID.eq();
		System.out.println(luserSubscriptionCriteria.uniqueSubscription());
		
		System.out.println("Retrieving Match by MatchCriteria");
		sportify.competition.MatchCriteria lcompetitionMatchCriteria = new sportify.competition.MatchCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcompetitionMatchCriteria.ID.eq();
		System.out.println(lcompetitionMatchCriteria.uniqueMatch());
		
		System.out.println("Retrieving Event by EventCriteria");
		sportify.event.EventCriteria leventEventCriteria = new sportify.event.EventCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//leventEventCriteria.ID.eq();
		System.out.println(leventEventCriteria.uniqueEvent());
		
		System.out.println("Retrieving User by UserCriteria");
		sportify.user.UserCriteria luserUserCriteria = new sportify.user.UserCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//luserUserCriteria.ID.eq();
		System.out.println(luserUserCriteria.uniqueUser());
		
		System.out.println("Retrieving InvoicePayment by InvoicePaymentCriteria");
		sportify.user.InvoicePaymentCriteria luserInvoicePaymentCriteria = new sportify.user.InvoicePaymentCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//luserInvoicePaymentCriteria.ID.eq();
		System.out.println(luserInvoicePaymentCriteria.uniqueInvoicePayment());
		
		System.out.println("Retrieving Invoice by InvoiceCriteria");
		sportify.user.InvoiceCriteria luserInvoiceCriteria = new sportify.user.InvoiceCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//luserInvoiceCriteria.ID.eq();
		System.out.println(luserInvoiceCriteria.uniqueInvoice());
		
		System.out.println("Retrieving Athlete by AthleteCriteria");
		sportify.subentities.AthleteCriteria subEntitiesAthleteCriteria = new sportify.subentities.AthleteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//subEntitiesAthleteCriteria.ID.eq();
		System.out.println(subEntitiesAthleteCriteria.uniqueAthlete());
		
		System.out.println("Retrieving Sport by SportCriteria");
		sportify.competition.SportCriteria lcompetitionSportCriteria = new sportify.competition.SportCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcompetitionSportCriteria.ID.eq();
		System.out.println(lcompetitionSportCriteria.uniqueSport());
		
		System.out.println("Retrieving MonthlyBill by MonthlyBillCriteria");
		sportify.user.MonthlyBillCriteria luserMonthlyBillCriteria = new sportify.user.MonthlyBillCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//luserMonthlyBillCriteria.ID.eq();
		System.out.println(luserMonthlyBillCriteria.uniqueMonthlyBill());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateEAClassDiagramData retrieveAndUpdateEAClassDiagramData = new RetrieveAndUpdateEAClassDiagramData();
			try {
				retrieveAndUpdateEAClassDiagramData.retrieveAndUpdateTestData();
				//retrieveAndUpdateEAClassDiagramData.retrieveByCriteria();
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
