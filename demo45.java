import java.io.BufferedReader;

import java.io.InputStreamReader;




public class demo45 {

    public static void main(String[] args) {

        try {

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));




            System.out.println("Enter id: ");

            int id=Integer.parseInt(br.readLine());




            System.out.println("Enter id: ");

            String fname=br.readLine();




            System.out.println("Enter id: ");

            String lname=br.readLine();




            System.out.println("Id: "+id);

            System.out.println("Firstname: "+fname);

            System.out.println("Lastname: "+lname);

        } catch (Exception e) {

            // TODO: handle exception

        }

    }

}