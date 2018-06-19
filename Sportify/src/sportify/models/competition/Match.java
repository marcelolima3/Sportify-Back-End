package sportify.models.competition; /**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

import sportify.models.AthleteSetCollection;
import sportify.models.SubscriptionEntity;
import sportify.models.event.EventSetCollection;
import sportify.models.event.ORMConstants;

/**
 * Licensee: tr3s(Universidade do Minho)
 * License Type: Academic
 */
public class Match implements SubscriptionEntity {
	public Match() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MATCH_EVENTS) {
			return ORM_events;
		}
		else if (key == ORMConstants.KEY_MATCH_ATHLETES) {
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
	
	private String description;
	
	private java.util.Date startTime;
	
	private java.util.Date endTime;
	
	private String location;
	
	private Boolean active;
	
	private java.util.Set ORM_events = new java.util.HashSet();
	
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
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setStartTime(java.util.Date value) {
		this.startTime = value;
	}
	
	public java.util.Date getStartTime() {
		return startTime;
	}
	
	public void setEndTime(java.util.Date value) {
		this.endTime = value;
	}
	
	public java.util.Date getEndTime() {
		return endTime;
	}
	
	public void setLocation(String value) {
		this.location = value;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setActive(boolean value) {
		setActive(new Boolean(value));
	}
	
	public void setActive(Boolean value) {
		this.active = value;
	}
	
	public Boolean getActive() {
		return active;
	}
	
	private void setORM_Events(java.util.Set value) {
		this.ORM_events = value;
	}
	
	private java.util.Set getORM_Events() {
		return ORM_events;
	}
	
	public final EventSetCollection events = new EventSetCollection(this, _ormAdapter, ORMConstants.KEY_MATCH_EVENTS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Athletes(java.util.Set value) {
		this.ORM_athletes = value;
	}
	
	private java.util.Set getORM_Athletes() {
		return ORM_athletes;
	}
	
	public final AthleteSetCollection athletes = new AthleteSetCollection(this, _ormAdapter, ORMConstants.KEY_MATCH_ATHLETES, ORMConstants.KEY_ATHLETE_MATCHES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public Boolean isActive() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
