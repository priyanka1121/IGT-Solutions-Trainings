interface I{
    public final static int a = 10;
    public final static int b = 20;
    
}



class cal implements I{
    
    void add(){
        
        System.out.println("ADD: "+(I.a+I.b));
    }
}

public class demo31 {
    public static void main(String[] args) {
        cal c = new cal();
        c.add();
    }
}
