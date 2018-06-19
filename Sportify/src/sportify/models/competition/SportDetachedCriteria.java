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
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class SportDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final CollectionExpression competitions;
	public final CollectionExpression modalities;
	
	public SportDetachedCriteria() {
		super(Sport.class, SportCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		competitions = new CollectionExpression("ORM_Competitions", this.getDetachedCriteria());
		modalities = new CollectionExpression("ORM_Modalities", this.getDetachedCriteria());
	}
	
	public SportDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, SportCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		competitions = new CollectionExpression("ORM_Competitions", this.getDetachedCriteria());
		modalities = new CollectionExpression("ORM_Modalities", this.getDetachedCriteria());
	}
	
	public CompetitionDetachedCriteria createCompetitionsCriteria() {
		return new CompetitionDetachedCriteria(createCriteria("ORM_Competitions"));
	}
	
	public ModalityDetachedCriteria createModalitiesCriteria() {
		return new ModalityDetachedCriteria(createCriteria("ORM_Modalities"));
	}
	
	public Sport uniqueSport(PersistentSession session) {
		return (Sport) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Sport[] listSport(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Sport[]) list.toArray(new Sport[list.size()]);
	}
}

