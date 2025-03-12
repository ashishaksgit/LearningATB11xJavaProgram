package Ex_03_Java_12_03_2025;

public class Exercise_4_mathfun1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z = 10;

        // Compute the expression: ∛(x² + y² - |z|)
        double result = Math.cbrt(Math.pow(x, 2) + Math.pow(y, 2) - Math.abs(z));

        // Print the result
        System.out.println("Result: " + result);
    }
}
