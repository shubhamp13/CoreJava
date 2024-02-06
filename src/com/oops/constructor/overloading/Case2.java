package com.oops.constructor.overloading;
class  ParentClass
{
//    ParentClass(int i)
//    {
//
//    }
}
class  ChildClass extends ParentClass
{
//    ChildClass()
//    {
//
//    }
}
public class Case2
{
    public static void main(String[] args)
    {
        System.out.println("Case 2:");
        System.out.println("\t1.If parent class constructor is argument constructor  and child class have\n" +
                "\t no arg constructor only then we will get compile time error saying  can not applied to types\n");
        System.out.println("\t2.It is highly recommended if we are writing any argument constructor then we\n" +
                "\t should always write no arg constructor\n");
    }
}
