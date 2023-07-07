import java.io.*;


public class demo47 {

        public static void main(String[] args) {

        try {

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));




           File dir1=new File("abc");

           dir1.mkdir();




           File dir2=new File("xyz");

           dir2.mkdir();




           File f=new File(dir2, "atoz.txt");

           

            if(f.exists()){

                System.out.println("File exists");

                System.out.println("Please enter some other name for file: ");

                String fname=br.readLine();

                f=new File(dir2, fname);

                f.createNewFile();

           

            }

            else{

                f.createNewFile();

            }

            try (PrintWriter pw = new PrintWriter(new FileOutputStream(f, true))) {
            }




        } catch (Exception e) {

            // TODO: handle exception

        }

    }

}