package Ashish_Java_Practice.CollecetionFramework;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet of Strings
        TreeSet<String> fruits = new TreeSet<>();
//TreeSet stores unique elements in sorted (ascending) order.
        // Adding elements to the TreeSet
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
       // fruits.add(null); -- not allowed
        fruits.add("Apple");  // Duplicate - will not be added

        // Displaying the TreeSet
        System.out.println("Fruits in sorted order:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking if an element exists
        if (fruits.contains("Mango") && fruits.contains("Banana"))
        {
            System.out.println("Mango and Banana are present in the TreeSet.");
        }


        // Removing an element
        fruits.remove("Banana");

        // Displaying the updated TreeSet
        System.out.println("After removing Banana:");
        System.out.println(fruits);

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);//No duplicate

        System.out.println("TreeSet: " + numbers);



    }
}
