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
public class Athlete implements SubscriptionEntity {
	public Athlete() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == event.ORMConstants.KEY_ATHLETE_MATCHES) {
			return ORM_matches;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == event.ORMConstants.KEY_ATHLETE_TEAM) {
			this.team = (Team) owner;
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
	
	private Team team;
	
	private event.String name;
	
	private event.String nationality;
	
	private event.String genre;
	
	private java.util.Set ORM_matches = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setName(event.String value) {
		this.name = value;
	}
	
	public event.String getName() {
		return name;
	}
	
	public void setNationality(event.String value) {
		this.nationality = value;
	}
	
	public event.String getNationality() {
		return nationality;
	}
	
	public void setGenre(event.String value) {
		this.genre = value;
	}
	
	public event.String getGenre() {
		return genre;
	}
	
	public void setTeam(Team value) {
		if (team != null) {
			team.athletes.remove(this);
		}
		if (value != null) {
			value.athletes.add(this);
		}
	}
	
	public Team getTeam() {
		return team;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Team(Team value) {
		this.team = value;
	}
	
	private Team getORM_Team() {
		return team;
	}
	
	private void setORM_Matches(java.util.Set value) {
		this.ORM_matches = value;
	}
	
	private java.util.Set getORM_Matches() {
		return ORM_matches;
	}
	
	public final MatchSetCollection matches = new MatchSetCollection(this, _ormAdapter, event.ORMConstants.KEY_ATHLETE_MATCHES, event.ORMConstants.KEY_MATCH_ATHLETES, event.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
