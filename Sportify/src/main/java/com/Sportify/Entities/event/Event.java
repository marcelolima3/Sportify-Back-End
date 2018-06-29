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
package com.Sportify.Entities.event;

import com.Sportify.DAO.ORMConstants;
import com.Sportify.Views.JSONViews.event.EventView;
import com.fasterxml.jackson.annotation.JsonView;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Event")
public class Event implements Serializable {
	public Event() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_EVENT_CATEGORY) {
			this.category = (com.Sportify.Entities.event.EventCategory) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};

	@JsonView(EventView.Public.class)
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="EVENT_EVENT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="EVENT_EVENT_ID_GENERATOR", strategy="native")	
	private int ID;

	@JsonView(EventView.Public.class)
	@ManyToOne(targetEntity= com.Sportify.Entities.event.EventCategory.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="EventCategoryID", referencedColumnName="ID", nullable=false) })	
	private com.Sportify.Entities.event.EventCategory category;

	@JsonView(EventView.Public.class)
	@Column(name="TextFormat", nullable=true, length=255)	
	private String textFormat;

	@JsonView(EventView.Public.class)
	@Column(name="ImageFormat", nullable=true, length=255)	
	private String imageFormat;

	@JsonView(EventView.Public.class)
	@Column(name="VideoFormat", nullable=true, length=255)	
	private String videoFormat;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTextFormat(String value) {
		this.textFormat = value;
	}
	
	public String getTextFormat() {
		return textFormat;
	}
	
	public void setImageFormat(String value) {
		this.imageFormat = value;
	}
	
	public String getImageFormat() {
		return imageFormat;
	}
	
	public void setVideoFormat(String value) {
		this.videoFormat = value;
	}
	
	public String getVideoFormat() {
		return videoFormat;
	}
	
	public void setCategory(com.Sportify.Entities.event.EventCategory value) {
		this.category = value;
	}
	
	public com.Sportify.Entities.event.EventCategory getCategory() {
		return category;
	}

	public Event(String textFormat, String imageFormat, String videoFormat) {
		this.textFormat = textFormat;
		this.imageFormat = imageFormat;
		this.videoFormat = videoFormat;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
