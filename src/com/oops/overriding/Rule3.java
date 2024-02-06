package com.oops.overriding;
class  P
{
    public  final  void  m1()
    {
        System.out.println("Final method");
    }
}
class C extends P
{
//    public final void  m1()
//    {
//
//    }
}
public class Rule3
{
    public static void main(String[] args)
    {
        System.out.println("Rule 3:");
        System.out.println("\t1.Parent class final methods can not be override in child class\n");
        System.out.println("\t2.As final methods can not be modifiable so we can not change their\n" +
                "\t implementation so that final method can not override if we try then we will get\n" +
                "\t compile time error saying  method m1() of class P can not override in class c as\n" +
                "\t overridden method is final ");
    }
}
