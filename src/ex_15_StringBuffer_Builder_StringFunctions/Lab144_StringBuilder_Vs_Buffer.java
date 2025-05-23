package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {

        // String - 90%
        String s0 = "Ashish";
        String s1 = new String("Ashish");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Ashish");
        StringBuilder stringBuilder = new StringBuilder("Ashish");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

        System.out.println("-----new --------");
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World"); // Appends " World" to "Hello"
        System.out.println(sb); // Output: Hello World

        sb.insert(5, " Java"); // Inserts " Java" at index 5
        System.out.println(sb); // Output: Hello Java World

        sb.replace(6, 10, "Python"); // Replaces "Java" with "Python"
        System.out.println(sb); // Output: Hello Python World

        sb.delete(6, 13); // Deletes "Python"
        System.out.println(sb); // Output: Hello  World

        sb.reverse(); // Reverses the string
        System.out.println(sb); // Output: dlroW  olleH

        String school = "DAV";
        school.replace("ABC","DAV");
        System.out.println(school);





    }
}
