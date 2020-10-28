/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/

INSERT INTO `User` 		 (UserID , FullName, 			Email,				`Password`)		 
VALUES
						(1,			N'Nguyễn Thị Mỵ',	'mynt2407@gmail.com', 	'myNguyen123'),
						(2,			N'Nguyễn Ngọc Duy',	'duynn03@gmail.com', 	'duyNguyen'),
						(3,			N'Nguyễn Hùng Mạnh','hungmanh@gmail.com', 	'hungManh123'),
						(4,			N'Tống Thị Nhung',	'nhung@gmail.com', 		'Nhungtong'),
						(5,			N'Trần Thị Kim Anh','kimoanh.tran@gmail.com','Kimoanh'),
                        (6,			N'Hồ Hồng Nhung',	'nhung.ho@gmail.com', 	'Nhungho123'), 	 	
                        (7,			N'Nguyễn Ngọc Mai',	'mainn03@gmail.com', 	'MaiNguyen'),        
                        (8,			N'Trần Văn Nam',	'namtran1@gmail.com', 	'VietNam1'), 		
                        (9,			N'Nguyễn Thế Hưng',	'hung@gmail.com', 		'Hungnguyen12'),  	
                        (10,		N'Trần Thị Oanh',	'oanh@gmail.com',		'Tranoanh'); 	
                        
                        
INSERT INTO `Employee`  (UserID , ProSkill) 
VALUES
						(3,			'dev'),
						(2,			'test'),
						(5,			'java'),
						(7,			'sql'),
						(10,		'C++');
                        
INSERT INTO `Manager`  (UserID , ExpInYear) 
VALUES
						(1,			10	),
						(4,			20	),
						(6,			13	),
						(9,			3	),
						(8,			7	);   
                        
INSERT INTO `Project`  (ProjectID , TeamSize) 
VALUES
						(1,			150	),
						(2,			200	),
						(3,			130	),
						(4,			300	),
                        (5,			300	),
                        (6,			300	),
						(7,			100	);
                                        
                        
INSERT INTO Project_User (UserID , `Role`, 		ProjectID)
VALUES
						(5,			'Employee',		2	),
						(3,			'Employee',		3	),
						(8,			'Manager',		2	),
						(10,		'Employee',		4	),
						(4,			'Manager',		5	),
                        (6,			'Manager',		7	),
                        (7,			'Employee',		3	),
                        (8,			'Manager',		6	);
                        