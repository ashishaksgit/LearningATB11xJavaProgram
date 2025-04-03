package ex_19_OOps_Inheritance.hybrid;
interface Father1 {
     void show();

}
interface Mother1 {
    void display();
}
class Son implements Father1, Mother1 {
    public void show() {
        System.out.println("Father's show() method");
    }

    public void display() {
        System.out.println("Mother's display() method");
    }
}
public class HybridInheritanceExample_possible_with_interface {
    public static void main(String[] args) {
        Son s = new Son();
        s.show();    // Calls Father's method
        s.display(); // Calls Mother's method
    }
}
