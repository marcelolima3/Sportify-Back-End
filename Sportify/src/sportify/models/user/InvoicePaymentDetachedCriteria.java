package sportify.models.user; /**
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

public class InvoicePaymentDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final BigDecimalExpression currentAmount;
	public final CollectionExpression payments;
	
	public InvoicePaymentDetachedCriteria() {
		super(InvoicePayment.class, InvoicePaymentCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		currentAmount = new BigDecimalExpression("currentAmount", this.getDetachedCriteria());
		payments = new CollectionExpression("ORM_Payments", this.getDetachedCriteria());
	}
	
	public InvoicePaymentDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, InvoicePaymentCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		currentAmount = new BigDecimalExpression("currentAmount", this.getDetachedCriteria());
		payments = new CollectionExpression("ORM_Payments", this.getDetachedCriteria());
	}
	
	public InvoiceDetachedCriteria createPaymentsCriteria() {
		return new InvoiceDetachedCriteria(createCriteria("ORM_Payments"));
	}
	
	public InvoicePayment uniqueInvoicePayment(PersistentSession session) {
		return (InvoicePayment) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public InvoicePayment[] listInvoicePayment(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (InvoicePayment[]) list.toArray(new InvoicePayment[list.size()]);
	}
}

