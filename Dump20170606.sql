-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: cadi
-- ------------------------------------------------------
-- Server version	5.5.51-log

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
-- Table structure for table `actividad`
--

DROP TABLE IF EXISTS `actividad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `actividad` (
  `idActividad` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `descripcion` varchar(250) DEFAULT NULL,
  `cupo` varchar(2) DEFAULT NULL,
  `fechaActividad` datetime DEFAULT NULL,
  `idAsesor` varchar(3) DEFAULT NULL,
  `horaInicio` time DEFAULT NULL,
  `horaFin` time DEFAULT NULL,
  `numeroArea` varchar(3) DEFAULT NULL,
  `idCurso` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`idActividad`),
  KEY `idAsesor` (`idAsesor`),
  KEY `numeroArea` (`numeroArea`),
  KEY `idCurso` (`idCurso`),
  CONSTRAINT `actividad_ibfk_1` FOREIGN KEY (`idAsesor`) REFERENCES `asesor` (`idAsesor`),
  CONSTRAINT `actividad_ibfk_2` FOREIGN KEY (`numeroArea`) REFERENCES `area` (`numeroArea`),
  CONSTRAINT `actividad_ibfk_3` FOREIGN KEY (`idCurso`) REFERENCES `curso` (`idCurso`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `actividad`
--

LOCK TABLES `actividad` WRITE;
/*!40000 ALTER TABLE `actividad` DISABLE KEYS */;
INSERT INTO `actividad` VALUES (2,'lectura grupal','El alumno participara en una lectura grupal para mejorar su audicion y habilidad oral','10','2017-06-09 13:00:00','800','13:00:00','15:00:00','2','1000'),(3,'Conociendo la cultura de Francia I','El alumno conocera la cultura de la zona sur de Francia','20','2017-06-08 11:00:00','800','11:00:00','13:00:00','1','1001'),(4,'Tradiciones de Estados Unidos','El alumno conocera tradiciones llevadas a cabo en EUA','15','2017-06-08 11:00:00','801','11:00:00','13:00:00','1','1000');
/*!40000 ALTER TABLE `actividad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alumno` (
  `matricula` varchar(10) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellidoPaterno` varchar(50) DEFAULT NULL,
  `apellidoMaterno` varchar(50) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `idUsuario` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`matricula`),
  KEY `idUsuario` (`idUsuario`),
  CONSTRAINT `alumno_ibfk_1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno`
--

LOCK TABLES `alumno` WRITE;
/*!40000 ALTER TABLE `alumno` DISABLE KEYS */;
INSERT INTO `alumno` VALUES ('zS15011617','jesus enrique','flores','nestozo','9212007093','enrique.flores093@gmail.com','100');
/*!40000 ALTER TABLE `alumno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `area`
--

DROP TABLE IF EXISTS `area`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `area` (
  `numeroArea` varchar(3) NOT NULL,
  `capacidad` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`numeroArea`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `area`
--

LOCK TABLES `area` WRITE;
/*!40000 ALTER TABLE `area` DISABLE KEYS */;
INSERT INTO `area` VALUES ('1','20'),('2','15'),('3','25');
/*!40000 ALTER TABLE `area` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asesor`
--

DROP TABLE IF EXISTS `asesor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `asesor` (
  `idAsesor` varchar(3) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellidoP` varchar(50) DEFAULT NULL,
  `apellidoM` varchar(50) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `idUsuario` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`idAsesor`),
  KEY `idUsuario` (`idUsuario`),
  CONSTRAINT `asesor_ibfk_1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asesor`
--

LOCK TABLES `asesor` WRITE;
/*!40000 ALTER TABLE `asesor` DISABLE KEYS */;
INSERT INTO `asesor` VALUES ('800','Fernando','Guzman','Aja','2283138361','fe_asesor@gmail.com','500'),('801','Carlos','Olivo','Villalobos','2282125432','c_olivo@gmail.com','501');
/*!40000 ALTER TABLE `asesor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curso`
--

DROP TABLE IF EXISTS `curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `curso` (
  `idCurso` varchar(4) NOT NULL,
  `nombre` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`idCurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` VALUES ('1000','InglesIV'),('1001','FrancesI');
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inscripcion`
--

DROP TABLE IF EXISTS `inscripcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inscripcion` (
  `idInscripcio` varchar(6) NOT NULL,
  `fechaInscripcion` datetime DEFAULT NULL,
  `estado` varchar(1) DEFAULT NULL,
  `calificacionFinal` varchar(3) DEFAULT NULL,
  `matricula` varchar(10) DEFAULT NULL,
  `nrc` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`idInscripcio`),
  KEY `matricula` (`matricula`),
  KEY `nrc` (`nrc`),
  CONSTRAINT `inscripcion_ibfk_1` FOREIGN KEY (`matricula`) REFERENCES `alumno` (`matricula`),
  CONSTRAINT `inscripcion_ibfk_2` FOREIGN KEY (`nrc`) REFERENCES `seccion` (`nrc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inscripcion`
--

LOCK TABLES `inscripcion` WRITE;
/*!40000 ALTER TABLE `inscripcion` DISABLE KEYS */;
INSERT INTO `inscripcion` VALUES ('300000','2017-01-10 16:00:00','1',NULL,'zS15011617','34100');
/*!40000 ALTER TABLE `inscripcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservacion`
--

DROP TABLE IF EXISTS `reservacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservacion` (
  `idReservacion` int(11) NOT NULL AUTO_INCREMENT,
  `fechaReservacion` datetime DEFAULT NULL,
  `matricula` varchar(10) DEFAULT NULL,
  `idActividad` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`idReservacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservacion`
--

LOCK TABLES `reservacion` WRITE;
/*!40000 ALTER TABLE `reservacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seccion`
--

DROP TABLE IF EXISTS `seccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `seccion` (
  `nrc` varchar(5) NOT NULL,
  `nombre` varchar(40) DEFAULT NULL,
  `periodoInicio` varchar(3) DEFAULT NULL,
  `periodoFin` varchar(3) DEFAULT NULL,
  `idAsesor` varchar(3) DEFAULT NULL,
  `idCurso` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`nrc`),
  KEY `idAsesor` (`idAsesor`),
  KEY `idCurso` (`idCurso`),
  CONSTRAINT `seccion_ibfk_1` FOREIGN KEY (`idAsesor`) REFERENCES `asesor` (`idAsesor`),
  CONSTRAINT `seccion_ibfk_2` FOREIGN KEY (`idCurso`) REFERENCES `curso` (`idCurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seccion`
--

LOCK TABLES `seccion` WRITE;
/*!40000 ALTER TABLE `seccion` DISABLE KEYS */;
INSERT INTO `seccion` VALUES ('34100','InglesIV02','feb','jul','800','1000');
/*!40000 ALTER TABLE `seccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idUsuario` varchar(3) NOT NULL,
  `nombreUsuario` varchar(15) DEFAULT NULL,
  `contrasena` varchar(32) DEFAULT NULL,
  `tipo` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES ('100','s15011617','f4d19f6dfce51edfdd070179df21c1d0','1'),('500','asesor_fer','b69a52925c4bb190fcb1b7eb2c438631','2'),('501','asesor_carlos','9f89f4e3ec1a37dfb54ab0d2a5518117','2'),('502','recep_flo','e2233f2ac89a9865936519c974b591fd','3'),('503','coord_jcarlos','f22a88f0aa45ffe1df5ac599c8c863f8','4');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-06  1:10:13
