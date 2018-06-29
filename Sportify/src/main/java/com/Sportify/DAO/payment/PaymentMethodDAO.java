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
package com.Sportify.DAO.payment;

import com.Sportify.DAO.EAClassDiagramPersistentManager;
import com.Sportify.Entities.payment.PaymentMethod;
import com.Sportify.Entities.payment.PaymentMethodCriteria;
import org.orm.*;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaymentMethodDAO {
	public static PaymentMethod loadPaymentMethodByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadPaymentMethodByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PaymentMethod getPaymentMethodByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getPaymentMethodByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PaymentMethod loadPaymentMethodByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadPaymentMethodByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PaymentMethod getPaymentMethodByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getPaymentMethodByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PaymentMethod loadPaymentMethodByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (PaymentMethod) session.load(com.Sportify.Entities.payment.PaymentMethod.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PaymentMethod getPaymentMethodByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (PaymentMethod) session.get(com.Sportify.Entities.payment.PaymentMethod.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PaymentMethod loadPaymentMethodByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PaymentMethod) session.load(com.Sportify.Entities.payment.PaymentMethod.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PaymentMethod getPaymentMethodByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PaymentMethod) session.get(com.Sportify.Entities.payment.PaymentMethod.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaymentMethod(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return queryPaymentMethod(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaymentMethod(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return queryPaymentMethod(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PaymentMethod[] listPaymentMethodByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listPaymentMethodByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PaymentMethod[] listPaymentMethodByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listPaymentMethodByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaymentMethod(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.payment.PaymentMethod as PaymentMethod");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaymentMethod(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.payment.PaymentMethod as PaymentMethod");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PaymentMethod", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PaymentMethod[] listPaymentMethodByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPaymentMethod(session, condition, orderBy);
			return (PaymentMethod[]) list.toArray(new PaymentMethod[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PaymentMethod[] listPaymentMethodByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPaymentMethod(session, condition, orderBy, lockMode);
			return (PaymentMethod[]) list.toArray(new PaymentMethod[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PaymentMethod loadPaymentMethodByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadPaymentMethodByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PaymentMethod loadPaymentMethodByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadPaymentMethodByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PaymentMethod loadPaymentMethodByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		PaymentMethod[] paymentMethods = listPaymentMethodByQuery(session, condition, orderBy);
		if (paymentMethods != null && paymentMethods.length > 0)
			return paymentMethods[0];
		else
			return null;
	}
	
	public static PaymentMethod loadPaymentMethodByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		PaymentMethod[] paymentMethods = listPaymentMethodByQuery(session, condition, orderBy, lockMode);
		if (paymentMethods != null && paymentMethods.length > 0)
			return paymentMethods[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePaymentMethodByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iteratePaymentMethodByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaymentMethodByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iteratePaymentMethodByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaymentMethodByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.payment.PaymentMethod as PaymentMethod");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaymentMethodByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.payment.PaymentMethod as PaymentMethod");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PaymentMethod", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean save(com.Sportify.Entities.payment.PaymentMethod paymentMethod) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().saveObject(paymentMethod);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.Sportify.Entities.payment.PaymentMethod paymentMethod) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().deleteObject(paymentMethod);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(com.Sportify.Entities.payment.PaymentMethod paymentMethod) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().refresh(paymentMethod);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.Sportify.Entities.payment.PaymentMethod paymentMethod) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().evict(paymentMethod);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PaymentMethod loadPaymentMethodByCriteria(PaymentMethodCriteria paymentMethodCriteria) {
		PaymentMethod[] paymentMethods = listPaymentMethodByCriteria(paymentMethodCriteria);
		if(paymentMethods == null || paymentMethods.length == 0) {
			return null;
		}
		return paymentMethods[0];
	}
	
	public static PaymentMethod[] listPaymentMethodByCriteria(PaymentMethodCriteria paymentMethodCriteria) {
		return paymentMethodCriteria.listPaymentMethod();
	}
}
