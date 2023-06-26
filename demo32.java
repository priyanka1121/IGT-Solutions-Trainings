import java.io.*;
public class demo32 {
    public static void main(String[] args) throws FileNotFoundException{
        m1();
    }
    static void m1() throws FileNotFoundException{
        m2();
        System.out.println("M1 Method");
    }
    static void m2() throws FileNotFoundException{
        m3();
        System.out.println("M2 method");
    }
    static void m3() throws FileNotFoundException{
        File f = new File("abc.txt");
        try (FileReader fr = new FileReader(f)) {
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
           
            e.printStackTrace();
        }
    }
}
