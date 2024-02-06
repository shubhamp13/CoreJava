package com.exceptionhandling.nestedtrycatchfinallyflow;

public class Case8 {
    public static void main(String[] args)
    {
        System.out.println("If\t exception occurs at statement 7 and corresponding exception not matched then \n" +
                "\tcontrol flow will be");
        System.out.println("statement [1,2,3,4,8,11] abnormal termination");
        try
        {
            System.out.println("statement 1");
            System.out.println("statement 2");
            System.out.println("statement 3");
            try
            {
                String s=null;
                System.out.println("statement 4");
                System.out.println(s.length());
                System.out.println("statement 6");
            }
            catch (NullPointerException e)
            {
                System.out.println(10/0);
            }
            finally
            {
                System.out.println("statement 8");
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
