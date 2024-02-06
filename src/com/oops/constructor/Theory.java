package com.oops.constructor;

public class Theory
{
    public static void main(String[] args)
    {
        System.out.println("Constructor:");
        System.out.println("\t1.Constructor is special member of the class whose name is same as class name\n");
        System.out.println("\t2.The Main purpose of constructor is to initialize the object\n");
        System.out.println("\t3.The constructor does not have return type\n");
        System.out.println("\t4.The constructor name is same as class name\n");
        System.out.println("\t5.The Only applicable modifier for the constructors are:" +
                "\t\t1.public\n\t\t2.private\n\t\t3.protected\n\t\t4.default\n");
        System.out.println("\t6.The Main difference between constructor and instance block is\n");
        System.out.println("\t\ta.The instance block is used to execute set of instructions other\n" +
                "\t\t than initialization of an object\n" +
                "\t\t\t Example: To count no of objects we have to increment count variable inside\n" +
                "\t\t\t instance block only otherwise you have to use it in all constructors which are\n" +
                "\t\t\t present inside your class\n");
        System.out.println("\t\tb.The main purpose of constructor is only to initialize the object\n");
        System.out.println("\t7.If the class does not contain any constructor the compiler will provide\n" +
                "\t constructor known as default constructor\n");
        System.out.println("\t8.We can say that every class have constructor either provided by compiler or\n" +
                "\t by user\n");
        System.out.println("\t9.If By mistake you have taken any return type for constructor then we\n" +
                "\t will not get any compile time or runtime error compiler will treat it as method\n" +
                "\t but it is not recommended to have method as same name as class name\n");
    }
}
