package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteEmp {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root","root");
			
			PreparedStatement pstmt=con.prepareStatement("delete from emp where eid=?");
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter ID ");
			int id=sc.nextInt();
			
			
			pstmt.setInt(1, id);
			
			pstmt.execute();
			
			pstmt.close();
			con.close();
			System.out.println("Data Deleted  successfully....!");
			}
			catch (Exception e) {
				System.out.println(e);
			}

	}

}
