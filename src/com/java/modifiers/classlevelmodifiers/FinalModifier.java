package com.java.modifiers.classlevelmodifiers;

public class FinalModifier
{
    /*
        final modifier is applicable for
            1.class
            2.method
            3.variable

      1.final method:
        1.If a method is declared as final,then we cant override that method in child class
        otherwise we will get compile time error
        2.child class have all the methods of parent class and its own,if child class dont
        want implementation of parent class then child class can give its own implementation
        that is known as method overriding
        3.Method overriding is the process of giving new implementation to the method
        which is already present in parent class
        4.for method overriding class must be in IS A relationship
     */
    public static void main(String[] args)
    {
        System.out.println("If Method declared as final then we can not override final method" +
                "to its corresponding child class");

        System.out.println("Method Overriding:");
        System.out.println("\tChild class have all the methods form parents class and its own\n" +
                "if child class dont want implementation of parent class then child class can give" +
                "\nits own implementation that is known as method overriding,but method is final" +
                "then we cant override that method");
        System.out.println("\n\nMethod Overriding is the process of giving new implementation" +
                "to the method which is present in parent class");
        System.out.println("To achieve method overriding classes must be in IS A relationship");
    }
}
