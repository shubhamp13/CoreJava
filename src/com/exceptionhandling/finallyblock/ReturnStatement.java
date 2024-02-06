package com.exceptionhandling.finallyblock;

public class ReturnStatement
{
    public static void main(String[] args)
    {
        System.out.println("return vs finally block");
        System.out.println("\t1.if return statement is present inside try block then before executing\n" +
                "\t return statement finally block will be executed then return statement will be processed");
        System.out.println("\t2.finally block dominates return statement\n");
        System.out.println("Case 2:");
        System.out.println("\t1.If try,catch and finally will return some value then highest priority\n" +
                "\t will be given to the finally block always.\n");
        System.out.println("\t2.finally block value will be returned always\n");
//        case1:
//        {
//            try
//            {
//                System.out.println("try block executed");
//                return;
//            }
//            catch (ArithmeticException e)
//            {
//                System.out.println("catch block executed");
//            }
//            finally
//            {
//                System.out.println("finally block executed");
//            }
//        }
        System.out.println(m1());

    }
    public  static  int m1()
    {
        try {
            return  777;
        }
        catch (Exception e)
        {
            return  888;
        }
        finally
        {
            return  999;
        }
    }
}
