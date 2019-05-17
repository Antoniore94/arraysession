<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% HttpSession sesion = request.getSession(); 
    ArrayList<String> nombres = (ArrayList<String>)sesion.getAttribute("nombre");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Los alumnos registrados: </p>
	<ul>
		<% for(String n : nombres)
			{out.println("<li>"+n+"</li>");}
		%>
	</ul>
	<a href="index.jsp">Index</a>
</body>
</html>