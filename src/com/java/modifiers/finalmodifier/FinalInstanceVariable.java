package com.java.modifiers.finalmodifier;

public class FinalInstanceVariable
{
    /*
        If a variable is declared inside class block which are not prefixed with
        static modifier are known as instance variable

        2.Separate copy of instance variable is created for every object creation

        3.Instance variable are initialized with default value by JVM

       *********************************************************************************
       Important
       1.If instance variable is declared as final then it must be initialized.
       otherwise we will get compile time error saying variable might have not been
       initialized.

       2.There are three different ways in which we can initialize final instance variables

            1.declare and initialization statement

            2.non-static block

            3.inside constructor

        3. We must initialize final instance variable before complete execution of constructor






     */
    public static void main(String[] args)
    {
        System.out.println("Instance Variable:");
        System.out.println("\t1.Variable declared inside class block which is not prefixed\n" +
                "\twith static modifier are known as Instance variable");
        System.out.println("\t2.Separate copy is created for instance variables for\n" +
                "\tEvery object creation");
        System.out.println("\t3.instance variables are initialized with default values" +
                "\n\tby JVM");
        System.out.println("\nFinal Instance Variable:");
        System.out.println("\t1.Final instance variables must be initialized");
        System.out.println("\t2.They can be initialized in following ways");
        System.out.println("\t\ta.Declare and initialization statement(final int x=10)");
        System.out.println("\t\tb.Inside Non static block");
        System.out.println("\t\tc.Inside constructor");
        System.out.println("\nWe Must initialize final instance variable before the complete\n" +
                "execution of constructor");
    }
}
