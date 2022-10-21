-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Oct 21, 2022 at 01:22 PM
-- Server version: 8.0.27
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `grocery_shop`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill_log`
--

CREATE TABLE `bill_log` (
  `BILL_ID` int NOT NULL,
  `DATE` varchar(20) NOT NULL,
  `AMOUNT` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `bill_log`
--

INSERT INTO `bill_log` (`BILL_ID`, `DATE`, `AMOUNT`) VALUES
(8589, '30/08/2022 17:51:38', 120),
(18311, '30/08/2022 15:18:26', 225),
(19819, '30/08/2022 21:07:42', 2250),
(20683, '30/08/2022 17:31:13', 600),
(22101, '30/08/2022 17:34:41', 1200),
(37659, '30/08/2022 17:32:54', 1200),
(38727, '30/08/2022 20:41:28', 3450),
(46393, '30/08/2022 17:46:35', 120),
(59338, '30/08/2022 13:25:20', 225),
(62036, '30/08/2022 21:06:44', 702),
(64140, '30/08/2022 17:06:21', 300),
(67768, '30/08/2022 13:13:19', 225),
(77262, '30/08/2022 14:18:40', 150),
(83134, '30/08/2022 19:31:47', 225),
(90514, '30/08/2022 20:39:57', 1838),
(92041, '30/08/2022 13:20:27', 150),
(96011, '30/08/2022 17:01:06', 60),
(97800, '30/08/2022 19:36:10', 668);

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `CUSTOMER_ID` int NOT NULL,
  `CUSTOMER_NAME` varchar(50) NOT NULL,
  `EMAIL_ADDRESS` varchar(50) DEFAULT NULL,
  `CONTACT_NUMBER` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`CUSTOMER_ID`, `CUSTOMER_NAME`, `EMAIL_ADDRESS`, `CONTACT_NUMBER`) VALUES
(1234, 'Laksisi Gunaratne', 'laksisig@sltc.ac.lk', '0764729594'),
(1948, 'lakshani perera', 'lakshani@gmail.com', '077896545'),
(1969, 'K.N.Perera', 'pererakn@gmail.com', '0752885046'),
(1987, 'R. Perera', 'pereraR@gmail.com', '0771134267'),
(1999, 'Samanthi Kariyawasam', 'samanthi@gmail.com', '0767351635'),
(2345, 'Namal Perera', 'namal87@gmail.com', '0772345678'),
(7657, 'Anil Gunaratne', 'anil61@gmail.com', '0771345678'),
(8734, 'Chetha Gunaratne', 'chethag@gmail.com', '0763322323'),
(8765, 'Isuru Fernando', 'isuru83@gmail.com', '0765674545');

-- --------------------------------------------------------

--
-- Table structure for table `grocery_items`
--

CREATE TABLE `grocery_items` (
  `ITEM_ID` int NOT NULL,
  `ITEM_NAME` varchar(100) NOT NULL,
  `SIZE` varchar(10) NOT NULL,
  `BRAND` varchar(100) NOT NULL,
  `CATEGORY` varchar(50) NOT NULL,
  `PRICE` int NOT NULL,
  `CUSTOM_PRICE` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `grocery_items`
--

INSERT INTO `grocery_items` (`ITEM_ID`, `ITEM_NAME`, `SIZE`, `BRAND`, `CATEGORY`, `PRICE`, `CUSTOM_PRICE`) VALUES
(234, 'icecream', 'keels', 'small', 'food', 350, 200),
(455, 'mssa', 'asa', 'aasasassaa', 'sas', 123, 334),
(1111, 'dfdfd', 'dfdfdfd', 'dfdffd', 'fdffd', 1233, 3333),
(1815, 'toothpaste', 'signal', 'medium', 'cosmetic', 350, 400),
(3333, 'oil', 'fortune', 'medium', 'food', 450, 234);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bill_log`
--
ALTER TABLE `bill_log`
  ADD PRIMARY KEY (`BILL_ID`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`CUSTOMER_ID`),
  ADD UNIQUE KEY `EMAIL_ADDDRESS` (`EMAIL_ADDRESS`),
  ADD UNIQUE KEY `CONTACT_NUMBER` (`CONTACT_NUMBER`);

--
-- Indexes for table `grocery_items`
--
ALTER TABLE `grocery_items`
  ADD PRIMARY KEY (`ITEM_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
