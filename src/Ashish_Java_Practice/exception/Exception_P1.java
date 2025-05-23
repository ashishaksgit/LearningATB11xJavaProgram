package Ashish_Java_Practice.exception;

public class Exception_P1 {
    public static void main(String[] args) {
        System.out.println("Line1");
        try {
            int number =100/0;
        } catch (Exception e) {
            System.out.println("Why are you deviding number by 0");
        }
        System.out.println("line2");
        //if you don't use handle exception in code, 2nd line will not be generated
    }
}
