package ex_02_Java_Basics;

public class Lab025_Local_Variable {
    public static void main(String[] args) {
        /*
        Yes, all variables in this program are local variables
         because they are declared inside the main method and have limited scope.
         A local variable is a variable that is declared inside a method, constructor, or block and is only accessible within that method or block.

Declared inside a method → They cannot be accessed outside the method.
Memory is allocated when the method is called → Destroyed when the method ends.
Must be initialized before use → Unlike instance or static variables, local variables don’t have default values.
         */
        int a = 10;
        byte b = 10;
        short s = 10;
        long l = 9876543210L;
        float f = 3.14F;
        double d = 67.8987654567;
        boolean b1 = true;
        char c = 'A';
    }
}
