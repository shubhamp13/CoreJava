package com.java.modifiers.staticmodifier;

public class StaticModifier
{
    /*
        1.static modifier can be applicable to
            a.methods
            b.blocks
            c.variables
        2.static modifier can not applicable for top level(Outer class)classes,it can be applicable to inner class
        that is called as static inner class or static nested class.

        3.static variable will be created at class level and it will share with all the objects which are created,means
        static variable is common for all the objects which are instanced.

        4.we can access static members directly from anywhere inside the class but we can not access instance variables
        inside static context otherwise we will get compile time error variable x is referenced from static context

        5.Because static variables are created at class level and it will be shared with all objects but instance
        variables will be created separate for every object creation,inside static block or method there is no
        reference available to access instance variable but for static variable as they are created at class level
        so they are accessible even inside instance block or method directly

        6.Overloading concept is applicable for static method including main method

        7.inheritance concept is applicable for static methods including main method.

        8.if child class does not have main method but parent class have main method while executing child class
        parent class main method is executed as static method is inherited\

        9.Overriding concept is  not applicable for static method,static method have method hiding concept

        10.static method supports inheritance and overloading but not overriding ,static method supports
        method hiding

        11.implementation is mandatory for static method but for abstract method we can not give implementation
        so combination of static and abstract is illegal for method

     */
    public static void main(String[] args)
    {
        System.out.println("static modifier:");
        System.out.println("\t1.static modifier can be applicable to\n" +
                "\t\t1.method\n\t\t2.block\n\t\t3.variable\n");
        System.out.println("\t2.static modifier can not applicable for top class,but it can be applicable for\n" +
                "\t .\"inner classes that is known as static nested class.\"\n");
        System.out.println("\t3.static variables will be created at class level\n");
        System.out.println("\t4.static variables will be shared with single copy for all the objects created for class\n");
        System.out.println("\t5.static methods can be overloaded including main method\n");
        System.out.println("\t6.inheritance concept is applicable for static methods including main method\n");
        System.out.println("\t7.If child class does not have main method and if we are executing child class\n" +
                "\t then parent class main method will be executed so we can say that inheritance concpet is\n" +
                "\t is applicable for static methods also including main method\n");
        System.out.println("\t8.static method does not supports method overriding instead of that it supports\n" +
                "\t method hiding\n");
        System.out.println("\t9.static method supports (1)method overloading (2)Inheritance but not .\"Method Overriding.\"\n" +
                "\t instead of that it supports (3) Method hiding\n");
        System.out.println("\t10.implementation is mandatory for static methods but for abstract method we can not give\n" +
                "\t implementation so combination of static and abstract modifier is illegal");
    }
}
