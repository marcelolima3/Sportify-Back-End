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

import com.Sportify.DAO.EAClassDiagramPersistentManager;
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class MatchEventCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression subscriptions;
	public final StringExpression description;
	public final DateExpression startTime;
	public final DateExpression endTime;
	public final StringExpression location;
	public final BooleanExpression active;
	public final CollectionExpression events;
	public final CollectionExpression athletes;
	
	public MatchEventCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		subscriptions = new CollectionExpression("ORM_subscriptions", this);
		description = new StringExpression("description", this);
		startTime = new DateExpression("startTime", this);
		endTime = new DateExpression("endTime", this);
		location = new StringExpression("location", this);
		active = new BooleanExpression("active", this);
		events = new CollectionExpression("ORM_events", this);
		athletes = new CollectionExpression("ORM_athletes", this);
	}
	
	public MatchEventCriteria(PersistentSession session) {
		this(session.createCriteria(MatchEvent.class));
	}
	
	public MatchEventCriteria() throws PersistentException {
		this(EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public com.Sportify.Entities.event.EventCriteria createEventsCriteria() {
		return new com.Sportify.Entities.event.EventCriteria(createCriteria("ORM_events"));
	}
	
	public com.Sportify.Entities.subentities.AthleteCriteria createAthletesCriteria() {
		return new com.Sportify.Entities.subentities.AthleteCriteria(createCriteria("ORM_athletes"));
	}
	
	public com.Sportify.Entities.user.SubscriptionCriteria createSubscriptionsCriteria() {
		return new com.Sportify.Entities.user.SubscriptionCriteria(createCriteria("ORM_subscriptions"));
	}
	
	public MatchEvent uniqueMatchEvent() {
		return (MatchEvent) super.uniqueResult();
	}
	
	public MatchEvent[] listMatchEvent() {
		java.util.List list = super.list();
		return (MatchEvent[]) list.toArray(new MatchEvent[list.size()]);
	}
}

