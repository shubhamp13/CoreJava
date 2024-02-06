package com.exceptionhandling.finallyblock;

public class FinallyExit
{
    public static void main(String[] args)
    {
        System.out.println("finally block vs System.exit(0)");
        System.out.println("\t1.There is only one case inwhich finally block will not be executed\n" +
                "\t if there is System.exit() call inside try or catch.");
        System.out.println("\t2.System.exit(0) call will shutdown the JVM directly so there is no chance\n" +
                "\t of executing finally block");
        try {
            System.out.println("try -block executed");
            System.exit(  0);
        }
        catch (Exception e)
        {
            System.out.println("catch block executed");
        }
        finally {
            System.out.println("finally block executed");
        }
    }
}
