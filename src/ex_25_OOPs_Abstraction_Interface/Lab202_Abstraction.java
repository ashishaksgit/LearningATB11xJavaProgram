package ex_25_OOPs_Abstraction_Interface;

public class Lab202_Abstraction {
    public static void main(String[] args) {
        ConcreateClass c = new ConcreateClass();
        c.display();
        c.display2();
        Incomplete_Interface.display3();// Correct way to call static method in interface
        Incomplete_Interface obj = new ConcreateClass();
        obj.display2();
    }
}


class ConcreateClass implements Incomplete_Interface{

    @Override
    public void display() {
        System.out.println("Hi");
    }
}

interface Incomplete_Interface{
    int a = 10; // final
    void display();

    default void display2(){
        System.out.println("Default is allowed!2");
    }

    static void display3(){
        System.out.println("Default is allowed!3");
    }
}

abstract class Incomplete_abstract{
    int a= 10;
    abstract void display1();
    void display2(){
        System.out.println("abstract ");
    }
}