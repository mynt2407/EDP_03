/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/

DROP DATABASE IF EXISTS ManagerUsers;
CREATE DATABASE ManagerUsers;
USE ManagerUsers;

/*============================== CREATE TABLE =======================================*/
/*======================================================================================*/


-- create table 3: projectId, teamSize, idManager,  idEmployees


-- create table 1: Employee  id, FullName, Email, Password, projectId , ProSkill
CREATE TABLE Employee(
	EmployeeID 		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	FullName 		VARCHAR(50) UNIQUE KEY NOT NULL,
    Email 			VARCHAR(50) UNIQUE KEY NOT NULL,
    `Password`		VARCHAR(50) NOT NULL CHECK(length(`Password`) >= 6),
    ProjectID		TINYINT UNSIGNED,
    ProSkill 		VARCHAR(50) NOT NULL

);

-- create table 2: Manager   id, FullName, Email, Password, ExpInYear
CREATE TABLE Manager(
	ManagerID 		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	FullName 		VARCHAR(50) UNIQUE KEY NOT NULL,
    Email 			VARCHAR(50) UNIQUE KEY NOT NULL,
    `Password`		VARCHAR(50) NOT NULL CHECK(length(`Password`) >= 6),
    ExpInYear		TINYINT UNSIGNED
);
CREATE TABLE Project(
    ProjectID 	TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    TeamSize 	SMALLINT UNSIGNED,
    ManagerID 	TINYINT UNSIGNED NOT NULL,
    EmployeeID 	TINYINT UNSIGNED NOT NULL,
    FOREIGN KEY (ManagerID) REFERENCES Manager (ManagerID) ON DELETE CASCADE,
    FOREIGN KEY (EmployeeID) REFERENCES Employee (EmployeeID) ON DELETE CASCADE
);

    ALTER TABLE  Employee ADD FOREIGN KEY (ProjectID) REFERENCES Project(ProjectID) 

