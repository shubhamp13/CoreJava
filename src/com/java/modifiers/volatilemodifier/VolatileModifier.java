package com.java.modifiers.volatilemodifier;

public class VolatileModifier
{
    /*
        volatile modifier:
                1.this modifier is only applicable for variables
                2.we can not apply volatile modifier anywhere else
                3.volatile means changing continuously
                4.If multiple threads are trying to access one variable then there may be
                chance of data inconsistency so to avoid this we can use volatile modifier
                5.When we declare variable as volatile then for  every thread new copy of
                variable will be created so that changes made by any thread will no-affect
                to other threads

                5.But separate copy for each and every thread will create complexity in
                program and performance of thr application will decrease

                6.Hence,it is highly recommended not to use volatile modifier
                and its is almost deprecated

                7.final modifier means it never be changed and volatile means it will
                keep on changing hence combination of final volatile is illegal

     */
    public static void main(String[] args)
    {
        System.out.println("volatile modifier:");
        System.out.println("\t1.volatile modifier can be used only for variables\n");
        System.out.println("\t2.we can not use volatile modifier anywhere else\n");
        System.out.println("\t3.If multiple threads are trying to access single variable\n" +
                "\t then there will be high chance of data inconsistency problem\n" +
                "\t to overcome this problem we use volatile modifier\n");
        System.out.println("\t4.If variable is declared as volatile then for each and every\n" +
                "\t thread separate copy of variable is created so that there will be no affect\n" +
                "\t of any changes made on one thread on another so that we can remove\n" +
                "\t data inconsistency problem\n");
        System.out.println("\t5.But for every thread new copy is created so that complexity of\n" +
                "\t program will be increased and it causes performance issue\n");
        System.out.println("\t6.So it is highly recommended not to use volatile modifier and it is\n" +
                "\t almost deprecated from java\n");
        System.out.println("\t7.final means value never be changed and volatile means\n" +
                "\t value will keep on changing hence,combination of volatile final is illegal\n" +
                "\t in java");
    }
}
