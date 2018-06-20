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

public class Team implements sportify.subentities.SubscriptionEntity {
	public Team() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == sportify.competition.ORMConstants.KEY_TEAM_ATHLETES) {
			return ORM_athletes;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String name;
	
	private java.util.Set ORM_athletes = new java.util.HashSet();
	
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
	
	private void setORM_Athletes(java.util.Set value) {
		this.ORM_athletes = value;
	}
	
	private java.util.Set getORM_Athletes() {
		return ORM_athletes;
	}
	
	public final sportify.subentities.AthleteSetCollection athletes = new sportify.subentities.AthleteSetCollection(this, _ormAdapter, sportify.competition.ORMConstants.KEY_TEAM_ATHLETES, sportify.competition.ORMConstants.KEY_ATHLETE_TEAM, sportify.competition.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
