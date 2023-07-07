package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

class Emp
{
	static void insert()
	{
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
	static void display()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root","root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from emp");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" : "+rs.getString(2)+ " : "+rs.getString(3));
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	static  void update()
	{
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
	static  void delete()
	{
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
public class Project {
	public static void main(String[] args) {
		System.out.println("Welcome to JDBC Programming...!");
		int ch=0;
		Scanner sc= new Scanner(System.in);
		do {
				System.out.println("1 ) INSERT ");
				System.out.println("2 ) Display");
				System.out.println("3 ) Update ");
				System.out.println("4 ) DLETE  ");
				System.out.println("5 ) exit ");
				 System.out.println("Enter the Choce : ");
				ch=sc.nextInt();
				if(ch==1) {
					Emp.insert();
				}
				else if(ch==2) {
					Emp.display();
				}
				else if(ch==3) {
					Emp.update();
				}
				else if(ch==4) {
					Emp.delete();
				}
				 
		}while(ch<=4);

	} 
}

// CRUD opetion 
// CREATE 
// READ 
// UPDATE 
// DELETE



