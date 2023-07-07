<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Deposit Form</title>
</head>
<body>
    <%
       
        String id = request.getParameter("id");
        String accountNumber = request.getParameter("accountNumber");
        String pan = request.getParameter("pan");
        double depositAmount = Double.parseDouble(request.getParameter("withdrawAmount"));

       
        String DB_URL = "jdbc:mysql://localhost:3306/bank";
        String DB_USER = "root";
        String DB_PASSWORD = "123456789";

       
        try {
          
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Update
            String sql = "UPDATE account SET initial_balance = initial_balance - ? WHERE id = ? AND account_number = ? AND pan = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDouble(1, depositAmount);
            statement.setString(2, id);
            statement.setString(3, accountNumber);
            statement.setString(4, pan);

       
            int rowsUpdated = statement.executeUpdate();

          
            if (rowsUpdated > 0) {
                out.println("<script>alert('Withdraw successful');</script>");
            } else {
                out.println("<script>alert('Withdraw failed. Invalid credentials or account does not exist.');</script>");
            }


            connection.close();
        } catch (Exception e) {
            out.println("<script>alert('An error occurred.');</script>");
            e.printStackTrace();
        }
    %>
</body>
</html>
