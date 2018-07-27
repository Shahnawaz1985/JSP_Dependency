<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Start Page</title>
</head>
<body>
<% request.getRequestDispatcher("/hello").forward(request, response); %>
</body>
</html>