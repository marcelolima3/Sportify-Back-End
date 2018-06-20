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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class InvoiceDAO {
	public static Invoice loadInvoiceByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return loadInvoiceByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice getInvoiceByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return getInvoiceByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice loadInvoiceByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return loadInvoiceByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice getInvoiceByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return getInvoiceByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice loadInvoiceByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Invoice) session.load(sportify.user.Invoice.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice getInvoiceByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Invoice) session.get(sportify.user.Invoice.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice loadInvoiceByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Invoice) session.load(sportify.user.Invoice.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice getInvoiceByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Invoice) session.get(sportify.user.Invoice.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInvoice(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return queryInvoice(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInvoice(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return queryInvoice(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice[] listInvoiceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return listInvoiceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice[] listInvoiceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return listInvoiceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInvoice(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sportify.user.Invoice as Invoice");
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
	
	public static List queryInvoice(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sportify.user.Invoice as Invoice");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Invoice", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice[] listInvoiceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryInvoice(session, condition, orderBy);
			return (Invoice[]) list.toArray(new Invoice[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice[] listInvoiceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryInvoice(session, condition, orderBy, lockMode);
			return (Invoice[]) list.toArray(new Invoice[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice loadInvoiceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return loadInvoiceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice loadInvoiceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return loadInvoiceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice loadInvoiceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Invoice[] invoices = listInvoiceByQuery(session, condition, orderBy);
		if (invoices != null && invoices.length > 0)
			return invoices[0];
		else
			return null;
	}
	
	public static Invoice loadInvoiceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Invoice[] invoices = listInvoiceByQuery(session, condition, orderBy, lockMode);
		if (invoices != null && invoices.length > 0)
			return invoices[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateInvoiceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return iterateInvoiceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInvoiceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return iterateInvoiceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInvoiceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sportify.user.Invoice as Invoice");
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
	
	public static java.util.Iterator iterateInvoiceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sportify.user.Invoice as Invoice");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Invoice", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice createInvoice() {
		return new sportify.user.Invoice();
	}
	
	public static boolean save(sportify.user.Invoice invoice) throws PersistentException {
		try {
			sportify.competition.EAClassDiagramPersistentManager.instance().saveObject(invoice);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(sportify.user.Invoice invoice) throws PersistentException {
		try {
			sportify.competition.EAClassDiagramPersistentManager.instance().deleteObject(invoice);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(sportify.user.Invoice invoice) throws PersistentException {
		try {
			sportify.competition.EAClassDiagramPersistentManager.instance().getSession().refresh(invoice);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(sportify.user.Invoice invoice) throws PersistentException {
		try {
			sportify.competition.EAClassDiagramPersistentManager.instance().getSession().evict(invoice);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice loadInvoiceByCriteria(InvoiceCriteria invoiceCriteria) {
		Invoice[] invoices = listInvoiceByCriteria(invoiceCriteria);
		if(invoices == null || invoices.length == 0) {
			return null;
		}
		return invoices[0];
	}
	
	public static Invoice[] listInvoiceByCriteria(InvoiceCriteria invoiceCriteria) {
		return invoiceCriteria.listInvoice();
	}
}
