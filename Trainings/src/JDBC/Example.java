package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Example {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/emp";
        String username = "root";
        String password = "123456789";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "INSERT INTO emp (id, name, age, salary, designation) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);

            // Set the parameter values for the placeholder
            statement.setInt(1, 1);  // Example value for id
            statement.setString(2, "jerry");  // Example value for name
            statement.setInt(3, 30);  // Example value for age
            statement.setDouble(4, 5000.00);  // Example value for salary
            statement.setString(5, "Manager");  // Example value for designation

           
            int rowsAffected = statement.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted successfully.");

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

