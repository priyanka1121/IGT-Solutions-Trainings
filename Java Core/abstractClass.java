abstract class A {
    abstract void abc();
}

abstract class B extends A {
    void abc(){
        System.out.println("ABC Method");
    }
    abstract void xyz();
}

class C extends B {
    void abc() {
        super.abc(); 
    }

    void xyz(){
        System.out.println("XYZ Method");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        C c = new C();
        c.abc();
        c.xyz();
    }
}
