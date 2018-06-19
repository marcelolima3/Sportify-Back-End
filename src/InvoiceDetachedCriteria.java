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

public class InvoiceDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression attribute2;
	public final IntegerExpression attribute;
	public final IntegerExpression ID;
	public final DateExpression date;
	public final BigDecimalExpression amount;
	public final CollectionExpression subscriptions;
	
	public InvoiceDetachedCriteria() {
		super(Invoice.class, InvoiceCriteria.class);
		attribute2 = new IntegerExpression("attribute2", this.getDetachedCriteria());
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		date = new DateExpression("date", this.getDetachedCriteria());
		amount = new BigDecimalExpression("amount", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_Subscriptions", this.getDetachedCriteria());
	}
	
	public InvoiceDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, InvoiceCriteria.class);
		attribute2 = new IntegerExpression("attribute2", this.getDetachedCriteria());
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		date = new DateExpression("date", this.getDetachedCriteria());
		amount = new BigDecimalExpression("amount", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_Subscriptions", this.getDetachedCriteria());
	}
	
	public SubscriptionDetachedCriteria createSubscriptionsCriteria() {
		return new SubscriptionDetachedCriteria(createCriteria("ORM_Subscriptions"));
	}
	
	public Invoice uniqueInvoice(PersistentSession session) {
		return (Invoice) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Invoice[] listInvoice(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Invoice[]) list.toArray(new Invoice[list.size()]);
	}
}

