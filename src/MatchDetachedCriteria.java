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

public class MatchDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final DateExpression startTime;
	public final DateExpression endTime;
	public final BooleanExpression active;
	public final CollectionExpression events;
	public final CollectionExpression athletes;
	
	public MatchDetachedCriteria() {
		super(Match.class, MatchCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		startTime = new DateExpression("startTime", this.getDetachedCriteria());
		endTime = new DateExpression("endTime", this.getDetachedCriteria());
		active = new BooleanExpression("active", this.getDetachedCriteria());
		events = new CollectionExpression("ORM_Events", this.getDetachedCriteria());
		athletes = new CollectionExpression("ORM_Athletes", this.getDetachedCriteria());
	}
	
	public MatchDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, MatchCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		startTime = new DateExpression("startTime", this.getDetachedCriteria());
		endTime = new DateExpression("endTime", this.getDetachedCriteria());
		active = new BooleanExpression("active", this.getDetachedCriteria());
		events = new CollectionExpression("ORM_Events", this.getDetachedCriteria());
		athletes = new CollectionExpression("ORM_Athletes", this.getDetachedCriteria());
	}
	
	public event.EventDetachedCriteria createEventsCriteria() {
		return new event.EventDetachedCriteria(createCriteria("ORM_Events"));
	}
	
	public AthleteDetachedCriteria createAthletesCriteria() {
		return new AthleteDetachedCriteria(createCriteria("ORM_Athletes"));
	}
	
	public Match uniqueMatch(PersistentSession session) {
		return (Match) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Match[] listMatch(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Match[]) list.toArray(new Match[list.size()]);
	}
}

