package ex_05_TypeCasting;

public class Lab058_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid - > Implicit Casting- Automatically
        int a1 = (int)b; // Explicit Casting - Widening( doesn't require)
        System.out.println(b);
        System.out.println(a);
        System.out.println(a1);

    }
}
