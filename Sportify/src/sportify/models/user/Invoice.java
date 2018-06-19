package sportify.models.user; /**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

import sportify.models.event.ORMConstants;

/**
 * Licensee: tr3s(Universidade do Minho)
 * License Type: Academic
 */
public class Invoice {
	public Invoice() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_INVOICE_SUBSCRIPTIONS) {
			return ORM_subscriptions;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int attribute2;
	
	private int attribute;
	
	private int ID;
	
	private java.util.Date date;
	
	private java.math.BigDecimal amount;
	
	private java.util.Set ORM_subscriptions = new java.util.HashSet();
	
	private void setAttribute2(int value) {
		this.attribute2 = value;
	}
	
	public int getAttribute2() {
		return attribute2;
	}
	
	public int getORMID() {
		return getAttribute2();
	}
	
	public void setAttribute(int value) {
		this.attribute = value;
	}
	
	public int getAttribute() {
		return attribute;
	}
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setDate(java.util.Date value) {
		this.date = value;
	}
	
	public java.util.Date getDate() {
		return date;
	}
	
	public void setAmount(java.math.BigDecimal value) {
		this.amount = value;
	}
	
	public java.math.BigDecimal getAmount() {
		return amount;
	}
	
	private void setORM_Subscriptions(java.util.Set value) {
		this.ORM_subscriptions = value;
	}
	
	private java.util.Set getORM_Subscriptions() {
		return ORM_subscriptions;
	}
	
	public final SubscriptionSetCollection subscriptions = new SubscriptionSetCollection(this, _ormAdapter, ORMConstants.KEY_INVOICE_SUBSCRIPTIONS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getAttribute2());
	}
	
}
