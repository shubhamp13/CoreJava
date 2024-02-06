package com.java.Operators.conditional;

public class Case1
{
    public static void main(String[] args)
    {
        /*
            There Is Only One Ternary Operator in Java i.e Conditional Operator
            In Conditional Operator:
            1.Operand 1 Must be of Boolean Type
            2.If Operand 1 is True then Control Goes To Second Operand
            3.If Operand 1 Is False Then Control Goes To Third Operator
         */
        int a=10;
        int b=20;
        int c=100;

        int max=a > b?a>c?a:c:b>c?b:c;
        System.out.println(max);
        int max2=a>b&&a>c?a:b>c?b:c;
        System.out.println(max2);
    }
}
