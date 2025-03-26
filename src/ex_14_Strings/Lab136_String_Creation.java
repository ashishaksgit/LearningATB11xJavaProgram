package ex_14_Strings;

import java.util.logging.SocketHandler;

public class Lab136_String_Creation {
    public static void main(String[] args) {

        // String 2 ways
        String s1 = "pramod"; // SCP
        System.out.println(s1.toUpperCase());

        String s2 = new String("pramod"); // OA -> Object Area
        System.out.println(s2.toUpperCase());
        String s3 = "ashish";
        String s4 = "ashish";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s3==s4);






    }
}
