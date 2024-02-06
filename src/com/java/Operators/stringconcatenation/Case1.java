package com.java.Operators.stringconcatenation;

public class Case1
{
    public static void main(String[] args)
    {
        /*
            The Only overloaded Operator in java is "+" Operator
            1.Sometimes it act as "Arithmatic Addition" and Sometime
            It act as "String Concatenation" Operator

            2.If at least one argument is string type in addition then result will be
            always concatenation of string.
            3.If two are both numbers then only arithmatic addition happens

            4.Any value with string addition then its concatenated
         */
        String a="Shubham";
        int b=10,c=20,d=30;
        System.out.println(a+b+c+d);//Shubham102030
        System.out.println(b+c+d+a);//60Shubham
        System.out.println(b+c+a+d);//30Shubham30
        System.out.println(b+a+c+d);//10Shubham2030
    }
}
