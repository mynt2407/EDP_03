/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/

INSERT INTO `Employee`  (EmployeeID , FullName, 			Email,				`Password`, 		 ProSkill) 
VALUES
						(1,			N'Nguyễn Thị Mỵ',	'mynt2407@gmail.com', 	'myNguyen123', 		'Dev'	),
						(2,			N'Nguyễn Ngọc Duy',	'duynn03@gmail.com', 	'duyNguyen',    	'Test'	),
						(3,			N'Nguyễn Hùng Mạnh','hungmanh@gmail.com', 	'hungManh123', 		'sql'	),
						(4,			N'Tống Thị Nhung',	'nhung@gmail.com', 		'Nhungtong', 		'java'	),
						(5,			N'Trần Thị Kim Anh','kimoanh.tran@gmail.com','Kimoanh', 		'C++'	);
                        
INSERT INTO `Manager`  (ManagerID , FullName, 			Email,				`Password`, 		ExpInYear) 
VALUES
						(1,			N'Hồ Hồng Nhung',	'nhung.ho@gmail.com', 	'Nhungho123', 	7		),
						(2,			N'Nguyễn Ngọc Mai',	'mainn03@gmail.com', 	'MaiNguyen',    4		),
						(3,			N'Trần Văn Nam',	'namtran1@gmail.com', 	'VietNam1', 	10		),
						(4,			N'Nguyễn Thế Hưng',	'hung@gmail.com', 		'Hungnguyen12', 3		),
						(5,			N'Trần Thị Oanh',	'oanh@gmail.com',		'Tranoanh', 	3		);
                        
INSERT INTO `Project`  (ProjectID , TeamSize, 	ManagerID,	EmployeeID) 
VALUES
						(1,			300,		5,			1 		),
						(2,			100,		3, 			3 		),
						(3,			150,		1,			5 		),
						(4,			200,		5, 			3 		),
						(5,			150,		2,			2 		);
                        
INSERT INTO `Manager`  (ManagerID , FullName, 			Email,				`Password`)		
VALUES
						(1,			N'Hồ Hồng Nhung',	'nhung.ho@gmail.com', 	'Nhungho123'),	
						(2,			N'Nguyễn Ngọc Mai',	'mainn03@gmail.com', 	'MaiNguyen'),    
						(3,			N'Trần Văn Nam',	'namtran1@gmail.com', 	'VietNam1'), 	
						(4,			N'Nguyễn Thế Hưng',	'hung@gmail.com', 		'Hungnguyen12'), 
                        (1,			N'Nguyễn Thị Mỵ',	'mynt2407@gmail.com', 	'myNguyen123'), 	
						(2,			N'Nguyễn Ngọc Duy',	'duynn03@gmail.com', 	'duyNguyen'),   
						(3,			N'Nguyễn Hùng Mạnh','hungmanh@gmail.com', 	'hungManh123'), 	
						(4,			N'Tống Thị Nhung',	'nhung@gmail.com', 		'Nhungtong'), 	
						(5,			N'Trần Thị Kim Anh','kimoanh.tran@gmail.com','Kimoanh'; 	
                        