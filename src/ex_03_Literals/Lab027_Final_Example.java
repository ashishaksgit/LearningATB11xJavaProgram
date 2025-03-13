package ex_03_Literals;

public class Lab027_Final_Example {
    public static void main(String[] args) {
        int local;
        local = 10;
        System.out.println(local);

        final float PI = 3.14f;
        // PI = 3.13f; This is final in nature.
        System.out.println(PI);
    }
    public void display()
    {
        //can not use the above declared variable "local' since it is local, can use only in main fuction
        //local=50;  --can not assign this variable here
    }
}
