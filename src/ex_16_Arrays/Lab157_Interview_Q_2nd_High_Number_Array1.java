package ex_16_Arrays;

import java.util.Arrays;

class NumberFinder {
    // Method to find the second largest number without sorting
    void secondLargestNumberWay2() {
        int[] numbers1 = {12, 34, 10, 1, 100, 3, 4, 32};

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : numbers1) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }

        System.out.println("Second highest number (without sorting): " + secondMax);
    }
}
public class Lab157_Interview_Q_2nd_High_Number_Array1 {
    public static void main(String[] args) {
        // Find Second Largest Number in an Array

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

        // Sort the array
        Arrays.sort(numbers);

        // Print the largest, second largest, and other values carefully
        System.out.println("Largest number: " + numbers[numbers.length - 1]);
        System.out.println("Second largest number: " + numbers[numbers.length - 2]);

        if (numbers.length >= 3) {
            System.out.println("Third largest number: " + numbers[numbers.length - 3]);
        }

        if (numbers.length >= 8) {
            System.out.println("Smallest number: " + numbers[0]);
        } else {
            System.out.println("Not enough elements for smallest index (8th element)");
        }

        System.out.println("----------------------");

        // Call the method to find the second highest number without sorting
        NumberFinder finder = new NumberFinder();
        finder.secondLargestNumberWay2();
    }
}
