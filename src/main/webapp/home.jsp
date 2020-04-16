<%@page import="com.demo.entities.Classes"%>
<%@page import="java.util.List"%>
<%@page import="com.demo.dao.ClassDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>List</h1>
	<%
		List<Classes> list = (List<Classes>) request.getAttribute("listClass");
		out.print("<ul>");
		for (Classes classes : list) {
			out.print("<li>" + classes.getName() + "</li>");
		}
		out.print("</ul>");
	%>

</body>
</html>