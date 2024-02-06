package com.java.methods;

public class VarArgsMethodImp
{
    public  static  void m1(int a,int...x)
    {
        System.out.println(a);
        for(int b:x)
        {
            System.out.println(b);
        }
    }

    public static void main(String[] args)
    {
        m1(10,10,20,30);
    }
}
