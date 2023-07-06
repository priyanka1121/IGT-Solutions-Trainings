class Emp{
    class Insert{
        Insert(){
            System.out.println("Insert class");
        }
        void abc(){
            System.out.println("Insert class abc method");
        }
    }
    class Display{
        Display(){
            System.out.println("Display class");
        }   
        void xyz(){
            System.out.println("Display class xyz method");
        }
    }
}
class demo43{
    public static void main(String[] args) {
        System.out.println("Hi demo 43 ");
        Emp e = new Emp();
        Emp.Insert ins = e.new Insert();
        ins.abc();
    }
}
