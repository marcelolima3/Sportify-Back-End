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

public class PaymentMethodCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	
	public PaymentMethodCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
	}
	
	public PaymentMethodCriteria(PersistentSession session) {
		this(session.createCriteria(PaymentMethod.class));
	}
	
	public PaymentMethodCriteria() throws PersistentException {
		this(EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public PaymentMethod uniquePaymentMethod() {
		return (PaymentMethod) super.uniqueResult();
	}
	
	public PaymentMethod[] listPaymentMethod() {
		java.util.List list = super.list();
		return (PaymentMethod[]) list.toArray(new PaymentMethod[list.size()]);
	}
}

