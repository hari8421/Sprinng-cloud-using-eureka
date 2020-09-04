-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hotel_db
-- ------------------------------------------------------
-- Server version	5.7.28-log

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

--
-- Table structure for table `guest`
--

DROP TABLE IF EXISTS `guest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guest` (
  `guest_id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `member_code` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone_no` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`guest_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guest`
--

LOCK TABLES `guest` WRITE;
/*!40000 ALTER TABLE `guest` DISABLE KEYS */;
INSERT INTO `guest` VALUES (2,'Kerala','UST','abc@gmail.com','ABC','Hari','9207602850'),(6,'dsc','wcw','abc@gmail.com','edb','ewb','9207602850'),(8,'dsc','wcw','abc@gmail.com','edb','ewb','9207602850'),(9,'hasg','gg','abc@gmail.com','kjsbhd','uyuy','9207602850'),(10,'hasg','gg','abc@gmail.com','kjsbhd','uyuy','9207602850'),(12,'dsc','wcw','abc@gmail.com','edb','ewb','9207602850'),(14,'dsc','wcw','abc@gmail.com','edb','ewb','9207602850'),(16,'dsc','wcw','abc@gmail.com','edb','ewb','9207602850');
/*!40000 ALTER TABLE `guest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guest_list`
--

DROP TABLE IF EXISTS `guest_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guest_list` (
  `guest_id` bigint(20) NOT NULL,
  `reservation_id` bigint(20) NOT NULL,
  PRIMARY KEY (`guest_id`,`reservation_id`),
  KEY `FKlbsuy4wsf21w0bbo95f53fpw9` (`reservation_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guest_list`
--

LOCK TABLES `guest_list` WRITE;
/*!40000 ALTER TABLE `guest_list` DISABLE KEYS */;
INSERT INTO `guest_list` VALUES (3,2),(4,2),(5,6),(7,8),(11,12),(13,14),(15,16);
/*!40000 ALTER TABLE `guest_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (17),(17),(17);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room` (
  `room_id` bigint(20) NOT NULL,
  `building_no` bigint(20) DEFAULT NULL,
  `floor_no` bigint(20) DEFAULT NULL,
  `is_occupied` int(11) DEFAULT NULL,
  `room_type_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`room_id`),
  KEY `FKd468eq7j1cbue8mk20qfrj5et` (`room_type_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (100,12,12,0,'100'),(101,10,1,0,'100'),(102,10,1,0,'100');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room_sequence`
--

DROP TABLE IF EXISTS `room_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room_sequence`
--

LOCK TABLES `room_sequence` WRITE;
/*!40000 ALTER TABLE `room_sequence` DISABLE KEYS */;
INSERT INTO `room_sequence` VALUES (103);
/*!40000 ALTER TABLE `room_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room_type`
--

DROP TABLE IF EXISTS `room_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room_type` (
  `room_type_id` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `extra_adults` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `no_of_adults` int(11) DEFAULT NULL,
  `no_of_children` int(11) DEFAULT NULL,
  `single_price` decimal(19,2) DEFAULT NULL,
  `standard_price` decimal(19,2) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`room_type_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room_type`
--

LOCK TABLES `room_type` WRITE;
/*!40000 ALTER TABLE `room_type` DISABLE KEYS */;
INSERT INTO `room_type` VALUES (100,'Premium',1,'Premium',2,2,1500.00,1000.00,'1');
/*!40000 ALTER TABLE `room_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rservation`
--

DROP TABLE IF EXISTS `rservation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rservation` (
  `reservation_id` bigint(20) NOT NULL,
  `building_no` bigint(20) DEFAULT NULL,
  `check_in` varchar(255) DEFAULT NULL,
  `check_out` varchar(255) DEFAULT NULL,
  `floor_no` bigint(20) DEFAULT NULL,
  `no_of_adults` int(11) DEFAULT NULL,
  `no_of_children` int(11) DEFAULT NULL,
  `no_of_nights` int(11) DEFAULT NULL,
  `room_id` bigint(20) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`reservation_id`),
  KEY `FK8or2k6rtodbdsd8ajf0929wq2` (`room_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rservation`
--

LOCK TABLES `rservation` WRITE;
/*!40000 ALTER TABLE `rservation` DISABLE KEYS */;
INSERT INTO `rservation` VALUES (1,1,'asfdasf','asf',100,2,2,1,100,'1'),(3,NULL,'10/10/2020','11/10/2020',NULL,2,1,1,100,'1'),(4,NULL,'10/10/2020','11/10/2020',NULL,2,1,1,100,'1'),(5,NULL,'21/10/2020','22/10/2020',NULL,2,1,1,100,'1'),(7,NULL,'21/10/2020','22/10/2020',NULL,2,1,1,100,'1'),(11,NULL,'21/10/2020','22/10/2020',NULL,2,1,1,100,'1'),(13,NULL,'21/10/2020','23/10/2020',NULL,2,1,1,100,'1'),(15,NULL,'21/10/2020','23/10/2020',NULL,2,1,1,100,'1');
/*!40000 ALTER TABLE `rservation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `user_role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (100,'asdaf','0','Hari','Manager'),(101,'asdaf','1','Hari','Manager');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_sequence`
--

DROP TABLE IF EXISTS `user_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_sequence`
--

LOCK TABLES `user_sequence` WRITE;
/*!40000 ALTER TABLE `user_sequence` DISABLE KEYS */;
INSERT INTO `user_sequence` VALUES (102);
/*!40000 ALTER TABLE `user_sequence` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-04 22:17:05
