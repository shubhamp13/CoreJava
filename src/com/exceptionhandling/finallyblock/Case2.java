package com.exceptionhandling.finallyblock;

public class Case2
{
    public static void main(String[] args)
    {
        System.out.println("If any exception occurred inside try block and exception is matched with\n" +
                "\t corresponding catch block then order of execution will be");
        System.out.println("\t1.catch block");
        System.out.println("\t2.finally block");

        try
        {
            System.out.println("Hello");
            System.out.println(10/0);
            System.out.println("bye");
        }
        catch (ArithmeticException e)
        {
            System.out.println("catch block");
        }
        finally
        {
            System.out.println("Finally block");
        }
    }
}
