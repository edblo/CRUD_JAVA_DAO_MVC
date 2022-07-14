CREATE DATABASE  IF NOT EXISTS `empleados` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `empleados`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: empleados
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleados` (
  `idEmpleado` int NOT NULL AUTO_INCREMENT,
  `apellido` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `dni` int NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `fechaNac` varchar(45) DEFAULT NULL,
  `legajo` int NOT NULL,
  `fechaIngreso` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idEmpleado`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES (6,'Gonzalez','Jose Luis',11111111,'josegonzalez@hotmail.com','4554-8989','1985-06-12',4556,'1985-06-12'),(7,'García','María Luisa',22333222,'mariagarcia@gmail.com','4489-1926','1980-02-15',77778,'1980-02-15'),(8,'Lopez','Carlos Javier',33555777,'cjlopez78@gmail.com','4483-5658','1985-08-15',6666,'1985-08-15'),(9,'Castro','Erica Elizabeth',33666444,'erica_castro@yahoo.com','53238282','1977-11-04',2323,'1977-11-04'),(10,'Perez','Ana María',33555666,'ana-perez86@outlook.com','2442-4593','1992-09-06',4578,'2007-03-01'),(11,'Dominguez','Andrea Lorena',44333111,'adominguez@email.com','46279966','1999-11-25',6589,'2020-06-01');
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-14  0:53:10
