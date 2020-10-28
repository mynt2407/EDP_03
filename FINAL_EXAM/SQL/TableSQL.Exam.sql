/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/

DROP DATABASE IF EXISTS ManagerUsers;
CREATE DATABASE ManagerUsers;
USE ManagerUsers;

/*============================== CREATE TABLE =======================================*/
/*======================================================================================*/


-- create table 3: projectId, teamSize, idManager,  idEmployees


-- create table 1: Employee  id, FullName, Email, Password, projectId , ProSkill
CREATE TABLE `User`(
UserID 			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
FullName 		VARCHAR(50) NOT NULL,
Email 			VARCHAR(50) UNIQUE KEY NOT NULL,
`Password`		VARCHAR(50) NOT NULL CHECK(length(`Password`) >= 6)
);

CREATE TABLE Employee(
	UserID 			TINYINT UNSIGNED UNIQUE KEY NOT NULL,
    ProSkill 		VARCHAR(50) NOT NULL,
	FOREIGN KEY (UserID) REFERENCES `User` (UserID) ON DELETE CASCADE
);

-- create table 2: Manager   id, FullName, Email, Password, ExpInYear
CREATE TABLE Manager(
	UserID 			TINYINT UNSIGNED UNIQUE KEY NOT NULL,
    ExpInYear		TINYINT UNSIGNED NOT NULL,
	FOREIGN KEY (UserID) REFERENCES `User` (UserID) ON DELETE CASCADE
);

CREATE TABLE Project(
    ProjectID 	TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    TeamSize 	SMALLINT UNSIGNED
);

CREATE TABLE Project_User(
    UserID 		TINYINT UNSIGNED NOT NULL,
    `Role` 		ENUM('Employee', 'Manager'),
	ProjectID	TINYINT UNSIGNED,
    
    FOREIGN KEY (ProjectID) REFERENCES `Project` (ProjectID) ON DELETE CASCADE,
    FOREIGN KEY (UserID) REFERENCES `User` (UserID) ON DELETE CASCADE
);

