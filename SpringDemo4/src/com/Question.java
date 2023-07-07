package com;

import java.util.*;

// id , name . location:
// location : list . AP , UP , MP , Banglore , Kolkath 
public class Question {
	private int id;
	private String name;
	
	private List<String>answers;
	private Set ph;

	public Question(int id, String name, List<String> answers, Set ph) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
		this.ph = ph;
	}
	public void display()
	{
		System.out.println(id +" : "+name );
		System.out.println("Answers...!");
		
		Iterator i =answers.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("NUMBER...!");
		
		Iterator phone =ph.iterator();
		while(phone.hasNext()) {
			System.out.println(phone.next());
		}
	}
}
