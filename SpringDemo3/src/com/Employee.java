package com;

public class Employee {

	private int uid;
	private String name; 
	
	// salary 
	// age 
	// desig
	
	Employee(){
		System.out.println("Default COnstructor...!");
	}

	public Employee(int uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
	}
	public void display()
	{
		System.out.println("ID :"+uid);
		System.out.println("Name :"+name);
	}
}
