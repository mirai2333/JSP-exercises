-- MySQL dump 10.13  Distrib 5.7.20, for Win64 (x86_64)
--
-- Host: localhost    Database: serviceold
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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `admName` varchar(20) NOT NULL,
  `admPassword` varchar(20) NOT NULL,
  PRIMARY KEY (`admName`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('admin','admin'),('mirai','y973593589'),('yaolu','y675430411');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `oldman`
--

DROP TABLE IF EXISTS `oldman`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `oldman` (
  `OMid` int(11) NOT NULL,
  `OMname` varchar(20) NOT NULL,
  `OMsex` varchar(10) NOT NULL,
  `OMidNum` varchar(20) NOT NULL,
  `OMhome` varchar(20) NOT NULL,
  `OMaddr` varchar(45) NOT NULL,
  `OMtel1` varchar(20) NOT NULL,
  `OMtel2` varchar(20) NOT NULL,
  `OMsort` varchar(20) NOT NULL,
  PRIMARY KEY (`OMid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oldman`
--

LOCK TABLES `oldman` WRITE;
/*!40000 ALTER TABLE `oldman` DISABLE KEYS */;
INSERT INTO `oldman` VALUES (10800001,'张三','男','7888866561235','北京','北京','18888888888','18888888888','收费'),(10800002,'樊志铭','男','544879888456213546','北京','北京','54687777777','15544446666','收费'),(10800003,'董泽','男','875454523','士大夫','拉斯达克警方','顺利打开房','数量的','免费');
/*!40000 ALTER TABLE `oldman` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servlist`
--

DROP TABLE IF EXISTS `servlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servlist` (
  `SLid` varchar(20) NOT NULL,
  `SRname` varchar(20) DEFAULT NULL,
  `SLstartTime` varchar(20) DEFAULT NULL,
  `SLcloseTime` varchar(20) DEFAULT NULL,
  `OMname` varchar(20) DEFAULT NULL,
  `SLcontent` varchar(20) DEFAULT NULL,
  `SLfee` int(11) DEFAULT NULL,
  `SLfeeOk` varchar(20) DEFAULT NULL,
  `SLlevel` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`SLid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servlist`
--

LOCK TABLES `servlist` WRITE;
/*!40000 ALTER TABLE `servlist` DISABLE KEYS */;
INSERT INTO `servlist` VALUES ('2018011901','赵旭东','20180121','20191212','赵旭东','无',6000,'已缴','良好'),('2018011902','赵旭东','20180204','','','',588,'已缴','一般'),('2018011903','赵旭东','20180209','20191212','赵旭东','无',5000,'已缴','一般');
/*!40000 ALTER TABLE `servlist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `socialer`
--

DROP TABLE IF EXISTS `socialer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `socialer` (
  `SRid` varchar(20) NOT NULL,
  `SRname` varchar(20) DEFAULT NULL,
  `SRsex` varchar(20) DEFAULT NULL,
  `SRidNum` varchar(20) DEFAULT NULL,
  `SRhome` varchar(20) DEFAULT NULL,
  `SRaddr` varchar(20) DEFAULT NULL,
  `SRtel` varchar(20) DEFAULT NULL,
  `SRsort` varchar(20) DEFAULT NULL,
  `SRsalary` int(11) DEFAULT NULL,
  `SRstarDate` varchar(20) DEFAULT NULL,
  `SRlevel` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`SRid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socialer`
--

LOCK TABLES `socialer` WRITE;
/*!40000 ALTER TABLE `socialer` DISABLE KEYS */;
INSERT INTO `socialer` VALUES ('1','赵旭东','男','6','广州','广州','null','社工',20000,'20180116','5'),('2','董泽','男','43456','反对个','地方阿三','null','社工',564,'20180209','5');
/*!40000 ALTER TABLE `socialer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-18  9:58:57
