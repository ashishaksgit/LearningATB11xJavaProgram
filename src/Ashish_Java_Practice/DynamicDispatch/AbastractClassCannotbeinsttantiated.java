package Ashish_Java_Practice.DynamicDispatch;
abstract class Animal1 {
    // Abstract method (without body)
    abstract void makeSound();

    // Concrete method (with body)
    void sleep() {
        System.out.println("Sleeping...");
    }
}
class Dog1 extends Animal1 {
    // Providing implementation for abstract method
    void makeSound() {
        System.out.println("Bark!");
    }
}
public class AbastractClassCannotbeinsttantiated {
    public static void main(String[] args) {
       // Animal1 A1 = new Animal1(); --Abstract classes cannot be instantiated.
        Dog1 dog1 = new Dog1();
        dog1.makeSound(); // Output: Bark!
        dog1.sleep();     // Output: Sleeping...
    }
}
