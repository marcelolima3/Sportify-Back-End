/**
 * Licensee: tr3s(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
public class ListEAClassDiagramData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing User...");
		User[] users = UserDAO.listUserByQuery(null, null);
		int length = Math.min(users.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(users[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing InvoicePayment...");
		InvoicePayment[] invoicePayments = InvoicePaymentDAO.listInvoicePaymentByQuery(null, null);
		length = Math.min(invoicePayments.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(invoicePayments[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PrepaidCard...");
		PrepaidCard[] prepaidCards = PrepaidCardDAO.listPrepaidCardByQuery(null, null);
		length = Math.min(prepaidCards.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(prepaidCards[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing MonthlyBill...");
		MonthlyBill[] monthlyBills = MonthlyBillDAO.listMonthlyBillByQuery(null, null);
		length = Math.min(monthlyBills.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(monthlyBills[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Subscription...");
		Subscription[] subscriptions = SubscriptionDAO.listSubscriptionByQuery(null, null);
		length = Math.min(subscriptions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(subscriptions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Sport...");
		Sport[] sports = SportDAO.listSportByQuery(null, null);
		length = Math.min(sports.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(sports[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Competition...");
		Competition[] competitions = CompetitionDAO.listCompetitionByQuery(null, null);
		length = Math.min(competitions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(competitions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Event...");
		event.Event[] eventEvents = event.EventDAO.listEventByQuery(null, null);
		length = Math.min(eventEvents.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eventEvents[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing NotificationTracker...");
		NotificationTracker[] notificationTrackers = NotificationTrackerDAO.listNotificationTrackerByQuery(null, null);
		length = Math.min(notificationTrackers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(notificationTrackers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing EventCategory...");
		event.EventCategory[] eventEventCategorys = event.EventCategoryDAO.listEventCategoryByQuery(null, null);
		length = Math.min(eventEventCategorys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eventEventCategorys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Invoice...");
		Invoice[] invoices = InvoiceDAO.listInvoiceByQuery(null, null);
		length = Math.min(invoices.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(invoices[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Athlete...");
		Athlete[] athletes = AthleteDAO.listAthleteByQuery(null, null);
		length = Math.min(athletes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(athletes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Team...");
		Team[] teams = TeamDAO.listTeamByQuery(null, null);
		length = Math.min(teams.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(teams[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Match...");
		Match[] matchs = MatchDAO.listMatchByQuery(null, null);
		length = Math.min(matchs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(matchs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Modality...");
		Modality[] modalitys = ModalityDAO.listModalityByQuery(null, null);
		length = Math.min(modalitys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modalitys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing User by Criteria...");
		UserCriteria userCriteria = new UserCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//userCriteria.ID.eq();
		userCriteria.setMaxResults(ROW_COUNT);
		User[] users = userCriteria.listUser();
		int length =users== null ? 0 : Math.min(users.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(users[i]);
		}
		System.out.println(length + " User record(s) retrieved."); 
		
		System.out.println("Listing InvoicePayment by Criteria...");
		InvoicePaymentCriteria invoicePaymentCriteria = new InvoicePaymentCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//invoicePaymentCriteria.ID.eq();
		invoicePaymentCriteria.setMaxResults(ROW_COUNT);
		InvoicePayment[] invoicePayments = invoicePaymentCriteria.listInvoicePayment();
		length =invoicePayments== null ? 0 : Math.min(invoicePayments.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(invoicePayments[i]);
		}
		System.out.println(length + " InvoicePayment record(s) retrieved."); 
		
		System.out.println("Listing PrepaidCard by Criteria...");
		PrepaidCardCriteria prepaidCardCriteria = new PrepaidCardCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//prepaidCardCriteria.ID.eq();
		prepaidCardCriteria.setMaxResults(ROW_COUNT);
		PrepaidCard[] prepaidCards = prepaidCardCriteria.listPrepaidCard();
		length =prepaidCards== null ? 0 : Math.min(prepaidCards.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(prepaidCards[i]);
		}
		System.out.println(length + " PrepaidCard record(s) retrieved."); 
		
		System.out.println("Listing MonthlyBill by Criteria...");
		MonthlyBillCriteria monthlyBillCriteria = new MonthlyBillCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//monthlyBillCriteria.ID.eq();
		monthlyBillCriteria.setMaxResults(ROW_COUNT);
		MonthlyBill[] monthlyBills = monthlyBillCriteria.listMonthlyBill();
		length =monthlyBills== null ? 0 : Math.min(monthlyBills.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(monthlyBills[i]);
		}
		System.out.println(length + " MonthlyBill record(s) retrieved."); 
		
		System.out.println("Listing Subscription by Criteria...");
		SubscriptionCriteria subscriptionCriteria = new SubscriptionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//subscriptionCriteria.ID.eq();
		subscriptionCriteria.setMaxResults(ROW_COUNT);
		Subscription[] subscriptions = subscriptionCriteria.listSubscription();
		length =subscriptions== null ? 0 : Math.min(subscriptions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(subscriptions[i]);
		}
		System.out.println(length + " Subscription record(s) retrieved."); 
		
		System.out.println("Listing Sport by Criteria...");
		SportCriteria sportCriteria = new SportCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//sportCriteria.ID.eq();
		sportCriteria.setMaxResults(ROW_COUNT);
		Sport[] sports = sportCriteria.listSport();
		length =sports== null ? 0 : Math.min(sports.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(sports[i]);
		}
		System.out.println(length + " Sport record(s) retrieved."); 
		
		System.out.println("Listing Competition by Criteria...");
		CompetitionCriteria competitionCriteria = new CompetitionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//competitionCriteria.ID.eq();
		competitionCriteria.setMaxResults(ROW_COUNT);
		Competition[] competitions = competitionCriteria.listCompetition();
		length =competitions== null ? 0 : Math.min(competitions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(competitions[i]);
		}
		System.out.println(length + " Competition record(s) retrieved."); 
		
		System.out.println("Listing Event by Criteria...");
		event.EventCriteria leventEventCriteria = new event.EventCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//leventEventCriteria.ID.eq();
		leventEventCriteria.setMaxResults(ROW_COUNT);
		event.Event[] eventEvents = leventEventCriteria.listEvent();
		length =eventEvents== null ? 0 : Math.min(eventEvents.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(eventEvents[i]);
		}
		System.out.println(length + " Event record(s) retrieved."); 
		
		System.out.println("Listing NotificationTracker by Criteria...");
		NotificationTrackerCriteria notificationTrackerCriteria = new NotificationTrackerCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//notificationTrackerCriteria.ID.eq();
		notificationTrackerCriteria.setMaxResults(ROW_COUNT);
		NotificationTracker[] notificationTrackers = notificationTrackerCriteria.listNotificationTracker();
		length =notificationTrackers== null ? 0 : Math.min(notificationTrackers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(notificationTrackers[i]);
		}
		System.out.println(length + " NotificationTracker record(s) retrieved."); 
		
		System.out.println("Listing EventCategory by Criteria...");
		event.EventCategoryCriteria leventEventCategoryCriteria = new event.EventCategoryCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//leventEventCategoryCriteria.ID.eq();
		leventEventCategoryCriteria.setMaxResults(ROW_COUNT);
		event.EventCategory[] eventEventCategorys = leventEventCategoryCriteria.listEventCategory();
		length =eventEventCategorys== null ? 0 : Math.min(eventEventCategorys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(eventEventCategorys[i]);
		}
		System.out.println(length + " EventCategory record(s) retrieved."); 
		
		System.out.println("Listing Invoice by Criteria...");
		InvoiceCriteria invoiceCriteria = new InvoiceCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//invoiceCriteria.attribute2.eq();
		invoiceCriteria.setMaxResults(ROW_COUNT);
		Invoice[] invoices = invoiceCriteria.listInvoice();
		length =invoices== null ? 0 : Math.min(invoices.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(invoices[i]);
		}
		System.out.println(length + " Invoice record(s) retrieved."); 
		
		System.out.println("Listing Athlete by Criteria...");
		AthleteCriteria athleteCriteria = new AthleteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//athleteCriteria.ID.eq();
		athleteCriteria.setMaxResults(ROW_COUNT);
		Athlete[] athletes = athleteCriteria.listAthlete();
		length =athletes== null ? 0 : Math.min(athletes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(athletes[i]);
		}
		System.out.println(length + " Athlete record(s) retrieved."); 
		
		System.out.println("Listing Team by Criteria...");
		TeamCriteria teamCriteria = new TeamCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//teamCriteria.ID.eq();
		teamCriteria.setMaxResults(ROW_COUNT);
		Team[] teams = teamCriteria.listTeam();
		length =teams== null ? 0 : Math.min(teams.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(teams[i]);
		}
		System.out.println(length + " Team record(s) retrieved."); 
		
		System.out.println("Listing Match by Criteria...");
		MatchCriteria matchCriteria = new MatchCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//matchCriteria.ID.eq();
		matchCriteria.setMaxResults(ROW_COUNT);
		Match[] matchs = matchCriteria.listMatch();
		length =matchs== null ? 0 : Math.min(matchs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(matchs[i]);
		}
		System.out.println(length + " Match record(s) retrieved."); 
		
		System.out.println("Listing Modality by Criteria...");
		ModalityCriteria modalityCriteria = new ModalityCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//modalityCriteria.ID.eq();
		modalityCriteria.setMaxResults(ROW_COUNT);
		Modality[] modalitys = modalityCriteria.listModality();
		length =modalitys== null ? 0 : Math.min(modalitys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modalitys[i]);
		}
		System.out.println(length + " Modality record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListEAClassDiagramData listEAClassDiagramData = new ListEAClassDiagramData();
			try {
				listEAClassDiagramData.listTestData();
				//listEAClassDiagramData.listByCriteria();
			}
			finally {
				event.EAClassDiagramPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
