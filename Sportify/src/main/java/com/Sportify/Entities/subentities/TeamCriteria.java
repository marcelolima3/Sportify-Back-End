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

import com.Sportify.DAO.EAClassDiagramPersistentManager;
import com.Sportify.Entities.user.SubscriptionCriteria;
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TeamCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression subscriptions;
	public final StringExpression name;
	public final StringExpression imgUrl;
	public final CollectionExpression athletes;
	
	public TeamCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		subscriptions = new CollectionExpression("ORM_subscriptions", this);
		name = new StringExpression("name", this);
		imgUrl = new StringExpression("imgUrl", this);
		athletes = new CollectionExpression("ORM_athletes", this);
	}
	
	public TeamCriteria(PersistentSession session) {
		this(session.createCriteria(Team.class));
	}
	
	public TeamCriteria() throws PersistentException {
		this(EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public com.Sportify.Entities.subentities.AthleteCriteria createAthletesCriteria() {
		return new com.Sportify.Entities.subentities.AthleteCriteria(createCriteria("ORM_athletes"));
	}
	
	public SubscriptionCriteria createSubscriptionsCriteria() {
		return new SubscriptionCriteria(createCriteria("ORM_subscriptions"));
	}
	
	public Team uniqueTeam() {
		return (Team) super.uniqueResult();
	}
	
	public Team[] listTeam() {
		java.util.List list = super.list();
		return (Team[]) list.toArray(new Team[list.size()]);
	}
}

