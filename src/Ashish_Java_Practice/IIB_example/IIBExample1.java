package Ashish_Java_Practice.IIB_example;

public class IIBExample1 {
    // Instance variable
    int x = 10;

    // IIB (Instance Initialization Block)
    {
        System.out.println("IIB Block executed");
        System.out.println("Value of x: " + x);
    }

    // Constructor
    IIBExample1() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method started");

        IIBExample1 obj1 = new IIBExample1();
        System.out.println("---");
        IIBExample1 obj2 = new IIBExample1();

        System.out.println("Main method ended");
    }
}
