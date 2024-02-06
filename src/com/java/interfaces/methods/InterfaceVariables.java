package com.java.interfaces.methods;

import java.awt.desktop.ScreenSleepEvent;

public interface InterfaceVariables
{
    /*
        1.Interface have all the variables by default public static final
        2.As Interface variables are final we have to assign a value to variable while declaring
        ("Interface does not have constructor and initializers")

        3.Why interface variables are public static final

            1.public: all the implementation class can be able to access variable so that
                        interface variables are public

            2.static: as we can not create instance of an interface so to access the variable of
                      an interface without creating instance interface variables are static

            3.final: "Implementation class should not be able to modify the value of variable
                       so that interface variables are final"


          4. as interface variables are public static final we can not use modifiers such as
             a.public:
                      1.private
                      2.protected
             b.static final
                     1.transient --->serialization
                     2.volatile  ---->multiple threads multiple copy

           5.inside implementation class we can access interface variables but we can not
           modify
     */
    public static void main(String[] args)
    {
        System.out.println("Interface Variables:");
        System.out.println("\t1.Interface Variables are by default public static final\n");
        System.out.println("\t2.Why Interface Variables are public static finale?");
        System.out.println("\t\t1.public: all the implementation class should be able to access the\n" +
                "\t\t the interface variable so that interface variables are public\n");
        System.out.println("\t\t2static:.As we can not create instance of an interface, to access the variable\n" +
                "\t\t of an interface without creating instance we have to make it as static\n");
        System.out.println("\t\t3.final:implementation class should not be able to modify the value\n");

        System.out.println("\t3.as interface variables are final we have to initialize it at the\n" +
                "\t time of declaration otherwise we will get compile time error\n");
        System.out.println("\t4.We can directly access interface variables in implementing class\n" +
                "\t but we can not modify it");
    }
}
