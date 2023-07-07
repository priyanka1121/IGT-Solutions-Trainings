package com;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory=cfg.buildSessionFactory();
		
		
		Session sesion=factory.openSession();

		Transaction tx= sesion.beginTransaction();

		Product p = new Product();
		Scanner sc= new Scanner(System.in);
			
//		System.out.println("ENter Product ID : ");
//			int pid=sc.nextInt();
//			
			System.out.println("Enter P Name :");
			String pname=sc.next();
			
			System.out.println("Enter Price : ");
			int price = sc.nextInt();
			
			System.out.println("Enter Description : ");
			String desig=sc.next();
			
			
			//p.setPid(pid);
			
			p.setPname(pname);
			p.setPrice(price);
			p.setDescription(desig);
			
			sesion.save(p);
			tx.commit();
			
			System.out.println("Saved Succcessfully...!");
			
		
	}

}
