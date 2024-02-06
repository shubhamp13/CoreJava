package com.java.modifiers.classlevelmodifiers;

public class PublicModifier
{
    /*
        *****public modifier************
        * 1.If a class is declared as public then we can access that class from anywhere
        * 2.If a class is not public and if we are trying to access that class from outside the
        * package then we will get compile time error
        * so inorder to access class from different package we have to declare that class as public
     */
    public static void main(String[] args)
    {

        System.out.println("*****************public modifier*********************");
        System.out.println("If a class is declared as public then we can access that class from\n" +
                "anywhere");
        System.out.println("If a class is not public if we are trying to access that class from outside" +
                "the package then we will get compile time error");
        System.out.println("To Access The Class From another package so corresponding class must" +
                "\nbe public");
    }
}
