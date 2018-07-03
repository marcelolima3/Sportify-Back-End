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
INSERT INTO `Athlete` VALUES ('José Pedro','Portuguese','Male','https://image.flaticon.com/icons/svg/166/166362.svg',2,13),('Carlos Rocha','Portuguese','Male','https://image.flaticon.com/icons/svg/166/166362.svg',3,12),('João Pereira','Portuguese','Male','https://image.flaticon.com/icons/svg/166/166362.svg',4,14),('António Sá','Portuguese','Male','https://image.flaticon.com/icons/svg/166/166362.svg',5,13),('Manuel Pereira','Portuguese','Male','https://image.flaticon.com/icons/svg/166/166362.svg',6,13),('Maria Silva','Portuguese','Female','https://image.flaticon.com/icons/svg/166/166357.svg',8,14),('Luísa Rocha','Portuguese','Female','https://image.flaticon.com/icons/svg/166/166357.svg',9,14),('Ana Miranda','Portuguese','Female','https://image.flaticon.com/icons/svg/166/166357.svg',10,12),('Maria Peixoto','Portuguese','Female','https://image.flaticon.com/icons/svg/166/166357.svg',11,12),('Manuel Ferreira','Portuguese','Male','https://image.flaticon.com/icons/svg/166/166362.svg',16,28),('João Sá','Portuguese','Male','https://image.flaticon.com/icons/svg/166/166362.svg',17,28),('Luís António','Portuguese','Male','https://image.flaticon.com/icons/svg/166/166362.svg',18,26),('Carlos Costa','Portuguese','Male','https://image.flaticon.com/icons/svg/166/166362.svg',19,27),('Bruno Pedro','Portuguese','Male','https://image.flaticon.com/icons/svg/166/166362.svg',20,28),('Mariana Silva','Portuguese','Female','https://image.flaticon.com/icons/svg/166/166357.svg',22,26),('Teresa Rocha','Portuguese','Female','https://image.flaticon.com/icons/svg/166/166357.svg',23,26),('Maria Pires','Portuguese','Female','https://image.flaticon.com/icons/svg/166/166357.svg',24,27),('Ana Guedes','Portuguese','Female','https://image.flaticon.com/icons/svg/166/166357.svg',25,27),('Luisão','Brazilian','Male','https://image.flaticon.com/icons/svg/166/166344.svg',30,41),('Herrera','Mexican','Male','https://image.flaticon.com/icons/svg/166/166344.svg',31,40),('Paulinho','Portuguese','Male','https://image.flaticon.com/icons/svg/166/166344.svg',33,42),('Fábio Coentão','Portuguese','Male','https://image.flaticon.com/icons/svg/166/166344.svg',34,44),('David Silva','Spanish','Male','https://image.flaticon.com/icons/svg/166/166344.svg',36,43),('Buffon','Italian','Male','https://image.flaticon.com/icons/svg/166/166344.svg',38,45),('Cristiano Ronaldo','Portuguese','Male','https://image.flaticon.com/icons/svg/166/166344.svg',39,46),('Zach LaVine','American','Male','https://image.flaticon.com/icons/svg/166/166355.svg',48,50),('LeBron James','American','Male','https://image.flaticon.com/icons/svg/166/166355.svg',49,51),('Roger Federer','Swiss','Male','https://image.flaticon.com/icons/svg/166/166368.svg',53,55),('Novak Djokovic','Serbia','Male','https://image.flaticon.com/icons/svg/166/166368.svg',54,56),('Aaron Judge','American','Male','https://image.flaticon.com/icons/svg/166/166366.svg',58,60),('Joe Mauer','American','Male','https://image.flaticon.com/icons/svg/166/166366.svg',59,61),('Rui Costa','Portuguese','Male','https://image.flaticon.com/icons/svg/166/166346.svg',63,65),('Antonio Carvalho','Portuguese','Male','https://image.flaticon.com/icons/svg/166/166346.svg',64,66),('Miroslav','Bulgarian','Male','https://image.flaticon.com/icons/svg/166/166344.svg',68,70),('Rui Almeida','Portuguese','Male','https://image.flaticon.com/icons/svg/166/166344.svg',69,71),('Brooks Koepka','American','Male','https://image.flaticon.com/icons/svg/166/166353.svg',73,76),('Tiger Woods','American','Male','https://image.flaticon.com/icons/svg/166/166353.svg',74,75),('Rúben Vieira','Portuguese','Male','https://image.flaticon.com/icons/svg/166/166368.svg',78,81),('Lin Dan','Chinese','Male','https://image.flaticon.com/icons/svg/166/166368.svg',79,80);
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
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Competition`
--

LOCK TABLES `Competition` WRITE;
/*!40000 ALTER TABLE `Competition` DISABLE KEYS */;
INSERT INTO `Competition` VALUES (1,1,'European Athletics Championships 100m Sprint Men','France','3918-08-01','3918-08-10','100m Sprint Men',1),(2,1,'European Athletics Championships 100m Sprint Women','France','3918-08-01','3918-08-10','100m Sprint Women',1),(3,2,'European Athletics Championships 200m Hurdles Men','France','3918-08-01','3918-08-10','200m Hurdles Men',1),(4,2,'European Athletics Championships 200m Hurdles Women','France','3918-08-01','3918-08-10','200m Hurdles Women',1),(5,3,'Primeira Liga','Portugal','3917-10-10','3918-09-13','Liga NOS',1),(6,3,'Champions League','Europe','3917-12-01','3918-09-10','Champions League',1),(7,4,'National Basketball Association (NBA)','North America','3917-08-01','3918-08-10','NBA',1),(8,5,'Australian Open','Australia','3918-02-01','3918-03-02','Australian Open Tournament',1),(9,6,'NCAA Baseball Championship','Nebraska','3918-08-05','3918-08-30','NCAA',1),(10,7,'UCI World Tour','Worldwide','3918-08-01','3918-08-10','UCI',1),(11,8,'FIVB Volleyball Challenger Cup - Men','Portugal','3918-10-05','3918-12-10','FIVB Volleyball',1),(12,9,'The Open Championship','United Kingdom','3918-10-10','3919-02-14','The Open Championship',1),(13,10,'World Badminton Grand Prix','Japan','3918-08-01','3918-08-10','World Badminton Grand Prix',1);
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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EventCategory`
--

