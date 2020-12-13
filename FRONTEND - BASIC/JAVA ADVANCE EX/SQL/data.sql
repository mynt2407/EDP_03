/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/

INSERT INTO  `Account` (account_id, 	user_name, 		email, 							`password`, 	full_name)
VALUES
						(1,			'duynn03',			'duynn03@gmail.com',			"123456789",	N'Nguyễn Ngọc Duy'),
						(2,			'dat.tranphu',		'tranphudattp1997@gmail.com',	"123456789",	N'Trần Phú Đạt'),
                        (3,			'du.lengoc',		'alka.asura@gmail.com',			"123456789",	N'Lê Ngọc Du'),
                        (4,			'duc.nguyenthe',	'ntd19795@gmail.com',			"123456789",	N'Nguyễn Thế Đức'),
                        (5,			'hiep.vuhoang',		'Vuhoanghiepnb@gmail.com',		"123456789",	N'Vũ Hoàng Hiệp'),
                        (6,			'my.nguyenthi',		'mynt2407@gmail.com',			"123456789",	N'Nguyễn Thị Mỵ'),
                        (7,			'nhung.tongthi',	'nhung.tongthi@vti.com.vn',		"123456789",	N'Tống Thị Nhung');
     
INSERT INTO  `Group` (group_id, 	group_name, 		 `member` , creator_id, create_date)
VALUES
						(1,			'Java Core',		2, 			4, 			'2019-01-10 10:11:11'),
						(2,			'Group C#',			15, 		6, 			now()),
                        (3,			'My SQL',			23, 		1,			'2020-09-20 01:15:30'),
                        (4,			'Frontend basic',	12, 		3, 			now()),
                        (5,			'Frontend Advance',	30, 		7, 			now()),
                        (6,			'Java Advance',		2, 			2,			'2018-02-11 09:50:11'),	
                        (7,			'Group PHP',		60, 		4, 			'2018-02-10 08:40:11');