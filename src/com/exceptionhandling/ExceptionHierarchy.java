package com.exceptionhandling;

public class ExceptionHierarchy
{
    public static void main(String[] args)
    {
        System.out.println("Exception Hierarchy:");
        System.out.println("\t1.Throwable is root class for all exceptions in java\n");
        System.out.println("\t2.Throwable class have two child classes:");
        System.out.println("\t\t1.Exception");
        System.out.println("\t\t2.Error");
        System.out.println("Exception:");
        System.out.println("\t1.An Unwanted Event which causes interruption in normal execution of program\n" +
                "\t known as Exception\n");
        System.out.println("\t2.Mostly Exceptions are caused by the programmer only\n");
        System.out.println("\t3.Exceptions are recoverable\n");
        System.out.println("\t4.We can give alternative way for program to prevent from interruption during\n" +
                "\t execution so that we can recover the exceptions\n");
        System.out.println("\t5.Examples:");
        System.out.println("\t\t1.ArithmaticException");
        System.out.println("\t\t2.FileNotFoundException");
        System.out.println("\t\t3.ClassCastException");
        System.out.println("Error:");
        System.out.println("\t1.Mostly Errors are caused due to lack of System Resources\n");
        System.out.println("\t2.Mostly programmers are not responsible for errors\n");
        System.out.println("\t3.Errors can not be recoverable\n");
        System.out.println("\t4.Examples:");
        System.out.println("\t\t1.StackOverFlowError");
        System.out.println("\t\t2.OutOfMemoryError");
    }
}
