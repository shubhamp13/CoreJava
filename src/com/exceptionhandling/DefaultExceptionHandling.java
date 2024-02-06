package com.exceptionhandling;

public class DefaultExceptionHandling
{
    public static void main(String[] args)
    {
        System.out.println("Default Exception Handling:");
        System.out.println("\t1.Inside The method if any exception occurs then that method is responsible\n" +
                "\t to create object of an Exception which includes following things:");
        System.out.println("\t\t1.Exception name");
        System.out.println("\t\t2.Exception Description");
        System.out.println("\t\t3.Exception Location (print StackTrace)\n");
        System.out.println("\t2.Method will give Exception Object to the JVM now JVM will check whether\n" +
                "\t the exception handling code is present inside method or not if not then JVM will terminate\n" +
                "\t execution of method abnormally and remove method from Stack area\n");
        System.out.println("\t3.JVM will go to the caller method and check whether the exception is handled or not\n" +
                "\t if not then JVM will terminate execution of method abnormally and remove it form stack\n");
        System.out.println("\t4.This Process will be continued until main method.At main method JVM again checks whether\n" +
                "\t the exception is handled by main method or not if not JVM will terminated execution of main method\n" +
                "\tabnormally and remove it from Stack area\n");
        System.out.println("\t5.JVM will call default exception handler to handle exception\n");
        System.out.println("\t6.Default Exception handler will print the Exception in following format and\n" +
                "\t terminated the execution of program abnormally");
        System.out.println("\t\t1.Exception in thread name Exception name:Description of Exception");
        System.out.println("\t\t print stack trace\n");
        System.out.println("Note:");
        System.out.println("\t1. If one method inside the program terminated abnormally then entire program\n" +
                "\t will terminates abnormally\n");
        System.out.println("\t2.If execution of all methods are completed smoothly then only program is executed\n" +
                "smoothly and termination is normal termination");

    }
}
