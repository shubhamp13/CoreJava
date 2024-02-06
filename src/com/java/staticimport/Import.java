package com.java.staticimport;
public class Import
{
    public static void main(String[] args)
    {
        System.out.println("Import :");
        System.out.println("\t1Whenever we want to access classes from outside the current working directory\n" +
                "\t the you have to use fully qualified clas name otherwise we will get compile time errot\n");
        System.out.println("\t2.By using fully qualified class name the readability of the code will decrease\n");
        System.out.println("\t3.Instead of using fully qualified class name we can use import statement\n" +
                "\t it will act as shortcut for fully qualified class name\n");
        System.out.println("\t4.There are two types of import statements:\n");
        System.out.println("\t\t1.Explicit import\n");
        System.out.println("\t\t2.Implicit import\n");
        System.out.println("\t5.Explicit import:\n");
        System.out.println("\t\t import java.util.ArrayList;");
        System.out.println("\t6.implicit import:\n");
        System.out.println("\t\t import java.util.*;");
        System.out.println("\t7.It is highly recommended to use explicit import because it increases \n" +
                "\t code readability\n");
        System.out.println("\t8.The order of import statements:");
        System.out.println("\t\t1.Explicit import");
        System.out.println("\t\t2.Current Working directory");
        System.out.println("\t\t3.implicit import");
    }
}
