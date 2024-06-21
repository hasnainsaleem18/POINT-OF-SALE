-- MySQL dump 10.13  Distrib 5.7.24, for osx10.9 (x86_64)
--
-- Host: localhost    Database: posdb
-- ------------------------------------------------------
-- Server version	8.3.0

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
-- Table structure for table `Admin`
--

DROP TABLE IF EXISTS `Admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Admin` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) DEFAULT NULL,
  `Username` varchar(45) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Admin`
--

LOCK TABLES `Admin` WRITE;
/*!40000 ALTER TABLE `Admin` DISABLE KEYS */;
INSERT INTO `Admin` VALUES (1,'John Doe','john_admin','admin123'),(2,'Alice Smith','alice_admin','password123'),(3,'Bob Johnson','bob_admin','bobpassword'),(5,'Michael Wilson','michael_admin','securepass'),(6,'Sarah Lee','sarah_admin','admin1234'),(7,'David Davis','david_admin','daviddav'),(8,'Emma Taylor','emma_admin','password'),(9,'James Moore','james_admin','secure123'),(10,'Olivia Wilson','olivia_admin','password'),(11,'hasnain','hs','123');
/*!40000 ALTER TABLE `Admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Cashier`
--

DROP TABLE IF EXISTS `Cashier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Cashier` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) DEFAULT NULL,
  `Username` varchar(45) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  `CashDrawer` double DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cashier`
--

