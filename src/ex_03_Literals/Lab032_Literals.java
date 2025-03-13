package ex_03_Literals;

public class Lab032_Literals {
    public static void main(String[] args) {
        //program demonstrates different types of integer literals in Java,
        // such as decimal, binary, octal, and hexadecimal.
        /*
        Decimal numbers are numbers we use in daily life (0-9).
age = 65 means 65 in the decimal (base 10) system.
         */
        int age = 65; // Decimal System - base wil 10

        // Binary Literal
        /*Binary numbers use only 0 and 1 (base 2).
Prefix: 0b or 0B tells Java this is a binary number.
0b1010 in binary is equal to 10 in decimal.

         */
        int binary_num = 0b1010; // Decimal System - 10

        // Octal base? -> 8
        /*
        Octal numbers use digits from 0 to 7 (base 8).
Prefix: A number starting with 0 is interpreted as an octal number.
0101 (octal) converts to decimal as:
         */
        int octal = 0101;


        // Hexadecimal Literals - 16
        /*
        Hexadecimal numbers use digits (0-9) and letters (A-F) (base 16).
Prefix: 0x or 0X indicates a hexadecimal literal.
0Xface means:
F = 15, A = 10, C = 12, E = 14

         */
        int hex = 0Xface;
        //base 16 color combination are in hex - #28a745

        System.out.println("Decimal age: " + age);
        System.out.println("Binary 0b1010 (decimal): " + binary_num);
        System.out.println("Octal 0101 (decimal): " + octal);
        System.out.println("Hexadecimal 0xFACE (decimal): " + hex);


    }
}

