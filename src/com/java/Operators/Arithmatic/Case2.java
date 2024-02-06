package com.java.Operators.Arithmatic;

public class Case2
{
    public static void main(String[] args)
    {
        /*
        1.In Integral point arithmatic there is no way to represent infinity
        so when we try to perform operation who have output as infinity then we
        wii get ArithmaticException '/' By  zero
          Example:
          System.out.println(10/0);-----> ArithmaticException Division by zero

        2.In Floating Point arithmatic there is way to represent infinity so we will get
        infinity as output
         Example System.out.println(10/0.0);------->Infinity
                  System.out.println(-10/0.0);-------> - Infinity

         */
//        System.out.println(10/0);//ArithmeticException: / by zero
        System.out.println(10/0.0);
        System.out.println(-10/0.0);

        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
    }
}
