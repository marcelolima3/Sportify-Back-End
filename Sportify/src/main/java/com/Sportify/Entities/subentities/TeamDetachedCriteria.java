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

public class TeamDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression subscriptions;
	public final StringExpression name;
	public final CollectionExpression athletes;
	
	public TeamDetachedCriteria() {
		super(com.Sportify.Entities.subentities.Team.class, com.Sportify.Entities.subentities.TeamCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_subscriptions", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		athletes = new CollectionExpression("ORM_athletes", this.getDetachedCriteria());
	}
	
	public TeamDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.Sportify.Entities.subentities.TeamCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_subscriptions", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		athletes = new CollectionExpression("ORM_athletes", this.getDetachedCriteria());
	}
	
	public com.Sportify.Entities.subentities.AthleteDetachedCriteria createAthletesCriteria() {
		return new com.Sportify.Entities.subentities.AthleteDetachedCriteria(createCriteria("ORM_athletes"));
	}
	
	public com.Sportify.Entities.user.SubscriptionDetachedCriteria createSubscriptionsCriteria() {
		return new com.Sportify.Entities.user.SubscriptionDetachedCriteria(createCriteria("ORM_subscriptions"));
	}
	
	public Team uniqueTeam(PersistentSession session) {
		return (Team) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Team[] listTeam(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Team[]) list.toArray(new Team[list.size()]);
	}
}

