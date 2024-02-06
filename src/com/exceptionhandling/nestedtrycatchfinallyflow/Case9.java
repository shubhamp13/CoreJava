package com.exceptionhandling.nestedtrycatchfinallyflow;

public class Case9
{
    public static void main(String[] args)
    {
        System.out.println("If\t exception occurs at statement 8 and corresponding exception  matched then \n" +
                "\tcontrol flow will be");
        System.out.println("statement [1,2,3,4,5,6,10,11,12] normal termination");
        try
        {
            System.out.println("statement 1");
            System.out.println("statement 2");
            System.out.println("statement 3");
            try
            {
                System.out.println("statement 4");
                System.out.println("statement 5");
                System.out.println("statement 6");
            }
            catch (NullPointerException e)
            {
                System.out.println("statement 7");
            }
            finally
            {
                System.out.println(args[1]);
            }
            System.out.println("statement 9");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("statement 10");
        }
        finally
        {
            System.out.println("statement 11");
        }
        System.out.println("statement 12");
    }
}
