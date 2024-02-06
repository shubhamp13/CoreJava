package com.oops.polymorphism;

public class ObjectTypeCasting
{
    public static void main(String[] args)
    {
        System.out.println("Object Type Casting:");
        System.out.println("\t1.We can store child class object inside parent class reference\n");
        System.out.println("\t2.Interface reference variable can be used to store  its implemented class\n" +
                "\t object");
        System.out.println("\t\tExample:Runnable r=new Thread();\n");
        System.out.println("\t3.A b = ( C ) d");
        System.out.println("\t\t1.A---> Class or Interface Name");
        System.out.println("\t\t2.b---->reference variable name");
        System.out.println("\t\t3.C----->class or interface name");
        System.out.println("\t\t.d----->reference variable name\n");
        System.out.println("Rule 1:(Compile Time Checking");
        System.out.println("\t1.'C' and  'd'  must be in relationship either (parent-->child),(child--->parent)\n" +
                "\t or same otherwise we will get compile time error saying\n" +
                "\t\t inconvertible types:" +
                "\t\t found:d\n" +
                "\t\t required:c\n");
        System.out.println("Rule 2: (Compile time checking)");
        System.out.println("\t1.'C' should be same or derived type of 'A' otherwise we will get compile\n" +
                "\t time error saying:" +
                "\t\t incompatible types:" +
                "\t\tfound:C\n" +
                "\t\t required:A\n");
        System.out.println("Rule 3: (Run time checking)");
        System.out.println("\t1.Run time object of d must be same or derived of C otherwise we will get\n" +
                "\t Run time exception:" +
                "\n\t\t ClassCastException");
    }
}
