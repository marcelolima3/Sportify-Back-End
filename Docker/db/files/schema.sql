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
  `ImgUrl` varchar(255) DEFAULT NULL,
  `SubscriptionEntityID` int(10) NOT NULL,
  `TeamSubscriptionEntityID` int(10) DEFAULT NULL,
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
INSERT INTO `Athlete` VALUES ('António Sá','Portuguese','Male',NULL,2,1),('José Pedro','Portuguese','Male',NULL,3,1),('Manuel Pereira','Portuguese','Male',NULL,4,1),('Ana Miranda','Portuguese','Female',NULL,6,5),('Carlos Rocha','Portuguese','Male',NULL,7,5),('Maria Peixoto','Portuguese','Female',NULL,8,5),('Luísa Rocha','Portuguese','Female',NULL,10,9),('Maria Silva','Portuguese','Female',NULL,11,9),('João Pereira','Portuguese','Male',NULL,12,9),('João Sá','Portuguese','Male',NULL,14,13),('Manuel Ferreira','Portuguese','Male',NULL,15,13),('Bruno Pedro','Portuguese','Male',NULL,16,13),('Teresa Rocha','Portuguese','Female',NULL,18,17),('Luís António','Portuguese','Male',NULL,19,17),('Mariana Silva','Portuguese','Female',NULL,20,17),('Maria Pires','Portuguese','Female',NULL,22,21),('Carlos Costa','Portuguese','Male',NULL,23,21),('Ana Guedes','Portuguese','Female',NULL,24,21),('Fábio Coentão','Portuguese','Male',NULL,26,25),('David Silva','Spanish','Male',NULL,28,27),('Cristiano Ronaldo','Portuguese','Male',NULL,30,29),('Paulinho','Portuguese','Male',NULL,32,31),('Herrera','Mexican','Male',NULL,34,33),('Luisão','Brazilian','Male',NULL,36,35),('Buffon','Italian','Male',NULL,38,37),('LeBron James','American','Male',NULL,40,39),('Roger Federer','Swiss','Male',NULL,42,41),('Aaron Judge','American','Male',NULL,44,43),('Rui Costa','Portuguese','Male',NULL,46,45),('Miroslav','Bulgarian','Male',NULL,48,47),('Tiger Woods','American','Male',NULL,50,49),('Rúben Vieira','Portuguese','Male',NULL,52,51);
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
  `Name` varchar(255) DEFAULT NULL,
  `RegularPrice` double DEFAULT NULL,
  `ExtraPrice` double NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EventCategory`
--

LOCK TABLES `EventCategory` WRITE;
/*!40000 ALTER TABLE `EventCategory` DISABLE KEYS */;
INSERT INTO `EventCategory` VALUES (1,'After Match',0.2,2),(2,'Before Match',0.2,2),(3,'Results',0.2,2),(4,'Personal Record',0.2,2),(5,'Fault',0.2,2),(6,'Goal',0.2,2);
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
INSERT INTO `InvoicePayment` VALUES (10,1),(10,2),(10,3);
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
  `ImgUrl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKModality97613` (`SportID`),
  CONSTRAINT `FKModality97613` FOREIGN KEY (`SportID`) REFERENCES `Sport` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Modality`
--

LOCK TABLES `Modality` WRITE;
/*!40000 ALTER TABLE `Modality` DISABLE KEYS */;
INSERT INTO `Modality` VALUES (1,1,'Sprint',NULL),(2,1,'Hurdling',NULL),(3,2,'Football',NULL),(4,3,'Basketball',NULL),(5,4,'Tennis',NULL),(6,5,'Baseball',NULL),(7,6,'Cycling',NULL),(8,7,'Volleyball',NULL),(9,8,'Golf',NULL),(10,9,'Badminton',NULL);
/*!40000 ALTER TABLE `Modality` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Modality_EventCategory`
--

DROP TABLE IF EXISTS `Modality_EventCategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Modality_EventCategory` (
  `ModalityID` int(10) NOT NULL,
  `EventCategoryID` int(10) NOT NULL,
  PRIMARY KEY (`ModalityID`,`EventCategoryID`),
  KEY `FKModality_E862695` (`EventCategoryID`),
  CONSTRAINT `FKModality_E862695` FOREIGN KEY (`EventCategoryID`) REFERENCES `EventCategory` (`ID`),
  CONSTRAINT `FKModality_E924197` FOREIGN KEY (`ModalityID`) REFERENCES `Modality` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Modality_EventCategory`
--

LOCK TABLES `Modality_EventCategory` WRITE;
/*!40000 ALTER TABLE `Modality_EventCategory` DISABLE KEYS */;
INSERT INTO `Modality_EventCategory` VALUES (1,1),(1,2),(3,2),(1,3),(3,3),(1,4),(3,5),(3,6);
/*!40000 ALTER TABLE `Modality_EventCategory` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PaymentMethod`
--

LOCK TABLES `PaymentMethod` WRITE;
/*!40000 ALTER TABLE `PaymentMethod` DISABLE KEYS */;
INSERT INTO `PaymentMethod` VALUES (1),(2),(3);
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
  `ImgUrl` varchar(255) DEFAULT NULL,
  `OnlySport` tinyint(1) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Sport`
--

LOCK TABLES `Sport` WRITE;
/*!40000 ALTER TABLE `Sport` DISABLE KEYS */;
INSERT INTO `Sport` VALUES (1,'Athletics',NULL,0),(2,'Football',NULL,0),(3,'Basketball',NULL,0),(4,'Tennis',NULL,0),(5,'Baseball',NULL,0),(6,'Cycling',NULL,0),(7,'Volleyball',NULL,0),(8,'Golf',NULL,0),(9,'Badminton',NULL,0);
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
  `InvoiceID` int(10) DEFAULT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SubscriptionEntity`
--

LOCK TABLES `SubscriptionEntity` WRITE;
/*!40000 ALTER TABLE `SubscriptionEntity` DISABLE KEYS */;
INSERT INTO `SubscriptionEntity` VALUES (1),(2),(3),(4),(5),(6),(7),(8),(9),(10),(11),(12),(13),(14),(15),(16),(17),(18),(19),(20),(21),(22),(23),(24),(25),(26),(27),(28),(29),(30),(31),(32),(33),(34),(35),(36),(37),(38),(39),(40),(41),(42),(43),(44),(45),(46),(47),(48),(49),(50),(51),(52);
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
  `ImgUrl` varchar(255) DEFAULT NULL,
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
INSERT INTO `Team` VALUES ('Sporting CP','img',1,1),('FC Porto','img',5,1),('S.L. Benfica','img',9,1),('Sporting CP','img',13,2),('S.L. Benfica','img',17,2),('FC Porto','img',21,2),('Sporting CP','img',25,3),('Manchester City F.C.','img',27,3),('Real Madrid C.F.','img',29,3),('S.C. Braga','img',31,3),('FC Porto','img',33,3),('S.L. Benfica','img',35,3),('Juventus F.C.','img',37,3),('Cleveland Cavaliers','img',39,4),('Roger Federer','img',41,5),('New York Yankees','img',43,6),('S.L. Benfica','img',45,7),('S.L. Benfica','img',47,8),('Tiger Woods','img',49,9),('SC Braga','img',51,10);
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `User` WRITE;
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
INSERT INTO `User` VALUES (1,1,'Dinis','mail3@gmail.com','root','2018-06-29',NULL),(2,2,'Dinis P','mail1232@mail.com','root','2018-06-29','essa mesmo'),(3,3,'Dinis F','mail12@mail.com','root','2018-06-29','essa mesmo');
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

-- Dump completed on 2018-06-29 14:08:32
