package com.exceptionhandling.trycatchfinallyflow;

public class Case3
{
    public static void main(String[] args)
    {
        System.out.println("\tIf Exception occurs at statement 2 and corresponding catch block exception is not\n" +
                "\t matched then output will be");
        System.out.println("\t1.statement 1");
        System.out.println("\t2.statement 5");
        System.out.println("abnormal termination of program with exception handled by default handler");
        System.out.println("If exception rises or not and exception is handled or not every time finally block\n" +
                "\t will get executed\n");
        try
        {
            System.out.println("statement 1");
            System.out.println(10/0);
            System.out.println("statement 3");
        }
        catch (NullPointerException e)
        {
            System.out.println("statement 4");
        }
        finally {
            System.out.println("statement 5");
        }
        System.out.println("statement 6");
    }
}
