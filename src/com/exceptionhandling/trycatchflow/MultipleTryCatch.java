package com.exceptionhandling.trycatchflow;

public class MultipleTryCatch
{
    public static void main(String[] args)
    {
        System.out.println("Try with Multiple catch blocks:");
        System.out.println("\t1.We can have multiple catch blocks for one try block\n");
        System.out.println("\t2.It is highly recommended to handle every exception seperately inside\n" +
                "\t different catch block which can be occurred during run time\n");
        System.out.println("\t3.We should not handle all exceptions commonly\n");
        System.out.println("\t4.If we are handling exception with multiple catch block then order of\n" +
                "\t catch block is important\n");
        System.out.println("\t5.The child exception should handle first then we should handle parent\n" +
                "\t exception otherwise we will get Compile time error saying\n");
        System.out.println("\t\t Exception [exception name] already handled\n");
        System.out.println("\t6.We can not handle same exception twice otherwise we will get compile\n" +
                "\t time error");
    }
}
