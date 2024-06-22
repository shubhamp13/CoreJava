package com.langpackage.wrapperclasses.autoboxing;

public class Case4
{
    //Widening dominates Var arg methods
    public  static  void  m1(int ...x)
    {
        System.out.println("Var Arg Method");
    }

    public static void  m1(long l)
    {
        System.out.println("Widening");
    }
    public static void main(String[] args)
    {
        int x=10;
        m1(x);
    }
}

//Output:------->Widening
