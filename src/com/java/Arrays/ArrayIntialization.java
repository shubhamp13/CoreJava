package com.java.Arrays;

public class ArrayIntialization
{
    public static void main(String[] args)
    {
        int []a=new int[3];
        System.out.println(a);//[I@HexadecimalHashcode
        System.out.println(a[0]);//0
        a[0]=1;
        a[1]=2;
        a[2]=3;
        //a[-2]=3// ArrayIndexOutOfBoundException
        //a[3]-->//ArrayIndexOutOfBoundException
        int [][]b=new int[2][3];
        System.out.println(b);//[[I@Hexadecimal Hashcode
        System.out.println(b[0]);//[I@Hexadecimal Hashcode
        System.out.println(b[0][0]);//0

        int [][]c=new int[2][];
        System.out.println(c);//[[I@Hexadecimal Hashcode
        System.out.println(c[0]);//null
        System.out.println(c[0][0]);//NullPointerException


    }
}
