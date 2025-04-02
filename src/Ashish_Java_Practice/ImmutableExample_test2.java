package Ashish_Java_Practice;


final class ImmutableExample2 {
    private  String name="ashish"; // Removed 'final' to allow modification

    public ImmutableExample2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) { // Added a setter method
        this.name = newName;
    }
}
public class ImmutableExample_test2 {
    public static void main(String[] args) {
        ImmutableExample2 obj = new ImmutableExample2("John");
        System.out.println(obj.getName()); // Output: John

        obj.setName("Mike"); // Now, the name can be modified
        System.out.println(obj.getName()); // Output: Mike
    }
}
