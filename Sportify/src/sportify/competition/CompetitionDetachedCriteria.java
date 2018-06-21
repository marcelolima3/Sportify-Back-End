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

public class CompetitionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final StringExpression location;
	public final DateExpression startDate;
	public final DateExpression endDate;
	public final StringExpression description;
	public final BooleanExpression active;
	public final CollectionExpression match_events;
	
	public CompetitionDetachedCriteria() {
		super(sportify.competition.Competition.class, sportify.competition.CompetitionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		location = new StringExpression("location", this.getDetachedCriteria());
		startDate = new DateExpression("startDate", this.getDetachedCriteria());
		endDate = new DateExpression("endDate", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		active = new BooleanExpression("active", this.getDetachedCriteria());
		match_events = new CollectionExpression("ORM_Match_events", this.getDetachedCriteria());
	}
	
	public CompetitionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, sportify.competition.CompetitionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		location = new StringExpression("location", this.getDetachedCriteria());
		startDate = new DateExpression("startDate", this.getDetachedCriteria());
		endDate = new DateExpression("endDate", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		active = new BooleanExpression("active", this.getDetachedCriteria());
		match_events = new CollectionExpression("ORM_Match_events", this.getDetachedCriteria());
	}
	
	public Match_eventDetachedCriteria createMatch_eventsCriteria() {
		return new Match_eventDetachedCriteria(createCriteria("ORM_Match_events"));
	}
	
	public Competition uniqueCompetition(PersistentSession session) {
		return (Competition) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Competition[] listCompetition(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Competition[]) list.toArray(new Competition[list.size()]);
	}
}

