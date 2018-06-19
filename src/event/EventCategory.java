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

public class EventCategory {
	public EventCategory() {
	}
	
	private int ID;
	
	private event.String name;
	
	private java.math.BigDecimal price;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setName(event.String value) {
		this.name = value;
	}
	
	public event.String getName() {
		return name;
	}
	
	public void setPrice(java.math.BigDecimal value) {
		this.price = value;
	}
	
	public java.math.BigDecimal getPrice() {
		return price;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
