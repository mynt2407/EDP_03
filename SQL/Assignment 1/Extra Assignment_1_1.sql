CREATE DATABASE Fresher_Training_Management;
USE	Fresher_Training_Management;

CREATE TABLE `Trainee table` (
TraineeID 			TINYINT UNSIGNED PRIMARY KEY,
Full_Name			VARCHAR(20) NOT NULL,
Birth_Date 			DATE,
Gender 				ENUM ('Male', 'female', 'unknown') NOT NULL,
ET_IQ 				TINYINT UNSIGNED,
ET_Gmath 			TINYINT UNSIGNED,
ET_English 			TINYINT UNSIGNED,
Training_Class 		VARCHAR(50) NOT NULL,
Evaluation_Notes 	TINYINT NOT NULL,
VTI_Account			TINYINT NOT NULL UNIQUE KEY
);

