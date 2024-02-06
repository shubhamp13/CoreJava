package com.oops.inheritance;

class  A
{
    public  void m1()
    {
        System.out.println("M1 Method Of A class");
    }
}
class  B extends A
{
    public void m2()
    {
        System.out.println("M2 Method Of B class");
    }
}
class C extends B
{
    public void m3()
    {
        System.out.println("M3 Method Of C Class");
    }
}
public class MultiLevelInheritance
{
    public static void main(String[] args)
    {
        C c=new C();
        c.m1();
        c.m2();
        c.m3();
    }
}
