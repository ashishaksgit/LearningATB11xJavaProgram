package Ashish_Java_Practice.exception;

public class ExceptionHandlingExamples2 {

    // Example 1: Try-Catch for ArithmeticException
    public static void divideByZeroExample() {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Cannot divide by zero.");
        }
    }

    // Example 2: ArrayIndexOutOfBoundsException
    public static void arrayExample() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println("Accessing 4th element: " + arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid index.");
        }
    }

    // Example 3: NumberFormatException
    public static void numberFormatExample() {
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Cannot convert string to number.");
        }
    }

    // Example 4: Multiple catch blocks
    public static void multipleCatchExample() {
        try {
            int[] a = new int[2];
            a[5] = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught.");
        } catch (Exception e) {
            System.out.println("General Exception caught.");
        }
    }

    // Example 5: Finally block
    public static void finallyExample() {
        try {
            int a = 100 / 2;
            System.out.println("Division result: " + a);
        } catch (Exception e) {
            System.out.println("Exception caught.");
        } finally {
            System.out.println("Finally block always executes.");
        }
    }

    // Example 6: Using throw keyword
    public static void customThrowExample() {
        int age = 15;
        if (age < 18) {
            throw new ArithmeticException("You must be 18+ to vote.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    // Example 7: Using throws keyword
    public static void throwsExample() throws InterruptedException {
        System.out.println("Sleeping for 1 second...");
        Thread.sleep(1000);
        System.out.println("Awake!");
    }

    // Main method
    public static void main(String[] args) {
        divideByZeroExample();
        arrayExample();
        numberFormatExample();
        multipleCatchExample();
        finallyExample();

        // Example with throw (handled using try-catch in main)
        try {
            customThrowExample();
        } catch (ArithmeticException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        // Example with throws (handled using try-catch in main)
        try {
            throwsExample();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught.");
        }
    }
}
