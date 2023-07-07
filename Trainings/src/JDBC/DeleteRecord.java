package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

 

public class DeleteRecord {
    public static void main(String[] args) {    

        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root", "123456789");
                PreparedStatement pstmt=con.prepareStatement("delete from emp  where id=?");
                @SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
                System.out.println("Enter ID ");
                int id = sc.nextInt();

                pstmt.setInt(1, id);

                pstmt.execute();
                pstmt.close();
                System.out.println("Data Deleted sucessfully...!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}