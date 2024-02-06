package com.java.Operators.typecasting;

public class Explicit
{
    public static void main(String[] args)
    {
        /*
            *.The Type casting which is performed by explicitly by the programmer
            * this type of typecasting is known as Explicit Typecasting

            *
            1.Explicit Typecasting is not done automatically by compiler
            2.In Explicit typecasting there may be chance of loosing information.

         */
        int a=130;
        byte b=(byte) a;
        System.out.println(b);//-126

        int x=150;
        short s=(short) x;
        System.out.println(s);//150

        byte d=(byte) x;
        System.out.println(d);//-106
    }
}
