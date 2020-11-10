<%@ page language="Java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Result</title>
</head>
<body>
	<%
		float a = Float.parseFloat(request.getParameter("Number1"));
	float b = Float.parseFloat(request.getParameter("Number2"));

	String valueGet = request.getParameter("caculate");
	
	if (valueGet.equals("Cong")) {
		float c = a + b;
		out.print("Tổng hai số trên là " + c);
		
	} if (valueGet.equals("Tru")) {
		float d = a-b;
		out.print("Hiệu hai số trên là " + d);
		
	}if (valueGet.equals("Nhan")) {
		float e = a*b;
		out.print("Tích hai số trên là " + e);
	}
	if (valueGet.equals("Chia")) {
		float f = a/b;
		out.print("Thương hai số trên là " + f);
	}
	
	%>
</body>
</html>