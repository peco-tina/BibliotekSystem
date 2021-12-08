-- MySQL dump 10.13  Distrib 8.0.15, for macos10.14 (x86_64)
--
-- Host: 127.0.0.1    Database: bibliotek1
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `anvandare`
--

DROP TABLE IF EXISTS `anvandare`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `anvandare` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `namn` varchar(45) NOT NULL,
  `losenord` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `adress` varchar(45) NOT NULL,
  `mobilnummer` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anvandare`
--

LOCK TABLES `anvandare` WRITE;
/*!40000 ALTER TABLE `anvandare` DISABLE KEYS */;
INSERT INTO `anvandare` VALUES (1,'aaa','bbb','sssss','dfddddd','0909009'),(7,'bbbb','bbbb','bbbb','bbbb','0000'),(8,'xxx','xxx','xxx','xxx','111');
/*!40000 ALTER TABLE `anvandare` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `media`
--

DROP TABLE IF EXISTS `media`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `media` (
  `MediaId` int(11) NOT NULL AUTO_INCREMENT,
  `namn` varchar(45) DEFAULT NULL,
  `år` varchar(45) DEFAULT NULL,
  `genre` varchar(45) DEFAULT NULL,
  `författare` varchar(45) DEFAULT NULL,
  `antal` int(11) DEFAULT NULL,
  PRIMARY KEY (`MediaId`)
) ENGINE=InnoDB AUTO_INCREMENT=1007 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `media`
--

LOCK TABLES `media` WRITE;
/*!40000 ALTER TABLE `media` DISABLE KEYS */;
INSERT INTO `media` VALUES (999,'zzz','1','qqq','bbbb',14),(1000,'qqq','1','aaa','sss',0),(1001,'bbb','999','zzz','zzz',1),(1002,'ppp','000','ppp','ppp',11),(1003,'vvv','000','ccc','ccc',1),(1006,'mmm','000','mmm','mmm',10000000);
/*!40000 ALTER TABLE `media` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utlanad`
--

DROP TABLE IF EXISTS `utlanad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `utlanad` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `MediaId` varchar(45) DEFAULT NULL,
  `användarnamn` varchar(45) DEFAULT NULL,
  `LånaDatum` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `nästa_förfall` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utlanad`
--

LOCK TABLES `utlanad` WRITE;
/*!40000 ALTER TABLE `utlanad` DISABLE KEYS */;
INSERT INTO `utlanad` VALUES (28,'ID','','2019-09-20 15:52:30',NULL),(29,'ID','','2019-09-20 15:52:34',NULL),(32,'ID','','2019-09-20 16:17:58',NULL),(34,'ID','','2019-09-21 07:25:02','2019-09-28 07:25:02'),(35,'ID','','2019-09-21 07:25:10','2019-09-28 07:25:10'),(36,'ID','','2019-09-21 07:25:13','2019-09-28 07:25:13'),(37,'ID','','2019-09-21 07:25:24','2019-09-28 07:25:24'),(38,'1000','','2019-09-21 07:25:30','2019-09-28 07:25:30'),(39,'ID','','2019-09-21 07:26:55','2019-09-28 07:26:55'),(40,'1001','','2019-09-21 07:27:02','2019-09-28 07:27:02'),(41,'1005','aaa','2019-09-21 09:09:14','2019-09-17 07:27:10');
/*!40000 ALTER TABLE `utlanad` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `utlanad_BEFORE_INSERT` BEFORE INSERT ON `utlanad` FOR EACH ROW BEGIN
SET NEW.nästa_förfall = date_add(NEW.LånaDatum, INTERVAL 7 DAY);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Dumping events for database 'bibliotek1'
--

--
-- Dumping routines for database 'bibliotek1'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-21 17:51:53
