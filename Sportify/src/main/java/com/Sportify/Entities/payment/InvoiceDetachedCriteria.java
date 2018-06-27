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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class InvoiceDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final DateExpression date;
	public final DoubleExpression amount;
	public final CollectionExpression subscriptions;
	
	public InvoiceDetachedCriteria() {
		super(com.Sportify.Entities.payment.Invoice.class, com.Sportify.Entities.payment.InvoiceCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		date = new DateExpression("date", this.getDetachedCriteria());
		amount = new DoubleExpression("amount", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_subscriptions", this.getDetachedCriteria());
	}
	
	public InvoiceDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.Sportify.Entities.payment.InvoiceCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		date = new DateExpression("date", this.getDetachedCriteria());
		amount = new DoubleExpression("amount", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_subscriptions", this.getDetachedCriteria());
	}
	
	public com.Sportify.Entities.user.SubscriptionDetachedCriteria createSubscriptionsCriteria() {
		return new com.Sportify.Entities.user.SubscriptionDetachedCriteria(createCriteria("ORM_subscriptions"));
	}
	
	public Invoice uniqueInvoice(PersistentSession session) {
		return (Invoice) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Invoice[] listInvoice(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Invoice[]) list.toArray(new Invoice[list.size()]);
	}
}

