package com;
import java.sql.*;
public class Demo1 {

	public static void main(String[] args) {
		// 5 steps :
		// load the driver + add the jar file 
		// create the connection 
		// create the statement 
		// execute the query 
		// close the connection
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded ...!");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");
			System.out.println("Connection Created !");
			
			Statement stmt=con.createStatement();
			
			stmt.execute("insert into emp values(400,'Nishanth','Develoepr')");
			
			stmt.close();
			
			System.out.println("Data Inserted Succesfully...!");
			
		} catch (Exception e) {
			System.out.println(e);
		}	
	}
}
