package com.java.interfaces.important;

public class Difference
{
    /*
        When we should go for interface abstract class and Concrete class?
        Ans:-
            1.interface:- when we do not know anything about implementation and we have only
                          Service requirement specification then we should go for interface only.
                          Example: Servlet

           2.abstract class:- when we know about implementation but not complete implementation
                              that is(Partial implementation)  then we should go for abstract class
                              Example: (a)GenericServlet
                                       (b)HTTPServlet

           3.concrete class:- when we have know about implementation completely and we can provide
                               service directly then we should go for concrete class

                               Example:(a)myServlet

     */
    public static void main(String[] args)
    {
        System.out.println("\tI1.When we do not have need about implementation and have only\n" +
                "\t Service Requirement Specification then we should go for Interface\n");
        System.out.println("\tA1.When we know about implementation but not completely (Partial\n" +
                "\t -implementation) then we should go for abstract class");
        System.out.println("*************************************************************************");
        System.out.println("\n\t\t********Methods Difference*************");
        System.out.println("\tI2.All the methods inside interface are public abstract by default");
        System.out.println("\tA2.The methods inside abstract class need not be public abstract by default\n");
        System.out.println("\tI3As interface methods are public abstract we can not prefix with following\n" +
                "\t modifiers");
        System.out.println("\t\t1.private");
        System.out.println("\t\t2.protected");
        System.out.println("\t\t3.static");
        System.out.println("\t\t4.final");
        System.out.println("\t\t5.native");
        System.out.println("\t\t6.synchronized\n");
        System.out.println("\t\t7.strictfp");

        System.out.println("\n\tA3.No such modifier limitation for abstract class methods");
        System.out.println("*********************************************************************************");

        System.out.println("**********************Variable difference*********************");
        System.out.println("\tI4.All the variables declared inside interface are by default\n" +
                "\t public static final\n");
        System.out.println("\tA4.Variables declared inside abstract class are not public static final\n" +
                "\t by default\n");
        System.out.println("\tI5.As interface variables are final by default we have to initialize it\n" +
                "\t at the time of declaration only otherwise we will get compile time error\n");
        System.out.println("\tA5.No such restrictions for abstract class variables we can initialize it\n" +
                "\t anywhere\n");
        System.out.println("\tI6.As interface variables are by default public static final then we can not\n" +
                "\t prefix with following modifiers\n");
        System.out.println("\t\t1.private");
        System.out.println("\t\t2.protected");
        System.out.println("\t\t3.volatile");
        System.out.println("\t\t4.transient");

        System.out.println("*************************************************************************************\n");
        System.out.println("\tI7.Interface does not have any static and non static initializers\n");
        System.out.println("\tA7.Abstract class have both static and non static initializers\n");
        System.out.println("\tI8.Interface does not have any constructor");
        System.out.println("\tA8.Abstract class have constructor");
    }
}
