package com.java.interfaces.namingconflicts.variables;

public class Test implements  I1,I2
{
    /*
        Interface Variable naming conflict:

        1.two interface can have variable with same name so in implementing class we have to mention
        interface name to access the respective interface variable otherwise we will get ambitious
        reference-compile time error

     */
    public static void main(String[] args)
    {
        //System.out.println(x);// reference to x is ambigious
        System.out.println(I1.x);
        System.out.println(I2.x);
        System.out.println("Interface Variable Naming Conflicts:");
        System.out.println("\t1.Two Interface can have variable with same name but inside implementing \n" +
                "\t class we have to mention interface name inorder to access the respective interface\n" +
                "\t variable otherwise we will get ambigous reference to x");
        System.out.println("\tInterface I1 Variable:"+I1.x);
        System.out.println("\tInterface I2 Variable:"+I2.x);

    }
}
