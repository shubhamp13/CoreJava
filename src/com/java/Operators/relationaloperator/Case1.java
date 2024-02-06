package com.java.Operators.relationaloperator;

public class Case1
{
    public static void main(String[] args)
    {
        System.out.println(10<20);
        System.out.println('a'<10);
        System.out.println('a'<97.6);
        System.out.println('a'>'A');

        /*
            We  Can Not apply relational operators on boolean type
            except boolean we can apply relational operators on every primitve types
         */
//        System.out.println(true>false);
    }
}
