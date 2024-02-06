package com.java.methods;

public class VarArgMethods
{
    public  static  void m1(int... x)
    {
        System.out.println("Var - arg method");
    }

    public static void main(String[] args)
    {
        m1();
        m1(10);
        m1(10,20);
        m1(10,20,30);  
    }
}
