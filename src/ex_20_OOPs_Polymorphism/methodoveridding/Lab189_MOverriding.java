package ex_20_OOPs_Polymorphism.methodoveridding;

public class Lab189_MOverriding {
    public static void main(String[] args) {
        Dog d1  = new Dog();
        d1.sound();
        Animal a1 = new Animal();
        a1.sound();
        Animal.jungle(); //static funtion called without creating object
        a1.jungle();// not a best practice, follow above one with class name
    }
}
class Animal{
    static void jungle()
    {
        System.out.println("animal lives in jungle");
    }

    void sound(){
        System.out.println("Animal Sound!");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark!");
    }
}
