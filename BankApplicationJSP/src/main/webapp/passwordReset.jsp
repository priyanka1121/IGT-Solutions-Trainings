<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("newPassword");
    String confirmPassword = request.getParameter("confirmPassword");

   
    if (!password.equals(confirmPassword)) {
        out.println("<script>alert('Passwords do not match');</script>");
    } else {
        Connection connection = null;
        PreparedStatement updateStatement = null;

        try {
           
            String updateSql = "UPDATE users SET password = ? WHERE username = ?";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "123456789");
            updateStatement = connection.prepareStatement(updateSql);
            updateStatement.setString(1, password);
            updateStatement.setString(2, username);
            int rowsUpdated = updateStatement.executeUpdate();

            if (rowsUpdated > 0) {
                out.println("<script>alert('Password reset successful');</script>");
            } else {
                out.println("<script>alert('Username not found');</script>");
            }
        } catch (Exception e) {
            out.println("<script>alert('An error occurred');</script>");
            e.printStackTrace();
        } finally {
          
            if (updateStatement != null) {
                try {
                    updateStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
%>
    