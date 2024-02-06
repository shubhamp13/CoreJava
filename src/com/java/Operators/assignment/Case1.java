package com.java.Operators.assignment;

public class Case1
{
    public static void main(String[] args)
    {
        int a,b,c,d;
        a=b=c=d=20;
        a+=b-=c*=d/=2;
        System.out.println("A:"+a+" B:"+b+" C:"+c+" D:"+d);

    }
}
