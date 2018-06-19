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
import sportify.models.TeamCriteria;
import sportify.models.EAClassDiagramPersistentManager;
import sportify.models.event.EventCategoryCriteria;

public class ModalityCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final CollectionExpression events;
	public final CollectionExpression competitions;
	public final CollectionExpression teams;
	
	public ModalityCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
		events = new CollectionExpression("ORM_Events", this);
		competitions = new CollectionExpression("ORM_Competitions", this);
		teams = new CollectionExpression("ORM_Teams", this);
	}
	
	public ModalityCriteria(PersistentSession session) {
		this(session.createCriteria(Modality.class));
	}
	
	public ModalityCriteria() throws PersistentException {
		this(EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public EventCategoryCriteria createEventsCriteria() {
		return new EventCategoryCriteria(createCriteria("ORM_Events"));
	}
	
	public CompetitionCriteria createCompetitionsCriteria() {
		return new CompetitionCriteria(createCriteria("ORM_Competitions"));
	}
	
	public TeamCriteria createTeamsCriteria() {
		return new TeamCriteria(createCriteria("ORM_Teams"));
	}
	
	public Modality uniqueModality() {
		return (Modality) super.uniqueResult();
	}
	
	public Modality[] listModality() {
		java.util.List list = super.list();
		return (Modality[]) list.toArray(new Modality[list.size()]);
	}
}

