package ex_04_Operators;

public class Lab054_Interview {
    public static void main(String[] args) {
        char a1 = 'A'; // ASCII -> 65 --In Java, characters are stored as integers using ASCII values.
        char b1 = 'B'; // 66
        System.out.println(a1 + b1);
        System.out.println('A' + 'B');
        System.out.println('A' - 'B');
        //If you want to concatenate characters instead of adding their ASCII values:
        System.out.println("" + a1 + b1);


        // a1+b1 - 65+66 -> 131
    }
}
