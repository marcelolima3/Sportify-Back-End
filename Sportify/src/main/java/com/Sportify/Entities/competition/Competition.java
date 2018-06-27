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
package com.Sportify.Entities.competition;

import com.Sportify.DAO.ORMConstants;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Competition")
public class Competition implements Serializable {
	public Competition() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_COMPETITION_MATCHEVENTS) {
			return ORM_matchEvents;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COMPETITION_COMPETITION_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COMPETITION_COMPETITION_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="Location", nullable=true, length=255)	
	private String location;
	
	@Column(name="StartDate", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date startDate;
	
	@Column(name="EndDate", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date endDate;
	
	@Column(name="Description", nullable=true, length=255)	
	private String description;
	
	@Column(name="Active", nullable=true, length=1)	
	private boolean active;
	
	@OneToMany(targetEntity= com.Sportify.Entities.competition.MatchEvent.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="CompetitionID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_matchEvents = new java.util.HashSet();
	
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
		this.active = value;
	}
	
	public boolean getActive() {
		return active;
	}
	
	private void setORM_MatchEvents(java.util.Set value) {
		this.ORM_matchEvents = value;
	}
	
	private java.util.Set getORM_MatchEvents() {
		return ORM_matchEvents;
	}
	
	@Transient	
	public final com.Sportify.Entities.competition.MatchEventSetCollection matchEvents = new com.Sportify.Entities.competition.MatchEventSetCollection(this, _ormAdapter, ORMConstants.KEY_COMPETITION_MATCHEVENTS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public Competition(String name, String location, java.util.Date startDate, java.util.Date endDate, String description, boolean active) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public Date getStartTime() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public Date getEndTime() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public List<MatchEvent> getMatchEvents() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void setMatchEvents(List<MatchEvent> matchEvents) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
