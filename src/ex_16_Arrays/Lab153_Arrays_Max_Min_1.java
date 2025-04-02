package ex_16_Arrays;

import java.util.Scanner;

public class Lab153_Arrays_Max_Min_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find and print the maximum and minimum values
        int max_output = give_me_max(array);
        int min_output = give_me_min(array);

        System.out.println("Maximum Value: " + max_output);
        System.out.println("Minimum Value: " + min_output);

        scanner.close();
    }

    static int give_me_max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) { // Start from 1 to avoid redundant check
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int give_me_min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) { // Start from 1 to avoid redundant check
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
