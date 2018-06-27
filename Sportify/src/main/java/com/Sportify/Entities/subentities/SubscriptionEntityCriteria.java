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

import com.Sportify.DAO.EAClassDiagramPersistentManager;
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class SubscriptionEntityCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression subscriptions;
	
	public SubscriptionEntityCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		subscriptions = new CollectionExpression("ORM_subscriptions", this);
	}
	
	public SubscriptionEntityCriteria(PersistentSession session) {
		this(session.createCriteria(SubscriptionEntity.class));
	}
	
	public SubscriptionEntityCriteria() throws PersistentException {
		this(EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public com.Sportify.Entities.user.SubscriptionCriteria createSubscriptionsCriteria() {
		return new com.Sportify.Entities.user.SubscriptionCriteria(createCriteria("ORM_subscriptions"));
	}
	
	public SubscriptionEntity uniqueSubscriptionEntity() {
		return (SubscriptionEntity) super.uniqueResult();
	}
	
	public SubscriptionEntity[] listSubscriptionEntity() {
		java.util.List list = super.list();
		return (SubscriptionEntity[]) list.toArray(new SubscriptionEntity[list.size()]);
	}
}

