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
import sportify.models.event.EventCategoryCriteria;

public class SubscriptionCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final DateExpression date;
	public final BooleanExpression paid;
	public final CollectionExpression subscribedEvents;
	
	public SubscriptionCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		date = new DateExpression("date", this);
		paid = new BooleanExpression("paid", this);
		subscribedEvents = new CollectionExpression("ORM_SubscribedEvents", this);
	}
	
	public SubscriptionCriteria(PersistentSession session) {
		this(session.createCriteria(Subscription.class));
	}
	
	public SubscriptionCriteria() throws PersistentException {
		this(EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public EventCategoryCriteria createSubscribedEventsCriteria() {
		return new EventCategoryCriteria(createCriteria("ORM_SubscribedEvents"));
	}
	
	public Subscription uniqueSubscription() {
		return (Subscription) super.uniqueResult();
	}
	
	public Subscription[] listSubscription() {
		java.util.List list = super.list();
		return (Subscription[]) list.toArray(new Subscription[list.size()]);
	}
}

