package com.oops.overriding;
class  P6
{
    public static  void m1()
    {
        System.out.println("Parent class method");
    }
}
class  C6 extends P6
{
    public  static  void  m1()
    {
        System.out.println("Child Class method");
    }
}
public class MethodHiding
{
    public static void main(String[] args)
    {
        System.out.println("Method Hiding:");
        System.out.println("\t1.If both parent class and child class method are static with same signature\n" +
                "\t then it is seems to be method overriding but it is not overriding it is method hiding\n");
        System.out.println("\t2.All the rules of method overriding are same for method hiding also\n" +
                "\t except following:");
        System.out.println("\t\t1.In method hiding both parent class and child class method must be static\n");
        System.out.println("\t\t2.In Method hiding method resolution is done by compiler with reference type\n");
        System.out.println("\t\t3.It is also known as\n\t\t\t1.Compile time polymorphism");
        System.out.println("\t\t\t2.static polymorphism");
        System.out.println("\t\t\t3.Early binding");
        P6 p=new P6();
        p.m1();

        C6 c=new C6();
        c.m1();

        P6 p1=new C6();
        p1.m1();
    }
}
