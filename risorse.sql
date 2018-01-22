CREATE DATABASE  IF NOT EXISTS `risorse` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `risorse`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: risorse
-- ------------------------------------------------------
-- Server version	5.7.20-log

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
-- Table structure for table `employement`
--

DROP TABLE IF EXISTS `employement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employement` (
  `id_r` int(11) NOT NULL,
  `id_p` int(11) NOT NULL,
  PRIMARY KEY (`id_r`,`id_p`),
  KEY `id_idx` (`id_p`),
  CONSTRAINT `id` FOREIGN KEY (`id_p`) REFERENCES `project` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employement`
--

LOCK TABLES `employement` WRITE;
/*!40000 ALTER TABLE `employement` DISABLE KEYS */;
/*!40000 ALTER TABLE `employement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `project` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name_project` varchar(45) DEFAULT NULL,
  `start_project` date DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `nsenior` varchar(45) DEFAULT NULL,
  `njunior` varchar(45) DEFAULT NULL,
  `deadline` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resources`
--

DROP TABLE IF EXISTS `resources`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resources` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cognome` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `assunzione` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resources`
--

LOCK TABLES `resources` WRITE;
/*!40000 ALTER TABLE `resources` DISABLE KEYS */;
INSERT INTO `resources` VALUES (1,'Boi','Luca','Cyber Security',NULL),(2,'Boi','Luca','Cyber Security',NULL),(3,'Boi','Luca','Cyber Security',NULL),(4,'Boi','Luca','Cyber Security',NULL),(5,'Boi','Luca','Cyber Security',NULL),(6,'caredda','mauro','junior',NULL),(7,'Artizu','Marco','junior',NULL),(8,'arzu','lucia','Senior',NULL),(9,'Orru','Marco','Senior',NULL),(10,'Orru','Marco','Senior',NULL),(11,'caredda','mauro','senior',NULL),(12,'Sesselego','Matteo','CyberBoy',NULL),(13,'Lobina','Jessica','Senior master girl ass',NULL),(14,'Lobina','Jessica','Senior',NULL),(15,'caredda','mauro','junior',NULL),(16,'Boi','Luca','Cyber Security',NULL),(17,'Boi','Mauro','dev',NULL),(18,'Boi','Mauro','dev',NULL),(19,'Boi','Mauro','dev',NULL),(20,'Boi','Mauro','dev',NULL),(21,'Boi','Mauro','dev',NULL),(22,'Boi','Mauro','dev',NULL),(23,'Boi','Mauro','dev',NULL),(24,'Boi','Mauro','dev',NULL),(25,'Boi','Mauro','dev',NULL),(26,'Boi','Mauro','dev',NULL),(27,'Boi','Mauro','dev','1973-11-26'),(28,'Cabras','Matteo','junior','2018-01-12');
/*!40000 ALTER TABLE `resources` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-15  9:51:30
