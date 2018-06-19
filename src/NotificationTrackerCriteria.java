/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: tr3s(Universidade do Minho)
 * License Type: Academic
 */
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class NotificationTrackerCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression notificationHistory;
	
	public NotificationTrackerCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		notificationHistory = new CollectionExpression("ORM_NotificationHistory", this);
	}
	
	public NotificationTrackerCriteria(PersistentSession session) {
		this(session.createCriteria(NotificationTracker.class));
	}
	
	public NotificationTrackerCriteria() throws PersistentException {
		this(event.EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public event.EventCriteria createNotificationHistoryCriteria() {
		return new event.EventCriteria(createCriteria("ORM_NotificationHistory"));
	}
	
	public NotificationTracker uniqueNotificationTracker() {
		return (NotificationTracker) super.uniqueResult();
	}
	
	public NotificationTracker[] listNotificationTracker() {
		java.util.List list = super.list();
		return (NotificationTracker[]) list.toArray(new NotificationTracker[list.size()]);
	}
}

