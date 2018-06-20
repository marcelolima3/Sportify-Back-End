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

import sportify.event.Event;

import java.util.ArrayList;

public class NotificationTracker {
	public NotificationTracker() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == sportify.competition.ORMConstants.KEY_NOTIFICATIONTRACKER_NOTIFICATIONHISTORY) {
			return ORM_notificationHistory;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String notificationPolicy;
	
	private java.util.Set ORM_notificationHistory = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNotificationPolicy(String value) {
		this.notificationPolicy = value;
	}
	
	public String getNotificationPolicy() {
		return notificationPolicy;
	}
	
	private void setORM_NotificationHistory(java.util.Set value) {
		this.ORM_notificationHistory = value;
	}
	
	private java.util.Set getORM_NotificationHistory() {
		return ORM_notificationHistory;
	}
	
	public final sportify.event.EventSetCollection notificationHistory = new sportify.event.EventSetCollection(this, _ormAdapter, sportify.competition.ORMConstants.KEY_NOTIFICATIONTRACKER_NOTIFICATIONHISTORY, sportify.competition.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public ArrayList<Event> getNotificationHistory() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
