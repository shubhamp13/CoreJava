package com.oops.inheritance;

public class Theory
{
    public static void main(String[] args)
    {
        System.out.println("Relationship:");
        System.out.println("\t1.Its is an association between two or more classes");
        System.out.println("\t2.Relationship is classified into two types:");
        System.out.println("\t\ta.IS A Relationship");
        System.out.println("\t\tb.HAS A Relationship");
        System.out.println("IS A Relationship:");
        System.out.println("\t1.Its is association between two or more classes where one class acquires\n" +
                "\t properties of another class means child class having properties of parent class");
        System.out.println("\t2.IS A relationship is also known as Inheritance");
        System.out.println("\t3.Inheritance is process of one class acquiring properties of another class\n" +
                "\t Child class acquires properties of parent class");
        System.out.println("\t4.With the help of parent class reference we can access only parent class method");
        System.out.println("\t5.With the help of child class reference we can access both parent and child class\n" +
                "\t methods");
        System.out.println("\t6.We can store child class object in parent class reference with the help\n" +
                "\t of that parent class reference we can access only parent class methods");
        System.out.println("\n Types Of Inheritance:");
        System.out.println("\t\t1.Single level Inheritance");
        System.out.println("\t\t2.Multilevel Inheritance");
        System.out.println("\t\t3.Hierarchical Inheritance");
        System.out.println("\t\t4.Multiple Inheritance");
        System.out.println("\t\t5.Hybrid Inheritance");

        System.out.println("\n Java does not support multiple inheritance in terms of classes");
        System.out.println("\n With the help of interface we can achieve multiple inheritance");
        System.out.println("\n As interface does not contains any implementations to method so\n" +
                "\t their is no ambiguity issue");



    }
}
