package ex_16_Arrays;

public class Lab150_Arrays {
    public static void main(String[] sumit) {
        int[] marks = {1, 2, 3, 4, 5, 6};
        int[] rollnumber = {100,200,300,400};

        // 2nd way to create the array
        int[] mark2 = new int[5]; // Fixed Size
        int mark3[] = new int[5]; // Fixed Size
        int mark4 = 10;
        String[] names = new String[3];
        names[0] = "Ashish";
        names[1] = "Amit";
        names[2] = "Yasho";
        System.out.println("show all string");
        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }
        System.out.println("Show all names in reverse order:");
        for(int j = names.length-1; j>=0;j--)
        {
            System.out.println(names[j]);

        }


        System.out.println(marks[0]);
        System.out.println(names[0]);

    }
}
