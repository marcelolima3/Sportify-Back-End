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
package com.Sportify.Entities.user;

import com.Sportify.DAO.EAClassDiagramPersistentManager;
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class NotificationTrackerCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression notificationPolicy;
	public final CollectionExpression notificationHistory;
	
	public NotificationTrackerCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		notificationPolicy = new StringExpression("notificationPolicy", this);
		notificationHistory = new CollectionExpression("ORM_notificationHistory", this);
	}
	
	public NotificationTrackerCriteria(PersistentSession session) {
		this(session.createCriteria(NotificationTracker.class));
	}
	
	public NotificationTrackerCriteria() throws PersistentException {
		this(EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public com.Sportify.Entities.event.EventCriteria createNotificationHistoryCriteria() {
		return new com.Sportify.Entities.event.EventCriteria(createCriteria("ORM_notificationHistory"));
	}
	
	public NotificationTracker uniqueNotificationTracker() {
		return (NotificationTracker) super.uniqueResult();
	}
	
	public NotificationTracker[] listNotificationTracker() {
		java.util.List list = super.list();
		return (NotificationTracker[]) list.toArray(new NotificationTracker[list.size()]);
	}
}

