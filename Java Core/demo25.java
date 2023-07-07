class Car{
    final int speed=200;
    final void run(){
        System.out.println("Hi run method with speed of 200");
    }
    public String Speed() {
        return null;
    }
}

class maruthi extends Car{
    //void run(){
    //    System.out.println("Hi run method with speed of 250");
    //}
}

public class demo25 {
   public static void main(String[] args) {
     Car c = new Car();
    c.run();
    System.out.println("Speed: " + c.Speed());
    maruthi m = new maruthi();
    m.run();
   }
}
