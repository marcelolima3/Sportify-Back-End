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

public class User {
	public User() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == sportify.competition.ORMConstants.KEY_USER_SUBSCRIPTIONS) {
			return ORM_subscriptions;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private sportify.user.PaymentMethod paymentManager;
	
	private String name;
	
	private String email;
	
	private String password;
	
	private java.util.Date registrationDate;
	
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
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setRegistrationDate(java.util.Date value) {
		this.registrationDate = value;
	}
	
	public java.util.Date getRegistrationDate() {
		return registrationDate;
	}
	
	public void setPaymentManager(sportify.user.PaymentMethod value) {
		this.paymentManager = value;
	}
	
	public sportify.user.PaymentMethod getPaymentManager() {
		return paymentManager;
	}
	
	private void setORM_Subscriptions(java.util.Set value) {
		this.ORM_subscriptions = value;
	}
	
	private java.util.Set getORM_Subscriptions() {
		return ORM_subscriptions;
	}
	
	public final sportify.user.SubscriptionSetCollection subscriptions = new sportify.user.SubscriptionSetCollection(this, _ormAdapter, sportify.competition.ORMConstants.KEY_USER_SUBSCRIPTIONS, sportify.competition.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}