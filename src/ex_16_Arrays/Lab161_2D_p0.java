package ex_16_Arrays;

public class Lab161_2D_p0 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] martix_2_2 = {{1, 2}, {3, 4}};
        int[][] martix_3_1 = {{1}, {3}, {5}};
        System.out.println("Matrix 3x3:");
        printMatrix(matrix);

        System.out.println("Matrix 2x2:");
        printMatrix(martix_2_2);

        System.out.println("Matrix 3x1:");
        printMatrix(martix_3_1);

    }
    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
