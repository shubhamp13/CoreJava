package com.java.Operators.assignment;

public class ChainedAssignment
{
    public static void main(String[] args)
    {
        /*
            Assignment Operators Are of three Types
                1.Simple Assignment:----->int x=10;
                2.Chained Assignment------>int a,b,c,d;
                                    ------>a=b=c=d=20;
                3.Compound Assignment int a=10;
                                        a+=10;
         */
        int a,b,c,d;
        a=b=c=d=20;
        System.out.println("A: "+a+" B: "+b+" C:"+c+" D:"+d);
        /*
            Chained Assignment is not valid at the time of declaration
            Example:
            int a=b=c=d=20;
            in above example we  will get compile time error
            saying can not found variable b location class ChainedAssignment
         */

//        int p=q=r=s=10;//java: cannot find symbol
                        //symbol:   variable q
                        //location: class com.java.Operators.assignment.ChainedAssignment

    }
}
