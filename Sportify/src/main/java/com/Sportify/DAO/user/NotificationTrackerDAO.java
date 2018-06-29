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
package com.Sportify.DAO.user;

import com.Sportify.DAO.EAClassDiagramPersistentManager;
import com.Sportify.Entities.user.NotificationTracker;
import com.Sportify.Entities.user.NotificationTrackerCriteria;
import org.orm.*;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NotificationTrackerDAO {
	public static NotificationTracker loadNotificationTrackerByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadNotificationTrackerByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificationTracker getNotificationTrackerByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getNotificationTrackerByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificationTracker loadNotificationTrackerByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadNotificationTrackerByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificationTracker getNotificationTrackerByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getNotificationTrackerByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificationTracker loadNotificationTrackerByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (NotificationTracker) session.load(com.Sportify.Entities.user.NotificationTracker.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificationTracker getNotificationTrackerByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (NotificationTracker) session.get(com.Sportify.Entities.user.NotificationTracker.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificationTracker loadNotificationTrackerByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (NotificationTracker) session.load(com.Sportify.Entities.user.NotificationTracker.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificationTracker getNotificationTrackerByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (NotificationTracker) session.get(com.Sportify.Entities.user.NotificationTracker.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotificationTracker(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return queryNotificationTracker(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotificationTracker(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return queryNotificationTracker(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificationTracker[] listNotificationTrackerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listNotificationTrackerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificationTracker[] listNotificationTrackerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listNotificationTrackerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotificationTracker(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.user.NotificationTracker as NotificationTracker");
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
	
	public static List queryNotificationTracker(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.user.NotificationTracker as NotificationTracker");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("NotificationTracker", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificationTracker[] listNotificationTrackerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryNotificationTracker(session, condition, orderBy);
			return (NotificationTracker[]) list.toArray(new NotificationTracker[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificationTracker[] listNotificationTrackerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryNotificationTracker(session, condition, orderBy, lockMode);
			return (NotificationTracker[]) list.toArray(new NotificationTracker[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificationTracker loadNotificationTrackerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadNotificationTrackerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificationTracker loadNotificationTrackerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadNotificationTrackerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificationTracker loadNotificationTrackerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		NotificationTracker[] notificationTrackers = listNotificationTrackerByQuery(session, condition, orderBy);
		if (notificationTrackers != null && notificationTrackers.length > 0)
			return notificationTrackers[0];
		else
			return null;
	}
	
	public static NotificationTracker loadNotificationTrackerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		NotificationTracker[] notificationTrackers = listNotificationTrackerByQuery(session, condition, orderBy, lockMode);
		if (notificationTrackers != null && notificationTrackers.length > 0)
			return notificationTrackers[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateNotificationTrackerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iterateNotificationTrackerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotificationTrackerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iterateNotificationTrackerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotificationTrackerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.user.NotificationTracker as NotificationTracker");
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
	
	public static java.util.Iterator iterateNotificationTrackerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.user.NotificationTracker as NotificationTracker");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("NotificationTracker", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificationTracker createNotificationTracker() {
		return new com.Sportify.Entities.user.NotificationTracker();
	}
	
	public static boolean save(com.Sportify.Entities.user.NotificationTracker notificationTracker) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().saveObject(notificationTracker);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.Sportify.Entities.user.NotificationTracker notificationTracker) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().deleteObject(notificationTracker);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(com.Sportify.Entities.user.NotificationTracker notificationTracker) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().refresh(notificationTracker);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.Sportify.Entities.user.NotificationTracker notificationTracker) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().evict(notificationTracker);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotificationTracker loadNotificationTrackerByCriteria(NotificationTrackerCriteria notificationTrackerCriteria) {
		NotificationTracker[] notificationTrackers = listNotificationTrackerByCriteria(notificationTrackerCriteria);
		if(notificationTrackers == null || notificationTrackers.length == 0) {
			return null;
		}
		return notificationTrackers[0];
	}
	
	public static NotificationTracker[] listNotificationTrackerByCriteria(NotificationTrackerCriteria notificationTrackerCriteria) {
		return notificationTrackerCriteria.listNotificationTracker();
	}
}
