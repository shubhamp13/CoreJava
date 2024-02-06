package com.java.coommandlinearguments;

public class Case2
{
    public static void main(String[] args)
    {
        String []a={"x","y","z"};
        args=a;
        for(String x:args)
        {
            System.out.println(x);
        }
    }
}
