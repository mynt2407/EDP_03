DROP DATABASE IF EXISTS Fresher_Training_Management;
CREATE DATABASE Fresher_Training_Management;
USE Fresher_Training_Management;

CREATE TABLE `data_type`(
ID 				TINYINT UNSIGNED PRIMARY KEY,
`Name` 			VARCHAR(50) NOT NULL,
`Code` 			CHAR(5),
ModifiedDate 	DATE 
);




