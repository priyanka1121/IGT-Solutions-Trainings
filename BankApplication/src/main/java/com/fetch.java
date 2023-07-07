package com;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetch")
public class fetch extends HttpServlet {
    private static final long serialVersionUID = 1L;

    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/bank";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "123456789";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");

        
        String userId = request.getParameter("id");

        
        PrintWriter out = response.getWriter();

        
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            
            String sql = "SELECT id, name, account_number, pan, adhar_card_number, initial_balance FROM account WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, userId);

            
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
               
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String accountNumber = resultSet.getString("account_number");
                String pan = resultSet.getString("pan");
                String adharCardNumber = resultSet.getString("adhar_card_number");
                double initialBalance = resultSet.getDouble("initial_balance");

                out.println("<style>");
                out.println(".container {");
                out.println("    margin: 20px;");
                out.println("    padding: 20px;");
                out.println("    background-color: #fff;");
                out.println("    border-radius: 5px;");
                out.println("    box-shadow: 0 0 5px rgba(0, 0, 0, 0.1);");
                out.println("}");
                out.println("</style>");
                
                out.println("<div class=\"container\">");
                out.println("User ID: " + id + "<br><br>");
                out.println("Name: " + name + "<br><br>");
                out.println("Account Number: " + accountNumber + "<br><br>");
                out.println("PAN: " + pan + "<br><br>");
                out.println("Aadhaar Card Number: " + adharCardNumber + "<br><br>");
                out.println("<b>Current Balance: <b>" + initialBalance + "<br>");
                out.println("</div>");
            } else {
                out.println("User not found!");
            }
        } catch (SQLException e) {
            
            out.println("Database connection error: " + e.getMessage());
        } finally {
           
            out.close();
        }
    }
}
