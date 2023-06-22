// Abstract class
abstract class Animal {
    // Abstract method
    abstract void makeSound();

    // Concrete method
    void sleep() {
        System.out.println("Zzzz");
    }
}

// Interface
interface Jumpable {
    void jump();
}

// Concrete class implementing both the abstract class and interface
class Dog extends Animal implements Jumpable {
    // Implementing abstract method from the abstract class
    void makeSound() {
        System.out.println("Woof!");
    }

    // Implementing method from the interface
    public void jump() {
        System.out.println("Jumping high");
    }
}

public class methodTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Output: Woof!
        dog.jump(); // Output: Jumping high
        dog.sleep(); // Output: Zzzz
    }
}
