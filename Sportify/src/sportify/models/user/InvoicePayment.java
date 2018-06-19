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
public class InvoicePayment extends PaymentMethod {
	public InvoicePayment() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_INVOICEPAYMENT_PAYMENTS) {
			return ORM_payments;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.math.BigDecimal currentAmount;
	
	private java.util.Set ORM_payments = new java.util.HashSet();
	
	public void setCurrentAmount(java.math.BigDecimal value) {
		this.currentAmount = value;
	}
	
	public java.math.BigDecimal getCurrentAmount() {
		return currentAmount;
	}
	
	private void setORM_Payments(java.util.Set value) {
		this.ORM_payments = value;
	}
	
	private java.util.Set getORM_Payments() {
		return ORM_payments;
	}
	
	public final InvoiceSetCollection payments = new InvoiceSetCollection(this, _ormAdapter, ORMConstants.KEY_INVOICEPAYMENT_PAYMENTS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
