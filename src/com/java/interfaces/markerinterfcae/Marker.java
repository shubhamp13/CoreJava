package com.java.interfaces.markerinterfcae;
import java.io.Closeable;
import java.io.Serializable;
import java.util.RandomAccess;
public interface Marker extends Serializable, Closeable, RandomAccess
{
    /*
        Marker  Interface:
                           1.The interface which does not contains any methods but while implementing
                           the interface our object will get some ability that interface is known as
                           marker interface

                           Example Of Marker Interface:
                           1.Serializable
                           2.Cloneable
                           3.RandomAccess
                           4SingleThreadModel

   Example 1:
                By implementing serializable interface our object can be able to store in a file or
                it can be transferred through  network

   Example 2:
               By implementing cloneable interface we can create exact same copy of object

  Important Question:
    Q Without having any method how object will get some ability in marker interface ?
    Ans:
        1.Internally JVM is responsible to provide required ability

    Q Is it possible to create our own marker interface ?
    Ans:
        Yes,But Customization of JVM is required
     */
    public static void main(String[] args)
    {
        System.out.println("Marker Interface:");
        System.out.println("\t 1.Interface which does not have any methods and by implementing this\n" +
                "\t interface object will get some special ability that interface is known as\n" +
                "\t marker interface\n");
        System.out.println("*****************************************************************************");

        System.out.println("Examples of marker interface:");
        System.out.println("\t\t1.Serializable(I)");
        System.out.println("\t\t2.Cloneable(I)");
        System.out.println("\t\t3.RandomAccess(I)\n");
        System.out.println("*****************************************************************************");


        System.out.println("Example 1:");
        System.out.println("\tBy Implementing Serializable(I) interface object will get ability to store in\n" +
                "\t local machine and it can be transferred through network\n");
        System.out.println("*****************************************************************************");

        System.out.println("Example 2:");
        System.out.println("\t By Implementing Cloneable(I) object will get ability to make their\n" +
                "\t exact same copy\n");
        System.out.println("*****************************************************************************");

        System.out.println("\nQuestion");
        System.out.println("\tWithout having any method,How Object will get special ability inside\n" +
                "\t marker interface");
        System.out.println("Ans:");
        System.out.println("\t Internally JVM(Java Virtual Machine) Is responsible to give ability");
        System.out.println("*****************************************************************************");
        System.out.println("Question 2:");
        System.out.println("\t Can we Have Our Own Interface?");
        System.out.println("Ans:");
        System.out.println("\t Yes,By Customization in JVM then it is possible to create our own\n" +
                "\t interface");
        System.out.println("*****************************************************************************");

    }
}
