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

public class PrepaidCardDAO {
	public static PrepaidCard loadPrepaidCardByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return loadPrepaidCardByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrepaidCard getPrepaidCardByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return getPrepaidCardByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrepaidCard loadPrepaidCardByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return loadPrepaidCardByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrepaidCard getPrepaidCardByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return getPrepaidCardByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrepaidCard loadPrepaidCardByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (PrepaidCard) session.load(PrepaidCard.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrepaidCard getPrepaidCardByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (PrepaidCard) session.get(PrepaidCard.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrepaidCard loadPrepaidCardByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PrepaidCard) session.load(PrepaidCard.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrepaidCard getPrepaidCardByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PrepaidCard) session.get(PrepaidCard.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPrepaidCard(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return queryPrepaidCard(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPrepaidCard(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return queryPrepaidCard(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrepaidCard[] listPrepaidCardByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return listPrepaidCardByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrepaidCard[] listPrepaidCardByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return listPrepaidCardByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPrepaidCard(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PrepaidCard as PrepaidCard");
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
	
	public static List queryPrepaidCard(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PrepaidCard as PrepaidCard");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PrepaidCard", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrepaidCard[] listPrepaidCardByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPrepaidCard(session, condition, orderBy);
			return (PrepaidCard[]) list.toArray(new PrepaidCard[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrepaidCard[] listPrepaidCardByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPrepaidCard(session, condition, orderBy, lockMode);
			return (PrepaidCard[]) list.toArray(new PrepaidCard[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrepaidCard loadPrepaidCardByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return loadPrepaidCardByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrepaidCard loadPrepaidCardByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return loadPrepaidCardByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrepaidCard loadPrepaidCardByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		PrepaidCard[] prepaidCards = listPrepaidCardByQuery(session, condition, orderBy);
		if (prepaidCards != null && prepaidCards.length > 0)
			return prepaidCards[0];
		else
			return null;
	}
	
	public static PrepaidCard loadPrepaidCardByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		PrepaidCard[] prepaidCards = listPrepaidCardByQuery(session, condition, orderBy, lockMode);
		if (prepaidCards != null && prepaidCards.length > 0)
			return prepaidCards[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePrepaidCardByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return iteratePrepaidCardByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePrepaidCardByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = event.EAClassDiagramPersistentManager.instance().getSession();
			return iteratePrepaidCardByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePrepaidCardByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PrepaidCard as PrepaidCard");
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
	
	public static java.util.Iterator iteratePrepaidCardByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PrepaidCard as PrepaidCard");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PrepaidCard", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrepaidCard createPrepaidCard() {
		return new PrepaidCard();
	}
	
	public static boolean save(PrepaidCard prepaidCard) throws PersistentException {
		try {
			event.EAClassDiagramPersistentManager.instance().saveObject(prepaidCard);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(PrepaidCard prepaidCard) throws PersistentException {
		try {
			event.EAClassDiagramPersistentManager.instance().deleteObject(prepaidCard);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(PrepaidCard prepaidCard) throws PersistentException {
		try {
			event.EAClassDiagramPersistentManager.instance().getSession().refresh(prepaidCard);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(PrepaidCard prepaidCard) throws PersistentException {
		try {
			event.EAClassDiagramPersistentManager.instance().getSession().evict(prepaidCard);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PrepaidCard loadPrepaidCardByCriteria(PrepaidCardCriteria prepaidCardCriteria) {
		PrepaidCard[] prepaidCards = listPrepaidCardByCriteria(prepaidCardCriteria);
		if(prepaidCards == null || prepaidCards.length == 0) {
			return null;
		}
		return prepaidCards[0];
	}
	
	public static PrepaidCard[] listPrepaidCardByCriteria(PrepaidCardCriteria prepaidCardCriteria) {
		return prepaidCardCriteria.listPrepaidCard();
	}
}
