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
import com.Sportify.Views.JSONViews.competition.SportView;
import com.fasterxml.jackson.annotation.JsonView;

import java.io.Serializable;
import java.util.HashSet;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Sport")
public class Sport implements Serializable {
	public Sport() {
	}

	public Sport(String name) {
		this.name = name;
		this.ORM_modalities = new HashSet();
	}

	public Sport(String name, String imgUrl, boolean onlySport) {
		this.name = name;
		this.imgUrl = imgUrl;
		this.onlySport = onlySport;
	}

	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_SPORT_MODALITIES) {
			return ORM_modalities;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};

	@JsonView(SportView.Public.class)
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COMPETITION_SPORT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COMPETITION_SPORT_ID_GENERATOR", strategy="native")	
	private int ID;

	@JsonView(SportView.Public.class)
	@Column(name="Name", nullable=true, length=255)	
	private String name;

	@JsonView(SportView.Public.class)
	@Column(name="ImgUrl", nullable=true, length=255)	
	private String imgUrl;

	@JsonView(SportView.Public.class)
	@Column(name="OnlySport", nullable=false, length=1)	
	private boolean onlySport;

	@JsonView(SportView.Private.class)
	@OneToMany(targetEntity= com.Sportify.Entities.competition.Modality.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="SportID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_modalities = new java.util.HashSet();
	
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
	
	public void setImgUrl(String value) {
		this.imgUrl = value;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}
	
	public void setOnlySport(boolean value) {
		this.onlySport = value;
	}
	
	public boolean getOnlySport() {
		return onlySport;
	}
	
	public void setORM_Modalities(java.util.Set value) {
		this.ORM_modalities = value;
	}
	
	public java.util.Set getORM_Modalities() {
		return ORM_modalities;
	}
	
	@Transient	
	public final com.Sportify.Entities.competition.ModalitySetCollection modalities = new com.Sportify.Entities.competition.ModalitySetCollection(this, _ormAdapter, ORMConstants.KEY_SPORT_MODALITIES, ORMConstants.KEY_MUL_ONE_TO_MANY);

	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
