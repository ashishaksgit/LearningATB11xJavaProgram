package Ashish_Java_Practice.Methodoveriding;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
    String eating(String veg)
    {
        return veg;
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    String eating(String nonveg)
    {
        return nonveg;
    }
}
public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound();  // Output: Animal makes a sound

        Dog myDog = new Dog();
        myDog.sound();  // Output: Dog barks

        Animal myPet = new Dog(); // Upcasting
        myPet.sound();  // Output: Dog barks (Method from Dog class)
        System.out.println(myDog.eating("meat"));
    }
}
