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
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AthleteCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression teamId;
	public final AssociationExpression team;
	public final CollectionExpression matches;
	
	public AthleteCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		teamId = new IntegerExpression("team.ID", this);
		team = new AssociationExpression("team", this);
		matches = new CollectionExpression("ORM_Matches", this);
	}
	
	public AthleteCriteria(PersistentSession session) {
		this(session.createCriteria(Athlete.class));
	}
	
	public AthleteCriteria() throws PersistentException {
		this(event.EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public TeamCriteria createTeamCriteria() {
		return new TeamCriteria(createCriteria("team"));
	}
	
	public MatchCriteria createMatchesCriteria() {
		return new MatchCriteria(createCriteria("ORM_Matches"));
	}
	
	public Athlete uniqueAthlete() {
		return (Athlete) super.uniqueResult();
	}
	
	public Athlete[] listAthlete() {
		java.util.List list = super.list();
		return (Athlete[]) list.toArray(new Athlete[list.size()]);
	}
}

