package com.oops.overriding;

public class Rule5
{
    public static void main(String[] args)
    {
        System.out.println("Rule 5:");
        System.out.println("\t1.In Method overriding following modifiers does not have any restrictions:\n");
        System.out.println("\t\t1.native");
        System.out.println("\t\t2.strictfp");
        System.out.println("\t\t.synchronized\n");
        System.out.println("Important Points:");
        System.out.println("\t1.final method can not be override" +
                "\t2.non final method can be override as final");
        System.out.println("*********************************************************************\n");
        System.out.println("\t3.abstract method must be override in child class\n" +
                "\t4.Non abstract method can also  override\n as abstract in child class");
        System.out.println("**************************************************************************\n");
        System.out.println("\t5.Synchronized,native and strictfp methods can be override as it is\n " +
                "\t6. Synchronize ,native and strictfp can be override as non synchronize,non native or nob\\n" +
                "\t strictfp also no restrictions for these modifiers");
        System.out.println("*******************************************************************************\n");
    }
}
