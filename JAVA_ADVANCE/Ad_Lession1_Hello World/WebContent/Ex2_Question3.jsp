<%@ page language="Java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Create form</title>
<style>
form {
	width: 200px;
	padding: 30px;
	border: 1px solid black;
}
</style>
</head>
<body>
	<form action="formNhapLieu.jsp">
		<label for="stt">STT</label><br> <input type="text" name="stt"><br>
		<br> <label for="name">Tên VXL</label><br> <input
			type="text" name="name"><br>
		<br> <label for="brand">Hãng</label><br> <input type="text"
			name="brand"><br>
		<br> <label for="date">Ngày ra mắt</label><br> <input
			type="date" name="date"> <br>
		<br> <label for="price">Giá</label><br> <input type="text"
			name="price"><br>
		<br>

		<button type="submit" name="Submit">Thêm</button ><button type="reset" name="Cancel">Hủy</button>
	</form>
</body>
</html>