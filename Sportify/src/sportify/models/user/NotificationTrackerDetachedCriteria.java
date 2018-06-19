package sportify.models.user; /**
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
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;
import sportify.models.event.EventDetachedCriteria;

public class NotificationTrackerDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression notificationHistory;
	
	public NotificationTrackerDetachedCriteria() {
		super(NotificationTracker.class, NotificationTrackerCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		notificationHistory = new CollectionExpression("ORM_NotificationHistory", this.getDetachedCriteria());
	}
	
	public NotificationTrackerDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, NotificationTrackerCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		notificationHistory = new CollectionExpression("ORM_NotificationHistory", this.getDetachedCriteria());
	}
	
	public EventDetachedCriteria createNotificationHistoryCriteria() {
		return new EventDetachedCriteria(createCriteria("ORM_NotificationHistory"));
	}
	
	public NotificationTracker uniqueNotificationTracker(PersistentSession session) {
		return (NotificationTracker) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public NotificationTracker[] listNotificationTracker(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (NotificationTracker[]) list.toArray(new NotificationTracker[list.size()]);
	}
}

