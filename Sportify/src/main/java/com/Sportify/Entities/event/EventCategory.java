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

import com.Sportify.Views.JSONViews.event.EventCategoryView;
import com.fasterxml.jackson.annotation.JsonView;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="EventCategory")
public class EventCategory implements Serializable {
	public EventCategory() {
	}


	@JsonView(EventCategoryView.Public.class)
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="EVENT_EVENTCATEGORY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="EVENT_EVENTCATEGORY_ID_GENERATOR", strategy="native")	
	private int ID;

	@JsonView(EventCategoryView.Public.class)
	@Column(name="Name", nullable=true, length=255)	
	private String name;

	@JsonView(EventCategoryView.Public.class)
	@Column(name="Price", nullable=true)	
	private double price;
	
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
	
	public void setPrice(double value) {
		this.price = value;
	}
	
	public double getPrice() {
		return price;
	}
	
	public EventCategory(String name, double normalPrice, double extraPrice) {
		this.name = name;
		this.price = normalPrice;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
