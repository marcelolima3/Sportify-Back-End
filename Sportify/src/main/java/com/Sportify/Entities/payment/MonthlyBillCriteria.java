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

public class MonthlyBillCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final DoubleExpression limitAmount;
	public final DoubleExpression currentAmount;
	public final CollectionExpression payments;
	
	public MonthlyBillCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		limitAmount = new DoubleExpression("limitAmount", this);
		currentAmount = new DoubleExpression("currentAmount", this);
		payments = new CollectionExpression("ORM_payments", this);
	}
	
	public MonthlyBillCriteria(PersistentSession session) {
		this(session.createCriteria(MonthlyBill.class));
	}
	
	public MonthlyBillCriteria() throws PersistentException {
		this(EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public InvoiceCriteria createPaymentsCriteria() {
		return new InvoiceCriteria(createCriteria("ORM_payments"));
	}
	
	public MonthlyBill uniqueMonthlyBill() {
		return (MonthlyBill) super.uniqueResult();
	}
	
	public MonthlyBill[] listMonthlyBill() {
		java.util.List list = super.list();
		return (MonthlyBill[]) list.toArray(new MonthlyBill[list.size()]);
	}
}

