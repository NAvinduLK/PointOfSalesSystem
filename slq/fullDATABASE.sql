CREATE DATABASE `1_pos_system_db`;

USE `1_pos_system_db`;

#create company infor
CREATE TABLE `company_info` (
  `No` int NOT NULL,
  `Campany_Name` varchar(100) DEFAULT NULL,
  `Admin_Name` varchar(100) DEFAULT NULL,
  `Company_Contact` int DEFAULT NULL,
  `Address_1` varchar(100) DEFAULT NULL,
  `City` varchar(100) DEFAULT NULL,
  `Province` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`No`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `category` (
  `Cate_ID` int NOT NULL AUTO_INCREMENT,
  `CateName` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Cate_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `items` (
  `Item_ID` int NOT NULL AUTO_INCREMENT,
  `IName` varchar(100) DEFAULT NULL,
  `Category_ID` int DEFAULT NULL,
  `CategoryName` varchar(100) DEFAULT NULL,
  `IaddQuantity` int DEFAULT NULL,
  `IcostPrice` double DEFAULT NULL,
  `IsellingPrice` double DEFAULT NULL,
  PRIMARY KEY (`Item_ID`),
  UNIQUE KEY `IName_UNIQUE` (`IName`),
  KEY `Cate_ID_idx` (`Category_ID`),
  KEY `IQuantity_idx` (`IaddQuantity`),
  KEY `id` (`IName`,`Category_ID`),
  CONSTRAINT `Cate_ID` FOREIGN KEY (`Category_ID`) REFERENCES `category` (`Cate_ID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `stock` (
  `Item_ID` int NOT NULL,
  `IName` varchar(100) DEFAULT NULL,
  `Quantity` int DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Item_ID`),
  CONSTRAINT `Item_ID` FOREIGN KEY (`Item_ID`) REFERENCES `items` (`Item_ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `users` (
  `User_ID` int NOT NULL AUTO_INCREMENT,
  `UName` varchar(100) DEFAULT NULL,
  `UPassword` varchar(10) NOT NULL,
  `UNIC` varchar(12) DEFAULT NULL,
  `UAddress` varchar(100) DEFAULT NULL,
  `UPhone` int DEFAULT NULL,
  `UEmail` varchar(50) DEFAULT NULL,
  `Salary` int DEFAULT NULL,
  `Joined_date` date DEFAULT NULL,
  `Post` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`User_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `supplyers` (
  `Sup_ID` int NOT NULL AUTO_INCREMENT,
  `SName` varchar(100) DEFAULT NULL,
  `SNIC` varchar(12) DEFAULT NULL,
  `SPhone` int DEFAULT NULL,
  `SEmail` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Sup_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `customers` (
  `Cust_ID` int NOT NULL AUTO_INCREMENT,
  `CName` varchar(100) DEFAULT NULL,
  `CNIC` varchar(12) DEFAULT NULL,
  `CPhone` int DEFAULT NULL,
  `CEmail` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`Cust_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `orders` (
  `Order_ID` int NOT NULL AUTO_INCREMENT,
  `Sup_ID` int DEFAULT NULL,
  `Odate` date DEFAULT NULL,
  PRIMARY KEY (`Order_ID`),
  KEY `orders_ibfk_1` (`Sup_ID`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`Sup_ID`) REFERENCES `supplyers` (`Sup_ID`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `orders_itemlist` (
  `Order_ID` int DEFAULT NULL,
  `IName` varchar(50) DEFAULT NULL,
  `o_qty` int DEFAULT NULL,
  KEY `Order_ID_idx` (`Order_ID`),
  CONSTRAINT `Order_ID` FOREIGN KEY (`Order_ID`) REFERENCES `orders` (`Order_ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `invoice` (
  `Invoice_ID` int NOT NULL AUTO_INCREMENT,
  `In_Date` date DEFAULT NULL,
  `In_Time` time DEFAULT NULL,
  `In_CustName` varchar(100) DEFAULT NULL,
  `In_Cashier` varchar(100) DEFAULT NULL,
  `In_Cash` double DEFAULT NULL,
  `In_Total` double DEFAULT NULL,
  `In_Discount` int DEFAULT NULL,
  `In_DisAmount` double DEFAULT NULL,
  `In_Balance` double DEFAULT NULL,
  PRIMARY KEY (`Invoice_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `in_itemlist` (
  `No` int NOT NULL AUTO_INCREMENT,
  `Invoice_ID` int DEFAULT NULL,
  `In_Item` varchar(100) DEFAULT NULL,
  `In_Qty` int DEFAULT NULL,
  PRIMARY KEY (`No`),
  KEY `In_Item_idx` (`In_Item`),
  KEY `in_itemlist_ibfk_1` (`Invoice_ID`),
  CONSTRAINT `in_itemlist_ibfk_1` FOREIGN KEY (`Invoice_ID`) REFERENCES `invoice` (`Invoice_ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `invoiceprinttable` AS select `a`.`Invoice_ID` AS `Invoice_ID`,`a`.`In_Item` AS `In_Item`,`a`.`In_Qty` AS `In_Qty`,`b`.`IsellingPrice` AS `IsellingPrice` from (`in_itemlist` `a` join `items` `b`) where ((`a`.`In_Item` = `b`.`IName`) and `a`.`Invoice_ID` in (select `in_itemlist`.`Invoice_ID` from `in_itemlist`)) order by `a`.`Invoice_ID`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `item_view` AS select `items`.`Item_ID` AS `Item_ID`,`items`.`IName` AS `IName`,`items`.`Category_ID` AS `Category_ID` from `items`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `jitemtableview` AS select `a`.`Item_ID` AS `Item_ID`,`a`.`IName` AS `IName`,`a`.`CategoryName` AS `CategoryName`,`b`.`Quantity` AS `Quantity`,`a`.`IcostPrice` AS `IcostPrice`,`a`.`IsellingPrice` AS `IsellingPrice` from (`items` `a` join `stock` `b`) where (`a`.`Item_ID` = `b`.`Item_ID`);

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `jstocktableview` AS select `a`.`Item_ID` AS `Item_ID`,`a`.`IName` AS `IName`,`a`.`CategoryName` AS `CategoryName`,`b`.`Quantity` AS `Quantity`,`b`.`Status` AS `Status` from (`items` `a` join `stock` `b`) where (`a`.`Item_ID` = `b`.`Item_ID`);

