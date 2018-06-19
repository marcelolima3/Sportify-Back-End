package sportify.models; /**
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

import java.util.List;

public class TeamDAO {
	public static Team loadTeamByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadTeamByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Team getTeamByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getTeamByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Team loadTeamByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadTeamByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Team getTeamByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return getTeamByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Team loadTeamByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Team) session.load(Team.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Team getTeamByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Team) session.get(Team.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Team loadTeamByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Team) session.load(Team.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Team getTeamByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Team) session.get(Team.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTeam(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return queryTeam(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTeam(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return queryTeam(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Team[] listTeamByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listTeamByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Team[] listTeamByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return listTeamByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTeam(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sportify.models.Team as sportify.models.Team");
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
	
	public static List queryTeam(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sportify.models.Team as sportify.models.Team");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("sportify.models.Team", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Team[] listTeamByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTeam(session, condition, orderBy);
			return (Team[]) list.toArray(new Team[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Team[] listTeamByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTeam(session, condition, orderBy, lockMode);
			return (Team[]) list.toArray(new Team[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Team loadTeamByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadTeamByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Team loadTeamByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return loadTeamByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Team loadTeamByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Team[] teams = listTeamByQuery(session, condition, orderBy);
		if (teams != null && teams.length > 0)
			return teams[0];
		else
			return null;
	}
	
	public static Team loadTeamByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Team[] teams = listTeamByQuery(session, condition, orderBy, lockMode);
		if (teams != null && teams.length > 0)
			return teams[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTeamByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iterateTeamByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTeamByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EAClassDiagramPersistentManager.instance().getSession();
			return iterateTeamByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTeamByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sportify.models.Team as sportify.models.Team");
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
	
	public static java.util.Iterator iterateTeamByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sportify.models.Team as sportify.models.Team");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("sportify.models.Team", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Team createTeam() {
		return new Team();
	}
	
	public static boolean save(Team team) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().saveObject(team);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Team team) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().deleteObject(team);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Team team)throws PersistentException {
		try {
			Athlete[] lAthletess = team.athletes.toArray();
			for(int i = 0; i < lAthletess.length; i++) {
				lAthletess[i].setTeam(null);
			}
			return delete(team);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Team team, org.orm.PersistentSession session)throws PersistentException {
		try {
			Athlete[] lAthletess = team.athletes.toArray();
			for(int i = 0; i < lAthletess.length; i++) {
				lAthletess[i].setTeam(null);
			}
			try {
				session.delete(team);
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
	
	public static boolean refresh(Team team) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().refresh(team);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Team team) throws PersistentException {
		try {
			EAClassDiagramPersistentManager.instance().getSession().evict(team);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Team loadTeamByCriteria(TeamCriteria teamCriteria) {
		Team[] teams = listTeamByCriteria(teamCriteria);
		if(teams == null || teams.length == 0) {
			return null;
		}
		return teams[0];
	}
	
	public static Team[] listTeamByCriteria(TeamCriteria teamCriteria) {
		return teamCriteria.listTeam();
	}
}
