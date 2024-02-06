package com.exceptionhandling.nestedtrycatchfinallyflow;

public class Case12
{
    public static void main(String[] args)
    {
        System.out.println("If\t exception occurs at statement 9 and corresponding exception not matched then \n" +
                "\tcontrol flow will be");
        System.out.println("statement [1,2,3,4,5,6,8,11] abnormal termination");
        try
        {
            System.out.println("statement 1");
            System.out.println("statement 2");
            System.out.println("statement 3");
            try
            {
                String s=null;
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
                System.out.println("statement 8");
            }
            System.out.println(args[1]);
        }
        catch (StringIndexOutOfBoundsException e)
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
