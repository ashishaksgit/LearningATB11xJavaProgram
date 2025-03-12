package Ex_03_Java_12_03_2025;

public class Exercise1 {
    static int number1; //--un-assigned variable
    int number2 = 12;
    public static final float  pi = 3.14f;// can access this variable outside of class due to static
    public static void main(String[] args) {


         //int age; //not initialized so error
        //pi = 3.12f;
        Exercise1 e = new Exercise1();


        System.out.println(pi);
        System.out.println(number1);
        System.out.println(e.number2);
        //System.out.println(age);
       // char onechar;
       // System.out.println(onechar);



    }
}
