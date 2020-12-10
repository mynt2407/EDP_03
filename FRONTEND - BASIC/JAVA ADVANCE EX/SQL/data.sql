/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/

INSERT INTO  `Account` (account_id, 	user_name, 		email, 							`password`, 	full_name,				group_id)
VALUES
						(1,			'duynn03',			'duynn03@gmail.com',			"123456789",	N'Nguyễn Ngọc Duy',		1),
						(2,			'dat.tranphu',		'tranphudattp1997@gmail.com',	"123456789",	N'Trần Phú Đạt',		3),
                        (3,			'du.lengoc',		'alka.asura@gmail.com',			"123456789",	N'Lê Ngọc Du',			6),
                        (4,			'duc.nguyenthe',	'ntd19795@gmail.com',			"123456789",	N'Nguyễn Thế Đức',		3),
                        (5,			'hiep.vuhoang',		'Vuhoanghiepnb@gmail.com',		"123456789",	N'Vũ Hoàng Hiệp',		1),
                        (6,			'my.nguyenthi',		'mynt2407@gmail.com',			"123456789",	N'Nguyễn Thị Mỵ',		5),
                        (7,			'nhung.tongthi',	'nhung.tongthi@vti.com.vn',		"123456789",	N'Tống Thị Nhung',		2);
     
INSERT INTO  `Group` (group_id, 	group_name, 		 `member` , creator_id, create_date)
VALUES
						(1,			'nhom_cao_to',		2, 			4, 			NULL),
						(2,			'nhom_den_hoi',		15, 		1, 			now()),
                        (3,			'nhom_xinh_gai',	23, 		1,			NULL),
                        (4,			'nhom_cute',		12, 		3, 			now()),
                        (5,			'nhom_hoc_gioi',	30, 		7, 			now()),
                        (6,			'nhom_hoc_kha',		2, 			2,			NULL),	
                        (7,			'nhom_sieu_giau',	60, 		4, 			NULL);