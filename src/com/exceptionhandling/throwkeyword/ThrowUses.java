package com.exceptionhandling.throwkeyword;

public class ThrowUses
{
    public static void main(String[] args)
    {
        System.out.println("\t1.Throw is keyword which is used to throw exception object manually to the JVM\n");
        System.out.println("\t2.The main purpose of throw keyword is to handover exception object\n" +
                "\tcreated by programmer to the JVM\n");
        System.out.println("\t3.Throw can not prevent from abnormal termination of program\n");
        System.out.println("\t4.throw is mostly used in user defined exception\n");
        System.out.println("\t5.we can throw only Throwable type objects otherwise we will get\n" +
                "\t compile time error\n");
        System.out.println("\t6.if we are throwing checked exception directly then we will get\n" +
                "\t compile time error saying unreported error\n");
        System.out.println("\t7.After throw statement we can not write any statement otherwise we\n" +
                "\t will get compile time error");
    }
}
