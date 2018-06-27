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
package com.Sportify.Entities.event;

import com.Sportify.DAO.EAClassDiagramPersistentManager;
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EventCategoryCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final DoubleExpression price;
	
	public EventCategoryCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
		price = new DoubleExpression("price", this);
	}
	
	public EventCategoryCriteria(PersistentSession session) {
		this(session.createCriteria(EventCategory.class));
	}
	
	public EventCategoryCriteria() throws PersistentException {
		this(EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public EventCategory uniqueEventCategory() {
		return (EventCategory) super.uniqueResult();
	}
	
	public EventCategory[] listEventCategory() {
		java.util.List list = super.list();
		return (EventCategory[]) list.toArray(new EventCategory[list.size()]);
	}
}

