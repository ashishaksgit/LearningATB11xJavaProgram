package ex_16_Arrays;

import java.util.Scanner;

public class Lab164_2d_Multiplication_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int sizeOfTable = scanner.nextInt();
        scanner.close();  // Fix: Close scanner

        // Print column headers
        System.out.print("\t");
        for (int j = 0; j < sizeOfTable; j++) {
            System.out.print(j + "\t");
        }
        System.out.println();

        // Generate multiplication table
        for (int i = 0; i < sizeOfTable; i++) {
            System.out.print(i + "\t");  // Print row header
            for (int j = 0; j < sizeOfTable; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
