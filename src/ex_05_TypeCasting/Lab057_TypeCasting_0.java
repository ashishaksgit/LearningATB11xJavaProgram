package ex_05_TypeCasting;

public class Lab057_TypeCasting_0 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid syntax -> smaller data into the bigger data type
        //byte is a smaller data type (1 byte, 8 bits), which can store values from -128 to 127.
        // Implicit - Casting - Widening
        System.out.println(a);

        System.out.println("-----");
        byte b1 = 10;
        short s = b1; // byte -> short (Valid)
        int a1 = b1;   // byte -> int (Valid)
        long l = a;  // int -> long (Valid)
        float f = l; // long -> float (Valid)
        double d = f; // float -> double (Valid)

        System.out.println("byte: " + b1);
        System.out.println("short: " + s);
        System.out.println("int: " + a1);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
    }


    }

