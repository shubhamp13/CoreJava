package com.java.methods;

public class ImpVarArg
{
    public  static  void m1(int...x)
    {
        System.out.println("Var Arg Method");
    }
    public  static  void  m1(int x)
    {
        System.out.println("Normal Method");
    }

    public static void main(String...args)
    {
        m1();
        m1(10,20);
        m1(10);
    }

}
