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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class SubscriptionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression _trackerId;
	public final AssociationExpression _tracker;
	public final IntegerExpression subscribedEntityId;
	public final AssociationExpression subscribedEntity;
	public final DateExpression date;
	public final BooleanExpression paid;
	public final CollectionExpression subscribedEvents;
	
	public SubscriptionDetachedCriteria() {
		super(com.Sportify.Entities.user.Subscription.class, com.Sportify.Entities.user.SubscriptionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_trackerId = new IntegerExpression("_tracker.ID", this.getDetachedCriteria());
		_tracker = new AssociationExpression("_tracker", this.getDetachedCriteria());
		subscribedEntityId = new IntegerExpression("subscribedEntity.ID", this.getDetachedCriteria());
		subscribedEntity = new AssociationExpression("subscribedEntity", this.getDetachedCriteria());
		date = new DateExpression("date", this.getDetachedCriteria());
		paid = new BooleanExpression("paid", this.getDetachedCriteria());
		subscribedEvents = new CollectionExpression("ORM_subscribedEvents", this.getDetachedCriteria());
	}
	
	public SubscriptionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.Sportify.Entities.user.SubscriptionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_trackerId = new IntegerExpression("_tracker.ID", this.getDetachedCriteria());
		_tracker = new AssociationExpression("_tracker", this.getDetachedCriteria());
		subscribedEntityId = new IntegerExpression("subscribedEntity.ID", this.getDetachedCriteria());
		subscribedEntity = new AssociationExpression("subscribedEntity", this.getDetachedCriteria());
		date = new DateExpression("date", this.getDetachedCriteria());
		paid = new BooleanExpression("paid", this.getDetachedCriteria());
		subscribedEvents = new CollectionExpression("ORM_subscribedEvents", this.getDetachedCriteria());
	}
	
	public NotificationTrackerDetachedCriteria create_trackerCriteria() {
		return new NotificationTrackerDetachedCriteria(createCriteria("_tracker"));
	}
	
	public com.Sportify.Entities.subentities.SubscriptionEntityDetachedCriteria createSubscribedEntityCriteria() {
		return new com.Sportify.Entities.subentities.SubscriptionEntityDetachedCriteria(createCriteria("subscribedEntity"));
	}
	
	public com.Sportify.Entities.event.EventCategoryDetachedCriteria createSubscribedEventsCriteria() {
		return new com.Sportify.Entities.event.EventCategoryDetachedCriteria(createCriteria("ORM_subscribedEvents"));
	}
	
	public Subscription uniqueSubscription(PersistentSession session) {
		return (Subscription) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Subscription[] listSubscription(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Subscription[]) list.toArray(new Subscription[list.size()]);
	}
}

