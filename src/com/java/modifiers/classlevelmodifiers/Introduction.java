package com.java.modifiers.classlevelmodifiers;

public class Introduction
{
    /*
        modifiers are the keywords which are use to alter behaviour of java members

        1.Class Level Modifiers:
            *Modifiers applicable for Top level class are:
                1.public
                2.<default>
                3.final
                4.abstract
                5.strictfp

            *Modifiers applicable for inner classes are:*
                1.public
                2.<default>
                3.final
                4.abstract
                5.strictfp
                6.private
                7.protected
                8.static


    Important
    1.Private modifier is not applicable for top level classes otherwise we will get
    compile time error saying private modifier not allowed here
    2.In java there is no such concept of access modifier and access specifier all
    are modifiers only
     */
    public static void main(String[] args)
    {
        System.out.println("Class Level Modifiers are:");
        System.out.println("1.public");
        System.out.println("2.default");
        System.out.println("3.final");
        System.out.println("4.abstract");
        System.out.println("5.strictfp");
        System.out.println("****************************************************");
        System.out.println("Inner Class Level Modifiers are");
        System.out.println("1.public");
        System.out.println("2.default");
        System.out.println("3.final");
        System.out.println("4.abstract");
        System.out.println("5.strictfp");
        System.out.println("6.private");
        System.out.println("7.protected");
        System.out.println("8.default");
        System.out.println("************************************************************");

        System.out.println("Note:-");
        System.out.println("Private Modifier is not allowed at top class level otherwise\n" +
                "we will get compile time error saying illegal modifier for class");
        ;



    }
}
