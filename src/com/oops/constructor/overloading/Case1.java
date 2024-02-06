package com.oops.constructor.overloading;

public class Case1
{
//    public  Case1()// Recursive call To constructor
//    {
//        this();
//    }
    public  static  void  m1()
    {
        m2();
    }
    public  static  void m2()
    {
        m1();
    }

    public static void main(String[] args)
    {
        System.out.println("Hello");
        System.out.println("\t1.If class having recursive call for methods then we will not get any\n" +
                "\t compiler time error we will get runtime exception saying StackOverFlowEroor");
//        m1();
        System.out.println("\t2. If Their is any chance of recursive call in constructor then we will get\n" +
                "\t Compile Time Error saying Recursive Call to Constructor");
    }
}