LOCK TABLES `EventCategory` WRITE;
/*!40000 ALTER TABLE `EventCategory` DISABLE KEYS */;
INSERT INTO `EventCategory` VALUES (1,'Personal Record',0.2,2),(2,'After Match',0.2,2),(3,'Before Match',0.2,2),(4,'Match Record',0.2,2),(5,'Final Result',0.2,2),(6,'Fault',0.2,2),(7,'Score',0.2,2);
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
INSERT INTO `InvoicePayment` VALUES (0,1);
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
INSERT INTO `MatchEvent` VALUES ('100m Sprint Men Finals','2018-07-02','2018-07-02','France',1,1,1),('100m Sprint Women Finals','2018-07-02','2018-07-02','France',1,7,2),('200m Hurdles Men Finals','2018-07-02','2018-07-02','France',1,15,3),('200m Hurdles Women Finals','2018-07-02','2018-07-02','France',1,21,4),('S.L. Benfica vs FC Porto','2018-07-02','2018-07-02','Portugal',1,29,5),('Sporting CP vs S.C. Braga','2018-07-02','2018-07-02','Portugal',1,32,5),('Manchester City vs Benfica','2018-07-02','2018-07-02','England',1,35,6),('Real Madrid vs Juventus','2018-07-02','2018-07-02','Spain',1,37,6),('Cleveland Cavaliers vs Chicago Bulls','2018-07-02','2018-07-02','Ohio',1,47,7),('Roger Federer vs Novak Djokovic','2018-07-02','2018-07-02','Australia',1,52,8),('New York Yankees vs Minnesota Twins','2018-07-02','2018-07-02','New York',1,57,9),('Volta a Catalunha','2018-07-02','2018-07-02','Spain',1,62,10),('S.L. Benfica vs FC Porto','2018-07-02','2018-07-02','Portugal',1,67,11),('Final Day','2018-07-02','2018-07-02','United Kingdom',1,72,12),('Rúben Vieira vs Lin Dan','2018-07-02','2018-07-02','Japan',1,77,13);
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
INSERT INTO `MatchEvent_Athlete` VALUES (1,2),(1,3),(1,4),(1,5),(1,6),(7,8),(7,9),(7,10),(7,11),(15,16),(15,17),(15,18),(15,19),(15,20),(21,22),(21,23),(21,24),(21,25),(29,30),(29,31),(32,33),(32,34),(35,36),(37,38),(37,39),(47,48),(47,49),(52,53),(52,54),(57,58),(57,59),(62,63),(62,64),(67,68),(67,69),(72,73),(72,74),(77,78),(77,79);
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
INSERT INTO `Modality` VALUES (1,1,'Sprint','https://image.flaticon.com/icons/svg/502/502112.svg'),(2,1,'Hurdling','https://image.flaticon.com/icons/svg/674/674729.svg'),(3,2,'Football','https://image.flaticon.com/icons/svg/123/123495.svg'),(4,3,'Basketball','https://image.flaticon.com/icons/svg/123/123520.svg'),(5,4,'Tennis','https://image.flaticon.com/icons/svg/123/123514.svg'),(6,5,'Baseball','https://image.flaticon.com/icons/svg/123/123518.svg'),(7,6,'Cycling','https://image.flaticon.com/icons/svg/123/123505.svg'),(8,7,'Volleyball','https://image.flaticon.com/icons/svg/123/123510.svg'),(9,8,'Golf','https://image.flaticon.com/icons/svg/123/123524.svg'),(10,9,'Badminton','https://image.flaticon.com/icons/svg/123/123509.svg');
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
INSERT INTO `Modality_EventCategory` VALUES (1,1),(2,1),(1,2),(2,2),(1,3),(2,3),(3,3),(4,3),(5,3),(6,3),(7,3),(8,3),(9,3),(10,3),(1,4),(2,4),(3,5),(4,5),(5,5),(6,5),(7,5),(8,5),(9,5),(10,5),(3,6),(4,6),(5,6),(6,6),(7,6),(8,6),(9,6),(10,6),(3,7),(4,7),(5,7),(6,7),(7,7),(8,7),(9,7),(10,7);
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PaymentMethod`
--

LOCK TABLES `PaymentMethod` WRITE;
/*!40000 ALTER TABLE `PaymentMethod` DISABLE KEYS */;
INSERT INTO `PaymentMethod` VALUES (1);
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
INSERT INTO `Sport` VALUES (1,'Athletics','https://image.flaticon.com/icons/svg/123/123500.svg',1),(2,'Football','https://image.flaticon.com/icons/svg/123/123495.svg',0),(3,'Basketball','https://image.flaticon.com/icons/svg/123/123520.svg',0),(4,'Tennis','https://image.flaticon.com/icons/svg/123/123514.svg',0),(5,'Baseball','https://image.flaticon.com/icons/svg/123/123518.svg',0),(6,'Cycling','https://image.flaticon.com/icons/svg/123/123505.svg',0),(7,'Volleyball','https://image.flaticon.com/icons/svg/123/123510.svg',0),(8,'Golf','https://image.flaticon.com/icons/svg/123/123524.svg',0),(9,'Badminton','https://image.flaticon.com/icons/svg/123/123509.svg',0);
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
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SubscriptionEntity`
--

