package com.java.methods;

public class Test
{
    public static  void sum(int...x)
    {
        int total=0;
        for(int a:x)
        {
            total+=a;
        }
        System.out.println("Sum Is "+total);
    }

    public static void main(String[] args)
    {
        sum();
        sum(10);
        sum(10,20,30);
        sum(10,20,30,40);
    }
}
