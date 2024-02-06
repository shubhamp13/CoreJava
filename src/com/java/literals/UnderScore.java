package com.java.literals;

public class UnderScore
{
    public static void main(String[] args)
    {
        /*
            From JDK 1.7 onwards we can use _ symbols between numeric values alsp
            example 1_2_3_4;
         */
        double d=1_23_456.7_8_9;
        System.out.println(d);

//        double e=1________23_____56____7.89;
//        System.out.println(e);

       /*
        we can not use _ symbol before first digit or after last digit
        or after .
        */
//        double f=_123.789;
//
//        double g=123.789_;
    }
}
