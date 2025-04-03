package Ashish_Java_Practice.DynamicDispatch;
class Parent {
    void show() {
        System.out.println("Parent's show method");
    }
}
class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child's show method");
    }
}
public class DynamicDispatchExample {
    public static void main(String[] args) {
        Parent obj = new Child(); // Upcasting
                obj.show(); // Calls Child's show() method at runtime
    }
}
