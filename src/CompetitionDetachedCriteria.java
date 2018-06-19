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

public class CompetitionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final DateExpression startDate;
	public final DateExpression endDate;
	public final BooleanExpression active;
	public final CollectionExpression matches;
	
	public CompetitionDetachedCriteria() {
		super(Competition.class, CompetitionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		startDate = new DateExpression("startDate", this.getDetachedCriteria());
		endDate = new DateExpression("endDate", this.getDetachedCriteria());
		active = new BooleanExpression("active", this.getDetachedCriteria());
		matches = new CollectionExpression("ORM_Matches", this.getDetachedCriteria());
	}
	
	public CompetitionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, CompetitionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		startDate = new DateExpression("startDate", this.getDetachedCriteria());
		endDate = new DateExpression("endDate", this.getDetachedCriteria());
		active = new BooleanExpression("active", this.getDetachedCriteria());
		matches = new CollectionExpression("ORM_Matches", this.getDetachedCriteria());
	}
	
	public MatchDetachedCriteria createMatchesCriteria() {
		return new MatchDetachedCriteria(createCriteria("ORM_Matches"));
	}
	
	public Competition uniqueCompetition(PersistentSession session) {
		return (Competition) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Competition[] listCompetition(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Competition[]) list.toArray(new Competition[list.size()]);
	}
}

