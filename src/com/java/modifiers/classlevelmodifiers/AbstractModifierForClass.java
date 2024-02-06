package com.java.modifiers.classlevelmodifiers;
public class AbstractModifierForClass
{
    /*
        abstract class:
                    1.If class contains at least one abstract method then that class must be declared as
                    abstract
                    2.An abstract class can have zero abstract methods
                    3.We can not create the object of abstract class
                    4.If class is inheriting abstract class then that class should override all abstract methods
                    or that class should declared as abstract
                    5.HttpServelet is  abstract class with zero abstract methods
                    6.adapter class is abstract class with zero abstract methods


                    ************************abstract vs final modifier***********************
                    1.an abstract class can have final method
                    2.final class does not have any abstract method
                    3.for abstract method we must override abstract method in corresponding child class
                    but for final method we cant override final method so combination of abstract and final is illegal

     */
    public static void main(String[] args)
    {
        System.out.println("*************************************************************************");
        System.out.println("Abstract class");
        System.out.println("\t1.If Class Contains at least one abstract method then that class must declare\n" +
                "\tas abstract otherwise we will get compile time error ");
        System.out.println("\t2.An abstract class may or may not have any abstract method");
        System.out.println("\t3.If class is declared as abstract then we can not create object of that class");
        System.out.println("\t4HttpServer is abstract class which does not have any abstract methods");
        System.out.println("\t5.Adapter class does not have any abstract methods");
        System.out.println("****************************************************************************************");
        System.out.println("Abstract vs Final");
        System.out.println("\t1.An abstract class may have final method");
        System.out.println("\t2.Final class does not contain any abstract method");
        System.out.println("\t3.As Abstract method concept speaks about overriding the parent method in its\n" +
                "\tChild class but final method can not override so combination of abstract and final modifier\n" +
                "\tfor method is illegal");
        System.out.println("\t4.for abstract class can contain abstract method but final class does not contain any\n" +
                "\tfinal method so combination of abstract final for class is illegal");
        System.out.println("Using of abstract modifier is recommended as it promotes several oops features like\n" +
                "\t\t1.Inheritance \n\t\t2.Polymorphism");
        System.out.println("********************************************************************************************");



    }
}
