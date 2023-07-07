package com;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
class Clerkqq
{
	
}
public class CollDemo1 {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add("Thanesh");
		al.add('A');
		al.add(true);
		al.add(4,400000);
		al.add(new Date());
		al.add(new Thread());
		al.add(new Clerkqq());
		
		System.out.println(al);
		System.out.println(al.contains(400));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		System.out.println(al.remove(4));
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("==============");
		
	 Iterator i =al.iterator();
	 while(i.hasNext()) {
		 System.out.println(i.next());
	 }		
	}
}










