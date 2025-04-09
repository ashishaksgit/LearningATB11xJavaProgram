package ex_21_OOPs_Encapsulation;
 class animal {
    private int horn;
    private String color;

    public animal(int h, String c)
    {
       this.horn=h;
       this.color=c;
    }
    public int howmanyhorn()
        {
return horn;
    }
    public String getColor() {
        return color;
    }
}

public class example1 {

    public static void main(String[] args) {
        // Create an Animal object
        animal a = new animal(2, "Brown");

        // Use getter methods
        System.out.println("Horns: " + a.howmanyhorn());
        System.out.println("Color: " + a.getColor());
    }

}
