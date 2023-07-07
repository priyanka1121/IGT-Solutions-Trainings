package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

 

public class UpdateRecord {
    public static void main(String[] args) {    

        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root", "123456789");
                PreparedStatement pstmt=con.prepareStatement("Update Emp  set Salary= ? where id=?");
                @SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
                System.out.println("Enter ID ");
                int id = sc.nextInt();

                System.out.println("Enter salary ");
                int salary = sc.nextInt();

                pstmt.setInt(1, salary);
                pstmt.setInt(2, id);

                pstmt.execute();
                pstmt.close();
                System.out.println("data inserted sucessfully...!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}