class A{
	static int x =10;
	static void abc(){
		System.out.println("Hi abc method");
	}
}

class Demo24{
	public static void main(String args[]){
		// A a = new A();
		// a.abc();
		// System.out.println("X: "+a.x);
		A.abc();
		System.out.println("X: "+A.x);
	}
}