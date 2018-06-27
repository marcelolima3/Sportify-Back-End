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
import org.orm.util.ORMAdapter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Modality")
public class Modality implements Serializable {
	public Modality() {
	}

	public Modality(String name) {
		this.name = name;
		this.ORM__eventCategories = new HashSet();
		this.ORM_competitions = new HashSet();
		this.ORM_teams = new HashSet();
	}

	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MODALITY__EVENTCATEGORIES) {
			return ORM__eventCategories;
		}
		else if (key == ORMConstants.KEY_MODALITY_COMPETITIONS) {
			return ORM_competitions;
		}
		else if (key == ORMConstants.KEY_MODALITY_TEAMS) {
			return ORM_teams;
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
	@GeneratedValue(generator="COMPETITION_MODALITY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COMPETITION_MODALITY_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@OneToMany(targetEntity= com.Sportify.Entities.event.EventCategory.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ModalityID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__eventCategories = new java.util.HashSet();
	
	@OneToMany(targetEntity= com.Sportify.Entities.competition.Competition.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ModalityID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_competitions = new java.util.HashSet();
	
	@OneToMany(targetEntity= com.Sportify.Entities.subentities.Team.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ModalityID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_teams = new java.util.HashSet();
	
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
	
	private void setORM__eventCategories(java.util.Set value) {
		this.ORM__eventCategories = value;
	}
	
	private java.util.Set getORM__eventCategories() {
		return ORM__eventCategories;
	}
	
	@Transient	
	public final com.Sportify.Entities.event.EventCategorySetCollection _eventCategories = new com.Sportify.Entities.event.EventCategorySetCollection(this, _ormAdapter, ORMConstants.KEY_MODALITY__EVENTCATEGORIES, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Competitions(java.util.Set value) {
		this.ORM_competitions = value;
	}
	
	private java.util.Set getORM_Competitions() {
		return ORM_competitions;
	}
	
	@Transient	
	public final com.Sportify.Entities.competition.CompetitionSetCollection competitions = new com.Sportify.Entities.competition.CompetitionSetCollection(this, _ormAdapter, ORMConstants.KEY_MODALITY_COMPETITIONS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setORM_Teams(java.util.Set value) {
		this.ORM_teams = value;
	}
	
	public java.util.Set getORM_Teams() {
		return ORM_teams;
	}
	
	@Transient	
	public final com.Sportify.Entities.subentities.TeamSetCollection teams = new com.Sportify.Entities.subentities.TeamSetCollection(this, _ormAdapter, ORMConstants.KEY_MODALITY_TEAMS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
