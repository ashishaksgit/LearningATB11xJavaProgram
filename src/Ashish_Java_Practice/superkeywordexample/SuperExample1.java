package Ashish_Java_Practice.superkeywordexample;
class Parent {
    void show() {
        System.out.println("Parent class method");
    }
    public void message()
    {
        System.out.println("Parent: Hello!");
    }
    final void display()//final method can not be ovreride
    {
        System.out.println("Hi Parent");
    }
}

class Child extends Parent {
    @Override
    void show() {
        super.show(); // Calls Parent's show() method
        System.out.println("Child class method");
    }
    @Override
    public void message() {
        super.show();// Can increase visibility (protected → public)
        System.out.println("Child: Hi!");
    }
   // void display()
   // {

   // }
}

public class SuperExample1 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
        Parent obj2 = new Child();
        obj.message(); // Output: Child: Hi!
    }
}
