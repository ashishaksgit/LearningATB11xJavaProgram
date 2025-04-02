package ex_17_OOPs;

public class Lab168_Cats {

    public static void main(String[] args) {

        Cat c1 = new Cat();
        Cat c2;
        Cat c3;
        //c3.running();
        new Cat();

        c1.running();
   //c2.running();

        new Cat().running();
        System.out.println(new Cat().name);



    }

}

class Cat {
    String name; // null

    void running() {
        System.out.println("Running");
    }
}
