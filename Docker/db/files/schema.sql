-- MySQL dump 10.13  Distrib 5.7.21, for osx10.13 (x86_64)
--
-- Host: localhost    Database: sportify
-- ------------------------------------------------------
-- Server version	5.7.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- -----------------------------------------------------
-- Schema data
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sportify` DEFAULT CHARACTER SET latin1 ;
USE `sportify`;

--
-- Table structure for table `Athlete`
--

DROP TABLE IF EXISTS `Athlete`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Athlete` (
  `Name` varchar(255) DEFAULT NULL,
  `Nationality` varchar(255) DEFAULT NULL,
  `Genre` varchar(255) DEFAULT NULL,
  `SubscriptionEntityID` int(10) NOT NULL,
  `TeamSubscriptionEntityID` int(10) NOT NULL,
  PRIMARY KEY (`SubscriptionEntityID`),
  KEY `FKAthlete668286` (`TeamSubscriptionEntityID`),
  CONSTRAINT `FKAthlete450927` FOREIGN KEY (`SubscriptionEntityID`) REFERENCES `SubscriptionEntity` (`ID`),
  CONSTRAINT `FKAthlete668286` FOREIGN KEY (`TeamSubscriptionEntityID`) REFERENCES `Team` (`SubscriptionEntityID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Athlete`
--

LOCK TABLES `Athlete` WRITE;
/*!40000 ALTER TABLE `Athlete` DISABLE KEYS */;
INSERT INTO `Athlete` VALUES ('Maria Peixoto','Portuguese','Female',2,1),('Carlos Rocha','Portuguese','Male',3,1),('Ana Miranda','Portuguese','Female',4,1),('João Pereira','Portuguese','Male',6,5),('Maria Silva','Portuguese','Female',7,5),('Luísa Rocha','Portuguese','Female',8,5),('Manuel Pereira','Portuguese','Male',10,9),('José Pedro','Portuguese','Male',11,9),('António Sá','Portuguese','Male',12,9),('Carlos Costa','Portuguese','Male',14,13),('Ana Guedes','Portuguese','Female',15,13),('Maria Pires','Portuguese','Female',16,13),('Bruno Pedro','Portuguese','Male',18,17),('Manuel Ferreira','Portuguese','Male',19,17),('João Sá','Portuguese','Male',20,17),('Mariana Silva','Portuguese','Female',22,21),('Luís António','Portuguese','Male',23,21),('Teresa Rocha','Portuguese','Female',24,21),('Cristiano Ronaldo','Portuguese','Male',26,25),('Herrera','Mexican','Male',28,27),('David Silva','Spanish','Male',30,29),('Luisão','Brazilian','Male',32,31),('Fábio Coentão','Portuguese','Male',34,33),('Paulinho','Portuguese','Male',36,35),('Buffon','Italian','Male',38,37),('LeBron James','American','Male',40,39),('Roger Federer','Swiss','Male',42,41),('Aaron Judge','American','Male',44,43),('Rui Costa','Portuguese','Male',46,45),('Miroslav','Bulgarian','Male',48,47),('Tiger Woods','American','Male',50,49),('Rúben Vieira','Portuguese','Male',52,51),('João Pereira','Portuguese','Male',54,53),('Luísa Rocha','Portuguese','Female',55,53),('Maria Silva','Portuguese','Female',56,53),('Ana Miranda','Portuguese','Female',58,57),('Maria Peixoto','Portuguese','Female',59,57),('Carlos Rocha','Portuguese','Male',60,57),('Manuel Pereira','Portuguese','Male',62,61),('José Pedro','Portuguese','Male',63,61),('António Sá','Portuguese','Male',64,61),('Ana Guedes','Portuguese','Female',66,65),('Carlos Costa','Portuguese','Male',67,65),('Maria Pires','Portuguese','Female',68,65),('Luís António','Portuguese','Male',70,69),('Teresa Rocha','Portuguese','Female',71,69),('Mariana Silva','Portuguese','Female',72,69),('Manuel Ferreira','Portuguese','Male',74,73),('Bruno Pedro','Portuguese','Male',75,73),('João Sá','Portuguese','Male',76,73),('Cristiano Ronaldo','Portuguese','Male',78,77),('Luisão','Brazilian','Male',80,79),('Herrera','Mexican','Male',82,81),('Buffon','Italian','Male',84,83),('Paulinho','Portuguese','Male',86,85),('Fábio Coentão','Portuguese','Male',88,87),('David Silva','Spanish','Male',90,89),('LeBron James','American','Male',92,91),('Roger Federer','Swiss','Male',94,93),('Aaron Judge','American','Male',96,95),('Rui Costa','Portuguese','Male',98,97),('Miroslav','Bulgarian','Male',100,99),('Tiger Woods','American','Male',102,101),('Rúben Vieira','Portuguese','Male',104,103);
/*!40000 ALTER TABLE `Athlete` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Competition`
--

DROP TABLE IF EXISTS `Competition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Competition` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `ModalityID` int(10) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Location` varchar(255) DEFAULT NULL,
  `StartDate` date DEFAULT NULL,
  `EndDate` date DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `Active` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKCompetitio153811` (`ModalityID`),
  CONSTRAINT `FKCompetitio153811` FOREIGN KEY (`ModalityID`) REFERENCES `Modality` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Competition`
--

LOCK TABLES `Competition` WRITE;
/*!40000 ALTER TABLE `Competition` DISABLE KEYS */;
/*!40000 ALTER TABLE `Competition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Event`
--

DROP TABLE IF EXISTS `Event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Event` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `MatchEventSubscriptionEntityID` int(10) NOT NULL,
  `EventCategoryID` int(10) NOT NULL,
  `TextFormat` varchar(255) DEFAULT NULL,
  `ImageFormat` varchar(255) DEFAULT NULL,
  `VideoFormat` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKEvent164228` (`EventCategoryID`),
  KEY `FKEvent695362` (`MatchEventSubscriptionEntityID`),
  CONSTRAINT `FKEvent164228` FOREIGN KEY (`EventCategoryID`) REFERENCES `EventCategory` (`ID`),
  CONSTRAINT `FKEvent695362` FOREIGN KEY (`MatchEventSubscriptionEntityID`) REFERENCES `MatchEvent` (`SubscriptionEntityID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Event`
--

LOCK TABLES `Event` WRITE;
/*!40000 ALTER TABLE `Event` DISABLE KEYS */;
/*!40000 ALTER TABLE `Event` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `EventCategory`
--

DROP TABLE IF EXISTS `EventCategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `EventCategory` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `ModalityID` int(10) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Price` double DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKEventCateg673747` (`ModalityID`),
  CONSTRAINT `FKEventCateg673747` FOREIGN KEY (`ModalityID`) REFERENCES `Modality` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EventCategory`
--

LOCK TABLES `EventCategory` WRITE;
/*!40000 ALTER TABLE `EventCategory` DISABLE KEYS */;
/*!40000 ALTER TABLE `EventCategory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Invoice`
--

DROP TABLE IF EXISTS `Invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Invoice` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `MonthlyBillPaymentMethodID` int(10) DEFAULT NULL,
  `InvoicePaymentPaymentMethodID` int(10) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Amount` double DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKInvoice751307` (`InvoicePaymentPaymentMethodID`),
  KEY `FKInvoice979372` (`MonthlyBillPaymentMethodID`),
  CONSTRAINT `FKInvoice751307` FOREIGN KEY (`InvoicePaymentPaymentMethodID`) REFERENCES `InvoicePayment` (`PaymentMethodID`),
  CONSTRAINT `FKInvoice979372` FOREIGN KEY (`MonthlyBillPaymentMethodID`) REFERENCES `MonthlyBill` (`PaymentMethodID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Invoice`
--

LOCK TABLES `Invoice` WRITE;
/*!40000 ALTER TABLE `Invoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `Invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `InvoicePayment`
--

DROP TABLE IF EXISTS `InvoicePayment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `InvoicePayment` (
  `CurrentAmount` double DEFAULT NULL,
  `PaymentMethodID` int(10) NOT NULL,
  PRIMARY KEY (`PaymentMethodID`),
  CONSTRAINT `FKInvoicePay937081` FOREIGN KEY (`PaymentMethodID`) REFERENCES `PaymentMethod` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `InvoicePayment`
--

LOCK TABLES `InvoicePayment` WRITE;
/*!40000 ALTER TABLE `InvoicePayment` DISABLE KEYS */;
/*!40000 ALTER TABLE `InvoicePayment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MatchEvent`
--

DROP TABLE IF EXISTS `MatchEvent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MatchEvent` (
  `Description` varchar(255) DEFAULT NULL,
  `StartTime` date DEFAULT NULL,
  `EndTime` date DEFAULT NULL,
  `Location` varchar(255) DEFAULT NULL,
  `Active` tinyint(1) DEFAULT NULL,
  `SubscriptionEntityID` int(10) NOT NULL,
  `CompetitionID` int(10) NOT NULL,
  PRIMARY KEY (`SubscriptionEntityID`),
  KEY `FKMatchEvent773214` (`CompetitionID`),
  CONSTRAINT `FKMatchEvent772174` FOREIGN KEY (`SubscriptionEntityID`) REFERENCES `SubscriptionEntity` (`ID`),
  CONSTRAINT `FKMatchEvent773214` FOREIGN KEY (`CompetitionID`) REFERENCES `Competition` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MatchEvent`
--

LOCK TABLES `MatchEvent` WRITE;
/*!40000 ALTER TABLE `MatchEvent` DISABLE KEYS */;
/*!40000 ALTER TABLE `MatchEvent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MatchEvent_Athlete`
--

DROP TABLE IF EXISTS `MatchEvent_Athlete`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MatchEvent_Athlete` (
  `MatchEventSubscriptionEntityID` int(10) NOT NULL,
  `AthleteSubscriptionEntityID` int(10) NOT NULL,
  PRIMARY KEY (`MatchEventSubscriptionEntityID`,`AthleteSubscriptionEntityID`),
  KEY `FKMatchEvent328857` (`AthleteSubscriptionEntityID`),
  CONSTRAINT `FKMatchEvent328857` FOREIGN KEY (`AthleteSubscriptionEntityID`) REFERENCES `Athlete` (`SubscriptionEntityID`),
  CONSTRAINT `FKMatchEvent370651` FOREIGN KEY (`MatchEventSubscriptionEntityID`) REFERENCES `MatchEvent` (`SubscriptionEntityID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MatchEvent_Athlete`
--

LOCK TABLES `MatchEvent_Athlete` WRITE;
/*!40000 ALTER TABLE `MatchEvent_Athlete` DISABLE KEYS */;
/*!40000 ALTER TABLE `MatchEvent_Athlete` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Modality`
--

DROP TABLE IF EXISTS `Modality`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Modality` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `SportID` int(10) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKModality97613` (`SportID`),
  CONSTRAINT `FKModality97613` FOREIGN KEY (`SportID`) REFERENCES `Sport` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Modality`
--

LOCK TABLES `Modality` WRITE;
/*!40000 ALTER TABLE `Modality` DISABLE KEYS */;
INSERT INTO `Modality` VALUES (1,1,'Sprint'),(2,1,'Hurdling'),(3,2,'Football'),(4,3,'Basketball'),(5,4,'Tennis'),(6,5,'Baseball'),(7,6,'Cycling'),(8,7,'Volleyball'),(9,8,'Golf'),(10,9,'Badminton'),(11,10,'Sprint'),(12,10,'Hurdling'),(13,11,'Football'),(14,12,'Basketball'),(15,13,'Tennis'),(16,14,'Baseball'),(17,15,'Cycling'),(18,16,'Volleyball'),(19,17,'Golf'),(20,18,'Badminton');
/*!40000 ALTER TABLE `Modality` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MonthlyBill`
--

DROP TABLE IF EXISTS `MonthlyBill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MonthlyBill` (
  `LimitAmount` double DEFAULT NULL,
  `CurrentAmount` double DEFAULT NULL,
  `PaymentMethodID` int(10) NOT NULL,
  PRIMARY KEY (`PaymentMethodID`),
  CONSTRAINT `FKMonthlyBil355417` FOREIGN KEY (`PaymentMethodID`) REFERENCES `PaymentMethod` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MonthlyBill`
--

LOCK TABLES `MonthlyBill` WRITE;
/*!40000 ALTER TABLE `MonthlyBill` DISABLE KEYS */;
/*!40000 ALTER TABLE `MonthlyBill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `NotificationTracker`
--

DROP TABLE IF EXISTS `NotificationTracker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `NotificationTracker` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `NotificationPolicy` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `NotificationTracker`
--

LOCK TABLES `NotificationTracker` WRITE;
/*!40000 ALTER TABLE `NotificationTracker` DISABLE KEYS */;
/*!40000 ALTER TABLE `NotificationTracker` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `NotificationTracker_Event`
--

DROP TABLE IF EXISTS `NotificationTracker_Event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `NotificationTracker_Event` (
  `NotificationTrackerID` int(10) NOT NULL,
  `EventID` int(10) NOT NULL,
  PRIMARY KEY (`NotificationTrackerID`,`EventID`),
  KEY `FKNotificati925063` (`EventID`),
  CONSTRAINT `FKNotificati390849` FOREIGN KEY (`NotificationTrackerID`) REFERENCES `NotificationTracker` (`ID`),
  CONSTRAINT `FKNotificati925063` FOREIGN KEY (`EventID`) REFERENCES `Event` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `NotificationTracker_Event`
--

LOCK TABLES `NotificationTracker_Event` WRITE;
/*!40000 ALTER TABLE `NotificationTracker_Event` DISABLE KEYS */;
/*!40000 ALTER TABLE `NotificationTracker_Event` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PaymentMethod`
--

DROP TABLE IF EXISTS `PaymentMethod`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PaymentMethod` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PaymentMethod`
--

LOCK TABLES `PaymentMethod` WRITE;
/*!40000 ALTER TABLE `PaymentMethod` DISABLE KEYS */;
/*!40000 ALTER TABLE `PaymentMethod` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PrepaidCard`
--

DROP TABLE IF EXISTS `PrepaidCard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PrepaidCard` (
  `CardNumber` bigint(20) NOT NULL,
  `SecurityCode` varchar(255) DEFAULT NULL,
  `ExpirationDate` date DEFAULT NULL,
  `CardType` varchar(255) DEFAULT NULL,
  `Balance` double DEFAULT NULL,
  `NumRecharges` int(10) NOT NULL,
  `PaymentMethodID` int(10) NOT NULL,
  PRIMARY KEY (`PaymentMethodID`),
  CONSTRAINT `FKPrepaidCar717473` FOREIGN KEY (`PaymentMethodID`) REFERENCES `PaymentMethod` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PrepaidCard`
--

LOCK TABLES `PrepaidCard` WRITE;
/*!40000 ALTER TABLE `PrepaidCard` DISABLE KEYS */;
/*!40000 ALTER TABLE `PrepaidCard` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Sport`
--

DROP TABLE IF EXISTS `Sport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Sport` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Sport`
--

LOCK TABLES `Sport` WRITE;
/*!40000 ALTER TABLE `Sport` DISABLE KEYS */;
INSERT INTO `Sport` VALUES (1,'Athletics'),(2,'Football'),(3,'Basketball'),(4,'Tennis'),(5,'Baseball'),(6,'Cycling'),(7,'Volleyball'),(8,'Golf'),(9,'Badminton'),(10,'Athletics'),(11,'Football'),(12,'Basketball'),(13,'Tennis'),(14,'Baseball'),(15,'Cycling'),(16,'Volleyball'),(17,'Golf'),(18,'Badminton');
/*!40000 ALTER TABLE `Sport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Subscription`
--

DROP TABLE IF EXISTS `Subscription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Subscription` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `InvoiceID` int(10) NOT NULL,
  `UserID` int(10) NOT NULL,
  `NotificationTrackerID` int(10) NOT NULL,
  `SubscriptionEntityID` int(10) NOT NULL,
  `Date` date DEFAULT NULL,
  `Paid` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKSubscripti470890` (`SubscriptionEntityID`),
  KEY `FKSubscripti299525` (`NotificationTrackerID`),
  KEY `FKSubscripti993170` (`UserID`),
  KEY `FKSubscripti935920` (`InvoiceID`),
  CONSTRAINT `FKSubscripti299525` FOREIGN KEY (`NotificationTrackerID`) REFERENCES `NotificationTracker` (`ID`),
  CONSTRAINT `FKSubscripti470890` FOREIGN KEY (`SubscriptionEntityID`) REFERENCES `SubscriptionEntity` (`ID`),
  CONSTRAINT `FKSubscripti935920` FOREIGN KEY (`InvoiceID`) REFERENCES `Invoice` (`ID`),
  CONSTRAINT `FKSubscripti993170` FOREIGN KEY (`UserID`) REFERENCES `User` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Subscription`
--

LOCK TABLES `Subscription` WRITE;
/*!40000 ALTER TABLE `Subscription` DISABLE KEYS */;
/*!40000 ALTER TABLE `Subscription` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SubscriptionEntity`
--

DROP TABLE IF EXISTS `SubscriptionEntity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SubscriptionEntity` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=105 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SubscriptionEntity`
--

LOCK TABLES `SubscriptionEntity` WRITE;
/*!40000 ALTER TABLE `SubscriptionEntity` DISABLE KEYS */;
INSERT INTO `SubscriptionEntity` VALUES (1),(2),(3),(4),(5),(6),(7),(8),(9),(10),(11),(12),(13),(14),(15),(16),(17),(18),(19),(20),(21),(22),(23),(24),(25),(26),(27),(28),(29),(30),(31),(32),(33),(34),(35),(36),(37),(38),(39),(40),(41),(42),(43),(44),(45),(46),(47),(48),(49),(50),(51),(52),(53),(54),(55),(56),(57),(58),(59),(60),(61),(62),(63),(64),(65),(66),(67),(68),(69),(70),(71),(72),(73),(74),(75),(76),(77),(78),(79),(80),(81),(82),(83),(84),(85),(86),(87),(88),(89),(90),(91),(92),(93),(94),(95),(96),(97),(98),(99),(100),(101),(102),(103),(104);
/*!40000 ALTER TABLE `SubscriptionEntity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Subscription_EventCategory`
--

DROP TABLE IF EXISTS `Subscription_EventCategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Subscription_EventCategory` (
  `SubscriptionID` int(10) NOT NULL,
  `EventCategoryID` int(10) NOT NULL,
  PRIMARY KEY (`SubscriptionID`,`EventCategoryID`),
  KEY `FKSubscripti498032` (`EventCategoryID`),
  CONSTRAINT `FKSubscripti498032` FOREIGN KEY (`EventCategoryID`) REFERENCES `EventCategory` (`ID`),
  CONSTRAINT `FKSubscripti645838` FOREIGN KEY (`SubscriptionID`) REFERENCES `Subscription` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Subscription_EventCategory`
--

LOCK TABLES `Subscription_EventCategory` WRITE;
/*!40000 ALTER TABLE `Subscription_EventCategory` DISABLE KEYS */;
/*!40000 ALTER TABLE `Subscription_EventCategory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Team`
--

DROP TABLE IF EXISTS `Team`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Team` (
  `Name` varchar(255) DEFAULT NULL,
  `SubscriptionEntityID` int(10) NOT NULL,
  `ModalityID` int(10) NOT NULL,
  PRIMARY KEY (`SubscriptionEntityID`),
  KEY `FKTeam284151` (`ModalityID`),
  CONSTRAINT `FKTeam284151` FOREIGN KEY (`ModalityID`) REFERENCES `Modality` (`ID`),
  CONSTRAINT `FKTeam579301` FOREIGN KEY (`SubscriptionEntityID`) REFERENCES `SubscriptionEntity` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Team`
--

LOCK TABLES `Team` WRITE;
/*!40000 ALTER TABLE `Team` DISABLE KEYS */;
INSERT INTO `Team` VALUES ('FC Porto',1,1),('S.L. Benfica',5,1),('Sporting CP',9,1),('FC Porto',13,2),('Sporting CP',17,2),('S.L. Benfica',21,2),('Real Madrid C.F.',25,3),('FC Porto',27,3),('Manchester City F.C.',29,3),('S.L. Benfica',31,3),('Sporting CP',33,3),('S.C. Braga',35,3),('Juventus F.C.',37,3),('Cleveland Cavaliers',39,4),('Roger Federer',41,5),('New York Yankees',43,6),('S.L. Benfica',45,7),('S.L. Benfica',47,8),('Tiger Woods',49,9),('SC Braga',51,10),('S.L. Benfica',53,11),('FC Porto',57,11),('Sporting CP',61,11),('FC Porto',65,12),('S.L. Benfica',69,12),('Sporting CP',73,12),('Real Madrid C.F.',77,13),('S.L. Benfica',79,13),('FC Porto',81,13),('Juventus F.C.',83,13),('S.C. Braga',85,13),('Sporting CP',87,13),('Manchester City F.C.',89,13),('Cleveland Cavaliers',91,14),('Roger Federer',93,15),('New York Yankees',95,16),('S.L. Benfica',97,17),('S.L. Benfica',99,18),('Tiger Woods',101,19),('SC Braga',103,20);
/*!40000 ALTER TABLE `Team` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User`
--

DROP TABLE IF EXISTS `User`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `User` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `PaymentMethodID` int(10) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `RegistrationDate` date DEFAULT NULL,
  `DefaultNotificationType` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKUser152339` (`PaymentMethodID`),
  CONSTRAINT `FKUser152339` FOREIGN KEY (`PaymentMethodID`) REFERENCES `PaymentMethod` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `User` WRITE;
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
/*!40000 ALTER TABLE `User` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-28 18:11:44
