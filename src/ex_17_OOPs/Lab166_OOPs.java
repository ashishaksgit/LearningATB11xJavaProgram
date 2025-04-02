package ex_17_OOPs;

public class Lab166_OOPs {

    public static void main(String[] args) {
        Person amit;
        Person p1 = new Person();
        // Person - Class
        // p2 - Object Ref
        // new Person() -> Object

        p1.name = "Lucky";
        System.out.println(p1.name);

        Person p2  = new Person();
        p2.name = "Ashish";
        System.out.println(p2.name);
        Person p5 = new Person();
        p5.name="Shashi";
        System.out.println(p5.name);
        System.out.println(p1.remaining_amount_sal(200,10));
        p1.sleep();


        System.out.println(new Person().name = "Not Ref name");



    }


}

class Person{
    // Attribute | Properties |  Data Members | Instance variables
    String name;
    String phone;
    String color_eyes;
    int legs;
    double salary;
    byte age;
    double weight;
    boolean isMale;

    // Behaviour | Function | Method
    void sleep(){
        System.out.println("I am sleeping");
    }

    String greet(String name){
        return "Hello" +name;
    }

    void talk(){
        System.out.println("Talking");
    }
    int remaining_amount_sal(int salary,int tax){
        return salary-tax;
    }
}