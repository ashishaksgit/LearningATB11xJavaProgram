package ex_30_Exceptions;

public class Lab220_Handle_Exception {

    public static void main(String[] args) {


        try {
            int a = 0;

            a = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }


        // Checked - JVM
        // JVM knows about it , During Compilation - JVM is saying that
        // there can be case when this file is not found.
        //

        // JVM knows that this may lead to file not found exception
        // so it telling to handle it.




    }
