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
package com.Sportify.Entities.subentities;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class SubscriptionEntityDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression subscriptions;
	
	public SubscriptionEntityDetachedCriteria() {
		super(com.Sportify.Entities.subentities.SubscriptionEntity.class, com.Sportify.Entities.subentities.SubscriptionEntityCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_subscriptions", this.getDetachedCriteria());
	}
	
	public SubscriptionEntityDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.Sportify.Entities.subentities.SubscriptionEntityCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_subscriptions", this.getDetachedCriteria());
	}
	
	public com.Sportify.Entities.user.SubscriptionDetachedCriteria createSubscriptionsCriteria() {
		return new com.Sportify.Entities.user.SubscriptionDetachedCriteria(createCriteria("ORM_subscriptions"));
	}
	
	public SubscriptionEntity uniqueSubscriptionEntity(PersistentSession session) {
		return (SubscriptionEntity) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public SubscriptionEntity[] listSubscriptionEntity(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (SubscriptionEntity[]) list.toArray(new SubscriptionEntity[list.size()]);
	}
}

