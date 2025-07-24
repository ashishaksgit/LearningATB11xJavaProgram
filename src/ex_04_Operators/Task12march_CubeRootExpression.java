package ex_04_Operators;

public class Task12march_CubeRootExpression {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z = 10;

        double result = Math.cbrt(Math.pow(x, 2) + Math.pow(y, 2) - Math.abs(z));
        System.out.printf("Result: %.3f\n", result);
    }
}
