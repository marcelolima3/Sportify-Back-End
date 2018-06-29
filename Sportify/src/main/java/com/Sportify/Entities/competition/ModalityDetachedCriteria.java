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

public class ModalityDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final StringExpression imgUrl;
	public final CollectionExpression _eventCategories;
	public final CollectionExpression competitions;
	public final CollectionExpression teams;
	
	public ModalityDetachedCriteria() {
		super(com.Sportify.Entities.competition.Modality.class, com.Sportify.Entities.competition.ModalityCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		imgUrl = new StringExpression("imgUrl", this.getDetachedCriteria());
		_eventCategories = new CollectionExpression("ORM__eventCategories", this.getDetachedCriteria());
		competitions = new CollectionExpression("ORM_competitions", this.getDetachedCriteria());
		teams = new CollectionExpression("ORM_teams", this.getDetachedCriteria());
	}
	
	public ModalityDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.Sportify.Entities.competition.ModalityCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		imgUrl = new StringExpression("imgUrl", this.getDetachedCriteria());
		_eventCategories = new CollectionExpression("ORM__eventCategories", this.getDetachedCriteria());
		competitions = new CollectionExpression("ORM_competitions", this.getDetachedCriteria());
		teams = new CollectionExpression("ORM_teams", this.getDetachedCriteria());
	}
	
	public com.Sportify.Entities.event.EventCategoryDetachedCriteria create_eventCategoriesCriteria() {
		return new com.Sportify.Entities.event.EventCategoryDetachedCriteria(createCriteria("ORM__eventCategories"));
	}
	
	public CompetitionDetachedCriteria createCompetitionsCriteria() {
		return new CompetitionDetachedCriteria(createCriteria("ORM_competitions"));
	}
	
	public com.Sportify.Entities.subentities.TeamDetachedCriteria createTeamsCriteria() {
		return new com.Sportify.Entities.subentities.TeamDetachedCriteria(createCriteria("ORM_teams"));
	}
	
	public Modality uniqueModality(PersistentSession session) {
		return (Modality) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Modality[] listModality(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Modality[]) list.toArray(new Modality[list.size()]);
	}
}

