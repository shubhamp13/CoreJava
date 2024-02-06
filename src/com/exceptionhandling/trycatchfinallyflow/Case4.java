package com.exceptionhandling.trycatchfinallyflow;

public class Case4
{
    public static void main(String[] args)
    {
        System.out.println("\t If exception occurs inside try block and inside catch block also\n" +
                "\t there is an exception then program will terminated abnormally but before termination\n" +
                "\t finally block will get executed");
        System.out.println("Expected output:");
        System.out.println("\t1.statement 1");
        System.out.println("\t2.statement 5");
        System.out.println("Abnormal termination of the program\n");
        System.out.println("Real Output:");
        try
        {
            System.out.println("statement 1");
            System.out.println(10/0);
            System.out.println("statement 3");
        }
        catch (ArithmeticException e)
        {
            System.out.println(10/0);
        }
        finally {
            System.out.println("statement 5");
        }
        System.out.println("statement 6");
    }
}
