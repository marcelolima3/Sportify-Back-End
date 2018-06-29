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

public class SportCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final StringExpression imgUrl;
	public final BooleanExpression onlySport;
	public final CollectionExpression modalities;
	
	public SportCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
		imgUrl = new StringExpression("imgUrl", this);
		onlySport = new BooleanExpression("onlySport", this);
		modalities = new CollectionExpression("ORM_modalities", this);
	}
	
	public SportCriteria(PersistentSession session) {
		this(session.createCriteria(Sport.class));
	}
	
	public SportCriteria() throws PersistentException {
		this(EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public ModalityCriteria createModalitiesCriteria() {
		return new ModalityCriteria(createCriteria("ORM_modalities"));
	}
	
	public Sport uniqueSport() {
		return (Sport) super.uniqueResult();
	}
	
	public Sport[] listSport() {
		java.util.List list = super.list();
		return (Sport[]) list.toArray(new Sport[list.size()]);
	}
}

