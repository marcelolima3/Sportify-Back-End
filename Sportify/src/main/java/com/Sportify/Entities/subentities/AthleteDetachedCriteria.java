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
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AthleteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression subscriptions;
	public final StringExpression name;
	public final StringExpression nationality;
	public final StringExpression genre;
	public final IntegerExpression teamId;
	public final AssociationExpression team;
	public final CollectionExpression matchEvents;
	
	public AthleteDetachedCriteria() {
		super(com.Sportify.Entities.subentities.Athlete.class, com.Sportify.Entities.subentities.AthleteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_subscriptions", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		nationality = new StringExpression("nationality", this.getDetachedCriteria());
		genre = new StringExpression("genre", this.getDetachedCriteria());
		teamId = new IntegerExpression("team.", this.getDetachedCriteria());
		team = new AssociationExpression("team", this.getDetachedCriteria());
		matchEvents = new CollectionExpression("ORM_matchEvents", this.getDetachedCriteria());
	}
	
	public AthleteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.Sportify.Entities.subentities.AthleteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_subscriptions", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		nationality = new StringExpression("nationality", this.getDetachedCriteria());
		genre = new StringExpression("genre", this.getDetachedCriteria());
		teamId = new IntegerExpression("team.", this.getDetachedCriteria());
		team = new AssociationExpression("team", this.getDetachedCriteria());
		matchEvents = new CollectionExpression("ORM_matchEvents", this.getDetachedCriteria());
	}
	
	public TeamDetachedCriteria createTeamCriteria() {
		return new TeamDetachedCriteria(createCriteria("team"));
	}
	
	public com.Sportify.Entities.competition.MatchEventDetachedCriteria createMatchEventsCriteria() {
		return new com.Sportify.Entities.competition.MatchEventDetachedCriteria(createCriteria("ORM_matchEvents"));
	}
	
	public com.Sportify.Entities.user.SubscriptionDetachedCriteria createSubscriptionsCriteria() {
		return new com.Sportify.Entities.user.SubscriptionDetachedCriteria(createCriteria("ORM_subscriptions"));
	}
	
	public Athlete uniqueAthlete(PersistentSession session) {
		return (Athlete) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Athlete[] listAthlete(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Athlete[]) list.toArray(new Athlete[list.size()]);
	}
}

