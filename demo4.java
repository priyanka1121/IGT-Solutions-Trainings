import java.util.Scanner;
class A
{
	int uid; String name; int age; int salary;String desig;
	A()
	{
		try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter The ID  ? ");
            uid=sc.nextInt();
            System.out.print("Enter The name ? ");
             name=sc.next();
            System.out.print("Enter The AGE   ? ");
             age=sc.nextInt();
            System.out.print("Enter The Salary   ? ");
             salary=sc.nextInt();
            System.out.print("Enter The Desig ? ");
             desig=sc.next();
        }	
	}
	void display()
	{	
		System.out.println("ID  : "+uid);
		System.out.println("Name : "+name);
		System.out.println("AGE : "+age);
		System.out.println("Salary: "+salary);

		System.out.println("Desig : "+desig);	
	}
}
class Demo4
{
	public static void main(String args[])
	{
		System.out.println("Demo3 ");
		A a = new A();	
		a.display();	
	}
}