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
package sportify.event;

public class Event {
	public Event() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == sportify.competition.ORMConstants.KEY_EVENT_CATEGORY) {
			this.category = (sportify.event.EventCategory) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private sportify.event.EventCategory category;
	
	private String textFormat;
	
	private String imageFormat;
	
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
	
	public void setCategory(sportify.event.EventCategory value) {
		this.category = value;
	}
	
	public sportify.event.EventCategory getCategory() {
		return category;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
