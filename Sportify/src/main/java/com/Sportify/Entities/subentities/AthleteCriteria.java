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
import com.Sportify.Entities.competition.MatchEventCriteria;
import com.Sportify.Entities.user.SubscriptionCriteria;
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AthleteCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression subscriptions;
	public final StringExpression name;
	public final StringExpression nationality;
	public final StringExpression genre;
	public final StringExpression imgUrl;
	public final IntegerExpression teamId;
	public final AssociationExpression team;
	public final CollectionExpression matchEvents;
	
	public AthleteCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		subscriptions = new CollectionExpression("ORM_subscriptions", this);
		name = new StringExpression("name", this);
		nationality = new StringExpression("nationality", this);
		genre = new StringExpression("genre", this);
		imgUrl = new StringExpression("imgUrl", this);
		teamId = new IntegerExpression("team.", this);
		team = new AssociationExpression("team", this);
		matchEvents = new CollectionExpression("ORM_matchEvents", this);
	}
	
	public AthleteCriteria(PersistentSession session) {
		this(session.createCriteria(Athlete.class));
	}
	
	public AthleteCriteria() throws PersistentException {
		this(EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public TeamCriteria createTeamCriteria() {
		return new TeamCriteria(createCriteria("team"));
	}
	
	public MatchEventCriteria createMatchEventsCriteria() {
		return new MatchEventCriteria(createCriteria("ORM_matchEvents"));
	}
	
	public SubscriptionCriteria createSubscriptionsCriteria() {
		return new SubscriptionCriteria(createCriteria("ORM_subscriptions"));
	}
	
	public Athlete uniqueAthlete() {
		return (Athlete) super.uniqueResult();
	}
	
	public Athlete[] listAthlete() {
		java.util.List list = super.list();
		return (Athlete[]) list.toArray(new Athlete[list.size()]);
	}
}

