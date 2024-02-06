package com.oops.overriding;

class  ParentClass
{
    private  void m1()
    {
        System.out.println("Parent class method");
    }
}
class  ChildClass extends  ParentClass
{
    private  void m1()
    {
        System.out.println("Its Child class private method");
    }
}

public class Rule2
{
    public static void main(String[] args)
    {
        System.out.println("Rule 2:");
        System.out.println("\t1.Parent class private methods are not available to child class\n" +
                "\t so private methods can not be override\n");
        System.out.println("\t2.We can have exactly same private method of parent class in child\n" +
                "\t also but it is not overriding method.It is separate child class method only");

    }
}
