package com.exceptionhandling.finallyblock;

public class Case1
{
    public static void main(String[] args)
    {
        System.out.println("If There is no exception arises then control flow of try-catch-finally\n");
        System.out.println("\t1.try");
        System.out.println("\t2.finally");
        try
        {
            System.out.println("Try Block");
        }
        catch (Exception e)
        {
            System.out.println("Catch block");
        }
        finally
        {
            System.out.println("Finally block");
        }
    }
}
