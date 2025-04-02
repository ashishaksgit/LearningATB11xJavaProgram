package ex_16_Arrays;

public class Lab160_JaggedArrays {
    public static void main(String[] args) {
        // Java allows jagged arrays where each row can have a different length
        int[][] jaggedArray = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7}
        };
        for (int i = 0; i < jaggedArray.length; i++) {
            // Loop through each column in the current row
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
                //System.out.print();
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }
}
