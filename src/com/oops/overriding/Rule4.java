package com.oops.overriding;
class  P1
{
    public  void  m1()
    {
        System.out.println("M1 method of parent class");
    }
}

abstract class  C1 extends  P1
{
    abstract  public  void  m1();
}
class  C2 extends  C1
{

    public   void  m1()
    {
        System.out.println("C2 class method");
    }
}
public class Rule4
{
    public static void main(String[] args)
    {
        System.out.println("Rule 4:");
        System.out.println("\t1.Abstract methods must be override in child class to give implementation\n");
        System.out.println("\t2.We can override non abstract method as abstract in child class\n" +
                "\t if we do not want parent class implementation in further child class s non abstract\n" +
                "\t method can be override in child class as abstract");
    }
}
