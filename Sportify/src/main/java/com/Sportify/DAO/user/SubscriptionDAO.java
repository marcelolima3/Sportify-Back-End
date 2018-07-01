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
import com.Sportify.Entities.user.Subscription;
import com.Sportify.Entities.user.SubscriptionCriteria;
import org.hibernate.SQLQuery;
import org.orm.*;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SubscriptionDAO {
	public static Subscription loadSubscriptionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadSubscriptionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription getSubscriptionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getSubscriptionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription loadSubscriptionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadSubscriptionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription getSubscriptionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getSubscriptionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription loadSubscriptionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Subscription) session.load(com.Sportify.Entities.user.Subscription.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription getSubscriptionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Subscription) session.get(com.Sportify.Entities.user.Subscription.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription loadSubscriptionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Subscription) session.load(com.Sportify.Entities.user.Subscription.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription getSubscriptionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Subscription) session.get(com.Sportify.Entities.user.Subscription.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySubscription(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return querySubscription(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySubscription(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return querySubscription(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription[] listSubscriptionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listSubscriptionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription[] listSubscriptionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listSubscriptionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySubscription(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("Select Subscription.UserID From Subscription");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			SQLQuery sql = session.createSQLQuery(sb.toString());
			//Query query = session.createQuery(sb.toString());
			return sql.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySubscription(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.user.Subscription as Subscription");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Subscription", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription[] listSubscriptionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySubscription(session, condition, orderBy);
			return (Subscription[]) list.toArray(new Subscription[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription[] listSubscriptionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySubscription(session, condition, orderBy, lockMode);
			return (Subscription[]) list.toArray(new Subscription[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription loadSubscriptionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadSubscriptionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription loadSubscriptionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadSubscriptionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription loadSubscriptionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Subscription[] subscriptions = listSubscriptionByQuery(session, condition, orderBy);
		if (subscriptions != null && subscriptions.length > 0)
			return subscriptions[0];
		else
			return null;
	}
	
	public static Subscription loadSubscriptionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Subscription[] subscriptions = listSubscriptionByQuery(session, condition, orderBy, lockMode);
		if (subscriptions != null && subscriptions.length > 0)
			return subscriptions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSubscriptionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iterateSubscriptionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSubscriptionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iterateSubscriptionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSubscriptionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.user.Subscription as Subscription");
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
	
	public static java.util.Iterator iterateSubscriptionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.user.Subscription as Subscription");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Subscription", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription createSubscription() {
		return new com.Sportify.Entities.user.Subscription();
	}
	
	public static boolean save(com.Sportify.Entities.user.Subscription subscription) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().saveObject(subscription);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.Sportify.Entities.user.Subscription subscription) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().deleteObject(subscription);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.Sportify.Entities.user.Subscription subscription)throws PersistentException {
		try {
			if (subscription.getSubscribedEntity() != null) {
				subscription.getSubscribedEntity().subscriptions.remove(subscription);
			}
			
			return delete(subscription);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.Sportify.Entities.user.Subscription subscription, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (subscription.getSubscribedEntity() != null) {
				subscription.getSubscribedEntity().subscriptions.remove(subscription);
			}
			
			try {
				session.delete(subscription);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(com.Sportify.Entities.user.Subscription subscription) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().refresh(subscription);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.Sportify.Entities.user.Subscription subscription) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().evict(subscription);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription loadSubscriptionByCriteria(SubscriptionCriteria subscriptionCriteria) {
		Subscription[] subscriptions = listSubscriptionByCriteria(subscriptionCriteria);
		if(subscriptions == null || subscriptions.length == 0) {
			return null;
		}
		return subscriptions[0];
	}
	
	public static Subscription[] listSubscriptionByCriteria(SubscriptionCriteria subscriptionCriteria) {
		return subscriptionCriteria.listSubscription();
	}
}
