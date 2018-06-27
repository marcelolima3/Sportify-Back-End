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

public class ModalityCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final CollectionExpression _eventCategories;
	public final CollectionExpression competitions;
	public final CollectionExpression teams;
	
	public ModalityCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
		_eventCategories = new CollectionExpression("ORM__eventCategories", this);
		competitions = new CollectionExpression("ORM_competitions", this);
		teams = new CollectionExpression("ORM_teams", this);
	}
	
	public ModalityCriteria(PersistentSession session) {
		this(session.createCriteria(Modality.class));
	}
	
	public ModalityCriteria() throws PersistentException {
		this(EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public com.Sportify.Entities.event.EventCategoryCriteria create_eventCategoriesCriteria() {
		return new com.Sportify.Entities.event.EventCategoryCriteria(createCriteria("ORM__eventCategories"));
	}
	
	public CompetitionCriteria createCompetitionsCriteria() {
		return new CompetitionCriteria(createCriteria("ORM_competitions"));
	}
	
	public com.Sportify.Entities.subentities.TeamCriteria createTeamsCriteria() {
		return new com.Sportify.Entities.subentities.TeamCriteria(createCriteria("ORM_teams"));
	}
	
	public Modality uniqueModality() {
		return (Modality) super.uniqueResult();
	}
	
	public Modality[] listModality() {
		java.util.List list = super.list();
		return (Modality[]) list.toArray(new Modality[list.size()]);
	}
}

