<%@page import="org.eclipse.jdt.internal.compiler.ast.TryStatement"%>
<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="java.util.Calendar"%>
<%@ page language="Java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Demo</title>
</head>
<body>

	<!-- Question 1 -->
	<h1>Hello World</h1>
	<%
		out.print("Welcom to jsp");
	%>
	<br>

	<!-- Question 2 -->

	Current time:
	<%=Calendar.getInstance().getTime()%>
	<br>

	<!-- Question 3 -->
	<%!String name = "Nguyen Thi My";%>

	Hello:
	<span class=<%=name%>>Mỵ Nguyễn </span>
	<br>

	<!-- Question 4 -->
	Current time:
	<%=Calendar.getInstance().getTime()%>

	<!-- Question 6 -->

	<%-- <%
		String number1 = "1";
	String number2 = "x";

	int a = Integer.parseInt(number2);
	int b = Integer.parseInt(number1);
	out.print(a / b);
	%> --%>

	<!-- Import các khung header, footer vào  -->
	<%@ include file="header.html"%>
	<%@ include file="footer.html"%>

	<form action="header.jsp">
		<input type="text" name="uname"> <input type="submit"
			name="go"> <br>
	</form>
	<%--<% response.sendRedirect("https://www.google.com.vn/?hl=vi"); %>  --%>

</body>
</html>