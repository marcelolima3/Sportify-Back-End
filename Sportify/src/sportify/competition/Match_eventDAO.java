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
package sportify.competition;

import org.orm.*;
import org.hibernate.Query;

import java.util.List;

public class Match_eventDAO {
	public static Match_event loadMatch_eventByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadMatch_eventByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Match_event getMatch_eventByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getMatch_eventByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Match_event loadMatch_eventByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadMatch_eventByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Match_event getMatch_eventByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getMatch_eventByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Match_event loadMatch_eventByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Match_event) session.load(sportify.competition.Match_event.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Match_event getMatch_eventByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Match_event) session.get(sportify.competition.Match_event.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Match_event loadMatch_eventByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Match_event) session.load(sportify.competition.Match_event.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Match_event getMatch_eventByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Match_event) session.get(sportify.competition.Match_event.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMatch_event(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return queryMatch_event(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMatch_event(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return queryMatch_event(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Match_event[] listMatch_eventByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listMatch_eventByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Match_event[] listMatch_eventByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listMatch_eventByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMatch_event(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sportify.competition.Match_event as Match_event");
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
	
	public static List queryMatch_event(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sportify.competition.Match_event as Match_event");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Match_event", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Match_event[] listMatch_eventByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMatch_event(session, condition, orderBy);
			return (Match_event[]) list.toArray(new Match_event[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Match_event[] listMatch_eventByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMatch_event(session, condition, orderBy, lockMode);
			return (Match_event[]) list.toArray(new Match_event[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Match_event loadMatch_eventByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadMatch_eventByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Match_event loadMatch_eventByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadMatch_eventByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Match_event loadMatch_eventByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Match_event[] match_events = listMatch_eventByQuery(session, condition, orderBy);
		if (match_events != null && match_events.length > 0)
			return match_events[0];
		else
			return null;
	}
	
	public static Match_event loadMatch_eventByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Match_event[] match_events = listMatch_eventByQuery(session, condition, orderBy, lockMode);
		if (match_events != null && match_events.length > 0)
			return match_events[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMatch_eventByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iterateMatch_eventByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMatch_eventByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iterateMatch_eventByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMatch_eventByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sportify.competition.Match_event as Match_event");
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
	
	public static java.util.Iterator iterateMatch_eventByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sportify.competition.Match_event as Match_event");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Match_event", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Match_event createMatch_event() {
		return new sportify.competition.Match_event();
	}
	
	public static boolean save(sportify.competition.Match_event match_event) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().saveObject(match_event);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(sportify.competition.Match_event match_event) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().deleteObject(match_event);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(sportify.competition.Match_event match_event)throws PersistentException {
		try {
			sportify.subentities.Athlete[] lAthletess = match_event.athletes.toArray();
			for(int i = 0; i < lAthletess.length; i++) {
				lAthletess[i].match_events.remove(match_event);
			}
			return delete(match_event);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(sportify.competition.Match_event match_event, org.orm.PersistentSession session)throws PersistentException {
		try {
			sportify.subentities.Athlete[] lAthletess = match_event.athletes.toArray();
			for(int i = 0; i < lAthletess.length; i++) {
				lAthletess[i].match_events.remove(match_event);
			}
			try {
				session.delete(match_event);
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
	
	public static boolean refresh(sportify.competition.Match_event match_event) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().refresh(match_event);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(sportify.competition.Match_event match_event) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().evict(match_event);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Match_event loadMatch_eventByCriteria(Match_eventCriteria match_eventCriteria) {
		Match_event[] match_events = listMatch_eventByCriteria(match_eventCriteria);
		if(match_events == null || match_events.length == 0) {
			return null;
		}
		return match_events[0];
	}
	
	public static Match_event[] listMatch_eventByCriteria(Match_eventCriteria match_eventCriteria) {
		return match_eventCriteria.listMatch_event();
	}
}
