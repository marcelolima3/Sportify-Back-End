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

public class PrepaidCardDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final LongExpression cardNumber;
	public final DateExpression expirationDate;
	public final BigDecimalExpression balance;
	public final IntegerExpression numRecharges;
	
	public PrepaidCardDetachedCriteria() {
		super(PrepaidCard.class, PrepaidCardCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		cardNumber = new LongExpression("cardNumber", this.getDetachedCriteria());
		expirationDate = new DateExpression("expirationDate", this.getDetachedCriteria());
		balance = new BigDecimalExpression("balance", this.getDetachedCriteria());
		numRecharges = new IntegerExpression("numRecharges", this.getDetachedCriteria());
	}
	
	public PrepaidCardDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, PrepaidCardCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		cardNumber = new LongExpression("cardNumber", this.getDetachedCriteria());
		expirationDate = new DateExpression("expirationDate", this.getDetachedCriteria());
		balance = new BigDecimalExpression("balance", this.getDetachedCriteria());
		numRecharges = new IntegerExpression("numRecharges", this.getDetachedCriteria());
	}
	
	public PrepaidCard uniquePrepaidCard(PersistentSession session) {
		return (PrepaidCard) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PrepaidCard[] listPrepaidCard(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PrepaidCard[]) list.toArray(new PrepaidCard[list.size()]);
	}
}

