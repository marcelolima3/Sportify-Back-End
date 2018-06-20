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
package sportify.competition;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ModalityCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final CollectionExpression competitions;
	public final CollectionExpression teams;
	
	public ModalityCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
		competitions = new CollectionExpression("ORM_Competitions", this);
		teams = new CollectionExpression("ORM_Teams", this);
	}
	
	public ModalityCriteria(PersistentSession session) {
		this(session.createCriteria(Modality.class));
	}
	
	public ModalityCriteria() throws PersistentException {
		this(EAClassDiagramPersistentManager.instance().getSession());
	}
	
	public CompetitionCriteria createCompetitionsCriteria() {
		return new CompetitionCriteria(createCriteria("ORM_Competitions"));
	}
	
	public sportify.subentities.TeamCriteria createTeamsCriteria() {
		return new sportify.subentities.TeamCriteria(createCriteria("ORM_Teams"));
	}
	
	public Modality uniqueModality() {
		return (Modality) super.uniqueResult();
	}
	
	public Modality[] listModality() {
		java.util.List list = super.list();
		return (Modality[]) list.toArray(new Modality[list.size()]);
	}
}

