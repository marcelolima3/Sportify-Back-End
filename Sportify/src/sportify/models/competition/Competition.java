package sportify.models.competition; /**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

import sportify.models.event.ORMConstants;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Licensee: tr3s(Universidade do Minho)
 * License Type: Academic
 */
public class Competition {
	public Competition() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_COMPETITION_MATCHES) {
			return ORM_matches;
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
	
	private String location;
	
	private java.util.Date startDate;
	
	private java.util.Date endDate;
	
	private String description;
	
	private Boolean active;
	
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
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setLocation(String value) {
		this.location = value;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setStartDate(java.util.Date value) {
		this.startDate = value;
	}
	
	public java.util.Date getStartDate() {
		return startDate;
	}
	
	public void setEndDate(java.util.Date value) {
		this.endDate = value;
	}
	
	public java.util.Date getEndDate() {
		return endDate;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
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
	
	private void setORM_Matches(java.util.Set value) {
		this.ORM_matches = value;
	}
	
	private java.util.Set getORM_Matches() {
		return ORM_matches;
	}
	
	public final MatchSetCollection matches = new MatchSetCollection(this, _ormAdapter, ORMConstants.KEY_COMPETITION_MATCHES, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public Date getStartTime() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public Date getEndTime() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public Boolean isActive() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
