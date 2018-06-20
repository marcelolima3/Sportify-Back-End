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
package sportify.subentities;

import org.orm.*;
import org.hibernate.Query;

import java.util.List;

public class AthleteDAO {
	public static Athlete loadAthleteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return loadAthleteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Athlete getAthleteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return getAthleteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Athlete loadAthleteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return loadAthleteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Athlete getAthleteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return getAthleteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Athlete loadAthleteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Athlete) session.load(sportify.subentities.Athlete.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Athlete getAthleteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Athlete) session.get(sportify.subentities.Athlete.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Athlete loadAthleteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Athlete) session.load(sportify.subentities.Athlete.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Athlete getAthleteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Athlete) session.get(sportify.subentities.Athlete.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAthlete(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return queryAthlete(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAthlete(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return queryAthlete(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Athlete[] listAthleteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return listAthleteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Athlete[] listAthleteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return listAthleteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAthlete(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sportify.subentities.Athlete as Athlete");
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
	
	public static List queryAthlete(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sportify.subentities.Athlete as Athlete");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Athlete", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Athlete[] listAthleteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAthlete(session, condition, orderBy);
			return (Athlete[]) list.toArray(new Athlete[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Athlete[] listAthleteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAthlete(session, condition, orderBy, lockMode);
			return (Athlete[]) list.toArray(new Athlete[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Athlete loadAthleteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return loadAthleteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Athlete loadAthleteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return loadAthleteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Athlete loadAthleteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Athlete[] athletes = listAthleteByQuery(session, condition, orderBy);
		if (athletes != null && athletes.length > 0)
			return athletes[0];
		else
			return null;
	}
	
	public static Athlete loadAthleteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Athlete[] athletes = listAthleteByQuery(session, condition, orderBy, lockMode);
		if (athletes != null && athletes.length > 0)
			return athletes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAthleteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return iterateAthleteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAthleteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sportify.competition.EAClassDiagramPersistentManager.instance().getSession();
			return iterateAthleteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAthleteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sportify.subentities.Athlete as Athlete");
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
	
	public static java.util.Iterator iterateAthleteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sportify.subentities.Athlete as Athlete");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Athlete", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Athlete createAthlete() {
		return new sportify.subentities.Athlete();
	}
	
	public static boolean save(sportify.subentities.Athlete athlete) throws PersistentException {
		try {
			sportify.competition.EAClassDiagramPersistentManager.instance().saveObject(athlete);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(sportify.subentities.Athlete athlete) throws PersistentException {
		try {
			sportify.competition.EAClassDiagramPersistentManager.instance().deleteObject(athlete);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(sportify.subentities.Athlete athlete)throws PersistentException {
		try {
			if (athlete.getTeam() != null) {
				athlete.getTeam().athletes.remove(athlete);
			}
			
			sportify.competition.Match[] lMatchess = athlete.matches.toArray();
			for(int i = 0; i < lMatchess.length; i++) {
				lMatchess[i].athletes.remove(athlete);
			}
			return delete(athlete);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(sportify.subentities.Athlete athlete, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (athlete.getTeam() != null) {
				athlete.getTeam().athletes.remove(athlete);
			}
			
			sportify.competition.Match[] lMatchess = athlete.matches.toArray();
			for(int i = 0; i < lMatchess.length; i++) {
				lMatchess[i].athletes.remove(athlete);
			}
			try {
				session.delete(athlete);
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
	
	public static boolean refresh(sportify.subentities.Athlete athlete) throws PersistentException {
		try {
			sportify.competition.EAClassDiagramPersistentManager.instance().getSession().refresh(athlete);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(sportify.subentities.Athlete athlete) throws PersistentException {
		try {
			sportify.competition.EAClassDiagramPersistentManager.instance().getSession().evict(athlete);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Athlete loadAthleteByCriteria(AthleteCriteria athleteCriteria) {
		Athlete[] athletes = listAthleteByCriteria(athleteCriteria);
		if(athletes == null || athletes.length == 0) {
			return null;
		}
		return athletes[0];
	}
	
	public static Athlete[] listAthleteByCriteria(AthleteCriteria athleteCriteria) {
		return athleteCriteria.listAthlete();
	}
}
