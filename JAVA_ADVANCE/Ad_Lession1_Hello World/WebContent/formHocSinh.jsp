<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="Java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Thông tin học sinh</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>
	<h2 style="text-align: center;">Bảng thông tin học sinh</h2>

	<%
		String id = request.getParameter("");
	String name = request.getParameter("name");

	//Cách lấy giới tính từ radio
	String valueGet = request.getParameter("sex");

	if (valueGet.equals("Nam")) {
		//Do action
	} else if (valueGet.equals("Nữ")) {
		//Do other action
	}
	String phone = request.getParameter("phone");

	/* parse từ dạng String sang date */
	String startDateStr = request.getParameter("birthday");
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date startDate = sdf.parse(startDateStr);
	%>
	/* Cách viết ngắn gọn:
	Date startDate=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date")); */
	

	<table>

		<tr>
			<th>STT</th>
			<th>Họ tên</th>
			<th>Năm sinh</th>
			<th>Giới tính</th>
			<th>Số điện thoại</th>
		</tr>


		<tr>
			<td><%=id%></td>
			<td><%=name%></td>
			<td><%=startDate%></td>
			<td><%=valueGet%></td>  
			<td><%=phone%></td>                           
		</tr>

	</table>

</body>

</html>