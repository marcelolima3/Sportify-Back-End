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
package com.Sportify.Entities.payment;

import com.Sportify.DAO.EAClassDiagramPersistentManager;
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class InvoiceCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final DateExpression date;
	public final BigDecimalExpression amount;
	public final CollectionExpression subscriptions;
	
	public InvoiceCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		date = new DateExpression("date", this);
		amount = new BigDecimalExpression("amount", this);
		subscriptions = new CollectionExpression("ORM_subscriptions", this);
	}
	
	public InvoiceCriteria(PersistentSession session) {
		this(session.createCriteria(Invoice.class));
	}
	
	public InvoiceCriteria() throws PersistentException {
		this(EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public com.Sportify.Entities.user.SubscriptionCriteria createSubscriptionsCriteria() {
		return new com.Sportify.Entities.user.SubscriptionCriteria(createCriteria("ORM_subscriptions"));
	}
	
	public Invoice uniqueInvoice() {
		return (Invoice) super.uniqueResult();
	}
	
	public Invoice[] listInvoice() {
		java.util.List list = super.list();
		return (Invoice[]) list.toArray(new Invoice[list.size()]);
	}
}

