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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EventCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression categoryId;
	public final AssociationExpression category;
	public final StringExpression textFormat;
	public final StringExpression imageFormat;
	public final StringExpression videoFormat;
	
	public EventCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		categoryId = new IntegerExpression("category.ID", this);
		category = new AssociationExpression("category", this);
		textFormat = new StringExpression("textFormat", this);
		imageFormat = new StringExpression("imageFormat", this);
		videoFormat = new StringExpression("videoFormat", this);
	}
	
	public EventCriteria(PersistentSession session) {
		this(session.createCriteria(Event.class));
	}
	
	public EventCriteria() throws PersistentException {
		this(sportify.competition.EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public EventCategoryCriteria createCategoryCriteria() {
		return new EventCategoryCriteria(createCriteria("category"));
	}
	
	public Event uniqueEvent() {
		return (Event) super.uniqueResult();
	}
	
	public Event[] listEvent() {
		java.util.List list = super.list();
		return (Event[]) list.toArray(new Event[list.size()]);
	}
}

