package com.oops.overloading;
class  Animal
{

}
class Monkey extends Animal
{

}
public class Case5
{
    public  void m1(Animal a)
    {
        System.out.println("Animal method");
    }
    public  void  m1(Monkey m)
    {
        System.out.println("Monkey method");
    }
    public static void main(String[] args)
    {
        Case5 c=new Case5();

        Animal a=new Animal();
        c.m1(a);//Animal Method

        Monkey m=new Monkey();
        c.m1(m);//Monkey Method

        Animal a1=new Monkey();
        c.m1(a1);//Animal Method due to a1 is Animal type so in method overloading method binding with reference
    }
}
