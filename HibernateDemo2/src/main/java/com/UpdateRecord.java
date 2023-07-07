package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecord {

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
			
		System.out.println("Enter Price : ");
		int price = sc.nextInt();

		p.setPid(pid);
		p.setPrice(price);
		
		sesion.update(p);
		tx.commit();
			
		System.out.println("Saved Succcessfully...!");

		
	}

}
