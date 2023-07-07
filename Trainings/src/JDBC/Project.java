package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

 
abstract class A {

    int id;
    String name;
    int age;
    float salary;
    String designation;
    Scanner sc = new Scanner(System.in);

    A() {

         try {

           System.out.println("Enter Id:");
            id = sc.nextInt();
            System.out.println("Enter the Name:");
            name = sc.next();
            System.out.println("Enter Age:");
            age = sc.nextInt();
        } catch (Exception e) {

            System.out.println(e);


        }

    }


    public void display() {

        System.out.println("\nID:" + id);
        System.out.println("NAME:" + name);
        System.out.println("AGE:" + age);
        System.out.println("SALARY:" + salary);
        System.out.println("DESIGNATION:" + designation);
    }

 

 

    public abstract void riseSalary();

}

final class Tester extends A {
    public Tester() {
        salary = 10000;

        designation = "Tester";

 

    }

 

 

    public void riseSalary() {

 

        salary = salary + 5000;

 

        System.out.println("incremented Salary for Tester:" + salary);

 

    }

 

}

 

 

final class Programmer extends A {

 

    public Programmer() {

 

        salary = 40000;

 

        designation = "Programmer";

 

    }

 

 

    public void riseSalary() {

 

        salary = salary + 10000;

 

        System.out.println("incremented Salary for Programmer:" + salary);

 

    }

 

}

 

 

final class Manager extends A {

 

    public Manager() {

 

        salary = 90000;

 

        designation = "Manager";

 

    }

 

 

    public void riseSalary() {

 

        salary = salary + 15000;

 

        System.out.println("incremented Salary for Manager:" + salary);

 

    }

 

}

 

 

public class Project {

 

    public static void main(String args[]) {

 

        int ch1 = 0, ch2 = 0;

 

        ArrayList<A> list = new ArrayList<A>();

 

 

        // Create Connection object

 

        Connection connection = null;

 

 

        try {

 

            // Register JDBC driver

 

            Class.forName("com.mysql.cj.jdbc.Driver");

 

 

            // Open a connection

 

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "1234");

 

 

            System.out.println("Connection established successfully!");

 

 

            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO emp1 VALUES (?,?,?,?,?)");

 

 

            do {

 

                System.out.println("--------------------------------");

 

                System.out.println("1. CREATE");

 

                System.out.println("2. READ");

 

                System.out.println("3. UPDATE");

 

                System.out.println("4. DELETE");

 

                System.out.println("5. Exit");

 

 

                System.out.println("--------------------------------");

 

 

                System.out.println("Enter your Choice: ");

 

                @SuppressWarnings("resource")
				Scanner sc1 = new Scanner(System.in);

 

 

                ch1 = sc1.nextInt();

 

                if (ch1 == 1) {

 

                    do {

 

                        System.out.println("--------------------------------");

 

                        System.out.println("1. Tester");

 

                        System.out.println("2. Programmer");

 

                        System.out.println("3. Manager");

 

                        System.out.println("4. Exit");

 

                        System.out.println("--------------------------------");

 

 

                        System.out.println("Enter your Choice: ");

 

                        @SuppressWarnings("resource")
						Scanner sc2 = new Scanner(System.in);

 

                        ch2 = sc2.nextInt();

 

 

                        switch (ch2) {

 

                        case 1:

 

                            Tester tester = new Tester();

 

                            list.add(tester);

 

                            insertEmployeeData(pstmt, tester);

 

                            break;

 

                        case 2:

 

                            Programmer programmer = new Programmer();

 

                            list.add(programmer);

 

                            insertEmployeeData(pstmt, programmer);

 

                            break;

 

                        case 3:

 

                            Manager manager = new Manager();

 

                            list.add(manager);

 

                            insertEmployeeData(pstmt, manager);

 

                            break;

 

                        }

 

                    } while (ch2 != 4);

 

                }

 

                if (ch1 == 2) {

 

 

                    readAndDisplayRecords(connection);

 

                }

 

 

                if (ch1 == 3) {

 

                    updateRecord(connection);

 

                }

 

                if (ch1 == 4) {

 

                    deleteRecord(connection);

 

                }

 

 

            } while (ch1 != 5);

 

 

            pstmt.close();

 

            connection.close();

 

 

        } catch (ClassNotFoundException e) {

 

            System.out.println("JDBC driver not found!");

 

            e.printStackTrace();

 

        } catch (SQLException e) {

 

            System.out.println("Connection failed!");

 

            e.printStackTrace();

 

        }

 

    }

 

 

    public static void insertEmployeeData(PreparedStatement pstmt, A employee) throws SQLException {

 

        pstmt.setInt(1, employee.id);

 

        pstmt.setString(2, employee.name);

 

        pstmt.setInt(3, employee.age);

 

        pstmt.setFloat(4, employee.salary);

 

        pstmt.setString(5, employee.designation);

 

 

        pstmt.execute();

 

        System.out.println("\nData inserted successfully!");

 

    }

 

 

    public static void readAndDisplayRecords(Connection connection) {

 

        try {

 

            Statement statement = connection.createStatement();

 

            ResultSet rs = statement.executeQuery("SELECT * FROM emp1");

 

 

            while (rs.next()) {

 

                System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getInt(3) + " : "

 

                        + rs.getFloat(4) + " : " + rs.getString(5));

 

            }

 

 

            rs.close();

 

            statement.close();

 

            System.out.println("\nRecords displayed successfully!");

 

 

        } catch (SQLException e) {

 

            System.out.println("Failed to read records from the database!");

 

            e.printStackTrace();

 

        }

 

    }

 

 

    public static void updateRecord(Connection connection) {

 

        try {

 

            PreparedStatement pstmt = connection.prepareStatement("UPDATE emp1 SET Salary = ? WHERE Id = ?");

 

 

            int id;

 

            float salary;

 

 

            @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

 

 

            System.out.println("Enter Id:");

 

            id = sc.nextInt();

 

 

            System.out.println("Enter Salary:");

 

            salary = sc.nextFloat();

 

 

            pstmt.setFloat(1, salary);

 

            pstmt.setInt(2, id);

 

 

            pstmt.execute();

 

            pstmt.close();

 

            System.out.println("\nData updated successfully!");

 

 

        } catch (SQLException e) {

 

            System.out.println("Failed to update record in the database!");

 

            e.printStackTrace();

 

        }

 

    }

 

 

    public static void deleteRecord(Connection connection) {

 

        try {

 

            PreparedStatement pstmt = connection.prepareStatement("DELETE FROM emp1 WHERE Id = ?");

 

 

            int id;

 

 

            @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

 

 

            System.out.println("Enter Id:");

 

            id = sc.nextInt();

 

 

            pstmt.setInt(1, id);

 

 

            pstmt.execute();

 

            pstmt.close();

 

            

 

            System.out.println("\nData deleted successfully!");
 

        } catch (SQLException e) {

 

            System.out.println("Failed to delete record from the database!");

 

            e.printStackTrace();

 

        }

 

    }

 

 

}