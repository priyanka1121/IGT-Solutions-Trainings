package com;

import java.io.IOException;
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

@WebServlet("/WithdrawServlet")
public class withdraw extends HttpServlet {
    private static final long serialVersionUID = 1L;

   
    private static final String DB_URL = "jdbc:mysql://localhost:3306/bank";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "123456789";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form data
        int id = Integer.parseInt(request.getParameter("id"));
        String accountNumber = request.getParameter("accountNumber");
        String pan = request.getParameter("pan");
        double withdrawAmount = Double.parseDouble(request.getParameter("withdrawAmount"));

        
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            // Check if the account exists and retrieve 
            String selectSql = "SELECT initial_balance FROM account WHERE id = ? AND account_number = ? AND pan = ?";
            PreparedStatement selectStatement = connection.prepareStatement(selectSql);
            selectStatement.setInt(1, id);
            selectStatement.setString(2, accountNumber);
            selectStatement.setString(3, pan);
            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                double currentBalance = resultSet.getDouble("initial_balance");
                if (currentBalance >= withdrawAmount) {
                    double newBalance = currentBalance - withdrawAmount;

                    // Update the account balance
                    String updateSql = "UPDATE account SET initial_balance = ? WHERE id = ?";
                    PreparedStatement updateStatement = connection.prepareStatement(updateSql);
                    updateStatement.setDouble(1, newBalance);
                    updateStatement.setInt(2, id);

                    // Execute the update query
                    int rowsUpdated = updateStatement.executeUpdate();
                    if (rowsUpdated > 0) {
                        // Withdrawal successful
                        response.sendRedirect("success.html");
                    } else {
                        // Withdrawal failed
                        response.sendRedirect("error.html");
                    }
                } else {
                    // Insufficient balance
                    response.sendRedirect("error.html");
                }
            } else {
                // Account not found
                response.sendRedirect("error.html");
            }
        } catch (SQLException e) {
            // Handle any database errors
            e.printStackTrace();
            response.sendRedirect("error.html");
        }
    }
}
