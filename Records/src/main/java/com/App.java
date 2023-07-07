package com;

 

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
class Emp
{
    static void insert()
    {
        try {        
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");

 

            SessionFactory factory = cfg.buildSessionFactory();

 

            Session session = factory.openSession();

 

            Transaction tx = session.beginTransaction();


 

            EmployeeIGT e = new EmployeeIGT();

 

            Scanner sc= new Scanner(System.in);

 

            System.out.println("Enter id:");

 

           int  uid= sc.nextInt();
            System.out.print("Enter Name :");
          String   name= sc.next();
            System.out.print("Enter Age: ");
          int   age= sc.nextInt();
            System.out.print("Enter salary: ");
           int  salary= sc.nextInt(); 
           System.out.print("Enter designation :");
           String  desig= sc.next();

 

            e.setUid(uid);
            e.setName(name);
            e.setDesig(desig);
            e.setAge(age);
            e.setSalary(salary);

 

            session.save(e);
            tx.commit();

 

            System.out.println("Inserted");
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
    static void display()
    {
        try {
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");

            SessionFactory factory = cfg.buildSessionFactory();
            Session session = factory.openSession();

 

            Transaction tx = session.beginTransaction();

            List emp=session.createQuery("from  EmployeeIGT").list();
            Iterator i=emp.iterator();
            while(i.hasNext()) {
                EmployeeIGT e=(EmployeeIGT)i.next();
                System.out.println(e.getUid());
                System.out.println(e.getAge());
                System.out.println(e.getDesig());
                System.out.println(e.getSalary());
                System.out.println(e.getName());
            }

        } 
        catch (Exception e) {
            System.out.println(e);
        }

    }
    static void update()
    {
        try {        
             Configuration cfg = new Configuration();
                cfg.configure("hibernate.cfg.xml");

 

                SessionFactory factory = cfg.buildSessionFactory();

 

                Session session = factory.openSession();

 

                Transaction tx = session.beginTransaction();

 

             // Read employee ID from user
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter employee ID: ");
                int uid = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

 

                // Retrieve the employee record to update
                EmployeeIGT employee = session.get(EmployeeIGT.class, uid);
                if (employee == null) {
                    System.out.println("Employee with ID " + uid + " not found.");
                    tx.rollback();
                    session.close();
                    factory.close();
                    return;
                }
                System.out.print("Enter Salary: ");
                int salary = scanner.nextInt();
                employee.setSalary(salary);

                session.update(employee);
                tx.commit();

 

                System.out.println("Record updated successfully.");
                //scanner.close();
               // session.close();
               // factory.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }

 

        
    }
    static void delete()
    {
        try {        
             Configuration cfg = new Configuration();
                cfg.configure("hibernate.cfg.xml");

                SessionFactory factory = cfg.buildSessionFactory();

                Session session = factory.openSession();

                Transaction tx = session.beginTransaction();

 


                EmployeeIGT e = new EmployeeIGT();

 

                Scanner sc= new Scanner(System.in);

 

                System.out.println("Enter id:");
               int  uid= sc.nextInt();

 

               e.setUid(uid);
                session.delete(e);
                tx.commit();

 

                System.out.println("Deleted");
        } 
        catch (Exception e) {
            System.out.println(e);
        }

    }

}

 

public class App {

 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch=0;
        do {
            System.out.println("Enter choice ");
             System.out.println("1) ADD RECORD ");
             System.out.println("2) Display Record ");
             System.out.println("3) UPDATE");
             System.out.println("4) DELETE");
             System.out.println("5) EXIT");
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

        }while(ch<5);

 

    }

 

}