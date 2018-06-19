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

public class CompetitionDAO {
	public static Competition loadCompetitionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return loadCompetitionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Competition getCompetitionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return getCompetitionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Competition loadCompetitionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return loadCompetitionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Competition getCompetitionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return getCompetitionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Competition loadCompetitionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Competition) session.load(Competition.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Competition getCompetitionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Competition) session.get(Competition.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Competition loadCompetitionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Competition) session.load(Competition.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Competition getCompetitionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Competition) session.get(Competition.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompetition(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return queryCompetition(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompetition(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return queryCompetition(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Competition[] listCompetitionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return listCompetitionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Competition[] listCompetitionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return listCompetitionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompetition(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Competition as Competition");
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
	
	public static List queryCompetition(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Competition as Competition");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Competition", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Competition[] listCompetitionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCompetition(session, condition, orderBy);
			return (Competition[]) list.toArray(new Competition[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Competition[] listCompetitionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCompetition(session, condition, orderBy, lockMode);
			return (Competition[]) list.toArray(new Competition[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Competition loadCompetitionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return loadCompetitionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Competition loadCompetitionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return loadCompetitionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Competition loadCompetitionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Competition[] competitions = listCompetitionByQuery(session, condition, orderBy);
		if (competitions != null && competitions.length > 0)
			return competitions[0];
		else
			return null;
	}
	
	public static Competition loadCompetitionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Competition[] competitions = listCompetitionByQuery(session, condition, orderBy, lockMode);
		if (competitions != null && competitions.length > 0)
			return competitions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCompetitionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return iterateCompetitionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompetitionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return iterateCompetitionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompetitionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Competition as Competition");
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
	
	public static java.util.Iterator iterateCompetitionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Competition as Competition");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Competition", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Competition createCompetition() {
		return new Competition();
	}
	
	public static boolean save(Competition competition) throws PersistentException {
		try {
			event.EAClassDiagramPersistentManager.instance().saveObject(competition);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Competition competition) throws PersistentException {
		try {
			event.EAClassDiagramPersistentManager.instance().deleteObject(competition);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Competition competition) throws PersistentException {
		try {
			event.EAClassDiagramPersistentManager.instance().getSession().refresh(competition);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Competition competition) throws PersistentException {
		try {
			event.EAClassDiagramPersistentManager.instance().getSession().evict(competition);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Competition loadCompetitionByCriteria(CompetitionCriteria competitionCriteria) {
		Competition[] competitions = listCompetitionByCriteria(competitionCriteria);
		if(competitions == null || competitions.length == 0) {
			return null;
		}
		return competitions[0];
	}
	
	public static Competition[] listCompetitionByCriteria(CompetitionCriteria competitionCriteria) {
		return competitionCriteria.listCompetition();
	}
}
