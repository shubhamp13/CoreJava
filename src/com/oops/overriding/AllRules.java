package com.oops.overriding;

public class AllRules
{
    public static void main(String[] args)
    {
        System.out.println("Method Overriding:");
        System.out.println("\t1.All the methods of parent class automatically get to the child class\n" +
                "\t during inheritance concept\n");
        System.out.println("\t2.If child class does not want parent class implementation then child class\n" +
                "\t can give their own implementation to the method this process is known as Overriding\n");
        System.out.println("\t3.Overriding is the process of giving new implementation to the method of\n" +
                "\t parent class in child class\n");
        System.out.println("\t3.For method overriding two class must be in IS-A relationship\n");
        System.out.println("\t4.Parent class method in override is known as Overridden method\n");
        System.out.println("\t5.Child class method is override is known as Overriding method\n");
        System.out.println("\t6.In method overriding method resolution is done by JVM at runtime\n" +
                "\t based of type of object\n");
        System.out.println("\t7.It is also known as:" +
                "\t\t1.Run Time Polymorphism\n" +
                "\t\t2.Late Binding\n" +
                "\t\t3.Dynamic Binding");
        System.out.println("\nRules:");
        System.out.println("\t1.In Method overriding both parent class and child class method must be\n" +
                "\t same\n");
        System.out.println("\t2.In Method overriding both parent class and child class methods formal\n" +
                "\t arguments must be same\n");
        System.out.println("\t3.In Method overriding method signature must be same\n");
        System.out.println("\t4.In Method overriding return types should be same but form JDK 1.5V\n" +
                "\t onwards CO-VARIANT return types also allowed\n");
        System.out.println("\t5.private methods are not available to child class so private methods\n" +
                "\t can not override.Both parent and child class can have same private methods\n" +
                "\t but that are not overriding");
        System.out.println("\t6.Static method can not be override\n");
        System.out.println("\t7.final methods can not override\n" +
                "\t8.non -final methods can be override as final");
        System.out.println("\t8.abstract methods should be override to give implementation in child class\n");
        System.out.println("\t9.There is no restrictions on following modifiers while overriding:\n" +
                "\t\t1.strictfp\n\t\t2.native\n\t\t3.synchronized\n");
        System.out.println("\t10.We can not reduce scope of the access modifiers while overriding\n" +
                "\t we can increase the scope\n");
        System.out.println("\t11.private < default < protected < public\n");
        System.out.println("\t12.If child class method is throwing any checked exception then its parent\n" +
                "\t class method must throw same exception or its parent exception\n");
        System.out.println("\t13.There is no restrictions for unchecked exceptions\n");
    }
}
