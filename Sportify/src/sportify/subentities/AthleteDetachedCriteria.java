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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AthleteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression teamId;
	public final AssociationExpression team;
	public final StringExpression name;
	public final StringExpression nationality;
	public final StringExpression genre;
	public final CollectionExpression match_events;
	
	public AthleteDetachedCriteria() {
		super(sportify.subentities.Athlete.class, sportify.subentities.AthleteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		teamId = new IntegerExpression("team.ID", this.getDetachedCriteria());
		team = new AssociationExpression("team", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		nationality = new StringExpression("nationality", this.getDetachedCriteria());
		genre = new StringExpression("genre", this.getDetachedCriteria());
		match_events = new CollectionExpression("ORM_Match_events", this.getDetachedCriteria());
	}
	
	public AthleteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, sportify.subentities.AthleteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		teamId = new IntegerExpression("team.ID", this.getDetachedCriteria());
		team = new AssociationExpression("team", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		nationality = new StringExpression("nationality", this.getDetachedCriteria());
		genre = new StringExpression("genre", this.getDetachedCriteria());
		match_events = new CollectionExpression("ORM_Match_events", this.getDetachedCriteria());
	}
	
	public TeamDetachedCriteria createTeamCriteria() {
		return new TeamDetachedCriteria(createCriteria("team"));
	}
	
	public sportify.competition.Match_eventDetachedCriteria createMatch_eventsCriteria() {
		return new sportify.competition.Match_eventDetachedCriteria(createCriteria("ORM_Match_events"));
	}
	
	public Athlete uniqueAthlete(PersistentSession session) {
		return (Athlete) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Athlete[] listAthlete(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Athlete[]) list.toArray(new Athlete[list.size()]);
	}
}

