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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TeamCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final CollectionExpression athletes;
	
	public TeamCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
		athletes = new CollectionExpression("ORM_Athletes", this);
	}
	
	public TeamCriteria(PersistentSession session) {
		this(session.createCriteria(Team.class));
	}
	
	public TeamCriteria() throws PersistentException {
		this(sportify.competition.EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public sportify.subentities.AthleteCriteria createAthletesCriteria() {
		return new sportify.subentities.AthleteCriteria(createCriteria("ORM_Athletes"));
	}
	
	public Team uniqueTeam() {
		return (Team) super.uniqueResult();
	}
	
	public Team[] listTeam() {
		java.util.List list = super.list();
		return (Team[]) list.toArray(new Team[list.size()]);
	}
}

