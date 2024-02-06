package com.exceptionhandling.trycatchflow;

public class TryCatchBlock
{
    public static void main(String[] args)
    {
        System.out.println("Try-catch block:");
        System.out.println("\t1.It is highly recommended to handle exception\n");
        System.out.println("\t2.The code which will cause an exception that code is known as\n" +
                "\t risky code\n");
        System.out.println("\t3.Risky code should be kept inside try block always\n");
        System.out.println("\t4.Corresponding handling code should be write inside catch block\n");
        System.out.println("Control flow of try-catch block:");

        try {
            //statement 1
            // statement 2
            // statement 3
        }
        catch (Exception e)
        {
            //statement 4
        }
        //statement 5
        System.out.println("\tCase1:If no exception occurs");
        System.out.println("\t.order of execution will be:");
        System.out.println("\t\t1.statement 1");
        System.out.println("\t\t2.statement 2");
        System.out.println("\t\t3.statement 3");
        System.out.println("\t\t4.statement 5\n");

        System.out.println("\tcase 2: If exception occur at statement 2 and corresponding catch block\n" +
                "\t also matched");
        System.out.println("\t Order of execution");
        System.out.println("\t\t1.statement 1");
        System.out.println("\t\t2.statement 4");
        System.out.println("\t\t3.statement 5\n");

        System.out.println("\tcase 3:If exception occurs at statement 2 but exception is not matched with\n" +
                "\t corresponding catch block\n");
        System.out.println("\t Order of execution:");
        System.out.println("\t\t1.statement 1");
        System.out.println("\t\t abnormal termination of program\n");

        System.out.println("\tCase 4: If exception occur at statement 4 or statement 5");
        System.out.println("\t abnormal execution of program always\n");

        System.out.println("Note:");
        System.out.println("\t1.If exception is occurred inside try block then control will goes\n" +
                "\t to the corresponding catch block and other statement present inside try block will\n" +
                "\t not be executed so we should always write risky statement inside try block always otherwise\n" +
                "\t statement after exception occurred will not be executed Hence try block should contain\n" +
                "\t minimum code always\n");
        System.out.println("\t2.Exception can be occur inside catch block and finally block also then\n" +
                "\t program will terminates abnormally\n");
        System.out.println("\t3.Other than try block if exception occur anywhere else then\n" +
                "\t program will terminate abnormally");

    }
}

