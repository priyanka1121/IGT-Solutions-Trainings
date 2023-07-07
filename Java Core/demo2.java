import java.util.Scanner;
class Demo2
{
	public static void main(String args[])
	{

		try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter The ID  ? ");
            int uid=sc.nextInt();

            System.out.print("Enter The name ? ");
            String name=sc.next();

            System.out.print("Enter The AGE   ? ");
            int age=sc.nextInt();

            System.out.print("Enter The Salary   ? ");
            int salary=sc.nextInt();

            System.out.print("Enter The Desig ? ");
            String desig=sc.next();

            System.out.println("ID  : "+uid);
            System.out.println("Name : "+name);
            System.out.println("AGE : "+age);
            System.out.println("Salary: "+salary);
            System.out.println("Desig : "+desig);
        }		
	}
}