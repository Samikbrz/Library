# Proje Hakkında

:heavy_check_mark: Projemi java Spring,Thmeyeleaf,JPA,Maven veritabanı olarak MySql teknolojilerini kullarak geliştirdim.

:heavy_check_mark: IDE olarak IntelliJ,Mysql için arayüz olarakta MySql Workbench i kullandım.

:heavy_check_mark: Projemde ağırlık verdiğim kısım backend di bu yüzden frontend ve database kısmında eksiklikler mevcut.Daha sonraki commitlerimde bu kısımlarda iyileştirmeler yapacağım. 

# Proje Kurulum
:heavy_check_mark: Öncelikle veritabanımızda çalıştırmamız greken sql sorgusunu yazalım.


-- Table structure for table `author`


DROP TABLE IF EXISTS `author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `author` (
  `id` int NOT NULL AUTO_INCREMENT,
  `author_name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `isbnnumber` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `serial_no` varchar(255) DEFAULT NULL,
  `sub_name` varchar(255) DEFAULT NULL,
  `author` varchar(50) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `publishing_house` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `publishing_house`
--

DROP TABLE IF EXISTS `publishing_house`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `publishing_house` (
  `id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `publishing_house_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
