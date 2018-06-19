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

public class UserDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression paymentManagerId;
	public final AssociationExpression paymentManager;
	public final StringExpression name;
	public final StringExpression email;
	public final StringExpression password;
	public final DateExpression registrationDate;
	public final CollectionExpression subscriptions;
	
	public UserDetachedCriteria() {
		super(User.class, UserCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		paymentManagerId = new IntegerExpression("paymentManager.ID", this.getDetachedCriteria());
		paymentManager = new AssociationExpression("paymentManager", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		registrationDate = new DateExpression("registrationDate", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_Subscriptions", this.getDetachedCriteria());
	}
	
	public UserDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, UserCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		paymentManagerId = new IntegerExpression("paymentManager.ID", this.getDetachedCriteria());
		paymentManager = new AssociationExpression("paymentManager", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		registrationDate = new DateExpression("registrationDate", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_Subscriptions", this.getDetachedCriteria());
	}
	
	public PaymentMethodDetachedCriteria createPaymentManagerCriteria() {
		return new PaymentMethodDetachedCriteria(createCriteria("paymentManager"));
	}
	
	public SubscriptionDetachedCriteria createSubscriptionsCriteria() {
		return new SubscriptionDetachedCriteria(createCriteria("ORM_Subscriptions"));
	}
	
	public User uniqueUser(PersistentSession session) {
		return (User) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public User[] listUser(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (User[]) list.toArray(new User[list.size()]);
	}
}

