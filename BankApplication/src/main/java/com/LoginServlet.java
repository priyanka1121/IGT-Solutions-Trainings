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
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    private static final String DB_URL = "jdbc:mysql://localhost:3306/bank";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "123456789";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PrintWriter out = response.getWriter();

        try {
           
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);

            
            rs = stmt.executeQuery();

            if (rs.next()) {
                // Valid credentials
                
                HttpSession session = request.getSession();
                session.setAttribute("username", username);

                
                response.sendRedirect("home.html");
            } else {
               
                request.setAttribute("loginFailed", true);

                // Forward back to the login page
                request.getRequestDispatcher("login.html").forward(request, response);
                response.setContentType("text/html");
                PrintWriter out1 = response.getWriter();
                out1.println("alert('Message from Servlet: This is an alert!');");

            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            out.println("Login failed!");
            out.println("alert('Message from Servlet: This is an alert!');");

        } finally {
           
            try {
                if (rs != null)
                    rs.close();
                if (stmt != null)
                    stmt.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
