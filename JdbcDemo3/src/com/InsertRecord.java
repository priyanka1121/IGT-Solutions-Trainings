package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {
		
		try {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root","root");
		Statement stmt=con.createStatement();
		stmt.execute("insert into emp values(500,'Salman','Actor')");
		stmt.close();
		con.close();
		System.out.println("Data Inserted successfully....!");
			
		} catch (Exception e) {
		System.out.println(e);
		}
	}

}
