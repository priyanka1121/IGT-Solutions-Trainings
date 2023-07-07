package com;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
public class Demo1 {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>(4);
		al.add(100);
		al.add(200);
		al.add("abc");
		al.add(true);
		al.add(new Date());
		al.add(600);
		
		Iterator<Object> i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("===================");
		System.out.println(al.contains(100));
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.remove(0));
		System.out.println(al);
	}

}
