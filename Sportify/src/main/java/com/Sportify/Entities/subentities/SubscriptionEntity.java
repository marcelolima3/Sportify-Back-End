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
import com.Sportify.Views.JSONViews.competition.MatchEventView;
import com.Sportify.Views.JSONViews.subentities.AthleteView;
import com.Sportify.Views.JSONViews.subentities.SubscriptionEntityView;
import com.Sportify.Views.JSONViews.subentities.TeamView;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonView;

import java.io.Serializable;
import javax.persistence.*;

@JsonTypeInfo(
		use = JsonTypeInfo.Id.NAME,
		include = JsonTypeInfo.As.PROPERTY,
		property = "type")
@JsonSubTypes({
		@JsonSubTypes.Type(value = Team.class, name = "Team"),
		@JsonSubTypes.Type(value = Athlete.class, name = "Athlete"),
		@JsonSubTypes.Type(value = MatchEvent.class, name = "MatchEvent")
})
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="SubscriptionEntity")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("SubscriptionEntity")
public abstract class SubscriptionEntity implements Serializable {
	public SubscriptionEntity() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_SUBSCRIPTIONENTITY_SUBSCRIPTIONS) {
			return ORM_subscriptions;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};

	@JsonView({SubscriptionEntityView.Public.class, MatchEventView.Public.class, TeamView.Public.class, AthleteView.Public.class})
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="SUBENTITIES_SUBSCRIPTIONENTITY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="SUBENTITIES_SUBSCRIPTIONENTITY_ID_GENERATOR", strategy="native")	
	private int ID;

	@JsonView(SubscriptionEntityView.Private.class)
	@OneToMany(mappedBy="subscribedEntity", targetEntity= com.Sportify.Entities.user.Subscription.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_subscriptions = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	private void setORM_Subscriptions(java.util.Set value) {
		this.ORM_subscriptions = value;
	}
	
	private java.util.Set getORM_Subscriptions() {
		return ORM_subscriptions;
	}
	
	@Transient	
	public final com.Sportify.Entities.user.SubscriptionSetCollection subscriptions = new com.Sportify.Entities.user.SubscriptionSetCollection(this, _ormAdapter, ORMConstants.KEY_SUBSCRIPTIONENTITY_SUBSCRIPTIONS, ORMConstants.KEY_SUBSCRIPTION_SUBSCRIBEDENTITY, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}

	public boolean equals(SubscriptionEntity se){
		return this.ID == se.getID();
	}
	
}
