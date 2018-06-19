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

public class SportCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final CollectionExpression competitions;
	public final CollectionExpression modalities;
	
	public SportCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
		competitions = new CollectionExpression("ORM_Competitions", this);
		modalities = new CollectionExpression("ORM_Modalities", this);
	}
	
	public SportCriteria(PersistentSession session) {
		this(session.createCriteria(Sport.class));
	}
	
	public SportCriteria() throws PersistentException {
		this(event.EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public CompetitionCriteria createCompetitionsCriteria() {
		return new CompetitionCriteria(createCriteria("ORM_Competitions"));
	}
	
	public ModalityCriteria createModalitiesCriteria() {
		return new ModalityCriteria(createCriteria("ORM_Modalities"));
	}
	
	public Sport uniqueSport() {
		return (Sport) super.uniqueResult();
	}
	
	public Sport[] listSport() {
		java.util.List list = super.list();
		return (Sport[]) list.toArray(new Sport[list.size()]);
	}
}

