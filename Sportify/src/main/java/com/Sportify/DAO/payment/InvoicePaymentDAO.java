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
import com.Sportify.Entities.payment.InvoicePayment;
import com.Sportify.Entities.payment.InvoicePaymentCriteria;
import org.orm.*;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InvoicePaymentDAO {
	public static InvoicePayment loadInvoicePaymentByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadInvoicePaymentByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InvoicePayment getInvoicePaymentByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getInvoicePaymentByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InvoicePayment loadInvoicePaymentByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadInvoicePaymentByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InvoicePayment getInvoicePaymentByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getInvoicePaymentByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InvoicePayment loadInvoicePaymentByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (InvoicePayment) session.load(com.Sportify.Entities.payment.InvoicePayment.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InvoicePayment getInvoicePaymentByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (InvoicePayment) session.get(com.Sportify.Entities.payment.InvoicePayment.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InvoicePayment loadInvoicePaymentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (InvoicePayment) session.load(com.Sportify.Entities.payment.InvoicePayment.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InvoicePayment getInvoicePaymentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (InvoicePayment) session.get(com.Sportify.Entities.payment.InvoicePayment.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInvoicePayment(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return queryInvoicePayment(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInvoicePayment(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return queryInvoicePayment(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InvoicePayment[] listInvoicePaymentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listInvoicePaymentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InvoicePayment[] listInvoicePaymentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listInvoicePaymentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInvoicePayment(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.payment.InvoicePayment as InvoicePayment");
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
	
	public static List queryInvoicePayment(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.payment.InvoicePayment as InvoicePayment");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("InvoicePayment", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InvoicePayment[] listInvoicePaymentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryInvoicePayment(session, condition, orderBy);
			return (InvoicePayment[]) list.toArray(new InvoicePayment[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InvoicePayment[] listInvoicePaymentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryInvoicePayment(session, condition, orderBy, lockMode);
			return (InvoicePayment[]) list.toArray(new InvoicePayment[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InvoicePayment loadInvoicePaymentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadInvoicePaymentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InvoicePayment loadInvoicePaymentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadInvoicePaymentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InvoicePayment loadInvoicePaymentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		InvoicePayment[] invoicePayments = listInvoicePaymentByQuery(session, condition, orderBy);
		if (invoicePayments != null && invoicePayments.length > 0)
			return invoicePayments[0];
		else
			return null;
	}
	
	public static InvoicePayment loadInvoicePaymentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		InvoicePayment[] invoicePayments = listInvoicePaymentByQuery(session, condition, orderBy, lockMode);
		if (invoicePayments != null && invoicePayments.length > 0)
			return invoicePayments[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateInvoicePaymentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iterateInvoicePaymentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInvoicePaymentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iterateInvoicePaymentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInvoicePaymentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.payment.InvoicePayment as InvoicePayment");
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
	
	public static java.util.Iterator iterateInvoicePaymentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.payment.InvoicePayment as InvoicePayment");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("InvoicePayment", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InvoicePayment createInvoicePayment() {
		return new com.Sportify.Entities.payment.InvoicePayment();
	}
	
	public static boolean save(com.Sportify.Entities.payment.InvoicePayment invoicePayment) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().saveObject(invoicePayment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.Sportify.Entities.payment.InvoicePayment invoicePayment) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().deleteObject(invoicePayment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(com.Sportify.Entities.payment.InvoicePayment invoicePayment) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().refresh(invoicePayment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.Sportify.Entities.payment.InvoicePayment invoicePayment) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().evict(invoicePayment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InvoicePayment loadInvoicePaymentByCriteria(InvoicePaymentCriteria invoicePaymentCriteria) {
		InvoicePayment[] invoicePayments = listInvoicePaymentByCriteria(invoicePaymentCriteria);
		if(invoicePayments == null || invoicePayments.length == 0) {
			return null;
		}
		return invoicePayments[0];
	}
	
	public static InvoicePayment[] listInvoicePaymentByCriteria(InvoicePaymentCriteria invoicePaymentCriteria) {
		return invoicePaymentCriteria.listInvoicePayment();
	}
}
