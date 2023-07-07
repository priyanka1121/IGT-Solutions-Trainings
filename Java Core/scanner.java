import java.util.Scanner;

 

class Clerk{

    String name;

    int id;

    int age;

    String desg;

    float salary;

 

    Clerk(){

    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("----------Clerk----------");

 

            System.out.print("Enter your name: ");

         name = sc.next();


        System.out.print("Enter your id: ");

         id = sc.nextInt();

 

        System.out.print("Enter your age: ");

         age = sc.nextInt();

 

        System.out.print("Enter your Designation: ");

         desg = sc.next();

 

        System.out.print("Enter your salary: ");

         salary = sc.nextFloat();
    }


    System.out.println("");

 

    }


    void display(){

        System.out.println("Name: " +name);

        System.out.println("ID: " +id);

        System.out.println("Age: " +age);

        System.out.println("Designation: " +desg);

        System.out.println("Salary: " +salary);

        System.out.println("");

    }

}

 

class Manager{

    String name;

    int id;

    int age;

    String desg;

    float salary;

 

    Manager(){

    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("----------Manager----------");


            System.out.print("Enter your name: ");

         name = sc.next();


        System.out.print("Enter your id: ");

         id = sc.nextInt();

 

        System.out.print("Enter your age: ");

         age = sc.nextInt();

 

        System.out.print("Enter your Designation: ");

         desg = sc.next();

 

        System.out.print("Enter your salary: ");

         salary = sc.nextFloat();
    }

 

    System.out.println("");

 

    }


    void display(){

        System.out.println("Name: " +name);

        System.out.println("ID: " +id);

        System.out.println("Age: " +age);

        System.out.println("Designation: " +desg);

        System.out.println("Salary: " +salary);

        System.out.println("");

    }

}

 

class Developer{

    String name;

    int id;

    int age;

    String desg;

    float salary;

 

    Developer(){

    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("----------Developer----------");


            System.out.print("Enter your name: ");

         name = sc.next();


        System.out.print("Enter your id: ");

         id = sc.nextInt();

 

        System.out.print("Enter your age: ");

         age = sc.nextInt();

 

        System.out.print("Enter your Designation: ");

         desg = sc.next();

 

        System.out.print("Enter your salary: ");

         salary = sc.nextFloat();
    }

 

    System.out.println("");

    }


    void display(){

        System.out.println("Name: " +name);

        System.out.println("ID: " +id);

        System.out.println("Age: " +age);

        System.out.println("Designation: " +desg);

        System.out.println("Salary: " +salary);

        System.out.println("");

    }

}

 

class Tester{

    String name;

    int id;

    int age;

    String desg;

    float salary;

 

    Tester(){

    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("----------Tester----------");

 

        

            System.out.print("Enter your name: ");

         name = sc.next();


        System.out.print("Enter your id: ");

         id = sc.nextInt();

 

        System.out.print("Enter your age: ");

         age = sc.nextInt();

 

        System.out.print("Enter your Designation: ");

         desg = sc.next();

 

        System.out.print("Enter your salary: ");

         salary = sc.nextFloat();
    }

 

    System.out.println("");

    }


    void display(){

        System.out.println("Name: " +name);

        System.out.println("ID: " +id);

        System.out.println("Age: " +age);

        System.out.println("Designation: " +desg);

        System.out.println("Salary: " +salary);

        System.out.println("");

    }

}

 

 

class Project{

    public static void main(String[] args) {

 

    System.out.println("1. Manager");

    System.out.println("2. Developer");

    System.out.println("3. Tester");

    System.out.println("4. Clerk");

    System.out.println("");

 

    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("What's your Designation?: ");

        int num = sc.nextInt();

 

        if(num == 1){

            Manager manager = new Manager();

            manager.display();

        }

 

        if(num==2){

            Developer developer = new Developer();

            developer.display();

        }

 

        if(num==3){

            Tester tester = new Tester();

            tester.display();

        }

 

        if(num==4){

            Clerk clerk = new Clerk();

            clerk.display();

        }
    }


    }

}