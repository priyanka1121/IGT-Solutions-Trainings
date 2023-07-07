package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRec {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root","root");
			
			PreparedStatement pstmt=con.prepareStatement("update emp set desig=? where eid=?");
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter ID ");
			int eid=sc.nextInt();
			
			System.out.println("Enter Designation ...!");
			String desig=sc.next();
			
			pstmt.setString(1, desig);
			pstmt.setInt(2, eid);
			
			pstmt.execute();
			
			pstmt.close();
			con.close();
			System.out.println("Data Updated   successfully....!");
			}
			catch (Exception e) {
				System.out.println(e);
			}

		
	}

}
