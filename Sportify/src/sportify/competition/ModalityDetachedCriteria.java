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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ModalityDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final CollectionExpression competitions;
	public final CollectionExpression teams;
	
	public ModalityDetachedCriteria() {
		super(sportify.competition.Modality.class, sportify.competition.ModalityCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		competitions = new CollectionExpression("ORM_Competitions", this.getDetachedCriteria());
		teams = new CollectionExpression("ORM_Teams", this.getDetachedCriteria());
	}
	
	public ModalityDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, sportify.competition.ModalityCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		competitions = new CollectionExpression("ORM_Competitions", this.getDetachedCriteria());
		teams = new CollectionExpression("ORM_Teams", this.getDetachedCriteria());
	}
	
	public CompetitionDetachedCriteria createCompetitionsCriteria() {
		return new CompetitionDetachedCriteria(createCriteria("ORM_Competitions"));
	}
	
	public sportify.subentities.TeamDetachedCriteria createTeamsCriteria() {
		return new sportify.subentities.TeamDetachedCriteria(createCriteria("ORM_Teams"));
	}
	
	public Modality uniqueModality(PersistentSession session) {
		return (Modality) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Modality[] listModality(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Modality[]) list.toArray(new Modality[list.size()]);
	}
}

