package com.langpackage.wrapperclasses.autoboxing;

public class Case6
{
    //Widening Followed By Autoboxing is not allowed in Java

    public  static  void  m1(Long l)
    {
        System.out.println("Long");
    }

    public static void main(String[] args)
    {
        int x=10;
//        m1(x);
    }
}

//Compile Time error:-----java: incompatible types: int cannot be converted to java.lang.Long
