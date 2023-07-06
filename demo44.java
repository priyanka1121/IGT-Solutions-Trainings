import java.util.*;

class A{
    A(){
        ArrayList<Integer> al = new ArrayList<Integer>();
        //al.add("ABC");
        al.add(300);
        al.add(400);
        al.add(700);
        al.add(2,45356);

        Iterator i = al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        Date d = new Date();
        System.out.println(d);
    }
}
public class demo44{
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
    }
}