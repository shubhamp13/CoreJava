package com.oops.staticcontrolflow;

public class RuleForParentChild
{
    public static void main(String[] args)
    {
        System.out.println("Static Control Flow For Parent To child:\n");
        System.out.println("\t1.All the static members will be loaded inside class static area\n" +
                "\t from parent to child through top to bottom order\n");
        System.out.println("\t2.All the static declare and initialization statements and static blocks\n" +
                "\t will get executed from parent to child through top to bottom order\n");
        System.out.println("\t3.The Main method of child class will only get executed\n");
        System.out.println("\t4.While executing child class all the parent class members will be \n" +
                "\t loaded inside child class automatically\n");
        System.out.println("\t5.While executing parent class child class members will not get executed\n");
    }
}
