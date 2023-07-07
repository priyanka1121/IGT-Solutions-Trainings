<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Full Name</title>
</head>
<body>
    
   
    <% String firstName = request.getParameter("firstName"); %>
    <% String lastName = request.getParameter("lastName"); %>

    
    <% String fullName = firstName + " " + lastName; %>

   
    <h1>My full name is: <%= fullName %></h1>
</body>
</html>
