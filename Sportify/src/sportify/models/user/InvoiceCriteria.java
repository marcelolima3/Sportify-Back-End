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
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;
import sportify.models.EAClassDiagramPersistentManager;

public class InvoiceCriteria extends AbstractORMCriteria {
	public final IntegerExpression attribute2;
	public final IntegerExpression attribute;
	public final IntegerExpression ID;
	public final DateExpression date;
	public final BigDecimalExpression amount;
	public final CollectionExpression subscriptions;
	
	public InvoiceCriteria(Criteria criteria) {
		super(criteria);
		attribute2 = new IntegerExpression("attribute2", this);
		attribute = new IntegerExpression("attribute", this);
		ID = new IntegerExpression("ID", this);
		date = new DateExpression("date", this);
		amount = new BigDecimalExpression("amount", this);
		subscriptions = new CollectionExpression("ORM_Subscriptions", this);
	}
	
	public InvoiceCriteria(PersistentSession session) {
		this(session.createCriteria(Invoice.class));
	}
	
	public InvoiceCriteria() throws PersistentException {
		this(EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public SubscriptionCriteria createSubscriptionsCriteria() {
		return new SubscriptionCriteria(createCriteria("ORM_Subscriptions"));
	}
	
	public Invoice uniqueInvoice() {
		return (Invoice) super.uniqueResult();
	}
	
	public Invoice[] listInvoice() {
		java.util.List list = super.list();
		return (Invoice[]) list.toArray(new Invoice[list.size()]);
	}
}

