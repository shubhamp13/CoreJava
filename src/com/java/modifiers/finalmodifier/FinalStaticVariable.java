package com.java.modifiers.finalmodifier;

public class FinalStaticVariable
{
    /*
        1.The variable declared inside class block which is prefixed with static modifier is known as static
        variable.

        2.static variables will be created at class level

        3.static variable will be shared for every object creation

        4.static variables are initialized with default values by the JVM

        ****************************************************************************************************************

        static final variable:
            1.if static variable is final then we must have to initialize it otherwise we will get compile time error

            2.we have to initialize final static variable before class loading completion

            3.we can initialize static final variables in following ways:

                1.declare and initialize statement(static int x=10)

                2.static block


     */
    public static void main(String[] args)
    {
        System.out.println("static variable:");
        System.out.println("\t1.The Variable declared inside class block which is prefixed with static modifier is" +
                "\n\tknown as static variable");
        System.out.println("\t2.static variable will be created at class level ");
        System.out.println("\t3.static variable will be shared by all the objects created");
        System.out.println("\t4.static variable will be initialized with default values by the JVM");
        System.out.println("******************************************************************************************");
        System.out.println("\nFinal Static variable");
        System.out.println("\t1.If we declare static final variable then we must have to initialize it\n" +
                "\t otherwise we will get compile time error");
        System.out.println("\t2.We have to initialize final static variable before class loading process");
        System.out.println("\t3.we can initialize static final variable in following ways:");
        System.out.println("\t\t1.static declare and initialize statement:(static final int x=10;)\n");
        System.out.println("\t\t2.Inside static block");
        System.out.println("\n If Anywhere else we have tried to initialize static variable then we will get\n" +
                "\tcompile time error");
    }
}
