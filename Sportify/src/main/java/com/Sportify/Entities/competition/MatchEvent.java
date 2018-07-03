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
import com.Sportify.Views.JSONViews.competition.CompetitionView;
import com.Sportify.Views.JSONViews.competition.MatchEventView;
import com.Sportify.Views.JSONViews.payment.InvoiceView;
import com.Sportify.Views.JSONViews.subentities.SubscriptionEntityView;
import com.Sportify.Views.JSONViews.user.SubscriptionView;
import com.fasterxml.jackson.annotation.JsonView;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="MatchEvent")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("MatchEvent")
@PrimaryKeyJoinColumn(name="SubscriptionEntityID", referencedColumnName="ID")
public class MatchEvent extends com.Sportify.Entities.subentities.SubscriptionEntity implements Serializable {
	public MatchEvent() {
	}

	public MatchEvent(String description, Date startTime, Date endTime, String location, boolean active) {
		this.description = description;
		this.startTime = startTime;
		this.endTime = endTime;
		this.location = location;
		this.active = active;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MATCHEVENT_EVENTS) {
			return ORM_events;
		}
		else if (key == ORMConstants.KEY_MATCHEVENT_ATHLETES) {
			return ORM_athletes;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};

	@JsonView({InvoiceView.Public.class, SubscriptionView.Public.class, SubscriptionEntityView.Public.class,CompetitionView.Private.class,MatchEventView.Public.class})
	@Column(name="Description", nullable=true, length=255)	
	private String description;

	@JsonView({SubscriptionEntityView.Public.class,CompetitionView.Private.class,MatchEventView.Public.class})
	@Column(name="StartTime", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date startTime;

	@JsonView({SubscriptionEntityView.Public.class,CompetitionView.Private.class,MatchEventView.Public.class})
	@Column(name="EndTime", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date endTime;

	@JsonView({SubscriptionEntityView.Public.class,CompetitionView.Private.class,MatchEventView.Public.class})
	@Column(name="Location", nullable=true, length=255)	
	private String location;

	@JsonView({SubscriptionEntityView.Public.class,CompetitionView.Private.class,MatchEventView.Public.class})
	@Column(name="Active", nullable=true, length=1)	
	private boolean active;

	@JsonView({CompetitionView.Private.class,MatchEventView.Private.class})
	@OneToMany(targetEntity= com.Sportify.Entities.event.Event.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="MatchEventSubscriptionEntityID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_events = new java.util.HashSet();

	@JsonView({CompetitionView.Private.class})
	@ManyToMany(mappedBy="ORM_matchEvents", targetEntity= com.Sportify.Entities.subentities.Athlete.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_athletes = new java.util.HashSet();
	
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
		this.active = value;
	}
	
	public boolean getActive() {
		return active;
	}
	
	public void setORM_Events(java.util.Set value) {
		this.ORM_events = value;
	}
	
	public java.util.Set getORM_Events() {
		return ORM_events;
	}
	
	@Transient	
	public final com.Sportify.Entities.event.EventSetCollection events = new com.Sportify.Entities.event.EventSetCollection(this, _ormAdapter, ORMConstants.KEY_MATCHEVENT_EVENTS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setORM_Athletes(java.util.Set value) {
		this.ORM_athletes = value;
	}
	
	public java.util.Set getORM_Athletes() {
		return ORM_athletes;
	}
	
	@Transient	
	public final com.Sportify.Entities.subentities.AthleteSetCollection athletes = new com.Sportify.Entities.subentities.AthleteSetCollection(this, _ormAdapter, ORMConstants.KEY_MATCHEVENT_ATHLETES, ORMConstants.KEY_ATHLETE_MATCHEVENTS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
