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
package com.Sportify.Entities.competition;

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
	public final CollectionExpression matchEvents;
	
	public CompetitionDetachedCriteria() {
		super(com.Sportify.Entities.competition.Competition.class, com.Sportify.Entities.competition.CompetitionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		location = new StringExpression("location", this.getDetachedCriteria());
		startDate = new DateExpression("startDate", this.getDetachedCriteria());
		endDate = new DateExpression("endDate", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		active = new BooleanExpression("active", this.getDetachedCriteria());
		matchEvents = new CollectionExpression("ORM_matchEvents", this.getDetachedCriteria());
	}
	
	public CompetitionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.Sportify.Entities.competition.CompetitionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		location = new StringExpression("location", this.getDetachedCriteria());
		startDate = new DateExpression("startDate", this.getDetachedCriteria());
		endDate = new DateExpression("endDate", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		active = new BooleanExpression("active", this.getDetachedCriteria());
		matchEvents = new CollectionExpression("ORM_matchEvents", this.getDetachedCriteria());
	}
	
	public MatchEventDetachedCriteria createMatchEventsCriteria() {
		return new MatchEventDetachedCriteria(createCriteria("ORM_matchEvents"));
	}
	
	public Competition uniqueCompetition(PersistentSession session) {
		return (Competition) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Competition[] listCompetition(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Competition[]) list.toArray(new Competition[list.size()]);
	}
}

