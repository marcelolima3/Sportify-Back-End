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

public class PrepaidCardCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final LongExpression cardNumber;
	public final DateExpression expirationDate;
	public final BigDecimalExpression balance;
	public final IntegerExpression numRecharges;
	
	public PrepaidCardCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		cardNumber = new LongExpression("cardNumber", this);
		expirationDate = new DateExpression("expirationDate", this);
		balance = new BigDecimalExpression("balance", this);
		numRecharges = new IntegerExpression("numRecharges", this);
	}
	
	public PrepaidCardCriteria(PersistentSession session) {
		this(session.createCriteria(PrepaidCard.class));
	}
	
	public PrepaidCardCriteria() throws PersistentException {
		this(event.EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public PrepaidCard uniquePrepaidCard() {
		return (PrepaidCard) super.uniqueResult();
	}
	
	public PrepaidCard[] listPrepaidCard() {
		java.util.List list = super.list();
		return (PrepaidCard[]) list.toArray(new PrepaidCard[list.size()]);
	}
}

