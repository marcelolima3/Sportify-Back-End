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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Match_eventDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression description;
	public final DateExpression startTime;
	public final DateExpression endTime;
	public final StringExpression location;
	public final BooleanExpression active;
	public final CollectionExpression events;
	public final CollectionExpression athletes;
	
	public Match_eventDetachedCriteria() {
		super(sportify.competition.Match_event.class, sportify.competition.Match_eventCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		startTime = new DateExpression("startTime", this.getDetachedCriteria());
		endTime = new DateExpression("endTime", this.getDetachedCriteria());
		location = new StringExpression("location", this.getDetachedCriteria());
		active = new BooleanExpression("active", this.getDetachedCriteria());
		events = new CollectionExpression("ORM_Events", this.getDetachedCriteria());
		athletes = new CollectionExpression("ORM_Athletes", this.getDetachedCriteria());
	}
	
	public Match_eventDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, sportify.competition.Match_eventCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		startTime = new DateExpression("startTime", this.getDetachedCriteria());
		endTime = new DateExpression("endTime", this.getDetachedCriteria());
		location = new StringExpression("location", this.getDetachedCriteria());
		active = new BooleanExpression("active", this.getDetachedCriteria());
		events = new CollectionExpression("ORM_Events", this.getDetachedCriteria());
		athletes = new CollectionExpression("ORM_Athletes", this.getDetachedCriteria());
	}
	
	public sportify.event.EventDetachedCriteria createEventsCriteria() {
		return new sportify.event.EventDetachedCriteria(createCriteria("ORM_Events"));
	}
	
	public sportify.subentities.AthleteDetachedCriteria createAthletesCriteria() {
		return new sportify.subentities.AthleteDetachedCriteria(createCriteria("ORM_Athletes"));
	}
	
	public Match_event uniqueMatch_event(PersistentSession session) {
		return (Match_event) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Match_event[] listMatch_event(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Match_event[]) list.toArray(new Match_event[list.size()]);
	}
}

