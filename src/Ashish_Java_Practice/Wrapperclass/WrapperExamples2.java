package Ashish_Java_Practice.Wrapperclass;
public class WrapperExamples2 {
public static void integerExample() {
    int a = 10;
    Integer intObj = Integer.valueOf(a);  // Boxing
    int b = intObj.intValue();           // Unboxing
    System.out.println("Integer Example: " + intObj + " (Boxed), " + b + " (Unboxed)");
}

// Example 2: Double wrapper
public static void doubleExample() {
    double d = 25.67;
    Double doubleObj = Double.valueOf(d);  // Boxing
    double e = doubleObj.doubleValue();    // Unboxing
    System.out.println("Double Example: " + doubleObj + " (Boxed), " + e + " (Unboxed)");
}

// Example 3: Character wrapper
public static void characterExample() {
    char ch = 'A';
    Character charObj = Character.valueOf(ch);  // Boxing
    char ch2 = charObj.charValue();             // Unboxing
    System.out.println("Character Example: " + charObj + " (Boxed), " + ch2 + " (Unboxed)");
}

// Example 4: Boolean wrapper
public static void booleanExample() {
    boolean flag = true;
    Boolean boolObj = Boolean.valueOf(flag);  // Boxing
    boolean flag2 = boolObj.booleanValue();   // Unboxing
    System.out.println("Boolean Example: " + boolObj + " (Boxed), " + flag2 + " (Unboxed)");
}

// Example 5: Auto-boxing and auto-unboxing
public static void autoBoxingUnboxingExample() {
    Integer x = 100;  // Auto-boxing
    int y = x;        // Auto-unboxing
    System.out.println("Auto-boxing Example: x = " + x + ", y = " + y);
}

// Example 6: Parsing from String
public static void parsingExample() {
    String strNum = "123";
    int parsedInt = Integer.parseInt(strNum);
    double parsedDouble = Double.parseDouble("45.67");
    boolean parsedBool = Boolean.parseBoolean("true");

    System.out.println("Parsing Example: int = " + parsedInt + ", double = " + parsedDouble + ", boolean = " + parsedBool);
}

public static void main(String[] args) {
    integerExample();
    doubleExample();
    characterExample();
    booleanExample();
    autoBoxingUnboxingExample();
    parsingExample();
}
}
