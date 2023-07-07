<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Money Transfer</title>
    <style>
        /* CSS styles */
    </style>
</head>
<body>
    <%-- Handle the money transfer logic --%>
    <%-- Retrieve form data from request --%>
    <% String fromId = request.getParameter("fromId");
       String fromAccountNumber = request.getParameter("fromAccountNumber");
       String toId = request.getParameter("toId");
       double transferAmount = Double.parseDouble(request.getParameter("transferAmount"));
    %>
    
    <%-- Create database connection --%>
    <% String DB_URL = "jdbc:mysql://localhost:3306/bank";
       String DB_USER = "root";
       String DB_PASSWORD = "123456789";
       
       try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
           
           // Check if the fromId and toId exist in the database
           String checkSql = "SELECT * FROM account WHERE id IN (?, ?)";
           PreparedStatement checkStatement = connection.prepareStatement(checkSql);
           checkStatement.setString(1, fromId);
           checkStatement.setString(2, toId);
           
           ResultSet resultSet = checkStatement.executeQuery();
           
           int rowCount = 0;
           while (resultSet.next()) {
               rowCount++;
           }
           
           if (rowCount == 2) {
               // Both fromId and toId exist, proceed with the transfer
               
               // Check if the fromId has sufficient balance
               String balanceSql = "SELECT initial_balance FROM account WHERE id = ?";
               PreparedStatement balanceStatement = connection.prepareStatement(balanceSql);
               balanceStatement.setString(1, fromId);
               ResultSet balanceResultSet = balanceStatement.executeQuery();
               
               if (balanceResultSet.next()) {
                   double fromBalance = balanceResultSet.getDouble("initial_balance");
                   
                   if (fromBalance >= transferAmount) {
                      // Update 
                       String updateSql = "UPDATE account SET initial_balance = initial_balance - ? WHERE id = ?";
                       PreparedStatement updateStatement = connection.prepareStatement(updateSql);
                       updateStatement.setDouble(1, transferAmount);
                       updateStatement.setString(2, fromId);
                       updateStatement.executeUpdate();
                       
                       String updateSql2 = "UPDATE account SET initial_balance = initial_balance + ? WHERE id = ?";
                       PreparedStatement updateStatement2 = connection.prepareStatement(updateSql2);
                       updateStatement2.setDouble(1, transferAmount);
                       updateStatement2.setString(2, toId);
                       updateStatement2.executeUpdate();
                       
                    
                       out.println("<script>alert('Transfer successful');</script>");
                   } else {

                       out.println("<script>alert('Insufficient balance');</script>");
                   }
               } else {
                 
                   out.println("<script>alert('An error occurred');</script>");
               }
           } else {
              
               out.println("<script>alert('Invalid fromId or toId');</script>");
           }
           
       
           connection.close();
       } catch (Exception e) {
          
           out.println("<script>alert('An error occurred');</script>");
           e.printStackTrace();
       }
    %>
    
    <%-- Redirect back to the transfer page --%>
    <script>
        setTimeout(function() {
            window.location = "transfer.html";
        }, 1000); 
</script>