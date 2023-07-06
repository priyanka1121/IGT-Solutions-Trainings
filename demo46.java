import java.io.BufferedReader;

import java.io.File;

import java.io.FileReader;

import java.io.InputStreamReader;




public class demo46 {

    public static void main(String[] args) {

        String line=null;

        try {

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));




            System.out.println("Enter file name: ");

            String fname=br.readLine();




            File f=new File(fname);

            if(f.exists()){

                try (BufferedReader fr = new BufferedReader(new FileReader(fname))) {
                    while ((line=fr.readLine())!=null){

                        System.out.println(line);

                    }
                }

            }

            else{

                System.out.println("file does't exist");

            }




        } catch (Exception e) {

            // TODO: handle exception

        }

    }

}