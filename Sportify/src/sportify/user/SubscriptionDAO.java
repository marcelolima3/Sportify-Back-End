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

public class SubscriptionDAO {
	public static Subscription loadSubscriptionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return loadSubscriptionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription getSubscriptionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return getSubscriptionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription loadSubscriptionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return loadSubscriptionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription getSubscriptionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return getSubscriptionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription loadSubscriptionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Subscription) session.load(sportify.user.Subscription.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription getSubscriptionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Subscription) session.get(sportify.user.Subscription.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription loadSubscriptionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Subscription) session.load(sportify.user.Subscription.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription getSubscriptionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Subscription) session.get(sportify.user.Subscription.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySubscription(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return querySubscription(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySubscription(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return querySubscription(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription[] listSubscriptionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return listSubscriptionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription[] listSubscriptionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return listSubscriptionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySubscription(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sportify.user.Subscription as Subscription");
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
	
	public static List querySubscription(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sportify.user.Subscription as Subscription");
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
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return loadSubscriptionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Subscription loadSubscriptionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
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
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return iterateSubscriptionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSubscriptionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return iterateSubscriptionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSubscriptionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sportify.user.Subscription as Subscription");
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
		StringBuffer sb = new StringBuffer("From sportify.user.Subscription as Subscription");
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
		return new sportify.user.Subscription();
	}
	
	public static boolean save(sportify.user.Subscription subscription) throws PersistentException {
		try {
			sportify.competition.EAClassDiagramPersistentManager.instance().saveObject(subscription);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(sportify.user.Subscription subscription) throws PersistentException {
		try {
			sportify.competition.EAClassDiagramPersistentManager.instance().deleteObject(subscription);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(sportify.user.Subscription subscription) throws PersistentException {
		try {
			sportify.competition.EAClassDiagramPersistentManager.instance().getSession().refresh(subscription);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(sportify.user.Subscription subscription) throws PersistentException {
		try {
			sportify.competition.EAClassDiagramPersistentManager.instance().getSession().evict(subscription);
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
