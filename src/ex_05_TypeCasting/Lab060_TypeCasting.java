package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //short s = phone_no; // implicit ? not pssible automatically since long to short
        short s = (short) phone_no; // Explicit Casting - Narrowing
        System.out.println(s);
    }
}
