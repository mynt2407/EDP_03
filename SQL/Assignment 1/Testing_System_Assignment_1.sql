DROP DATABASE IF EXISTS TestingSystem;
CREATE DATABASE TestingSystem;
USE TestingSystem;

-- Create table: department
CREATE TABLE Department(
	DepartmentID 	TINYINT UNSIGNED,
	DepartmentName 	VARCHAR(50)
);

-- Create table: Position
CREATE TABLE Position (
	PositionID 		TINYINT UNSIGNED,
	PositionName 	ENUM('Dev', 'Test', 'Scrum Master', 'PM')
);

-- Create table: Account
CREATE TABLE `Account` (
	AccountID 		TINYINT UNSIGNED,
	Email 			VARCHAR(50),
	User_name		VARCHAR(50),
	Full_name 		VARCHAR(50),
	DepartmentID	TINYINT UNSIGNED,
	PositionID		TINYINT UNSIGNED,
	CreateDate		DATE
);

CREATE TABLE `Group`(
	GroupID 		TINYINT UNSIGNED,
	GroupName 		VARCHAR(50),
	CreatorID		TINYINT UNSIGNED,
	CreateDate		DATE
);

CREATE TABLE GroupAccount (
	GroupID 		INT,
	AccountID 		INT,
	JoinDate		DATE
);

CREATE TABLE TypeQuestion (
	TypeID		INT,
	TypeName	VARCHAR(100)
);

CREATE TABLE CategoryQuestion (
	CategoryID		INT,
	CategoryName	VARCHAR(100)
);

CREATE TABLE Question (
	QuestionID		INT,
	Content			VARCHAR(50),
	CategoryID		INT,
	TypeID			INT,
	CreatorID		INT,
	CreateDate		DATE
);

CREATE TABLE Answer (
	AnswerID 	INT,
	Content		VARCHAR(100),
    QuestionID	INT,
    isCorrect	VARCHAR(50)
);

CREATE TABLE Exam (
	ExamID	 	INT,
	`Code`		INT,
    Title		INT,
    CategoryID	INT,
    Duration	INT,
    CreatorID	INT,
    CreateDate	DATE
);

CREATE TABLE ExamQuestion (
	ExamID	 	INT,
	QuestionID	INT
);