package com.langpackage.wrapperclasses.autoboxing;

public class Case5
{
    //AutoBoxing dominates var arg
    public static  void  m1(Integer I)
    {
        System.out.println("Auto Boxing");
    }
    public static void m1(int ...x)
    {
        System.out.println("Var Arg Methods");
    }

    public static void main(String[] args)
    {
        int x=10;
        m1(x);
    }
}
//Output:------->Auto Boxing

