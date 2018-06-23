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
package sportify.event;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EventDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression categoryId;
	public final AssociationExpression category;
	public final StringExpression textFormat;
	public final StringExpression imageFormat;
	public final StringExpression videoFormat;
	
	public EventDetachedCriteria() {
		super(sportify.event.Event.class, sportify.event.EventCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		categoryId = new IntegerExpression("category.ID", this.getDetachedCriteria());
		category = new AssociationExpression("category", this.getDetachedCriteria());
		textFormat = new StringExpression("textFormat", this.getDetachedCriteria());
		imageFormat = new StringExpression("imageFormat", this.getDetachedCriteria());
		videoFormat = new StringExpression("videoFormat", this.getDetachedCriteria());
	}
	
	public EventDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, sportify.event.EventCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		categoryId = new IntegerExpression("category.ID", this.getDetachedCriteria());
		category = new AssociationExpression("category", this.getDetachedCriteria());
		textFormat = new StringExpression("textFormat", this.getDetachedCriteria());
		imageFormat = new StringExpression("imageFormat", this.getDetachedCriteria());
		videoFormat = new StringExpression("videoFormat", this.getDetachedCriteria());
	}
	
	public EventCategoryDetachedCriteria createCategoryCriteria() {
		return new EventCategoryDetachedCriteria(createCriteria("category"));
	}
	
	public Event uniqueEvent(PersistentSession session) {
		return (Event) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Event[] listEvent(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Event[]) list.toArray(new Event[list.size()]);
	}
}
