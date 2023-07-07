package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateAccountServlet")
public class CreateAccount extends HttpServlet {
    private static final long serialVersionUID = 1L;

   
    private static final String DB_URL = "jdbc:mysql://localhost:3306/bank";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "123456789";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String accountNumber = request.getParameter("accountNumber");
        String pan = request.getParameter("pan");
        String adharCardNumber = request.getParameter("adharCardNumber");
        double initialBalance = Double.parseDouble(request.getParameter("initialBalance"));

      
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO account (id, name, account_number, pan, adhar_card_number, initial_balance) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, accountNumber);
            statement.setString(4, pan);
            statement.setString(5, adharCardNumber);
            statement.setDouble(6, initialBalance);

            // Execute the query
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                // Account creation successful
                response.sendRedirect("accountCreated.html");
            } else {
                // Account creation failed
                response.sendRedirect("error.html");
            }
        } catch (SQLException e) {
            // Handle any database errors
            e.printStackTrace();
            response.sendRedirect("error.html");
        }
    }
}
