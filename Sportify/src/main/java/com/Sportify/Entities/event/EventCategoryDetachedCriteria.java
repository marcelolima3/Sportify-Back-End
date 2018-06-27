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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EventCategoryDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final DoubleExpression price;
	
	public EventCategoryDetachedCriteria() {
		super(com.Sportify.Entities.event.EventCategory.class, com.Sportify.Entities.event.EventCategoryCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		price = new DoubleExpression("price", this.getDetachedCriteria());
	}
	
	public EventCategoryDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.Sportify.Entities.event.EventCategoryCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		price = new DoubleExpression("price", this.getDetachedCriteria());
	}
	
	public EventCategory uniqueEventCategory(PersistentSession session) {
		return (EventCategory) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public EventCategory[] listEventCategory(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (EventCategory[]) list.toArray(new EventCategory[list.size()]);
	}
}

