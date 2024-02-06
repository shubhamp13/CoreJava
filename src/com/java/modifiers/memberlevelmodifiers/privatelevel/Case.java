package com.java.modifiers.memberlevelmodifiers.privatelevel;

public class Case
{
    /*
        If member is declared as private then it is accessible within same class
        only outside the class it is not accessible

        2.abstract method should be available to child class but if we declare method as abstract
        private then that method will not be available to child class so combination of
        private abstract is illegal
     */
    public static void main(String[] args)
    {
        System.out.println("if member is declared as private then it can be accessible within" +
                "same class,outside class private members are not accessible");
        System.out.println("abstract method needs child class to implement but if class " +
                "\nis private the it can not be abstract because private method is never " +
                "\navailable to child class");
        System.out.println("Hence combination of abstract private is illegal");
    }
}
