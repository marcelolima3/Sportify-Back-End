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
import com.Sportify.Views.JSONViews.subentities.TeamView;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
import org.orm.util.ORMAdapter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Team")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Team")
@PrimaryKeyJoinColumn(name="SubscriptionEntityID", referencedColumnName="ID")
public class Team extends com.Sportify.Entities.subentities.SubscriptionEntity implements Serializable {
	public Team() {
	}

	public Team(String name) {
		this.name = name;
		this.ORM_athletes = new HashSet();
	}

	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TEAM_ATHLETES) {
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

	@JsonView(TeamView.Public.class)
	@Column(name="Name", nullable=true, length=255)	
	private String name;

	@JsonView(TeamView.Private.class)
	@JsonManagedReference
	@OneToMany(mappedBy="team", targetEntity= com.Sportify.Entities.subentities.Athlete.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_athletes = new java.util.HashSet();
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setORM_Athletes(java.util.Set value) {
		this.ORM_athletes = value;
	}
	
	public java.util.Set getORM_Athletes() {
		return ORM_athletes;
	}
	
	@Transient	
	public final com.Sportify.Entities.subentities.AthleteSetCollection athletes = new com.Sportify.Entities.subentities.AthleteSetCollection(this, _ormAdapter, ORMConstants.KEY_TEAM_ATHLETES, ORMConstants.KEY_ATHLETE_TEAM, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
