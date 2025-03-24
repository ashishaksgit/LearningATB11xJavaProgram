package ex_04_Operators;

public class Lab051_InstanceOf_Operator {
    public static void main(String[] args) {
        // New Operator
        String s1 = new String("Pramod");
        Integer number = new Integer(20);
        Integer number2 =30; //// Auto-boxing
        // Learn this in OOPs

        System.out.println(s1 instanceof String);
        System.out.println(number instanceof Integer);
        System.out.println((number2 instanceof Integer));
    }
}
