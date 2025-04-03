package ex_19_OOps_Inheritance.hybrid;

public class lab186_Hybrid {
}
class GF{}

class Father extends GF{
    void show() { System.out.println("Father's show()"); }
}
class Mother extends GF{
    void show() { System.out.println("Mother's show()"); }
}
 //class Son extends Mother, Father{}
//above line is incorrect in Java because Java does not support multiple inheritance using classes.
//If allowed, Son would inherit from both Mother and Father, creating ambiguity in method resolution (the Diamond Problem).
//If Son calls show(), should it execute Father's show() or Mother's show()? This ambiguity is the diamond problem.

//Multiple inheritance makes the language complex and difficult to maintain. Java designers chose interfaces to achieve multiple inheritance instead.