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

public class PaymentMethodDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	
	public PaymentMethodDetachedCriteria() {
		super(PaymentMethod.class, PaymentMethodCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}
	
	public PaymentMethodDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, PaymentMethodCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}
	
	public PaymentMethod uniquePaymentMethod(PersistentSession session) {
		return (PaymentMethod) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PaymentMethod[] listPaymentMethod(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PaymentMethod[]) list.toArray(new PaymentMethod[list.size()]);
	}
}

