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
package com.Sportify.DAO.competition;

import com.Sportify.DAO.EAClassDiagramPersistentManager;
import com.Sportify.Entities.competition.MatchEvent;
import com.Sportify.Entities.competition.MatchEventCriteria;
import org.orm.*;
import org.hibernate.Query;

import java.util.List;

public class MatchEventDAO {
	public static MatchEvent loadMatchEventByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadMatchEventByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MatchEvent getMatchEventByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getMatchEventByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MatchEvent loadMatchEventByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadMatchEventByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MatchEvent getMatchEventByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getMatchEventByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MatchEvent loadMatchEventByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (MatchEvent) session.load(com.Sportify.Entities.competition.MatchEvent.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MatchEvent getMatchEventByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (MatchEvent) session.get(com.Sportify.Entities.competition.MatchEvent.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MatchEvent loadMatchEventByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (MatchEvent) session.load(com.Sportify.Entities.competition.MatchEvent.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MatchEvent getMatchEventByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (MatchEvent) session.get(com.Sportify.Entities.competition.MatchEvent.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMatchEvent(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return queryMatchEvent(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMatchEvent(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return queryMatchEvent(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MatchEvent[] listMatchEventByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listMatchEventByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MatchEvent[] listMatchEventByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listMatchEventByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMatchEvent(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.competition.MatchEvent as MatchEvent");
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
	
	public static List queryMatchEvent(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.competition.MatchEvent as MatchEvent");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("MatchEvent", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MatchEvent[] listMatchEventByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMatchEvent(session, condition, orderBy);
			return (MatchEvent[]) list.toArray(new MatchEvent[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MatchEvent[] listMatchEventByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMatchEvent(session, condition, orderBy, lockMode);
			return (MatchEvent[]) list.toArray(new MatchEvent[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MatchEvent loadMatchEventByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadMatchEventByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MatchEvent loadMatchEventByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadMatchEventByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MatchEvent loadMatchEventByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		MatchEvent[] matchEvents = listMatchEventByQuery(session, condition, orderBy);
		if (matchEvents != null && matchEvents.length > 0)
			return matchEvents[0];
		else
			return null;
	}
	
	public static MatchEvent loadMatchEventByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		MatchEvent[] matchEvents = listMatchEventByQuery(session, condition, orderBy, lockMode);
		if (matchEvents != null && matchEvents.length > 0)
			return matchEvents[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMatchEventByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iterateMatchEventByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMatchEventByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iterateMatchEventByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMatchEventByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.competition.MatchEvent as MatchEvent");
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
	
	public static java.util.Iterator iterateMatchEventByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.competition.MatchEvent as MatchEvent");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("MatchEvent", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MatchEvent createMatchEvent() {
		return new com.Sportify.Entities.competition.MatchEvent();
	}
	
	public static boolean save(com.Sportify.Entities.competition.MatchEvent matchEvent) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().saveObject(matchEvent);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.Sportify.Entities.competition.MatchEvent matchEvent) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().deleteObject(matchEvent);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.Sportify.Entities.competition.MatchEvent matchEvent)throws PersistentException {
		try {
			com.Sportify.Entities.subentities.Athlete[] lAthletess = matchEvent.athletes.toArray();
			for(int i = 0; i < lAthletess.length; i++) {
				lAthletess[i].matchEvents.remove(matchEvent);
			}
			com.Sportify.Entities.user.Subscription[] lSubscriptionss = matchEvent.subscriptions.toArray();
			for(int i = 0; i < lSubscriptionss.length; i++) {
				lSubscriptionss[i].setSubscribedEntity(null);
			}
			return delete(matchEvent);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.Sportify.Entities.competition.MatchEvent matchEvent, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.Sportify.Entities.subentities.Athlete[] lAthletess = matchEvent.athletes.toArray();
			for(int i = 0; i < lAthletess.length; i++) {
				lAthletess[i].matchEvents.remove(matchEvent);
			}
			com.Sportify.Entities.user.Subscription[] lSubscriptionss = matchEvent.subscriptions.toArray();
			for(int i = 0; i < lSubscriptionss.length; i++) {
				lSubscriptionss[i].setSubscribedEntity(null);
			}
			try {
				session.delete(matchEvent);
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
	
	public static boolean refresh(com.Sportify.Entities.competition.MatchEvent matchEvent) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().refresh(matchEvent);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.Sportify.Entities.competition.MatchEvent matchEvent) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().evict(matchEvent);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MatchEvent loadMatchEventByCriteria(MatchEventCriteria matchEventCriteria) {
		MatchEvent[] matchEvents = listMatchEventByCriteria(matchEventCriteria);
		if(matchEvents == null || matchEvents.length == 0) {
			return null;
		}
		return matchEvents[0];
	}
	
	public static MatchEvent[] listMatchEventByCriteria(MatchEventCriteria matchEventCriteria) {
		return matchEventCriteria.listMatchEvent();
	}
}
