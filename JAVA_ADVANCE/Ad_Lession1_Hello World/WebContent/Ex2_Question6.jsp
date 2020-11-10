<%@ page language="Java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<style>
form {
	width: 200px;
	padding: 30px;
	border: 1px solid black;
}
</style>
</head>
<body>

	<form action="formHocSinh.jsp">
		<label for="name">Họ tên</label><br> <input type="text"
			name="name"><br>
		<br> <label for="birthday">Năm sinh</label><br> <input
			type="date" name="birthday"><br>
		<br> <label for="sex">Giới tính</label><br> <input
			type="radio" name="sex" value ="Nam" >Nam
			<input
			type="radio" name="sex" value ="Nữ">Nữ<br>
		<br> <label for="phone">Số điện thoại </label><br> <input
			type="number" name="phone"> <br>
		<br>
		<button type="submit" name="Submit">Thêm</button ><button type="reset" name="Cancel">Hủy</button>
	</form>

</body>
</html>