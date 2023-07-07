class A
{
	A()
	{
		System.out.println("A class ");
		// if i create a child class object automatically parent class default constructor will call ..!
	}
}
class B extends A
{
	B()
	{
		System.out.println("B class ");
	}
}
class Demo11
{
	public static void main(String args[])
	{
		//A a = new A();
		//B b = new B();

		//B b = new B();
	}
}
