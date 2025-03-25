package ex_10_For_Loop;

import java.util.Scanner;

public class Lab105_FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int first = 0, second = 1; // First two numbers

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second; // Calculate next number
            first = second; // Move to next
            second = next; // Update second number
        }

        scanner.close();
    }
}
