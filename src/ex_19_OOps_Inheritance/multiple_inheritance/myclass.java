package ex_19_OOps_Inheritance.multiple_inheritance;

interface A {
    void show();

}

interface B {
    void show();
}

class C implements A, B {
    public void show() {
        System.out.println("Class C implementing both A and B");
    }

    public static void main(String args[]) {
        C obj = new C();
        obj.show();
    }
}
