package com.langpackage.wrapperclasses.autoboxing;

public class Case7
{
    //Auto Boxing followed by Widening is allowed

    //In This Example
    //int------->Integer------>AutoBoxing
    //Integer----->Object------>Widening
    //AutoBoxing to Widening is allowed in Java

    public  static  void  m1(Object o)
    {
        System.out.println("Object");
    }

    public static void main(String[] args)
    {
        int x=10;
        m1(x);
    }
}
//Output:---Object
