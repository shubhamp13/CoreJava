package com.java.modifiers.classlevelmodifiers;

final public class FinalClass
{
    static  int a=100;
    /*
        Final Class:
            1.if class is declared as final then we can not create child class of that
            corresponding final class("Inheritance Is not possible for final class")
            2.if class is final then all the methods inside final class are by default final
            3.if class is final then the variables inside final class are not final

            4.Main advantage of final class we achieve security means user can not be able to
            change the implementation of final class
            5.The main disadvantage of final class is we can not achieve sevral oops features:
                1.Inheritance
                2.Polymorphism
     */
    public static void main(String[] args)
    {
        a=200;
        System.out.println(a);
        System.out.println("Final Class:\n");
        System.out.println("1.If a class is declared as final then we can not create child class of that\n" +
                "corresponding final class means inheritance is not possible");
        System.out.println("\n2.If class is declared as final then all the methods declared inside final\n" +
                "class are by default final");
        System.out.println("\n3.If class is declared as final all the variables inside final class" +
                "need not to be final");
        System.out.println("\n4.The Biggest advantage of final class is we can achieve securtiy");
        System.out.println("\5.The Biggest disadvantage of final class is we can not use sevreal oops" +
                "\n feature such as \n1.Inheritance\n2.Polymorphism");
        System.out.println("So whenever is necessary then only we should use final modifier for class");
    }
}
