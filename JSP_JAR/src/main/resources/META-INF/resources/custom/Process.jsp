<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Process Page</title>
</head>
<body>
<% out.print((String)request.getAttribute("test-param"));
	Thread.sleep(10000);
	request.getRequestDispatcher("Process2").forward(request, response);
%>

</body>
</html>