/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: tr3s(Universidade do Minho)
 * License Type: Academic
 */
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class MonthlyBillDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final BigDecimalExpression limitAmount;
	public final BigDecimalExpression currentAmount;
	public final CollectionExpression payments;
	
	public MonthlyBillDetachedCriteria() {
		super(MonthlyBill.class, MonthlyBillCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		limitAmount = new BigDecimalExpression("limitAmount", this.getDetachedCriteria());
		currentAmount = new BigDecimalExpression("currentAmount", this.getDetachedCriteria());
		payments = new CollectionExpression("ORM_Payments", this.getDetachedCriteria());
	}
	
	public MonthlyBillDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, MonthlyBillCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		limitAmount = new BigDecimalExpression("limitAmount", this.getDetachedCriteria());
		currentAmount = new BigDecimalExpression("currentAmount", this.getDetachedCriteria());
		payments = new CollectionExpression("ORM_Payments", this.getDetachedCriteria());
	}
	
	public InvoiceDetachedCriteria createPaymentsCriteria() {
		return new InvoiceDetachedCriteria(createCriteria("ORM_Payments"));
	}
	
	public MonthlyBill uniqueMonthlyBill(PersistentSession session) {
		return (MonthlyBill) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public MonthlyBill[] listMonthlyBill(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (MonthlyBill[]) list.toArray(new MonthlyBill[list.size()]);
	}
}

