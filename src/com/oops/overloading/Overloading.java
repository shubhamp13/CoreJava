package com.oops.overloading;

public class Overloading
{
    public static void main(String[] args)
    {
        System.out.println("Method Overloading:");
        System.out.println("\t1.Class having more than one method with same name but different formal\n" +
                "\t arguments known as method overloading\n");
        System.out.println("\t2.Method overloading increases code readability\n");
        System.out.println("\t3.In Method overloading method resolution is done by the compiler by using\n" +
                "\t object reference so this is also known as:\n" +
                "\t\t1.Compile time Polymorphism\n" +
                "\t\t2.Static Polymorphism\n" +
                "\t\t3.Early Binding\n");
        System.out.println("\t4.In Method overloading binding of method call statement with method signature\n" +
                "\t is done with the help of\n" +
                "\t\t1.Method name\n" +
                "\t\t2.Type of formal arguments\n" +
                "\t case1: if type of formal arguments are same then binding is successful\n" +
                "\tcase2: If type of formal arguments are not same then compiler tries to do widening\n" +
                "\t if widening is successful then binding is successful else we will get compile time error\n");
    }
}
