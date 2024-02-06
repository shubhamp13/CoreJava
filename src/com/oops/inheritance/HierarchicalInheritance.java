package com.oops.inheritance;
class  P1
{
    public void  m1()
    {
        System.out.println("P1 Method");
    }
}
class  C1 extends P1
{
    public void  m2()
    {
        System.out.println("C1 Method");
    }
}
class  C2 extends P1
{
    public  void m3()
    {
        System.out.println("C2 Method");
    }
}
public class HierarchicalInheritance
{
    public static void main(String[] args)
    {
        C1 c1=new C1();
        c1.m1();
        c1.m2();
        C2 c2=new C2();
        c2.m1();
        c2.m3();
    }
}
