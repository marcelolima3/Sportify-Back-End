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

public class SubscriptionCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression _trackerId;
	public final AssociationExpression _tracker;
	public final IntegerExpression subscribedEntityId;
	public final AssociationExpression subscribedEntity;
	public final DateExpression date;
	public final BooleanExpression paid;
	public final CollectionExpression subscribedEvents;
	
	public SubscriptionCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		_trackerId = new IntegerExpression("_tracker.ID", this);
		_tracker = new AssociationExpression("_tracker", this);
		subscribedEntityId = new IntegerExpression("subscribedEntity.ID", this);
		subscribedEntity = new AssociationExpression("subscribedEntity", this);
		date = new DateExpression("date", this);
		paid = new BooleanExpression("paid", this);
		subscribedEvents = new CollectionExpression("ORM_subscribedEvents", this);
	}
	
	public SubscriptionCriteria(PersistentSession session) {
		this(session.createCriteria(Subscription.class));
	}
	
	public SubscriptionCriteria() throws PersistentException {
		this(EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public NotificationTrackerCriteria create_trackerCriteria() {
		return new NotificationTrackerCriteria(createCriteria("_tracker"));
	}
	
	public com.Sportify.Entities.subentities.SubscriptionEntityCriteria createSubscribedEntityCriteria() {
		return new com.Sportify.Entities.subentities.SubscriptionEntityCriteria(createCriteria("subscribedEntity"));
	}
	
	public com.Sportify.Entities.event.EventCategoryCriteria createSubscribedEventsCriteria() {
		return new com.Sportify.Entities.event.EventCategoryCriteria(createCriteria("ORM_subscribedEvents"));
	}
	
	public Subscription uniqueSubscription() {
		return (Subscription) super.uniqueResult();
	}
	
	public Subscription[] listSubscription() {
		java.util.List list = super.list();
		return (Subscription[]) list.toArray(new Subscription[list.size()]);
	}
}

