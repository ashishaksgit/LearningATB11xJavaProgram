package ex_10_For_Loop;

public class Lab112_For_loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) { // Loop runs from 0 to 49
            if (i == 5 || i == 6) { // Skip 5 and 6
                continue; // Skips iteration for 5 and 6
            }
            System.out.println(i);
        }
    }
}
