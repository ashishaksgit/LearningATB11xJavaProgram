package ex_18_OOPs_Constructor;

public class Lab176_DC {
    public static void main(String[] args) {
        Car c1 = new Car();
//        c1.name = "Telsa";
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);


        System.out.println( "  --------- ");

        Car c2 = new Car();
        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.model);
        Car c3 = new Car(223344);
        System.out.println(c3.phone);
        System.out.println(c3.age);


    }
}

class Car{
    String name;
    int year;
    String model;
    int age;
    int phone;

    // DC
    Car(){
        name = "Unknow Car";
        year = 1991;
        model =  "XXX";
    }
    Car(int phone)
    {
        name="Ashish";
        age=29;
        this.phone=phone;
    }




}