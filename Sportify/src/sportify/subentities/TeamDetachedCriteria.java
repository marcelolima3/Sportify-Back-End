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
package sportify.subentities;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TeamDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final CollectionExpression athletes;
	
	public TeamDetachedCriteria() {
		super(sportify.subentities.Team.class, sportify.subentities.TeamCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		athletes = new CollectionExpression("ORM_Athletes", this.getDetachedCriteria());
	}
	
	public TeamDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, sportify.subentities.TeamCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		athletes = new CollectionExpression("ORM_Athletes", this.getDetachedCriteria());
	}
	
	public sportify.subentities.AthleteDetachedCriteria createAthletesCriteria() {
		return new sportify.subentities.AthleteDetachedCriteria(createCriteria("ORM_Athletes"));
	}
	
	public Team uniqueTeam(PersistentSession session) {
		return (Team) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Team[] listTeam(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Team[]) list.toArray(new Team[list.size()]);
	}
}

