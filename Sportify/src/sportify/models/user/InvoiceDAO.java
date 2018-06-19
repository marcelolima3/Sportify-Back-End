package sportify.models.user; /**
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
import org.orm.*;
import org.hibernate.Query;
import sportify.models.EAClassDiagramPersistentManager;

import java.util.List;

public class InvoiceDAO {
	public static Invoice loadInvoiceByORMID(int attribute2) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadInvoiceByORMID(session, attribute2);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice getInvoiceByORMID(int attribute2) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getInvoiceByORMID(session, attribute2);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice loadInvoiceByORMID(int attribute2, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadInvoiceByORMID(session, attribute2, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice getInvoiceByORMID(int attribute2, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getInvoiceByORMID(session, attribute2, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice loadInvoiceByORMID(PersistentSession session, int attribute2) throws PersistentException {
		try {
			return (Invoice) session.load(Invoice.class, new Integer(attribute2));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice getInvoiceByORMID(PersistentSession session, int attribute2) throws PersistentException {
		try {
			return (Invoice) session.get(Invoice.class, new Integer(attribute2));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice loadInvoiceByORMID(PersistentSession session, int attribute2, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Invoice) session.load(Invoice.class, new Integer(attribute2), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice getInvoiceByORMID(PersistentSession session, int attribute2, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Invoice) session.get(Invoice.class, new Integer(attribute2), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInvoice(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return queryInvoice(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInvoice(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return queryInvoice(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice[] listInvoiceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listInvoiceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice[] listInvoiceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listInvoiceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInvoice(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Invoice as Invoice");
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
		StringBuffer sb = new StringBuffer("From Invoice as Invoice");
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
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadInvoiceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Invoice loadInvoiceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
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
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iterateInvoiceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInvoiceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iterateInvoiceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInvoiceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Invoice as Invoice");
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
		StringBuffer sb = new StringBuffer("From Invoice as Invoice");
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
		return new Invoice();
	}
	
	public static boolean save(Invoice invoice) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().saveObject(invoice);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Invoice invoice) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().deleteObject(invoice);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Invoice invoice) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().refresh(invoice);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Invoice invoice) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().evict(invoice);
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
