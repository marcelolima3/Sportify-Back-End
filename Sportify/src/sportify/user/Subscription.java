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
package sportify.user;

public class Subscription {
	public Subscription() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == sportify.competition.ORMConstants.KEY_SUBSCRIPTION_SUBSCRIBEDEVENTS) {
			return ORM_subscribedEvents;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private java.util.Date date;
	
	private Boolean paid;
	
	private java.util.Set ORM_subscribedEvents = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDate(java.util.Date value) {
		this.date = value;
	}
	
	public java.util.Date getDate() {
		return date;
	}
	
	public void setPaid(boolean value) {
		setPaid(new Boolean(value));
	}
	
	public void setPaid(Boolean value) {
		this.paid = value;
	}
	
	public Boolean getPaid() {
		return paid;
	}
	
	private void setORM_SubscribedEvents(java.util.Set value) {
		this.ORM_subscribedEvents = value;
	}
	
	private java.util.Set getORM_SubscribedEvents() {
		return ORM_subscribedEvents;
	}
	
	public final sportify.event.EventCategorySetCollection subscribedEvents = new sportify.event.EventCategorySetCollection(this, _ormAdapter, sportify.competition.ORMConstants.KEY_SUBSCRIPTION_SUBSCRIBEDEVENTS, sportify.competition.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public Boolean isPaid() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
