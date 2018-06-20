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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class SubscriptionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final DateExpression date;
	public final BooleanExpression paid;
	public final CollectionExpression subscribedEvents;
	
	public SubscriptionDetachedCriteria() {
		super(sportify.user.Subscription.class, sportify.user.SubscriptionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		date = new DateExpression("date", this.getDetachedCriteria());
		paid = new BooleanExpression("paid", this.getDetachedCriteria());
		subscribedEvents = new CollectionExpression("ORM_SubscribedEvents", this.getDetachedCriteria());
	}
	
	public SubscriptionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, sportify.user.SubscriptionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		date = new DateExpression("date", this.getDetachedCriteria());
		paid = new BooleanExpression("paid", this.getDetachedCriteria());
		subscribedEvents = new CollectionExpression("ORM_SubscribedEvents", this.getDetachedCriteria());
	}
	
	public sportify.event.EventCategoryDetachedCriteria createSubscribedEventsCriteria() {
		return new sportify.event.EventCategoryDetachedCriteria(createCriteria("ORM_SubscribedEvents"));
	}
	
	public Subscription uniqueSubscription(PersistentSession session) {
		return (Subscription) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Subscription[] listSubscription(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Subscription[]) list.toArray(new Subscription[list.size()]);
	}
}

