package com.java.modifiers.memberlevelmodifiers.defaultlevel;

public class Case
{
    /*
        If member is declared as default then it is accessible to the same package
        but outside package it is not accessible

        2.default modifier is also known as package level modifier
     */
    public static void main(String[] args)
    {
        System.out.println("If member is declared as default then we can access that" +
                "\n member within same package but outside package we can not access ");
        System.out.println("default modifier is also known as package level modifier");
    }
}
