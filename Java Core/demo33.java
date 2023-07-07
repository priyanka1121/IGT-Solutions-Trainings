
import java.io.*;

public class demo33 {
    public static void main(String[] args) {
        m1();
    }
    static void m1(){
        m2();
        System.out.println("m1 method");
    }
        static void m2(){
        m3();
        System.out.println("m2 method");
    }
        static void m3(){
            try{
                File f=new File("abc.txt");
                try (FileReader fr = new FileReader(f)) {
                } catch (FileNotFoundException e) {
                    throw e;
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            catch(FileNotFoundException e){
                System.out.println("something went wrong with file");
            }
            finally{
                System.out.println("Thank you");
            }
    }
}