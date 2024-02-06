package com.oops.overriding;

class  A
{
    public  void  m1(int ...x)
    {
        System.out.println("Parent Method");
    }
}
class B extends A
{
    public  void m1(int x)
    {
        System.out.println("Child Class Method");
    }
}
public class VarArgsMethod
{
    public static void main(String[] args)
    {
        System.out.println("Var-args method:");
        System.out.println("\t1.Two var-args method can be override\n");
        System.out.println("\t2.Var-args method with normal method is not overriding it is overloading\n" +
                "\tconcept");
        A a=new A();
        a.m1(10);

        B b=new B();
        b.m1(10);
        
        A a1=new A();
        a1.m1(10);


    }
}
