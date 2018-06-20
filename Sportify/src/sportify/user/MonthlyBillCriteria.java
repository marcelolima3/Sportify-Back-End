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
package sportify.user;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class MonthlyBillCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final BigDecimalExpression limitAmount;
	public final BigDecimalExpression currentAmount;
	public final CollectionExpression payments;
	
	public MonthlyBillCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		limitAmount = new BigDecimalExpression("limitAmount", this);
		currentAmount = new BigDecimalExpression("currentAmount", this);
		payments = new CollectionExpression("ORM_Payments", this);
	}
	
	public MonthlyBillCriteria(PersistentSession session) {
		this(session.createCriteria(MonthlyBill.class));
	}
	
	public MonthlyBillCriteria() throws PersistentException {
		this(sportify.competition.EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public InvoiceCriteria createPaymentsCriteria() {
		return new InvoiceCriteria(createCriteria("ORM_Payments"));
	}
	
	public MonthlyBill uniqueMonthlyBill() {
		return (MonthlyBill) super.uniqueResult();
	}
	
	public MonthlyBill[] listMonthlyBill() {
		java.util.List list = super.list();
		return (MonthlyBill[]) list.toArray(new MonthlyBill[list.size()]);
	}
}

