/**
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
package sportify.models.event;

import org.orm.*;
import org.hibernate.Query;
import sportify.models.EAClassDiagramPersistentManager;

import java.util.List;

public class EventDAO {
	public static Event loadEventByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadEventByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event getEventByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getEventByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event loadEventByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadEventByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event getEventByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getEventByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event loadEventByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Event) session.load(Event.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event getEventByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Event) session.get(Event.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event loadEventByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Event) session.load(Event.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event getEventByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Event) session.get(Event.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvent(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return queryEvent(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvent(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return queryEvent(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event[] listEventByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listEventByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event[] listEventByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listEventByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvent(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Event as Event");
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
	
	public static List queryEvent(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Event as Event");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Event", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event[] listEventByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEvent(session, condition, orderBy);
			return (Event[]) list.toArray(new Event[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event[] listEventByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEvent(session, condition, orderBy, lockMode);
			return (Event[]) list.toArray(new Event[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event loadEventByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadEventByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event loadEventByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadEventByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event loadEventByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Event[] events = listEventByQuery(session, condition, orderBy);
		if (events != null && events.length > 0)
			return events[0];
		else
			return null;
	}
	
	public static Event loadEventByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Event[] events = listEventByQuery(session, condition, orderBy, lockMode);
		if (events != null && events.length > 0)
			return events[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEventByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iterateEventByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEventByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iterateEventByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEventByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Event as Event");
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
	
	public static java.util.Iterator iterateEventByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Event as Event");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Event", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event createEvent() {
		return new Event();
	}
	
	public static boolean save(Event event1) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().saveObject(event1);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Event event1) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().deleteObject(event1);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Event event1) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().refresh(event1);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Event event1) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().evict(event1);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event loadEventByCriteria(EventCriteria eventCriteria) {
		Event[] events = listEventByCriteria(eventCriteria);
		if(events == null || events.length == 0) {
			return null;
		}
		return events[0];
	}
	
	public static Event[] listEventByCriteria(EventCriteria eventCriteria) {
		return eventCriteria.listEvent();
	}
}
