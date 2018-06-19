/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: tr3s(Universidade do Minho)
 * License Type: Academic
 */
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TeamDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression athletes;
	
	public TeamDetachedCriteria() {
		super(Team.class, TeamCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		athletes = new CollectionExpression("ORM_Athletes", this.getDetachedCriteria());
	}
	
	public TeamDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, TeamCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		athletes = new CollectionExpression("ORM_Athletes", this.getDetachedCriteria());
	}
	
	public AthleteDetachedCriteria createAthletesCriteria() {
		return new AthleteDetachedCriteria(createCriteria("ORM_Athletes"));
	}
	
	public Team uniqueTeam(PersistentSession session) {
		return (Team) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Team[] listTeam(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Team[]) list.toArray(new Team[list.size()]);
	}
}