LOCK TABLES `Cashier` WRITE;
/*!40000 ALTER TABLE `Cashier` DISABLE KEYS */;
INSERT INTO `Cashier` VALUES (1,'Emily White','emily_cashier','cashier123',1000),(2,'Daniel Johnson','daniel_cashier','cashierpass',1500),(3,'Sophia Martinez','sophia_cashier','sophiapass',800),(4,'Ethan Brown','ethan_cashier','ethan123',1200),(5,'Ava Jones','ava_cashier','cashierava',900),(6,'Mason Anderson','mason_cashier','cashiermason',1100),(7,'Isabella Taylor','isabella_cashier','cashier1234',1300),(8,'Jacob Wilson','jacob_cashier','cashierjacob',950),(9,'Mia Miller','mia_cashier','miamia',1050),(10,'Noah Garcia','noah_cashier','cashiernoah',1400),(11,'alishba','atk','2007',0);
/*!40000 ALTER TABLE `Cashier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Inventory`
--

DROP TABLE IF EXISTS `Inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Inventory` (
  `Product_Code` int NOT NULL,
  `Product_Name` varchar(45) DEFAULT NULL,
  `Product_Unit` varchar(45) DEFAULT NULL,
  `Product_Category` varchar(45) DEFAULT NULL,
  `Product_Price` double DEFAULT NULL,
  `Product_Quantity` int DEFAULT NULL,
  PRIMARY KEY (`Product_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Inventory`
--

LOCK TABLES `Inventory` WRITE;
/*!40000 ALTER TABLE `Inventory` DISABLE KEYS */;
INSERT INTO `Inventory` VALUES (101,'Amoxicillin','Bottle','Prescription Medications',20.99,40),(102,'Lisinopril','Box','Prescription Medications',15.49,18),(103,'Aspirin','Bottle','Over-the-Counter (OTC) Medications',5.99,100),(104,'Ibuprofen','Box','Over-the-Counter (OTC) Medications',8.49,80),(105,'Band-Aid','Pack','First Aid Supplies',2.99,200),(106,'Hydrogen Peroxide','Bottle','First Aid Supplies',3.49,150),(107,'Toothpaste','Tube','Personal Care Products',4.99,120),(108,'Shampoo','Bottle','Personal Care Products',6.49,90),(109,'Blood Glucose Meter','Piece','Medical Devices and Supplies',29.99,30),(110,'Thermometer','Piece','Medical Devices and Supplies',12.99,50),(111,'Diaper','Piece','Baby Care Products',0.99,200),(112,'Baby Wipes','Pack','Baby Care Products',2.49,150),(113,'Sanitary Pad','Pack','Feminine Hygiene Products',3.99,100),(114,'Tampons','Box','Feminine Hygiene Products',5.49,80),(115,'Antihistamine','Box','Allergy and Sinus Relief',10.99,70),(116,'Nasal Spray','Bottle','Allergy and Sinus Relief',7.49,90),(117,'Antacid','Bottle','Digestive Health',8.99,60),(118,'Probiotics','Bottle','Digestive Health',14.99,40),(119,'Acetaminophen','Bottle','Pain Relief',6.99,80),(120,'Muscle Rub','Tube','Pain Relief',9.49,70),(121,'Arnica','Bottle','Homeopathic Remedies',11.99,50),(122,'Echinacea','Bottle','Homeopathic Remedies',13.49,60),(123,'Cold and Flu Tablets','Box','Cold and Flu Remedies',9.99,70),(124,'Cough Syrup','Bottle','Cold and Flu Remedies',7.49,90),(125,'Eye Drops','Bottle','Eye and Ear Care',6.99,80),(126,'Ear Drops','Bottle','Eye and Ear Care',5.49,100);
/*!40000 ALTER TABLE `Inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Inventory_has_Admin`
--

DROP TABLE IF EXISTS `Inventory_has_Admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Inventory_has_Admin` (
  `Inventory_Product_Code` int NOT NULL,
  `Admin_Id` int NOT NULL,
  PRIMARY KEY (`Inventory_Product_Code`,`Admin_Id`),
  KEY `fk_Inventory_has_Admin_Admin1_idx` (`Admin_Id`),
  KEY `fk_Inventory_has_Admin_Inventory_idx` (`Inventory_Product_Code`),
  CONSTRAINT `fk_Inventory_has_Admin_Admin1` FOREIGN KEY (`Admin_Id`) REFERENCES `Admin` (`Id`),
  CONSTRAINT `fk_Inventory_has_Admin_Inventory` FOREIGN KEY (`Inventory_Product_Code`) REFERENCES `Inventory` (`Product_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Inventory_has_Admin`
--

LOCK TABLES `Inventory_has_Admin` WRITE;
/*!40000 ALTER TABLE `Inventory_has_Admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `Inventory_has_Admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Order`
--

DROP TABLE IF EXISTS `Order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Order` (
  `Order_Id` int NOT NULL,
  `Product` varchar(45) DEFAULT NULL,
  `Unit` varchar(45) DEFAULT NULL,
  `MinimunQty` int DEFAULT NULL,
  `MaximumQty` int DEFAULT NULL,
  `Supplier_Id` int DEFAULT NULL,
  PRIMARY KEY (`Order_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Order`
--

LOCK TABLES `Order` WRITE;
/*!40000 ALTER TABLE `Order` DISABLE KEYS */;
INSERT INTO `Order` VALUES (1,'Aspirin','Bottle',100,500,1),(2,'Band-Aid','Pack',200,800,2),(3,'Thermometer','Piece',50,200,3),(4,'Antacid','Bottle',80,300,4),(5,'Eye Drops','Bottle',70,250,5),(6,'Ibuprofen','Box',120,400,1),(7,'Toothpaste','Tube',150,600,2),(8,'Diaper','Piece',200,800,3),(9,'Antihistamine','Box',90,350,4),(10,'Shampoo','Bottle',100,400,5);
/*!40000 ALTER TABLE `Order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Payment`
--

DROP TABLE IF EXISTS `Payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Payment` (
  `Invoice_No` int NOT NULL,
  `Total` double DEFAULT NULL,
  `Date` datetime DEFAULT NULL,
  `Cashier_Id` int NOT NULL,
  PRIMARY KEY (`Invoice_No`,`Cashier_Id`),
  KEY `fk_Payment_Cashier1_idx` (`Cashier_Id`),
  CONSTRAINT `fk_Payment_Cashier1` FOREIGN KEY (`Cashier_Id`) REFERENCES `Cashier` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Payment`
--

LOCK TABLES `Payment` WRITE;
/*!40000 ALTER TABLE `Payment` DISABLE KEYS */;
INSERT INTO `Payment` VALUES (1,50.25,'2024-05-27 10:30:00',1),(2,30.75,'2024-05-27 11:45:00',3),(3,20.5,'2024-05-27 13:15:00',5),(4,45.8,'2024-05-27 14:45:00',2),(5,55.9,'2024-05-27 16:00:00',4),(6,40.25,'2024-05-27 17:30:00',1),(7,65.3,'2024-05-27 19:00:00',3),(8,28.9,'2024-05-27 20:15:00',5),(9,38.5,'2024-05-27 21:45:00',2),(10,49.75,'2024-05-27 23:00:00',4),(11,209.9,'2024-05-27 00:00:00',11),(12,185.88,'2024-05-27 00:00:00',11);
/*!40000 ALTER TABLE `Payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Purchase`
--

DROP TABLE IF EXISTS `Purchase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Purchase` (
  `Inventory_Product_Code` int NOT NULL,
  `Order_Order_Id` int NOT NULL,
  PRIMARY KEY (`Inventory_Product_Code`,`Order_Order_Id`),
  KEY `fk_Inventory_has_Order_Order1_idx` (`Order_Order_Id`),
  KEY `fk_Inventory_has_Order_Inventory1_idx` (`Inventory_Product_Code`),
  CONSTRAINT `fk_Inventory_has_Order_Inventory1` FOREIGN KEY (`Inventory_Product_Code`) REFERENCES `Inventory` (`Product_Code`),
  CONSTRAINT `fk_Inventory_has_Order_Order1` FOREIGN KEY (`Order_Order_Id`) REFERENCES `Order` (`Order_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Purchase`
--

LOCK TABLES `Purchase` WRITE;
/*!40000 ALTER TABLE `Purchase` DISABLE KEYS */;
/*!40000 ALTER TABLE `Purchase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Sales`
--

DROP TABLE IF EXISTS `Sales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Sales` (
  `Product_Code` int NOT NULL,
  `Product_Name` varchar(45) DEFAULT NULL,
  `Product_Unit` varchar(45) DEFAULT NULL,
  `Product_Category` varchar(45) DEFAULT NULL,
  `Unit_Price` double DEFAULT NULL,
  `Product_Quantity` int DEFAULT NULL,
  `Total_Price` double DEFAULT NULL,
  `Date` varchar(45) DEFAULT NULL,
  `Payment_Invoice_No` int NOT NULL,
  `Payment_Cashier_Id` int NOT NULL,
  PRIMARY KEY (`Payment_Invoice_No`,`Payment_Cashier_Id`,`Product_Code`),
  CONSTRAINT `fk_Sales_Payment1` FOREIGN KEY (`Payment_Invoice_No`, `Payment_Cashier_Id`) REFERENCES `Payment` (`Invoice_No`, `Cashier_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Sales`
--

LOCK TABLES `Sales` WRITE;
/*!40000 ALTER TABLE `Sales` DISABLE KEYS */;
/*!40000 ALTER TABLE `Sales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Sales_has_Inventory`
--

DROP TABLE IF EXISTS `Sales_has_Inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Sales_has_Inventory` (
  `Sales_Payment_Invoice_No` int NOT NULL,
  `Sales_Payment_Cashier_Id` int NOT NULL,
  `Sales_Product_Code` int NOT NULL,
  `Inventory_Product_Code` int NOT NULL,
  PRIMARY KEY (`Sales_Payment_Invoice_No`,`Sales_Payment_Cashier_Id`,`Sales_Product_Code`,`Inventory_Product_Code`),
  KEY `fk_Sales_has_Inventory_Inventory1_idx` (`Inventory_Product_Code`),
  KEY `fk_Sales_has_Inventory_Sales1_idx` (`Sales_Payment_Invoice_No`,`Sales_Payment_Cashier_Id`,`Sales_Product_Code`),
  CONSTRAINT `fk_Sales_has_Inventory_Inventory1` FOREIGN KEY (`Inventory_Product_Code`) REFERENCES `Inventory` (`Product_Code`),
  CONSTRAINT `fk_Sales_has_Inventory_Sales1` FOREIGN KEY (`Sales_Payment_Invoice_No`, `Sales_Payment_Cashier_Id`, `Sales_Product_Code`) REFERENCES `Sales` (`Payment_Invoice_No`, `Payment_Cashier_Id`, `Product_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Sales_has_Inventory`
--

LOCK TABLES `Sales_has_Inventory` WRITE;
/*!40000 ALTER TABLE `Sales_has_Inventory` DISABLE KEYS */;
/*!40000 ALTER TABLE `Sales_has_Inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Supplier`
--

DROP TABLE IF EXISTS `Supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Supplier` (
  `Supplier_Id` int NOT NULL,
  `Supplier_Name` varchar(45) DEFAULT NULL,
  `Supplier_Contact` varchar(45) DEFAULT NULL,
  `Supplier_Address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Supplier_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Supplier`
--

LOCK TABLES `Supplier` WRITE;
/*!40000 ALTER TABLE `Supplier` DISABLE KEYS */;
INSERT INTO `Supplier` VALUES (1,'ABC Pharmaceuticals','123-456-7890','123 Main Street, City, Country'),(2,'XYZ Medical Supplies','987-654-3210','456 Oak Avenue, Town, Country'),(3,'MediCorp Inc.','555-555-5555','789 Maple Lane, Village, Country'),(4,'Healthcare Distributors Ltd.','111-222-3333','321 Elm Street, Suburb, Country'),(5,'PharmaCare Solutions','444-444-4444','678 Pine Road, County, Country');
/*!40000 ALTER TABLE `Supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Supply`
--

DROP TABLE IF EXISTS `Supply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Supply` (
  `Order_Order_Id` int NOT NULL,
  `Product_Name` varchar(45) DEFAULT NULL,
  `Product_Unit` varchar(45) DEFAULT NULL,
  `MinimumQty` int DEFAULT NULL,
  `MaximumQty` int DEFAULT NULL,
  `Supplier_Supplier_Id` int NOT NULL,
  `Supplier_Name` varchar(45) DEFAULT NULL,
  `Supplier_Contact` varchar(45) DEFAULT NULL,
  `Supplier_Address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Order_Order_Id`,`Supplier_Supplier_Id`),
  KEY `fk_Order_has_Supplier_Supplier1_idx` (`Supplier_Supplier_Id`),
  KEY `fk_Order_has_Supplier_Order1_idx` (`Order_Order_Id`),
  CONSTRAINT `fk_Order_has_Supplier_Order1` FOREIGN KEY (`Order_Order_Id`) REFERENCES `Order` (`Order_Id`),
  CONSTRAINT `fk_Order_has_Supplier_Supplier1` FOREIGN KEY (`Supplier_Supplier_Id`) REFERENCES `Supplier` (`Supplier_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Supply`
--

LOCK TABLES `Supply` WRITE;
/*!40000 ALTER TABLE `Supply` DISABLE KEYS */;
/*!40000 ALTER TABLE `Supply` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-29 13:14:08
