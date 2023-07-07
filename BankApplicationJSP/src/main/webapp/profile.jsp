<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Profile</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }

        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h2 {
            margin-top: 0;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f5f5f5;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>User Profile</h2>
        <form action="profile.jsp" method="get">
            <div class="form-group">
                <label for="id">Enter your ID:</label>
                <input type="text" id="id" name="id" required>
                <button type="submit">View</button>
            </div>
        </form>

        <%-- Retrieve user input and fetch data from the database --%>
        <% String id = request.getParameter("id");
           if (id != null) {
               try {
                   Class.forName("com.mysql.jdbc.Driver");
                   String url = "jdbc:mysql://localhost:3306/bank";
                   String username = "root";
                   String password = "123456789";
                   Connection connection = DriverManager.getConnection(url, username, password);

                   String query = "SELECT * FROM account WHERE id = ?";
                   PreparedStatement statement = connection.prepareStatement(query);
                   statement.setString(1, id);

                   ResultSet resultSet = statement.executeQuery();
                   if (resultSet.next()) {
                       %>
                       <h3>Profile Details:</h3>
                       <table>
                           <tr>
                               <th>ID</th>
                               <th>Name</th>
                               <th>Account Number</th>
                               <th>PAN</th>
                               <th>Aadhaar Card Number</th>
                               <th>Initial Balance</th>
                           </tr>
                           <tr>
                               <td><%= resultSet.getString("id") %></td>
                               <td><%= resultSet.getString("name") %></td>
                               <td><%= resultSet.getString("account_number") %></td>
                               <td><%= resultSet.getString("pan") %></td>
                               <td><%= resultSet.getString("adhar_card_number") %></td>
                               <td><%= resultSet.getString("initial_balance") %></td>
                           </tr>
                       </table>
                       <%
                   } else {
                       out.println("<p>No profile found for the given ID.</p>");
                   }

                   resultSet.close();
                   statement.close();
                   connection.close();
               } catch (Exception e) {
                   out.println("<p>An error occurred while fetching the profile details.</p>");
                   e.printStackTrace();
               }
           }
        %>
    </div>
</body>
</html>
