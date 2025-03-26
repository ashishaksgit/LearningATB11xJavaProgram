package ex_14_Strings;

public class Lab140_Interview_P1 {
    public static void main(String[] args) {
     String s1 = "Hello"; // SCP-- string constant pool
        String s4 = "Hello"; // SCP
        String s10 = "Hello"; // SCP
        System.out.println(s1.equals(s4));
        //s1,s4 and s10 will point to same location
        //Java stores string literals in a special memory area called the String Constant Pool (SCP) to optimize memory usage.
        String s2 = new String("Hello"); //OA -Heap Memory with Object Allocation - OA)
        String s3 = new String("Hello");
        String s5 = new String("hello");
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));
        System.out.println(s5==s3);
        //This<s2, s3, and s5> means they are allocated separately in heap memory rather than SCP


    }
}
