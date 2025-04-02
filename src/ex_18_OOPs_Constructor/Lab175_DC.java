package ex_18_OOPs_Constructor;

public class Lab175_DC {
    public static void main(String[] args) {
        A a = new A();
        new A();
        new A();
        A b;
        new A(10);
    }
}

class A{
    A(){
        System.out.println("DC");
    }
    A(int num)
    {
        System.out.println(num);
    }
}