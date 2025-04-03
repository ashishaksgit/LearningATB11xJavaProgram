package Ashish_Java_Practice.DynamicDispatch;
//abstract class Animal {
     abstract class Animal
    {
      abstract void eat();
        void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
   // @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    void eat() {
        System.out.println("Dog eats meat");
    }
}

class Cat extends Animal {
    //@Override
    void makeSound() {
        System.out.println("Cat meows");
    }

    @Override
    void eat() {
        System.out.println("cat also eats meat");
    }
}

public class DynamicDispatchTest2 {
    public static void main(String[] args) {
       Animal a;  // Reference variable of Animal type
        //Animal a2= new Animal(); //Abstract classes cannot be instantiated.

        a = new Dog(); // Dog object assigned to Animal reference
        a.makeSound(); // Calls Dog's makeSound() method
        a.eat();

         a = new Cat(); // Cat object assigned to Animal reference
        a.makeSound(); // Calls Cat's makeSound() method
        a.eat();

//The method makeSound() is overridden in Dog and Cat classes. The decision about which makeSound() to invoke is made at runtime.
    }
}
