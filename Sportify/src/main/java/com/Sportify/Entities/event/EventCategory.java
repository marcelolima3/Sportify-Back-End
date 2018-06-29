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

import com.Sportify.Entities.user.Subscription;
import com.Sportify.Views.JSONViews.event.EventCategoryView;
import com.Sportify.Views.JSONViews.payment.InvoiceView;
import com.Sportify.Views.JSONViews.user.SubscriptionView;
import com.Sportify.Views.JSONViews.event.EventView;
import com.fasterxml.jackson.annotation.JsonView;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="EventCategory")
public class EventCategory implements Serializable {
	public EventCategory() {
	}

	public EventCategory(String name, double regularPrice, double extraPrice) {
		this.name = name;
		this.regularPrice = regularPrice;
		this.extraPrice = extraPrice;
	}

	@JsonView({InvoiceView.Public.class, SubscriptionView.Public.class, EventView.Public.class, EventCategoryView.Public.class})
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="EVENT_EVENTCATEGORY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="EVENT_EVENTCATEGORY_ID_GENERATOR", strategy="native")	
	private int ID;

	@JsonView({InvoiceView.Public.class, SubscriptionView.Public.class, EventView.Public.class, EventCategoryView.Public.class})
	@Column(name="Name", nullable=true, length=255)	
	private String name;

	@JsonView({InvoiceView.Public.class, SubscriptionView.Public.class, EventCategoryView.Public.class})
	@Column(name="RegularPrice", nullable=true)	
	private double regularPrice;

	@JsonView({EventView.Public.class, EventCategoryView.Public.class})
	@Column(name="ExtraPrice", nullable=false)	
	private double extraPrice;
	
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
	
	public void setRegularPrice(double value) {
		this.regularPrice = value;
	}
	
	public double getRegularPrice() {
		return regularPrice;
	}
	
	public void setExtraPrice(double value) {
		this.extraPrice = value;
	}
	
	public double getExtraPrice() {
		return extraPrice;
	}


	public String toString() {
		return String.valueOf(getID());
	}
	
}
