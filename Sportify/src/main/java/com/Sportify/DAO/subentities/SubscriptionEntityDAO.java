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
package com.Sportify.DAO.subentities;

import com.Sportify.DAO.EAClassDiagramPersistentManager;
import com.Sportify.DAO.competition.MatchEventDAO;
import com.Sportify.Entities.subentities.Athlete;
import com.Sportify.Entities.subentities.SubscriptionEntity;
import com.Sportify.Entities.subentities.SubscriptionEntityCriteria;
import com.Sportify.Entities.subentities.Team;
import org.orm.*;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SubscriptionEntityDAO {
	public static SubscriptionEntity loadSubscriptionEntityByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadSubscriptionEntityByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionEntity getSubscriptionEntityByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getSubscriptionEntityByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionEntity loadSubscriptionEntityByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadSubscriptionEntityByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionEntity getSubscriptionEntityByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getSubscriptionEntityByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionEntity loadSubscriptionEntityByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (SubscriptionEntity) session.load(com.Sportify.Entities.subentities.SubscriptionEntity.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionEntity getSubscriptionEntityByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (SubscriptionEntity) session.get(com.Sportify.Entities.subentities.SubscriptionEntity.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionEntity loadSubscriptionEntityByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (SubscriptionEntity) session.load(com.Sportify.Entities.subentities.SubscriptionEntity.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionEntity getSubscriptionEntityByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (SubscriptionEntity) session.get(com.Sportify.Entities.subentities.SubscriptionEntity.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySubscriptionEntity(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return querySubscriptionEntity(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySubscriptionEntity(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return querySubscriptionEntity(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionEntity[] listSubscriptionEntityByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listSubscriptionEntityByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionEntity[] listSubscriptionEntityByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listSubscriptionEntityByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySubscriptionEntity(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.subentities.SubscriptionEntity as SubscriptionEntity");
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
	
	public static List querySubscriptionEntity(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.subentities.SubscriptionEntity as SubscriptionEntity");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SubscriptionEntity", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionEntity[] listSubscriptionEntityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySubscriptionEntity(session, condition, orderBy);
			return (SubscriptionEntity[]) list.toArray(new SubscriptionEntity[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionEntity[] listSubscriptionEntityByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySubscriptionEntity(session, condition, orderBy, lockMode);
			return (SubscriptionEntity[]) list.toArray(new SubscriptionEntity[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionEntity loadSubscriptionEntityByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadSubscriptionEntityByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionEntity loadSubscriptionEntityByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadSubscriptionEntityByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionEntity loadSubscriptionEntityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		SubscriptionEntity[] subscriptionEntitys = listSubscriptionEntityByQuery(session, condition, orderBy);
		if (subscriptionEntitys != null && subscriptionEntitys.length > 0)
			return subscriptionEntitys[0];
		else
			return null;
	}
	
	public static SubscriptionEntity loadSubscriptionEntityByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		SubscriptionEntity[] subscriptionEntitys = listSubscriptionEntityByQuery(session, condition, orderBy, lockMode);
		if (subscriptionEntitys != null && subscriptionEntitys.length > 0)
			return subscriptionEntitys[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSubscriptionEntityByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iterateSubscriptionEntityByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSubscriptionEntityByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iterateSubscriptionEntityByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSubscriptionEntityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.subentities.SubscriptionEntity as SubscriptionEntity");
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
	
	public static java.util.Iterator iterateSubscriptionEntityByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.Sportify.Entities.subentities.SubscriptionEntity as SubscriptionEntity");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SubscriptionEntity", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean save(com.Sportify.Entities.subentities.SubscriptionEntity subscriptionEntity) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().saveObject(subscriptionEntity);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.Sportify.Entities.subentities.SubscriptionEntity subscriptionEntity) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().deleteObject(subscriptionEntity);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.Sportify.Entities.subentities.SubscriptionEntity subscriptionEntity)throws PersistentException {
		if (subscriptionEntity instanceof Team) {
			return TeamDAO.deleteAndDissociate((Team) subscriptionEntity);
		}
		
		if (subscriptionEntity instanceof com.Sportify.Entities.competition.MatchEvent) {
			return MatchEventDAO.deleteAndDissociate((com.Sportify.Entities.competition.MatchEvent) subscriptionEntity);
		}
		
		if (subscriptionEntity instanceof Athlete) {
			return AthleteDAO.deleteAndDissociate((Athlete) subscriptionEntity);
		}
		
		try {
			com.Sportify.Entities.user.Subscription[] lSubscriptionss = subscriptionEntity.subscriptions.toArray();
			for(int i = 0; i < lSubscriptionss.length; i++) {
				lSubscriptionss[i].setSubscribedEntity(null);
			}
			return delete(subscriptionEntity);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.Sportify.Entities.subentities.SubscriptionEntity subscriptionEntity, org.orm.PersistentSession session)throws PersistentException {
		if (subscriptionEntity instanceof Team) {
			return TeamDAO.deleteAndDissociate((Team) subscriptionEntity, session);
		}
		
		if (subscriptionEntity instanceof com.Sportify.Entities.competition.MatchEvent) {
			return MatchEventDAO.deleteAndDissociate((com.Sportify.Entities.competition.MatchEvent) subscriptionEntity, session);
		}
		
		if (subscriptionEntity instanceof Athlete) {
			return AthleteDAO.deleteAndDissociate((Athlete) subscriptionEntity, session);
		}
		
		try {
			com.Sportify.Entities.user.Subscription[] lSubscriptionss = subscriptionEntity.subscriptions.toArray();
			for(int i = 0; i < lSubscriptionss.length; i++) {
				lSubscriptionss[i].setSubscribedEntity(null);
			}
			try {
				session.delete(subscriptionEntity);
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
	
	public static boolean refresh(com.Sportify.Entities.subentities.SubscriptionEntity subscriptionEntity) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().refresh(subscriptionEntity);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.Sportify.Entities.subentities.SubscriptionEntity subscriptionEntity) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().evict(subscriptionEntity);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionEntity loadSubscriptionEntityByCriteria(SubscriptionEntityCriteria subscriptionEntityCriteria) {
		SubscriptionEntity[] subscriptionEntitys = listSubscriptionEntityByCriteria(subscriptionEntityCriteria);
		if(subscriptionEntitys == null || subscriptionEntitys.length == 0) {
			return null;
		}
		return subscriptionEntitys[0];
	}
	
	public static SubscriptionEntity[] listSubscriptionEntityByCriteria(SubscriptionEntityCriteria subscriptionEntityCriteria) {
		return subscriptionEntityCriteria.listSubscriptionEntity();
	}
}
