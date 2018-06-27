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

public class CompetitionCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final StringExpression location;
	public final DateExpression startDate;
	public final DateExpression endDate;
	public final StringExpression description;
	public final BooleanExpression active;
	public final CollectionExpression matchEvents;
	
	public CompetitionCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
		location = new StringExpression("location", this);
		startDate = new DateExpression("startDate", this);
		endDate = new DateExpression("endDate", this);
		description = new StringExpression("description", this);
		active = new BooleanExpression("active", this);
		matchEvents = new CollectionExpression("ORM_matchEvents", this);
	}
	
	public CompetitionCriteria(PersistentSession session) {
		this(session.createCriteria(Competition.class));
	}
	
	public CompetitionCriteria() throws PersistentException {
		this(EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public MatchEventCriteria createMatchEventsCriteria() {
		return new MatchEventCriteria(createCriteria("ORM_matchEvents"));
	}
	
	public Competition uniqueCompetition() {
		return (Competition) super.uniqueResult();
	}
	
	public Competition[] listCompetition() {
		java.util.List list = super.list();
		return (Competition[]) list.toArray(new Competition[list.size()]);
	}
}
