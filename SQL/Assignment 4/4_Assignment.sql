/*====================Exercise 1: Join====================*/

-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT 	A.Full_name, A.User_name, A.Email, A.CreateDate, D.DepartmentName, D.DepartmentID 
FROM 	`Account` A
JOIN 	`Department` D ON D.DepartmentID = A.DepartmentID
;

-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010 
SELECT 	*
FROM 	`Account`
WHERE 	CreateDate > '2010-12-20'
;

-- Question 3: Viết lệnh để lấy ra thông tin của tất cả các Developer 
SELECT 	*
FROM 	`Account` A
JOIN 	Position P ON P.PositionID = A.PositionID
WHERE 	PositionName = 'Developer'
 ;

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên

SELECT 		D.DepartmentName, COUNT(A.DepartmentID) AS 'So luong nhan vien'
FROM 		`Account` A
JOIN 		Department D ON A.DepartmentID = D.DepartmentID
GROUP BY 	A.DepartmentID
HAVING 		COUNT(A.DepartmentID) > 2;

-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
 SELECT 	*
 FROM 		ExamQuestion
 GROUP BY 	QuestionID
 HAVING 	COUNT(QuestionID)
 ;
 
 -- Question 6: Thống kê mỗi category Question được sử dụng trong bao nhiêu Question
 SELECT 	CategoryName, COUNT(C.CategoryID) AS ' SỐ LƯỢNG CÂU HỎI'
 FROM 		CategoryQuestion C
 JOIN 		Question Q ON C.CategoryID = Q.CategoryID
 GROUP BY	C.CategoryID;
 