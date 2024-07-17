package com.newupdates.lambdaexpressions;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
interface I1 //I1 is functional Interface
{
    public void m1();
}

@FunctionalInterface
interface I2// I2 is Functional interface
{
    public void m1();
    public default void m2()
    {

    }
    public static void m3()
    {

    }
}

@FunctionalInterface
interface I3 extends I1// I3 is functional interface
{
    public void m1();
}
//@FunctionalInterface   I4 is not functional interface
interface I4 extends I1
{
    public void m2();
}

public class FunctionalInterfaceDemo
{
    public static void main(String[] args)
    {
        System.out.println("Interface Which Contains only one abstract method that interface us also known as Functional Interface");
        System.out.println("In Functional Interface we can have only one abstract method and can have any number of default and static methods");
        System.out.println("If an interface extends Functional interface and does not contain any abstract method then also child interface is Functional Interface");
        System.out.println("If child interface having same abstract method as parent interface then also child interface is Functional Interface");
        System.out.println("If child interface having another abstract method then child interface is not Functional Interface");
       BiConsumer<Integer,Integer> bi=(a,b)-> System.out.println(a+b);
        Function <Integer,Integer>f=(n)-> n*n;
        System.out.println(f.apply(10));


    }
    public  int  squareIt(int n)
    {
        return n*n;
    }
}


