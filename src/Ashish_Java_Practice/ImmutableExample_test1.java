package Ashish_Java_Practice;

final class ImmutableExample {
      private final String name;
    public ImmutableExample(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class ImmutableExample_test1 {
    public static void main(String[] args) {
        ImmutableExample obj = new ImmutableExample("John");
        System.out.println(obj.getName()); // Output: John

      // obj.name = "Mike";  // ❌ Compilation error (Cannot modify final field)
        System.out.println(obj.getName());

    }
}
