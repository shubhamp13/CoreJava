package com.oops.staticcontrolflow;

public class Rules
{
    static
    {
        m1();
//        System.out.println(i);//reading directly
    }
    public static void m1()
    {
        System.out.println(i);//reading indirectly
    }
    public static void main(String[] args)
    {
        System.out.println("Static control flow:");
        System.out.println("\t1.All the static members will be loaded inside class static area\n" +
                "\t from top to bottom approach\n");
        System.out.println("\t2.All the static declare and initialization statements and static blocks\n" +
                "\t will get executed from top to bottom approach\n");
        System.out.println("\t3.At last main method will get executed\n");

        System.out.println("Read indirectly write only:");
        System.out.println("\t1.If variable is directly reading from static block then it is direct reading\n");
        System.out.println("\t2.If variable is reading from method then it is indirectly reading\n");
        System.out.println("\t3.If We are reading variable directly from static block before the declaration then\n" +
                "\t we will get illegal forward reference\n");
        System.out.println("\t4.If we are reading variable indirectly from static block means by calling the method\n" +
                "\t before declaration also then we will not get any error because variable is in Read Indirectly Write Only\n" +
                "\t stage in that stage we can access indirectly but not directly\n");
    }
    public static int i=10;
}
