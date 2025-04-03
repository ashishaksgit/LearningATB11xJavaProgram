package Ashish_Java_Practice.Task_31_Mar_2025;

public class Person {
    // Instance fields
    private String name;
    private int age;
    private String address;
    private String phone;
    private boolean isMale;

    // Default Constructor (DC)
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Not provided";
        this.phone = "Not provided";
        this.isMale = true;
    }

    // Parameterized Constructor (PC)
    public Person(String name, int age, String address, String phone, boolean isMale) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.isMale = isMale;
    }

    // 1. Without Parameters and Without Return Type
    public void greet() {
        System.out.println("Hello! Welcome to the Person class.");
    }

    // 2. Without Parameters but With Return Type
    public String getName() {
        return name;
    }

    // 3. With Parameters and Without Return Type
    public void setAge(int age) {
        this.age = age;
    }

    // 4. With Parameters and With Return Type
    public boolean isAdult(int age) {
        return age >= 18;
    }

    // Method to print details
    public void printDetails() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Gender: " + (isMale ? "Male" : "Female"));
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using default constructor
        Person person1 = new Person();
        person1.greet();
        person1.printDetails();

        System.out.println("--------------------------");

        // Using parameterized constructor
        Person person2 = new Person("John Doe", 30, "123 Street, City", "9876543210", true);
        person2.printDetails();

        System.out.println("Name: " + person2.getName());
        person2.setAge(35);
        System.out.println("Updated Age: " + person2.age);
        System.out.println("Is Adult: " + person2.isAdult(person2.age));
    }
}
