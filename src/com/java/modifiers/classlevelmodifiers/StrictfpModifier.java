package com.java.modifiers.classlevelmodifiers;

public class StrictfpModifier
{
    /*
        1.strictfp stands for "strict floating point"
        2.strictfp modifier can be declared with method or class,it can not be declared
        to variables
        3.strictfp modifier introduced in jdk 1.2V
        4.if a method declared with strictfp then all floating point operations
        in that method follows IEEE754 so result of floating point operations will be
        platform independent.
        5.class can be abstract and strictfp but method can not have abstract strictfp
        combination
     */
    public static void main(String[] args)
    {
        System.out.println(10/3);
        System.out.println("***********************strictfp*******************************");
        System.out.println("strictfp stands for strict floating point");
        System.out.println("strictfp was introduced in jdk 1.2V");
        System.out.println("strictfp modifier can be applicable for\n\t1.method\n\t2.class");
        System.out.println("\n1.strictfp method:\n\t The Method which is declared as strictfp\n" +
                "\t that follows all IEE754 rules for floating point calculations");
        System.out.println("\t If method is declared as strictfp then we can not make it as abstract" +
                "\nbecause strictfp method must requires implementation but abstract method does not \n" +
                "have any implementation so combination of strictfp and abstract is illegal at method level");
        System.out.println("\n2.strictfp at class:");
        System.out.println("\t1.The class which is declared as strictfp then all concrete methods inside \n" +
                "the class will follow IEE754 rules for floating point calculations");
        System.out.println("\t2.strictfp class may have abstract method");
        System.out.println("\t3.class can be declared as both strictfp abstract");
        System.out.println("\t4.if class is declared as strictfp abstract then all concrete\n" +
                "\tmethods will follow IEE754 for floating point calculations and all" +
                "\n methods without implementation can be declared as abstract");
    }
}
