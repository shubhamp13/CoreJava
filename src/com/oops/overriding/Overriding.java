package com.oops.overriding;

public class Overriding
{
    public static void main(String[] args)
    {
        System.out.println("Method Overriding:");
        System.out.println("\t1.With the inheritance child class will get all the methods which are present\n" +
                "\t inside parent class\n");
        System.out.println("\t2.If Child class is not satisfied with parent class method implementation then\n" +
                "\t child class can give their own implementation this process is also known as Method Overridng\n");
        System.out.println("\t3.Method which is overridden in parent class known as Overridden method\n");
        System.out.println("\t4.Method which is overriding in child class known as Overriding method\n");
        System.out.println("\t5.Method overriding is the process of giving new implementation to the method of parent\n" +
                "\t class in child class\n");
        System.out.println("\t6.In Method overriding method resolution is done at run time by JVM based on\n" +
                "\t type of object instead of reference hence it is also known as:\n" +
                "\t\t1.Run Time Polymorphism\n" +
                "\t\t2.Dynamic Polymorphism\n" +
                "\t\t3.Late Binding");
    }
}
