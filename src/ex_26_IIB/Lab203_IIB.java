package ex_26_IIB;

public class Lab203_IIB {

    // ```
    //IIB
    //Instance initialization Block == IIB--new featur added
    //I will be executed when Object is created.
    //```

    public static void main(String[] args) {
    //A a;
        new A();
       // A a1 = new A();
    }



}


class A{
    // Instance variable
    int x = 10;
    A(){
        System.out.println("DC");
    }

    {
        System.out.println("Hi, I am IIB1");
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file

    }

    {
        System.out.println("Hi, I am IIB 2");
    }

    {
        System.out.println("Hi, I am IIB 3");
    }


}