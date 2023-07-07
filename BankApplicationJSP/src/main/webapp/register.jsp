<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>

<%
  
    String url = "jdbc:mysql://localhost:3306/bank"; 
    String username = "root"; 
    String password = "123456789";

   
    String enteredUsername = request.getParameter("username");
    String enteredPassword = request.getParameter("password");

    
    if (enteredUsername != null && enteredPassword != null && !enteredUsername.isEmpty() && !enteredPassword.isEmpty()) {
        try {
            
            Connection connection = DriverManager.getConnection(url, username, password);

            
            String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

      
            statement.setString(1, enteredUsername);
            statement.setString(2, enteredPassword);

 
            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
              
                out.println("<h1>Registration Successful!</h1>");
                out.println("<p>Username: " + enteredUsername + "</p>");
            } else {
                
                out.println("<h1>Registration Failed!</h1>");
                out.println("<p>Failed to insert user data.</p>");
            }

            
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } else {

        out.println("<h1>Invalid Inputs!</h1>");
        out.println("<p>Please enter both a username and a password.</p>");
    }
%>
