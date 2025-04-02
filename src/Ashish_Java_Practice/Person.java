package Ashish_Java_Practice;

public class Person {
    // Instance fields
    private String name;
    private int age;
    private String address;
    private String phone;
    private boolean isMale;

    // Default Constructor (DC)
    public Person() {
        this.name = "Sharad";
        this.age = 33;
        this.address = "B-2332";
        this.phone = "00999999";
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

    // Behavior methods
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }

    public void doHome() {
        System.out.println(name + " is doing household work.");
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
        person1.printDetails();
        person1.eat();
        person1.sleep();
        person1.walk();

        System.out.println("--------------------------");

        // Using parameterized constructor
        Person person2 = new Person("John Doe", 30, "123 Street, City", "9876543210", true);
        person2.printDetails();
        person2.walk();
        person2.doHome();
        person2.sleep();
    }
}
