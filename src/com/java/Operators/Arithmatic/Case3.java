package com.java.Operators.Arithmatic;

public class Case3
{
    public static void main(String[] args)
    {
        /*
          In Integral(byte,short,int,long) Arithmatic operation there is no way
          to represent undefined value hence we will get ArithmaticException
           Example 1:  System.out.println(0/0);

          2.In Floating Point (float,double) Arithmatic operation there is way available to
          represent undefined value i.e NaN--(Not a Number)
          Example : System.out.println(0/0.0);---->NAN

         */
        System.out.println(0/0.0);
        System.out.println(Double.NaN);
    }
}
