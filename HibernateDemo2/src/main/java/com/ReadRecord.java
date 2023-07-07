package com;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReadRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session sesion=factory.openSession();
		
		Transaction tx= sesion.beginTransaction();
		
		List prod=sesion.createQuery("from Product").list();

		Iterator i =prod.iterator();
		while(i.hasNext()) {
			
			Product product=(Product)i.next();
			System.out.println("ID :"+product.getPid());
			System.out.println("NAME :"+product.getPname());
			System.out.println("PRICE  :"+product.getPrice());
			System.out.println("DESCRIPTION:"+product.getDescription());
			System.out.println("==============");
			
		}
		
//		Product p = new Product();
//			
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter Id to Desplay The Product : ");
//		int pid=sc.nextInt();
//		
//		Product prod=(Product)sesion.get(Product.class, pid);
//		
//		System.out.println("Product ID= "+prod.getPid());
//	     System.out.println("Product Name= "+prod.getPname());
//	     System.out.println("Product PRICE = "+prod.getPrice());
//	     System.out.println("Product DESICIPTION= "+prod.getDescription()); 
	     
	
	    						
	    						

	}

}
