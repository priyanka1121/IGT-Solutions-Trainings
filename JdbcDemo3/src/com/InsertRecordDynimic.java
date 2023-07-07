package com;
import java.sql.*;
import java.util.Scanner;
public class InsertRecordDynimic {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root","root");

			
			PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?)");
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter ID ");
			int id=sc.nextInt();
			
			System.out.println("Enter Name :");
			String name=sc.next();
			
			System.out.println("Enter Designation ");
			String desig=sc.next();
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, desig);

			pstmt.execute();
			pstmt.close();
			con.close();
			System.out.println("Data Inserted successfully....!");
			}
			catch (Exception e) {
				System.out.println(e);
			}
	}											
}
