package com.oops.constructor;

public class DefaultConstructor
{
    public static void main(String[] args) {
        System.out.println("Default constructor:");
        System.out.println("\t1.The constructor provided by compiler is known as default constructor\n");
        System.out.println("\t2.default constructor is no arg constructor which is provided by compiler\n");
        System.out.println("\t3.But no-argument constructor is not default constructor\n");
        System.out.println("\t4.default constructor contains only one line of code which is\n" +
                "\t super() call statement which is used to call super class constructor\n");
        System.out.println("\t5.Compiler will provide following things:\n");
        System.out.println("\t\ta.If programmer is not provided any constructor then compiler will\n" +
                "\t provide default constructor\n");
        System.out.println("\t\tb.If Programmer provides any constructor the compiler will check\n" +
                "\t whether the constructor contains this() or super() call statement.\n");
        System.out.println("\t\t\ti.if programmer does not provide any super() or this() then\n" +
                "\t\t\t compiler will provide super() call statement inside programmers constructor\n");
        System.out.println("\t6.super()  call statement is used to call super call constructor\n");
        System.out.println("\t7.this() call statement is used to call current class constructor\n");
        System.out.println("\t8.we can use super() and this() call statement only inside constructor\n");
        System.out.println("\t9.super() or this() statement must be first statement of constructor\n" +
                "\t otherwise we will get compile timer error\n");
        System.out.println("\t10.We can use either super() or this() inside constructor\n" +
                "\t we can not use both simultaneously\n\n");
        System.out.println("super and this:");
        System.out.println("\t1.super and this are keywords which are used to access super class or current\n" +
                "\t class members\n");
        System.out.println("\t2.we can use super or this anywhere except static context\n");
        System.out.println("\t3.super and this can be used any number of times\n");
        System.out.println("\t4.super is used to access super class members\n");
        System.out.println("\t5.this is used to access current class members\n");
    }
}
