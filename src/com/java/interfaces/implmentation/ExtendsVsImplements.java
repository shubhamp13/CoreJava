package com.java.interfaces.implmentation;

public class ExtendsVsImplements
{
    /*
        1.class can  extends at most one class at a time
            example: class A extends B
        2.interface can extends any number of interface simultaneously
            Example:  interface I1 extends I2,I3,I4
        3.class Can implements any no of interfaces at a time
            example: class implements A,B,C
       4.class can extends and implements simultaneously but first class
       have to extends then implements
            Example:
                    class A extends B implements C,D,E ---->valid
                    class A implements B extends C,D,E -------->Invalid


     Question: Consider the following expressions and define x and y
        *************************************************************************************
        1. x extends y:-> x and y can be both interface or class
                         because both class and interface can extends.
                         class can extend only one class
                         interface can extends any no of interface
        *************************************************************************************

        2. x extends y,z:---->Here x is an interface
                                   y is an interface
                                   z is an interface
                            (As class can not extends more than one class at a time,only interface
                               can extends more than one interface simlultaneously)
       *************************************************************************************

       3.x implements y,z
                Here x is class
                     y is an interface
                     z is an interface
                  (As class can only implements so x is class and y and z are interfaces)

        *************************************************************************************

       4.x extends y implements z
                        Here x is class
                             y is class
                             z is an interface
             (As class or interface can extends but in above scenario y implements z that means
                y must be class so x is also class and z is an interface)

           *************************************************************************************
     */
    public static void main(String[] args)
    {
        System.out.println("\t1.We can extend only one class at a time\n");
        System.out.println("\t2 We can extend any number of interface simultaneously\n");
        System.out.println("\t3.class can be both extended and implements but interface can only extends\n");
        System.out.println("\t4.class can implements any number of interface simultaneously\n");
        System.out.println("\t5.class can extends one class and can implements many interface simultaneously\n");
        System.out.println("\t6.We can not implements first and then extends we have to first extend and then implements");
    }
}
