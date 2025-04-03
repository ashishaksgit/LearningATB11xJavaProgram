package ex_20_OOPs_Polymorphism.methodoverloading;

public class Calculator {

    int attribute;

    public int add(int a, int b) {
        return a + b;
    }
//using add funtion(add() for different parameter(different data types), this is called method overloading
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(3,4));
        System.out.println(c1.add(3.414,4.56));
    }
}
