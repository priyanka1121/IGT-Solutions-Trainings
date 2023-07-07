package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServlerPage2
 */
public class ServlerPage2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServlerPage2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ServletConfig config=getServletConfig();
			
			String driver=config.getInitParameter("dbdriver");
			String url=config.getInitParameter("url");
			String username=config.getInitParameter("username");
			String userpass=config.getInitParameter("userpass");
			
			
			Class.forName(driver);
			Connection con= DriverManager.getConnection(url, username,userpass);
			
			
			
			Statement stmt=con.createStatement();
			stmt.execute("insert into emp values(900,'Salman',55,55555,'Actor')");
			stmt.close();
			con.close();
			System.out.println("Data Inserted successfully....!");
				
			} catch (Exception e) {
			System.out.println(e);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
