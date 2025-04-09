package ex_23_OOPs_Super;

public class Lab194_Super {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}


class GOD{
    void sound(){
        System.out.println("God!");
    }
}

class Animal extends GOD{
    protected  String color  = "white";


    void sound(){
        System.out.println("Animal Sound!");
        super.sound();
    }

}

class Dog extends Animal{

    private String color  = "Black";

    Dog(){
        super();
        System.out.println(color);
    }

    void display(){
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }

}