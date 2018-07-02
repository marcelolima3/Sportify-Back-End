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
package com.Sportify.DAO;

import org.orm.*;
import org.orm.cfg.JDBCConnectionSetting;
import org.hibernate.*;
import java.util.Properties;

import org.hibernate.boot.MetadataSources;

public class EAClassDiagramPersistentManager extends PersistentManager {
	private static final String PROJECT_NAME = "EAClassDiagram";
	private static PersistentManager _instance = null;
	private static SessionType _sessionType = SessionType.APP_BASE;
	private static int _timeToAlive = 60000;
	private static JDBCConnectionSetting _connectionSetting = null;
	private static Properties _extraProperties = null;
	private static String _configurationFile = null;
	
	private EAClassDiagramPersistentManager() throws PersistentException {
		super(_connectionSetting, _sessionType, _timeToAlive, new String[] {}, _extraProperties, _configurationFile);
		setFlushMode(FlushMode.AUTO);
	}
	
	@Override
	protected void configureMetadataSources(MetadataSources aMetadataSources) {
		super.configureMetadataSources(aMetadataSources);
		aMetadataSources.addAnnotatedClass(com.Sportify.Entities.competition.Modality.class);
		aMetadataSources.addAnnotatedClass(com.Sportify.Entities.payment.PaymentMethod.class);
		aMetadataSources.addAnnotatedClass(com.Sportify.Entities.user.NotificationTracker.class);
		aMetadataSources.addAnnotatedClass(com.Sportify.Entities.event.EventCategory.class);
		aMetadataSources.addAnnotatedClass(com.Sportify.Entities.payment.PrepaidCard.class);
		aMetadataSources.addAnnotatedClass(com.Sportify.Entities.competition.Competition.class);
		aMetadataSources.addAnnotatedClass(com.Sportify.Entities.user.Subscription.class);
		aMetadataSources.addAnnotatedClass(com.Sportify.Entities.competition.MatchEvent.class);
		aMetadataSources.addAnnotatedClass(com.Sportify.Entities.event.Event.class);
		aMetadataSources.addAnnotatedClass(com.Sportify.Entities.user.User.class);
		aMetadataSources.addAnnotatedClass(com.Sportify.Entities.payment.InvoicePayment.class);
		aMetadataSources.addAnnotatedClass(com.Sportify.Entities.payment.Invoice.class);
		aMetadataSources.addAnnotatedClass(com.Sportify.Entities.competition.Sport.class);
		aMetadataSources.addAnnotatedClass(com.Sportify.Entities.payment.MonthlyBill.class);
		aMetadataSources.addAnnotatedClass(com.Sportify.Entities.subentities.SubscriptionEntity.class);
		aMetadataSources.addAnnotatedClass(com.Sportify.Entities.subentities.Team.class);
		aMetadataSources.addAnnotatedClass(com.Sportify.Entities.subentities.Athlete.class);
	}
	
	public String getProjectName() {
		return PROJECT_NAME;
	}
	
	public static synchronized final PersistentManager instance() throws PersistentException {
		if (_instance == null) {
			_instance = new EAClassDiagramPersistentManager();
		}
		
		return _instance;
	}
	
	public void disposePersistentManager() throws PersistentException {
		_instance = null;
		super.disposePersistentManager();
	}
	
	public static void setSessionType(SessionType sessionType) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session type after create PersistentManager instance");
		}
		else {
			_sessionType = sessionType;
		}
		
	}
	
	public static void setAppBaseSessionTimeToAlive(int timeInMs) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session time to alive after create PersistentManager instance");
		}
		else {
			_timeToAlive = timeInMs;
		}
		
	}
	
	public static void setJDBCConnectionSetting(JDBCConnectionSetting aConnectionSetting) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set connection setting after create PersistentManager instance");
		}
		else {
			_connectionSetting = aConnectionSetting;
		}
		
	}
	
	public static void setHibernateProperties(Properties aProperties) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set hibernate properties after create PersistentManager instance");
		}
		else {
			_extraProperties = aProperties;
		}
		
	}
	
	public static void setConfigurationFile(String aConfigurationFile) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set configuration file after create PersistentManager instance");
		}
		else {
			_configurationFile = aConfigurationFile;
		}
		
	}
	
	public static void saveJDBCConnectionSetting() {
		PersistentManager.saveJDBCConnectionSetting(PROJECT_NAME, _connectionSetting);
	}
}
