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

public class Athlete implements sportify.subentities.SubscriptionEntity {
	public Athlete() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == sportify.competition.ORMConstants.KEY_ATHLETE_MATCH_EVENTS) {
			return ORM_match_events;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == sportify.competition.ORMConstants.KEY_ATHLETE_TEAM) {
			this.team = (sportify.subentities.Team) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private sportify.subentities.Team team;
	
	private String name;
	
	private String nationality;
	
	private String genre;
	
	private java.util.Set ORM_match_events = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNationality(String value) {
		this.nationality = value;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public void setGenre(String value) {
		this.genre = value;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setTeam(sportify.subentities.Team value) {
		if (team != null) {
			team.athletes.remove(this);
		}
		if (value != null) {
			value.athletes.add(this);
		}
	}
	
	public sportify.subentities.Team getTeam() {
		return team;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Team(sportify.subentities.Team value) {
		this.team = value;
	}
	
	private sportify.subentities.Team getORM_Team() {
		return team;
	}
	
	private void setORM_Match_events(java.util.Set value) {
		this.ORM_match_events = value;
	}
	
	private java.util.Set getORM_Match_events() {
		return ORM_match_events;
	}
	
	public final sportify.competition.Match_eventSetCollection match_events = new sportify.competition.Match_eventSetCollection(this, _ormAdapter, sportify.competition.ORMConstants.KEY_ATHLETE_MATCH_EVENTS, sportify.competition.ORMConstants.KEY_MATCH_EVENT_ATHLETES, sportify.competition.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
