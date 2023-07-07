import java.util.*;
class A
{
	Scanner sc= new Scanner(System.in);	
	A()
	{
		System.out.println("A class ");
	}
	void abc()
	{
		
		 
		System.out.print("abc()");
	}
}
class Demo6
{
	public  static    void main(String arg[])
	{
		A a = new A();
		a.abc();
	}
}


