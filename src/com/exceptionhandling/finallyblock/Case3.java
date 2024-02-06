package com.exceptionhandling.finallyblock;

public class Case3
{
    public static void main(String[] args)
    {
        System.out.println("If Exception raised in try but no corresponding exception code is available then\n" +
                "\t in this abnormal termination control flow of try-catch-finally\n");
        try
        {
            System.out.println("try-block");
            System.out.println(10/0);

        }
        catch (NullPointerException e)
        {
            System.out.println("catch block");
        }
        finally
        {
            System.out.println("finally block");
        }
    }
}
