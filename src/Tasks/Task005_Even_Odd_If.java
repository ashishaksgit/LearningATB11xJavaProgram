package Tasks;

import java.util.Scanner;

public class Task005_Even_Odd_If {
    //Create a Program -
    // Take user input &
    // Check weather the input is even or odd number

    public static void main(String[] args) {
        System.out.println("please enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // int number2 = Integer.parseInt(args[0]);
        if(number%2 ==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}