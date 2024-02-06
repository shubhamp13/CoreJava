package com.oops.constructor.overloading;

public class Overloading
{
    public static void main(String[] args)
    {
        System.out.println("Constructor Overloading:");
        System.out.println("\t1.Class having more than one constructor then it is known as constructor\n" +
                "\t Overloading\n");
        System.out.println("\t2.Overloading concept is applicable for constructors\n");
        System.out.println("\t3.Overriding and inheritance concept is not applicable for constructors\n");
        System.out.println("Important Cases:");
        System.out.println("Case 1:");
        System.out.println("\t1.Recursive call for methods is Run time exception saying \n" +
                "\t StackOverFlowError\n");
        System.out.println("\t2.If there is any possibility for recursive call for constructor then we will\n" +
                "\t get compiler time error saying Recursive Constructor Invocation\n");
        System.out.println("Case 2:");
        System.out.println("\t1.If parent class having argument constructor and child class  have \n" +
                "\t no argument constructor then we will get compile time error saying symbol not found\n" +
                "\t parent() location class Parent\n");
        System.out.println("\t2.It is highly recommended if we are writing argument constructor then\n" +
                "\t we must write no argument constructor also\n");
        System.out.println("Case 3:");
        System.out.println("\t1.If Parent class constructor throws any checked exception then child\n" +
                "\t class constructor must throw same exception or its parent exception");
    }
}
