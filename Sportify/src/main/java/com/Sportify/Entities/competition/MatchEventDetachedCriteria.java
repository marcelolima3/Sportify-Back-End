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

public class MatchEventDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression subscriptions;
	public final StringExpression description;
	public final DateExpression startTime;
	public final DateExpression endTime;
	public final StringExpression location;
	public final BooleanExpression active;
	public final CollectionExpression events;
	public final CollectionExpression athletes;
	
	public MatchEventDetachedCriteria() {
		super(com.Sportify.Entities.competition.MatchEvent.class, com.Sportify.Entities.competition.MatchEventCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_subscriptions", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		startTime = new DateExpression("startTime", this.getDetachedCriteria());
		endTime = new DateExpression("endTime", this.getDetachedCriteria());
		location = new StringExpression("location", this.getDetachedCriteria());
		active = new BooleanExpression("active", this.getDetachedCriteria());
		events = new CollectionExpression("ORM_events", this.getDetachedCriteria());
		athletes = new CollectionExpression("ORM_athletes", this.getDetachedCriteria());
	}
	
	public MatchEventDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.Sportify.Entities.competition.MatchEventCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_subscriptions", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		startTime = new DateExpression("startTime", this.getDetachedCriteria());
		endTime = new DateExpression("endTime", this.getDetachedCriteria());
		location = new StringExpression("location", this.getDetachedCriteria());
		active = new BooleanExpression("active", this.getDetachedCriteria());
		events = new CollectionExpression("ORM_events", this.getDetachedCriteria());
		athletes = new CollectionExpression("ORM_athletes", this.getDetachedCriteria());
	}
	
	public com.Sportify.Entities.event.EventDetachedCriteria createEventsCriteria() {
		return new com.Sportify.Entities.event.EventDetachedCriteria(createCriteria("ORM_events"));
	}
	
	public com.Sportify.Entities.subentities.AthleteDetachedCriteria createAthletesCriteria() {
		return new com.Sportify.Entities.subentities.AthleteDetachedCriteria(createCriteria("ORM_athletes"));
	}
	
	public com.Sportify.Entities.user.SubscriptionDetachedCriteria createSubscriptionsCriteria() {
		return new com.Sportify.Entities.user.SubscriptionDetachedCriteria(createCriteria("ORM_subscriptions"));
	}
	
	public MatchEvent uniqueMatchEvent(PersistentSession session) {
		return (MatchEvent) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public MatchEvent[] listMatchEvent(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (MatchEvent[]) list.toArray(new MatchEvent[list.size()]);
	}
}

