<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
   
</head>
<body>
    <h1>Employee Details</h1>
   
    <% String id = request.getParameter("id"); %>
    <% String name = request.getParameter("name"); %>
    <% String age = request.getParameter("age"); %>
    <% String salary = request.getParameter("salary"); %>
    <% String designation = request.getParameter("designation"); %>

    
    <p>ID: <%= id %></p>
    <p>Name: <%= name %></p>
    <p>Age: <%= age %></p>
    <p>Salary: <%= salary %></p>
    <p>Designation: <%= designation %></p>
</body>
</html>
