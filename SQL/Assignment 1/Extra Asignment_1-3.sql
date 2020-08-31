DROP DATABASE IF EXISTS Fresher_Training_Management;
CREATE DATABASE Fresher_Training_Management;
USE Fresher_Training_Management;

CREATE TABLE `Data_Types_2` (
ID 				TINYINT UNSIGNED PRIMARY KEY,
`Name` 			VARCHAR(50) NOT NULL,
BirthDate 		DATE,
Gender			ENUM ('0', '1', 'NULL'),
IsDeletedFlag  	ENUM ('0', '1')
);

