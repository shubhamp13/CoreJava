package com.oops.overriding;

class  P10
{
    String a="parent class var";
}
class C10 extends P10
{
    String a="Child class variable";
}

public class Variables
{
    public static void main(String[] args)
    {
        System.out.println("\t1.If Parent and child class having variable of same name then this is not\n" +
                "\t overriding\n");
        System.out.println("\t2.Overriding is only applicable for methods\n");
        System.out.println("\t3.Variable resolution is always takes care by compiler based on \n" +
                "\t type of reference");
        P10 p=new P10();
        System.out.println(p.a);

        C10 c=new C10();
        System.out.println(c.a);

        P10 p1=new C10();
        System.out.println(p1.a);
    }
}
