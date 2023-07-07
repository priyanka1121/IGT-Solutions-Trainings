abstract class Shape {
    abstract void draw();

    void display() {
        System.out.println("Displaying shape...");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class abstractShape {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw(); // Output: Drawing a circle
        circle.display(); 

        Shape rectangle = new Rectangle();
        rectangle.draw(); // Output: Drawing a rectangle
        rectangle.display(); // Output: Displaying shape
    }
}
