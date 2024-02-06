package com.oops.instancecontrolflow;

public class Instance
{
    public static void main(String[] args)
    {
        System.out.println("Instance Control Flow:");
        System.out.println("\t1.Identification of instance members of class from top to bottom\n");
        System.out.println("\t2.All instance declare and initialization statements and instance blocks will\n" +
                "\t get executed from top to bottom\n");
        System.out.println("\t3.Constructor will get executed\n");
        System.out.println("Instance Control Flow of parent to child:");
        System.out.println("\t1.Identification of all instance members from parent to child in top to\n" +
                "\t bottom approach\n");
        System.out.println("\t2.Execution of instance declare and initialization statement and instance block\n" +
                "\t of parent class only\n");
        System.out.println("\t3.Execution of parent class constructor\n");
        System.out.println("\t4.Execution of declare and initialization statement and instance blocks of child\n" +
                "\t class\n");
        System.out.println("\t5.Execution of child class constructor");
    }
}
