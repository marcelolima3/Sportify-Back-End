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

public class MatchCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final DateExpression startTime;
	public final DateExpression endTime;
	public final BooleanExpression active;
	public final CollectionExpression events;
	public final CollectionExpression athletes;
	
	public MatchCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		startTime = new DateExpression("startTime", this);
		endTime = new DateExpression("endTime", this);
		active = new BooleanExpression("active", this);
		events = new CollectionExpression("ORM_Events", this);
		athletes = new CollectionExpression("ORM_Athletes", this);
	}
	
	public MatchCriteria(PersistentSession session) {
		this(session.createCriteria(Match.class));
	}
	
	public MatchCriteria() throws PersistentException {
		this(event.EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public event.EventCriteria createEventsCriteria() {
		return new event.EventCriteria(createCriteria("ORM_Events"));
	}
	
	public AthleteCriteria createAthletesCriteria() {
		return new AthleteCriteria(createCriteria("ORM_Athletes"));
	}
	
	public Match uniqueMatch() {
		return (Match) super.uniqueResult();
	}
	
	public Match[] listMatch() {
		java.util.List list = super.list();
		return (Match[]) list.toArray(new Match[list.size()]);
	}
}

