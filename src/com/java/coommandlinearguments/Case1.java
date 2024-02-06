package com.java.coommandlinearguments;

//Array Out Of Bound Exception
public class Case1
{
    public static void main(String[] args)
    {
        for(int i=0;i<=args.length;i++)
        {
            System.out.println(args[i]);
        }
    }
}
