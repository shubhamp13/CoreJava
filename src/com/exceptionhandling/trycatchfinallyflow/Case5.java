package com.exceptionhandling.trycatchfinallyflow;

public class Case5
{
    public static void main(String[] args)
    {
        System.out.println("If an Exception occurs in finally block then program will be terminated\n" +
                "\t abnormally always\n");
        System.out.println("\t If Exception occurs anywhere other than try block then program will be\n" +
                "\t terminated abnormally always");
        System.out.println("Expected Output:");
        System.out.println("statement 1");
        System.out.println("statement 2");
        System.out.println("statement 3");
        System.out.println("abnormal termination of the program\n");
        System.out.println("Output:");
        try
        {
            System.out.println("statement 1");
            System.out.println("statement 2");
            System.out.println("statement 3");
        }
        catch (Exception e)
        {
            System.out.println("statement 4");
        }
        finally {
            System.out.println(10/0);
        }
        System.out.println("statement 6");
    }
}
