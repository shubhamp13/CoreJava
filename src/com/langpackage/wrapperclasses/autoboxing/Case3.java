package com.langpackage.wrapperclasses.autoboxing;

public class Case3
{
    //Widening dominates Auto Boxing

    public  static  void  m1(Integer I)
    {
        System.out.println("Auto Boxing");
    }
    public  static  void  m1(long l)
    {
        System.out.println("Widening");
    }

    public static void main(String[] args)
    {
        int x=10;
        m1(x);
    }
}

//Output:------>Widening
