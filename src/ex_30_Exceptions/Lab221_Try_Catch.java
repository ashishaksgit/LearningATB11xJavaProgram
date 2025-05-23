package ex_30_Exceptions;

public class Lab221_Try_Catch {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a = 10 / 0;
        }
        // correct sequence(1. ArthmeticException  2. Excetpion) Reverse not possible
        catch (ArithmeticException e){
            System.out.println("ARE YOU FOOL Arit");
        }
      catch (Exception e){
            System.out.println("ARE YOU FOOL");
        }
        System.out.println("2");




    }
}
