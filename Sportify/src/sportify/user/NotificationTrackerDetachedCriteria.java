/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Ricardo(Universidade do Minho)
 * License Type: Academic
 */
package sportify.user;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class NotificationTrackerDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression notificationPolicy;
	public final CollectionExpression notificationHistory;
	
	public NotificationTrackerDetachedCriteria() {
		super(sportify.user.NotificationTracker.class, sportify.user.NotificationTrackerCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		notificationPolicy = new StringExpression("notificationPolicy", this.getDetachedCriteria());
		notificationHistory = new CollectionExpression("ORM_NotificationHistory", this.getDetachedCriteria());
	}
	
	public NotificationTrackerDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, sportify.user.NotificationTrackerCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		notificationPolicy = new StringExpression("notificationPolicy", this.getDetachedCriteria());
		notificationHistory = new CollectionExpression("ORM_NotificationHistory", this.getDetachedCriteria());
	}
	
	public sportify.event.EventDetachedCriteria createNotificationHistoryCriteria() {
		return new sportify.event.EventDetachedCriteria(createCriteria("ORM_NotificationHistory"));
	}
	
	public NotificationTracker uniqueNotificationTracker(PersistentSession session) {
		return (NotificationTracker) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public NotificationTracker[] listNotificationTracker(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (NotificationTracker[]) list.toArray(new NotificationTracker[list.size()]);
	}
}

