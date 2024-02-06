package com.exceptionhandling;

public class CheckedUnchecked
{
    public static void main(String[] args)
    {
        System.out.println("Checked Exception:");
        System.out.println("\t1.The exceptions which are checked by the compiler whether the programmer\n" +
                "\t is providing any exception handling or not for smooth execution of the program are\n" +
                "\t known as Checked Exception\n");
        System.out.println("\t2.If in our program is there any chance to rise checked exception then we must handle it\n" +
                "\t by try-catch or by Throws otherwise code will not compile\n");
        System.out.println("\t3.Example:");
        System.out.println("\t\t1.FileNotFoundException");
        System.out.println("\t\t2.ServletException");
        System.out.println("\t\t3.InterruptedException\n");
        System.out.println("Unchecked Exception:");
        System.out.println("\t1.The exceptions which are not checked by compiler whether the programmer\n" +
                "\t is providing any exception handling or not these exceptions are Unchecked Exceptions\n");
        System.out.println("\t2.Examples:");
        System.out.println("\t\t1.ArithmaticException");
        System.out.println("\t\t2.NullPointerException");
        System.out.println("\t\t3.ClassCastException");
        System.out.println("\t\t4.IndexOutOfBoundsException\n");
        System.out.println("Note:");
        System.out.println("\t1.Any Checked or Unchecked Exception will only occur during run time only\n");
        System.out.println("\t2.RuntimeException and their child classes and Error and their child classes are\n" +
                "\t only unchecked exceptions except these all other exceptions are checked exceptions only\n ");
        System.out.println("Partially Checked and Unchecked Exception");
        System.out.println("\t1.The checked exceptions whose all child class are also checked only so that exceptions\n" +
                "\t are known as fully checked exceptions");
        System.out.println("\t2.Example:");
        System.out.println("\t\t\1.IOException");
        System.out.println("\t\t2.InterruptedException");
        System.out.println("\t\t3.ServletException");
        System.out.println("\t\t4.RemoteException\n");
        System.out.println("\t3.The checked exception whose all child exceptions are not checked that exception\n" +
                "\t is known as partially checked exception");
        System.out.println("\t\t1.Throwable");
        System.out.println("\t\t2.Exception");
        System.out.println("\t4.The Only Partially checked Exceptions are:");
        System.out.println("\t\t1.Throwable");
        System.out.println("\t\t2.Exception");

    }
}
