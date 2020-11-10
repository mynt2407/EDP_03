<%@ page language="Java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
<h2>Cộng trừ nhân chia</h2>

	<form action="ketqua.jsp">
		<div>
			Số hàng thứ 1 <input type="number" name="Number1">
		</div>
		<div>
			Số hàng thứ 2 <input type="number" name="Number2">
		</div>
		
		<button type="radio" name="caculate" value ="Cong">+</button>
		<button type="radio" name="caculate" value ="Tru">-</button>
		<button type="radio" name="caculate" value ="Nhan">x</button>
		<button type="radio" name="caculate" value ="Chia">/</button>
	</form>

</body>
</html>