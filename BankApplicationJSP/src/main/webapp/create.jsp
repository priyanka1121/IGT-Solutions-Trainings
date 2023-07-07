<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>

<%
    int id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("name");
    String accountNumber = request.getParameter("accountNumber");
    String pan = request.getParameter("pan");
    String adharCardNumber = request.getParameter("adharCardNumber");
    int initialBalance = Integer.parseInt(request.getParameter("initialBalance"));

    
    String url = "jdbc:mysql://localhost:3306/bank";
    String username = "root";
    String password = "123456789";

    try {
       
        Connection connection = DriverManager.getConnection(url, username, password);

       
        String sql = "INSERT INTO account (id, name, account_number, pan, adhar_card_number, initial_balance) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.setString(2, name);
        statement.setString(3, accountNumber);
        statement.setString(4, pan);
        statement.setString(5, adharCardNumber);
        statement.setInt(6, initialBalance);

       
        int rowsInserted = statement.executeUpdate();


        connection.close();

        if (rowsInserted > 0) {
           
            out.println("<script>alert('Account created successfully');</script>");
        } else {
          
            out.println("<script>alert('Account creation failed');</script>");
        }
    } catch (Exception e) {
        e.printStackTrace();
        out.println("<script>alert('An error occurred');</script>");
    }
%>
