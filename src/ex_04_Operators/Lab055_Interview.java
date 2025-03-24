package ex_04_Operators;

public class Lab055_Interview {
    public static void main(String[] args) {
        System.out.println('A' == 65);

        System.out.println("------");
        System.out.println('A' == 65); // true
        System.out.println('B' == 66); // true
        System.out.println('C' == 67); // true
        System.out.println('A' == 'B'); // false (65 != 66)
        System.out.println('A' + 1 == 66); // true ('A' -> 65, 65 + 1 = 66)
    }
}
