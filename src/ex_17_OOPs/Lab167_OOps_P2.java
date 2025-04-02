package ex_17_OOPs;

public class Lab167_OOps_P2 {

    public static void main(String[] args) {

        Student s1 = new Student();
        //1. Student - Class Loading
        //2. s1 - Object Ref.
        //3. new Student() -> Object creation
        System.out.println(s1.myname("ashish"));
        s1.sleep();



    }
}

class Student{
    String name;
    int roll;
    String myname( String n)
    {
       return this.name=n;
    }

    void sleep()
    {
        System.out.println("i am sleeping");
    }


}
