package com.oops.overriding;

public class Rule6
{
    public static void main(String[] args)
    {
        System.out.println("Rule 6:");
        System.out.println("\t1.While overriding methods the scope of the access modifiers can not be\n" +
                "\t reduced\n");
        System.out.println("\t2.We can increase the scope of modifiers but we can not decrease the scope\n");
        System.out.println("\t3.Scope of access modifier:");
        System.out.println("\t\t private<default<protected<public");
        System.out.println("\t4.default modifier can be override as default protected,or public\n");
        System.out.println("\t5.protected modifier can be override as protected or public\n");
        System.out.println("\t6.public modifier can be override as public only no other access modifiers are\n" +
                "\t allowed instead of public\n");
        System.out.println("\t7.as private methods can not be override there is no chance of reducing or increasing\n" +
                "\t accessibility ");
    }
}
