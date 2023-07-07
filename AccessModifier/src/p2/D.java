package p2;
import p1.*;
public class D {
	void display()
	{
		A a2= new A();
		System.out.println(a2.a);
		//System.out.println(a2.b);
		//System.out.println(a2.c);
		//System.out.println(a2.d);
	}

}
class E extends A
{   
	void display()
	{
		System.out.println(a);
		//System.out.println(b);
		System.out.println(c);// same package + sub CLASS in other package 
		//System.out.println(d);// only in same pakage 
	}	
}d
class F extends E
{
	void display()
	{
		System.out.println(a);// yes 
		//System.out.println(b);// no 
		System.out.println(c); // yes 
		//System.out.println(d); // no
	}
}