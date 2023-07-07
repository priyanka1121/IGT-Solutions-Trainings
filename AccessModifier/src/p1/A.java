package p1;
public class A {
	public int a =10;
	private int b =20;
	protected int c =30;
	         int d =40;
	        
	 void display()
	 {
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 System.out.println(d);
	 }
}
class B extends A
{
	 void display()
	 {
		 System.out.println(a);
		 //System.out.println(b); only single class 
		 System.out.println(c);
		 System.out.println(d);
	 }
}
class C 
{
	void display()
	 {
		A a1= new A();
		 System.out.println(a1.a);
		 // System.out.println(a1.b);
		 System.out.println(a1.c);
		 System.out.println(a1.d);
	 }
}
