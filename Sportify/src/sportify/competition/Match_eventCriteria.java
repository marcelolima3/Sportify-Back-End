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
package sportify.competition;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Match_eventCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression description;
	public final DateExpression startTime;
	public final DateExpression endTime;
	public final StringExpression location;
	public final BooleanExpression active;
	public final CollectionExpression events;
	public final CollectionExpression athletes;
	
	public Match_eventCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		description = new StringExpression("description", this);
		startTime = new DateExpression("startTime", this);
		endTime = new DateExpression("endTime", this);
		location = new StringExpression("location", this);
		active = new BooleanExpression("active", this);
		events = new CollectionExpression("ORM_Events", this);
		athletes = new CollectionExpression("ORM_Athletes", this);
	}
	
	public Match_eventCriteria(PersistentSession session) {
		this(session.createCriteria(Match_event.class));
	}
	
	public Match_eventCriteria() throws PersistentException {
		this(EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public sportify.event.EventCriteria createEventsCriteria() {
		return new sportify.event.EventCriteria(createCriteria("ORM_Events"));
	}
	
	public sportify.subentities.AthleteCriteria createAthletesCriteria() {
		return new sportify.subentities.AthleteCriteria(createCriteria("ORM_Athletes"));
	}
	
	public Match_event uniqueMatch_event() {
		return (Match_event) super.uniqueResult();
	}
	
	public Match_event[] listMatch_event() {
		java.util.List list = super.list();
		return (Match_event[]) list.toArray(new Match_event[list.size()]);
	}
}

