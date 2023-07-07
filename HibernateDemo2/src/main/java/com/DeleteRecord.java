package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteRecord {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session sesion=factory.openSession();
		
		Transaction tx= sesion.beginTransaction();
		
		Product p = new Product();
			
			Scanner sc= new Scanner(System.in);
		
			System.out.println("ENter Product ID : ");
			int pid=sc.nextInt();
			
			p.setPid(pid);
			
			sesion.delete(p);
			tx.commit();
			
			System.out.println("Deleted  Succcessfully...!");
//			
//			 User user = (User) session.get(User.class, new Integer(2));
//		      System.out.println("User ID= "+user.getId());
//		      System.out.println("User Name= "+user.getName());

	}

}
