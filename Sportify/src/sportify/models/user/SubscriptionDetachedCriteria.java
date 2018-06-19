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
import sportify.models.event.EventCategoryDetachedCriteria;

public class SubscriptionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final DateExpression date;
	public final BooleanExpression paid;
	public final CollectionExpression subscribedEvents;
	
	public SubscriptionDetachedCriteria() {
		super(Subscription.class, SubscriptionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		date = new DateExpression("date", this.getDetachedCriteria());
		paid = new BooleanExpression("paid", this.getDetachedCriteria());
		subscribedEvents = new CollectionExpression("ORM_SubscribedEvents", this.getDetachedCriteria());
	}
	
	public SubscriptionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, SubscriptionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		date = new DateExpression("date", this.getDetachedCriteria());
		paid = new BooleanExpression("paid", this.getDetachedCriteria());
		subscribedEvents = new CollectionExpression("ORM_SubscribedEvents", this.getDetachedCriteria());
	}
	
	public EventCategoryDetachedCriteria createSubscribedEventsCriteria() {
		return new EventCategoryDetachedCriteria(createCriteria("ORM_SubscribedEvents"));
	}
	
	public Subscription uniqueSubscription(PersistentSession session) {
		return (Subscription) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Subscription[] listSubscription(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Subscription[]) list.toArray(new Subscription[list.size()]);
	}
}

