package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class test {

 

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded...");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root","123456789");
            Statement stmt = (Statement) con.createStatement();
            stmt.execute("Insert into users values(102, 'ABCD')");
            System.out.println("Data inserted successfully!!");
            stmt.close();
        }catch(Exception e) {
            System.out.println(e);
        }
    }

 

}