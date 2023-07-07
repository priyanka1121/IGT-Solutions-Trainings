package com;

public class A {
	public int a1=100;
	private int b1=200;
	protected int c1 =300;
	int d1=400;
	protected void display() {
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
	}
}

class B extends A{
	protected void display() {
		System.out.println(a1);
		//System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
	}
}
class c{
	void display() {
		A a = new A();
		System.out.println(a.a1);
		//System.out.println(a.b1);
		System.out.println(a.c1);
		System.out.println(a.d1);
	}
}