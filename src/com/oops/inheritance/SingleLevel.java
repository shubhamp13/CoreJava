package com.oops.inheritance;
class  Parent
{
    public  void  m1()
    {
        System.out.println("Parent class Method");
    }
}
class  Child extends Parent
{
    public  void m2()
    {
        System.out.println("Child Class Method");
    }
}
public class SingleLevel
{
    public static void main(String[] args)
    {
        Parent p1=new Parent();
        p1.m1();
//        p1.m2();//Invalid

        Child c1=new Child();
        c1.m1();
        c1.m2();

        Parent p2=new Child();
        p2.m1();

//        Child c2=new Parent();
    }
}

