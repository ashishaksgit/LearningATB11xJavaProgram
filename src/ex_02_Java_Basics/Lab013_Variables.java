package ex_02_Java_Basics;

public class Lab013_Variables {
    //Two main methods exist in the class, but they have different method signatures (method overloading).
    /*
    The actual entry point of a Java program is the main method with the signature
    public static void main(String[] args)
    This is the standard method that the JVM looks for when executing a Java program.
     */
    public static void main(String[] args) {
        System.out.println("main1");

    }
/*
2nd main is not the actual main method that the JVM executes because its parameter is an int, not a String[].
while method is valid because Java supports method overloading (same method name, different parameters).
 */
    public static void main(int args) {
        System.out.println("main2");

    }
}
