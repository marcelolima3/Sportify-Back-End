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
package com.Sportify.Entities.subentities;

import java.util.List;

import com.Sportify.Entities.competition.MatchEventDetachedCriteria;
import com.Sportify.Entities.event.EventDetachedCriteria;
import com.Sportify.Entities.user.SubscriptionDetachedCriteria;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AthleteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression subscriptions;
	public final StringExpression name;
	public final StringExpression nationality;
	public final StringExpression genre;
	public final StringExpression imgUrl;
	public final IntegerExpression teamId;
	public final AssociationExpression team;
	public final CollectionExpression matchEvents;
	public final CollectionExpression events;

	public AthleteDetachedCriteria() {
		super(com.Sportify.Entities.subentities.Athlete.class, com.Sportify.Entities.subentities.AthleteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_subscriptions", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		nationality = new StringExpression("nationality", this.getDetachedCriteria());
		genre = new StringExpression("genre", this.getDetachedCriteria());
		imgUrl = new StringExpression("imgUrl", this.getDetachedCriteria());
		teamId = new IntegerExpression("team.", this.getDetachedCriteria());
		team = new AssociationExpression("team", this.getDetachedCriteria());
		matchEvents = new CollectionExpression("ORM_matchEvents", this.getDetachedCriteria());
		events = new CollectionExpression("ORM_events", this.getDetachedCriteria());
	}
	
	public AthleteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.Sportify.Entities.subentities.AthleteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_subscriptions", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		nationality = new StringExpression("nationality", this.getDetachedCriteria());
		genre = new StringExpression("genre", this.getDetachedCriteria());
		imgUrl = new StringExpression("imgUrl", this.getDetachedCriteria());
		teamId = new IntegerExpression("team.", this.getDetachedCriteria());
		team = new AssociationExpression("team", this.getDetachedCriteria());
		matchEvents = new CollectionExpression("ORM_matchEvents", this.getDetachedCriteria());
		events = new CollectionExpression("ORM_events", this.getDetachedCriteria());
	}
	
	public TeamDetachedCriteria createTeamCriteria() {
		return new TeamDetachedCriteria(createCriteria("team"));
	}
	
	public MatchEventDetachedCriteria createMatchEventsCriteria() {
		return new MatchEventDetachedCriteria(createCriteria("ORM_matchEvents"));
	}
	
	public SubscriptionDetachedCriteria createSubscriptionsCriteria() {
		return new SubscriptionDetachedCriteria(createCriteria("ORM_subscriptions"));
	}


	public EventDetachedCriteria createEventsCriteria() {
		return new EventDetachedCriteria(createCriteria("ORM_events"));
	}


	public Athlete uniqueAthlete(PersistentSession session) {
		return (Athlete) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Athlete[] listAthlete(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Athlete[]) list.toArray(new Athlete[list.size()]);
	}
}

