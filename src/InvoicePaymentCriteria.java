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
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class InvoicePaymentCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final BigDecimalExpression currentAmount;
	public final CollectionExpression payments;
	
	public InvoicePaymentCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		currentAmount = new BigDecimalExpression("currentAmount", this);
		payments = new CollectionExpression("ORM_Payments", this);
	}
	
	public InvoicePaymentCriteria(PersistentSession session) {
		this(session.createCriteria(InvoicePayment.class));
	}
	
	public InvoicePaymentCriteria() throws PersistentException {
		this(event.EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public InvoiceCriteria createPaymentsCriteria() {
		return new InvoiceCriteria(createCriteria("ORM_Payments"));
	}
	
	public InvoicePayment uniqueInvoicePayment() {
		return (InvoicePayment) super.uniqueResult();
	}
	
	public InvoicePayment[] listInvoicePayment() {
		java.util.List list = super.list();
		return (InvoicePayment[]) list.toArray(new InvoicePayment[list.size()]);
	}
}

