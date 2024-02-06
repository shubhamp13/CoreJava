package com.java.modifiers.memberlevelmodifiers.protectedlevel;

public class Test
{
    /*
         1.if a member is declared as protected then it is accessible within package and outside
         the package but with its child class only(with child class reference only)

         2.protected members can be accessible within same package directly

         3.but outside the package protected members are only accessible to child
         class with child class reference only

         4.we can access protected members within package by either child class reference or
         parent class reference

         5.But we can access protected members outside package with only child class
         reference but not with parent class

     */
    protected  void  m1()
    {
        System.out.println("M1 Method");
    }
}
class Test2 extends Test
{

}
class  Test3 extends  Test2
{
    public static void main(String[] args)
    {
        Test t=new Test();
        t.m1();
        Test2 t1=new Test2();
        t1.m1();
        Test t2=new Test2();
        t2.m1();
        Test t3=new Test3();
        t3.m1();
        Test3 t4=new Test3();
        t4.m1();
        System.out.println("If Member is declared as protected then it is accessible" +
                "\nwithin same package directly and " +
                "\noutside the package to the child class only(with child class reference only )");
        System.out.println("Important:");
        System.out.println("\t1.If member is declared as protected to access within same package then\n" +
                "\twe can access it with either parent class reference or child class reference");
        System.out.println("\t2.If member is declared as protected to access outside package\n" +
                "\t we can use only child class reference we can not use parent class reference\n");
        System.out.println("\tprotected----->>><default> + child_class(with child class ref)");

    }

}
