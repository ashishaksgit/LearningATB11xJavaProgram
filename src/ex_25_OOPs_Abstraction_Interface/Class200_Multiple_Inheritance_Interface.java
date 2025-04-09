package ex_25_OOPs_Abstraction_Interface;

public class Class200_Multiple_Inheritance_Interface {

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.money();

    }
}


interface Mother{
    void money();//interface has abstract method    ;
}
interface Father{
    void money();//By default, all methods in an interface are public and abstract.
}
//The Child class implements both Mother and Father interfaces — this is multiple inheritance in Java, which is only allowed via interfaces (not classes).

class Child implements Mother,Father{


    @Override
  public void money() {System.out.println("Child Money!");
    }
}