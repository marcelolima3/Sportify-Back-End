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

public class UserCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression paymentManagerId;
	public final AssociationExpression paymentManager;
	public final StringExpression name;
	public final StringExpression email;
	public final StringExpression password;
	public final DateExpression registrationDate;
	public final CollectionExpression subscriptions;
	
	public UserCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		paymentManagerId = new IntegerExpression("paymentManager.ID", this);
		paymentManager = new AssociationExpression("paymentManager", this);
		name = new StringExpression("name", this);
		email = new StringExpression("email", this);
		password = new StringExpression("password", this);
		registrationDate = new DateExpression("registrationDate", this);
		subscriptions = new CollectionExpression("ORM_Subscriptions", this);
	}
	
	public UserCriteria(PersistentSession session) {
		this(session.createCriteria(User.class));
	}
	
	public UserCriteria() throws PersistentException {
		this(event.EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public PaymentMethodCriteria createPaymentManagerCriteria() {
		return new PaymentMethodCriteria(createCriteria("paymentManager"));
	}
	
	public SubscriptionCriteria createSubscriptionsCriteria() {
		return new SubscriptionCriteria(createCriteria("ORM_Subscriptions"));
	}
	
	public User uniqueUser() {
		return (User) super.uniqueResult();
	}
	
	public User[] listUser() {
		java.util.List list = super.list();
		return (User[]) list.toArray(new User[list.size()]);
	}
}

