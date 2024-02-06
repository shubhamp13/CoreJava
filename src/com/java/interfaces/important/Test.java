package com.java.interfaces.important;

class  Parent
{
    Parent()
    {
        System.out.println("Inside Parent class constructor:"+this.hashCode());
    }
}
class  Child extends  Parent
{
    Child()
    {
        System.out.println("Inside Child class constructor:"+this.hashCode());
    }
}
public class Test
{
    public static void main(String[] args)
    {
        Child c=new Child();
        System.out.println("Child class object:"+c.hashCode());
    }
}
