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
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class SportDAO {
	public static Sport loadSportByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return loadSportByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sport getSportByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return getSportByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sport loadSportByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return loadSportByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sport getSportByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return getSportByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sport loadSportByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Sport) session.load(Sport.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sport getSportByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Sport) session.get(Sport.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sport loadSportByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Sport) session.load(Sport.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sport getSportByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Sport) session.get(Sport.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySport(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return querySport(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySport(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return querySport(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sport[] listSportByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return listSportByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sport[] listSportByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return listSportByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySport(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Sport as Sport");
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
	
	public static List querySport(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Sport as Sport");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Sport", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sport[] listSportByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySport(session, condition, orderBy);
			return (Sport[]) list.toArray(new Sport[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sport[] listSportByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySport(session, condition, orderBy, lockMode);
			return (Sport[]) list.toArray(new Sport[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sport loadSportByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return loadSportByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sport loadSportByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return loadSportByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sport loadSportByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Sport[] sports = listSportByQuery(session, condition, orderBy);
		if (sports != null && sports.length > 0)
			return sports[0];
		else
			return null;
	}
	
	public static Sport loadSportByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Sport[] sports = listSportByQuery(session, condition, orderBy, lockMode);
		if (sports != null && sports.length > 0)
			return sports[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSportByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return iterateSportByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSportByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return iterateSportByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSportByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Sport as Sport");
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
	
	public static java.util.Iterator iterateSportByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Sport as Sport");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Sport", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sport createSport() {
		return new Sport();
	}
	
	public static boolean save(Sport sport) throws PersistentException {
		try {
			event.EAClassDiagramPersistentManager.instance().saveObject(sport);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Sport sport) throws PersistentException {
		try {
			event.EAClassDiagramPersistentManager.instance().deleteObject(sport);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Sport sport) throws PersistentException {
		try {
			event.EAClassDiagramPersistentManager.instance().getSession().refresh(sport);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Sport sport) throws PersistentException {
		try {
			event.EAClassDiagramPersistentManager.instance().getSession().evict(sport);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sport loadSportByCriteria(SportCriteria sportCriteria) {
		Sport[] sports = listSportByCriteria(sportCriteria);
		if(sports == null || sports.length == 0) {
			return null;
		}
		return sports[0];
	}
	
	public static Sport[] listSportByCriteria(SportCriteria sportCriteria) {
		return sportCriteria.listSport();
	}
}
