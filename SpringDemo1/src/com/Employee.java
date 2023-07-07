package com;

public class Employee {
	private int uid;
	private String name;
	private String desig;
	
	
	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesig() {
		return desig;
	}


	public void setDesig(String desig) {
		this.desig = desig;
	}


	public void display() {
	    System.out.println("Prdouct ID: " + uid);
	    System.out.println("Employee Name: " + name);
	    System.out.println("Employee Designation: " + desig);
	}
}
