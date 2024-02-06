package com.java.literals;

public class FloatingPoint
{
    public static void main(String[] args)
    {
//        float f=1.14d;//Incompatible type:possible lossy conversion from double to float

        double d=1.31D;
        double a=1.2122222d;

        float f1=1.99999f;
        float f2=1.22222F;



        double oct=0123.456;
//        double hex=0x123.889;

//        double h=0786;//CTE:=Integer Bumber To Large// It is assigning as integral

        double i=0786.0;//Its Assigning as floating point literal

        double j=0xFace;//Its is assigning as integral so that no error

//        double k=0xface.0; //Its is Assigning as floating point //CTE:-Malformed Floating point literal

        /*
            1.Integral Literal Can be directly assigned to floating point so that integral can be of
            decimal ,octal or hexadecimal form

            2.floating point literal can only in the form of decimal form.It can not be in the form
            of octal or hexadecimal

            3.so if we try to assign octal or hexadecimal literal to double then it will be treated as
              integral type

            4. if we try to assign octal or hexadecimal form with precision then immediately we will get
                CTE:malformed floating-point literal


         */

        //Exponential forms
        double e=1.23e3;
        System.out.println(e);

        float f=1.2e3f;
        System.out.println(f);

    }
}
