package ex_04_Operators;

public class Lab043_Interview_Concat_Plus
{
    public static void main(String[] args) {
        String first_name = "Ashish";
        String last_name = "Sharma";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        // // PramodDutta1010 - first operator - + performed as Concatenation

        System.out.println(a + b + first_name + last_name);


        System.out.println(first_name + last_name + (a + b));
        System.out.println(3-6*6/2);

        // BODMAS - Bracket of Div, mul, add, sub
        //The program comments mention BODMAS (Brackets, Order, Division, Multiplication, Addition, Subtraction), which is similar to operator precedence in Java.
        //Parentheses () have the highest precedence.

        //Multiplication (*), Division (/), and Modulus (%) have higher precedence than Addition (+) and Subtraction (-).

          //      If + has both integers and strings, Java performs integer addition first (unless interrupted by a string).




    }
}