LOCK TABLES `SubscriptionEntity` WRITE;
/*!40000 ALTER TABLE `SubscriptionEntity` DISABLE KEYS */;
INSERT INTO `SubscriptionEntity` VALUES (1),(2),(3),(4),(5),(6),(7),(8),(9),(10),(11),(12),(13),(14),(15),(16),(17),(18),(19),(20),(21),(22),(23),(24),(25),(26),(27),(28),(29),(30),(31),(32),(33),(34),(35),(36),(37),(38),(39),(40),(41),(42),(43),(44),(45),(46),(47),(48),(49),(50),(51),(52),(53),(54),(55),(56),(57),(58),(59),(60),(61),(62),(63),(64),(65),(66),(67),(68),(69),(70),(71),(72),(73),(74),(75),(76),(77),(78),(79),(80),(81);
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
INSERT INTO `Team` VALUES ('FC Porto','https://seeklogo.com/images/F/F_C__Porto-logo-3BB4DAAEA2-seeklogo.com.png',12,1),('Sporting CP','https://seeklogo.com/images/S/sporting-lisbon-sporting-clube-de-portugal-logo-87718592BF-seeklogo.com.png',13,1),('S.L. Benfica','https://seeklogo.com/images/S/sport-lisboa-e-benfica-logo-149703CDAB-seeklogo.com.png',14,1),('S.L. Benfica','https://seeklogo.com/images/S/sport-lisboa-e-benfica-logo-149703CDAB-seeklogo.com.png',26,2),('FC Porto','https://seeklogo.com/images/F/F_C__Porto-logo-3BB4DAAEA2-seeklogo.com.png',27,2),('Sporting CP','https://seeklogo.com/images/S/sporting-lisbon-sporting-clube-de-portugal-logo-87718592BF-seeklogo.com.png',28,2),('FC Porto','https://seeklogo.com/images/F/F_C__Porto-logo-3BB4DAAEA2-seeklogo.com.png',40,3),('S.L. Benfica','https://seeklogo.com/images/S/sport-lisboa-e-benfica-logo-149703CDAB-seeklogo.com.png',41,3),('S.C. Braga','https://seeklogo.com/images/S/Sporting_Clube_de_Braga-logo-3E6C00F285-seeklogo.com.png',42,3),('Manchester City F.C.','https://seeklogo.com/images/M/manchester-city-fc-new-logo-4C45133019-seeklogo.com.png',43,3),('Sporting CP','https://seeklogo.com/images/S/sporting-lisbon-sporting-clube-de-portugal-logo-87718592BF-seeklogo.com.png',44,3),('Juventus F.C.','https://seeklogo.com/images/J/juventus-2017-new-logo-40FBF543AF-seeklogo.com.png',45,3),('Real Madrid C.F.','https://www.freeiconspng.com/uploads/real-madrid-logo-png-32.png',46,3),('Chicago Bulls','https://seeklogo.com/images/C/chicago-bulls-logo-9FCA01BE25-seeklogo.com.png',50,4),('Cleveland Cavaliers','https://seeklogo.com/images/C/cleveland-cavaliers-logo-B89008E8AA-seeklogo.com.png',51,4),('Roger Federer','https://seeklogo.com/images/R/roger-federer-logo-F69633952B-seeklogo.com.png',55,5),('Novak Djokovic','https://seeklogo.com/images/N/novak-djokovic-logo-0197066303-seeklogo.com.png',56,5),('New York Yankees','https://seeklogo.com/images/N/new-york-yankees-logo-766DC138B6-seeklogo.com.png',60,6),('Minnesota Twins','https://seeklogo.com/images/M/minnesota-twins-logo-8D8910AF17-seeklogo.com.png',61,6),('S.L. Benfica','https://seeklogo.com/images/S/sport-lisboa-e-benfica-logo-149703CDAB-seeklogo.com.png',65,7),('FC Porto','https://seeklogo.com/images/F/F_C__Porto-logo-3BB4DAAEA2-seeklogo.com.png',66,7),('S.L. Benfica','https://seeklogo.com/images/S/sport-lisboa-e-benfica-logo-149703CDAB-seeklogo.com.png',70,8),('FC Porto','https://seeklogo.com/images/F/F_C__Porto-logo-3BB4DAAEA2-seeklogo.com.png',71,8),('Tiger Woods','https://seeklogo.com/images/T/Tiger_Woods-logo-34FB839F89-seeklogo.com.png',75,9),('Brooks Koepka','https://seeklogo.com/images/B/Brooks-logo-BE9048B4D9-seeklogo.com.png',76,9),('Lin Dan','https://seeklogo.com/images/L/LIN_TV-logo-2B29416CBC-seeklogo.com.gif',80,10),('SC Braga','https://seeklogo.com/images/S/Sporting_Clube_de_Braga-logo-3E6C00F285-seeklogo.com.png',81,10);
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
  `IsManager` tinyint(1) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKUser152339` (`PaymentMethodID`),
  CONSTRAINT `FKUser152339` FOREIGN KEY (`PaymentMethodID`) REFERENCES `PaymentMethod` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `User` WRITE;
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
INSERT INTO `User` VALUES (1,1,'Dinis','mail3@gmail.com','root','2018-07-02','default',0);
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

-- Dump completed on 2018-07-03  0:38:02
