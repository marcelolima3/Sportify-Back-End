/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: tr3s(Universidade do Minho)
 * License Type: Academic
 */
package event;

public class Event {
	public Event() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_EVENT_CATEGORY) {
			this.category = (event.EventCategory) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private event.EventCategory category;
	
	private event.String textFormat;
	
	private event.String imageFormat;
	
	private event.String videoFormat;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTextFormat(event.String value) {
		this.textFormat = value;
	}
	
	public event.String getTextFormat() {
		return textFormat;
	}
	
	public void setImageFormat(event.String value) {
		this.imageFormat = value;
	}
	
	public event.String getImageFormat() {
		return imageFormat;
	}
	
	public void setVideoFormat(event.String value) {
		this.videoFormat = value;
	}
	
	public event.String getVideoFormat() {
		return videoFormat;
	}
	
	public void setCategory(event.EventCategory value) {
		this.category = value;
	}
	
	public event.EventCategory getCategory() {
		return category;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
