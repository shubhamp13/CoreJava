package com.java.modifiers.synchronizedmodifier;

public class SynchronizedModifier
{
    /*
        1.synchronized modifier can be applicable for only
                a.methods
                b.blocks
        2.we can not apply synchronize modifier for variables and classes

        3.if multiple threads are trying to access methods on same java object then
        there will be "Data inconsistency problem" to overcome this problem we declare
        method or block with synchronize modifier

        4.if method is declared as synchronized then only one thread can access the method
        other threads have to wait until complete execution. so that "data inconsistency problem
        will be resolved

        5.The main disadvantage of synchronize modifier is threads have to wait until complete execution of
        one thread this causes performance issue

        6.So it is highly recommended if there is no use of synchronize then we should not use it

        7.synchronize modifier must require implementation but abstract modifier does not have any implementation
        so combination of abstract synchronize is illegal at method level

     */
    public static void main(String[] args)
    {
        System.out.println("synchronize :");
        System.out.println("\t1.synchronize is the modifier which can be applicable only for\n" +
                "\t\t1.method\n\t\t2.block\n");
        System.out.println("\t2.If multiple threads are trying to access method of one java object then there\n" +
                "\t is high possibility for\"Data Inconsistency\" Problem to overcome this problem we can use\n" +
                "\t synchronize modifier\n");
        System.out.println("\t3.If method is declared with synchronize modifier then only one thread can access\n" +
                "\t that method at a time hence this will resolve \"Data Inconsistency\" problem\n");
        System.out.println("\t4.The Main disadvantage of synchronize is multiple threads have to wait\n" +
                "\t until execution of ongoing thread that causes performance issue\n");
        System.out.println("\t5.It is highly recommended if there is no use of synchronize modifier then we should \n" +
                "\t not use it\n");
        System.out.println("\t6.Implementation is mandatory for synchronize method but abstract method can not have\n" +
                "\t implementation so combination of abstract synchronize is illegal");
    }
}
