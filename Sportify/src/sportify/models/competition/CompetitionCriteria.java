package sportify.models.competition; /**
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
import sportify.models.EAClassDiagramPersistentManager;

public class CompetitionCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final DateExpression startDate;
	public final DateExpression endDate;
	public final BooleanExpression active;
	public final CollectionExpression matches;
	
	public CompetitionCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		startDate = new DateExpression("startDate", this);
		endDate = new DateExpression("endDate", this);
		active = new BooleanExpression("active", this);
		matches = new CollectionExpression("ORM_Matches", this);
	}
	
	public CompetitionCriteria(PersistentSession session) {
		this(session.createCriteria(Competition.class));
	}
	
	public CompetitionCriteria() throws PersistentException {
		this(EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public MatchCriteria createMatchesCriteria() {
		return new MatchCriteria(createCriteria("ORM_Matches"));
	}
	
	public Competition uniqueCompetition() {
		return (Competition) super.uniqueResult();
	}
	
	public Competition[] listCompetition() {
		java.util.List list = super.list();
		return (Competition[]) list.toArray(new Competition[list.size()]);
	}
}

