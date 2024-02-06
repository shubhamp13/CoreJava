package com.java.Operators.typecasting;

public class Implicite
{
    public static void main(String[] args)
    {
        /*
             In Below Example compiler will convert character to int internally
             this type of conversion is known as Implicit Type Casting

             In Second Example Compiler will convert int to double by implicit
             type casting

             Implicit typecasting is done when we are assigning smaller data type
             into larger data type

             byte<short<char<int<long<float<double

             This Concept Is Also Known As widening or upcasting

             There Is No Loss Of Information in implicit typecasting

         */
        int a='a';
        System.out.println(a);
        double d=a;
        System.out.println(d);

    }
}
