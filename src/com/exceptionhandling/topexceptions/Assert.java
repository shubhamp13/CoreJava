package com.exceptionhandling.topexceptions;

public class Assert
{
    public static void main(String[] args)
    {
        int x=10;
        x+=10;
        assert x<45:"True";
        System.out.println(x);
    }
}
