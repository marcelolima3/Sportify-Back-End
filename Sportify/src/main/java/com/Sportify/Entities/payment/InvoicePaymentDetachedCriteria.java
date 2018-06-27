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

public class InvoicePaymentDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final DoubleExpression currentAmount;
	public final CollectionExpression payments;
	
	public InvoicePaymentDetachedCriteria() {
		super(com.Sportify.Entities.payment.InvoicePayment.class, com.Sportify.Entities.payment.InvoicePaymentCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		currentAmount = new DoubleExpression("currentAmount", this.getDetachedCriteria());
		payments = new CollectionExpression("ORM_payments", this.getDetachedCriteria());
	}
	
	public InvoicePaymentDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.Sportify.Entities.payment.InvoicePaymentCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		currentAmount = new DoubleExpression("currentAmount", this.getDetachedCriteria());
		payments = new CollectionExpression("ORM_payments", this.getDetachedCriteria());
	}
	
	public InvoiceDetachedCriteria createPaymentsCriteria() {
		return new InvoiceDetachedCriteria(createCriteria("ORM_payments"));
	}
	
	public InvoicePayment uniqueInvoicePayment(PersistentSession session) {
		return (InvoicePayment) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public InvoicePayment[] listInvoicePayment(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (InvoicePayment[]) list.toArray(new InvoicePayment[list.size()]);
	}
}

