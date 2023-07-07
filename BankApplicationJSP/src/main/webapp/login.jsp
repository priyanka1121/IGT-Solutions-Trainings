<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<%
  String username = request.getParameter("username");
  String password = request.getParameter("password");

  Connection conn = null;
  PreparedStatement stmt = null;
  ResultSet rs = null;

  try {
  
    String dbURL = "jdbc:mysql://localhost/bank?useSSL=false";
    String dbUser = "root";
    String dbPassword = "123456789";

    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);

    String query = "SELECT * FROM users WHERE username = ? AND password = ?";
    stmt = conn.prepareStatement(query);
    stmt.setString(1, username);
    stmt.setString(2, password);
    rs = stmt.executeQuery();

    if (rs.next()) {

      response.sendRedirect("main.html");
    } else {
     
      out.println("<p class='error'>Invalid username or password.</p>");
    }
  } catch (Exception e) {
  
    e.printStackTrace();
    out.println("<p class='error'>An error occurred. Please try again later.</p>");
  } finally {
  
    if (rs != null) {
      try {
        rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    if (stmt != null) {
      try {
        stmt.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    if (conn != null) {
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
%>
</body>
</html>