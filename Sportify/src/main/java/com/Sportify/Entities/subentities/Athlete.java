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
package com.Sportify.Entities.subentities;

import com.Sportify.DAO.ORMConstants;
import com.Sportify.Entities.competition.MatchEvent;
import com.Sportify.Entities.competition.MatchEventSetCollection;
import com.Sportify.Entities.user.Subscription;
import com.Sportify.Views.JSONViews.competition.MatchEventView;
import com.Sportify.Views.JSONViews.payment.InvoiceView;
import com.Sportify.Views.JSONViews.subentities.AthleteView;
import com.Sportify.Views.JSONViews.subentities.SubscriptionEntityView;
import com.Sportify.Views.JSONViews.user.SubscriptionView;
import com.fasterxml.jackson.annotation.JsonView;

import java.io.Serializable;
import java.util.HashSet;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Athlete")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Athlete")
@PrimaryKeyJoinColumn(name="SubscriptionEntityID", referencedColumnName="ID")
public class Athlete extends com.Sportify.Entities.subentities.SubscriptionEntity implements Serializable {
	public Athlete() { super(); }

	public Athlete(String name, String nationality, String genre, String imgUrl) {
		super();
		this.name = name;
		this.nationality = nationality;
		this.genre = genre;
		this.imgUrl = imgUrl;
		this.ORM_matchEvents = new HashSet();
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ATHLETE_MATCHEVENTS) {
			return ORM_matchEvents;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ATHLETE_TEAM) {
			this.team = (com.Sportify.Entities.subentities.Team) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};

	@JsonView({InvoiceView.Public.class, SubscriptionView.Public.class, SubscriptionEntityView.Public.class, AthleteView.Public.class, MatchEventView.Public.class})
	@Column(name="Name", nullable=true, length=255)	
	private String name;

	@JsonView({SubscriptionEntityView.Public.class, AthleteView.Public.class, MatchEventView.Public.class})
	@Column(name="Nationality", nullable=true, length=255)	
	private String nationality;

	@JsonView({SubscriptionEntityView.Public.class, AthleteView.Public.class, MatchEventView.Public.class})
	@Column(name="Genre", nullable=true, length=255)	
	private String genre;

	@JsonView({SubscriptionEntityView.Public.class, AthleteView.Public.class, MatchEventView.Public.class})
	@Column(name="ImgUrl", nullable=true, length=255)	
	private String imgUrl;

	@JsonView(AthleteView.Private.class)
	@ManyToOne(targetEntity= com.Sportify.Entities.subentities.Team.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="TeamSubscriptionEntityID", referencedColumnName="SubscriptionEntityID") })	
	private com.Sportify.Entities.subentities.Team team;

	@JsonView(AthleteView.Private.class)
	@ManyToMany(targetEntity=MatchEvent.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="MatchEvent_Athlete", joinColumns={ @JoinColumn(name="AthleteSubscriptionEntityID") }, inverseJoinColumns={ @JoinColumn(name="MatchEventSubscriptionEntityID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_matchEvents = new java.util.HashSet();
	
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
	
	public void setImgUrl(String value) {
		this.imgUrl = value;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}
	
	public void setTeam(com.Sportify.Entities.subentities.Team value) {
		if (team != null) {
			team.athletes.remove(this);
		}
		if (value != null) {
			value.athletes.add(this);
		}
	}
	
	public com.Sportify.Entities.subentities.Team getTeam() {
		return team;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Team(com.Sportify.Entities.subentities.Team value) {
		this.team = value;
	}
	
	public com.Sportify.Entities.subentities.Team getORM_Team() {
		return team;
	}
	
	public void setORM_MatchEvents(java.util.Set value) {
		this.ORM_matchEvents = value;
	}
	
	public java.util.Set getORM_MatchEvents() {
		return ORM_matchEvents;
	}
	
	@Transient	
	public final MatchEventSetCollection matchEvents = new MatchEventSetCollection(this, _ormAdapter, ORMConstants.KEY_ATHLETE_MATCHEVENTS, ORMConstants.KEY_MATCHEVENT_ATHLETES, ORMConstants.KEY_MUL_MANY_TO_MANY);

	
	public String toString() {
		return super.toString();
	}
	
}
