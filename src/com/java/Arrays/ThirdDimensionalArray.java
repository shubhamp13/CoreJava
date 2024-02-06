package com.java.Arrays;

public class ThirdDimensionalArray
{
    public static void main(String[] args)
    {
        int []x=new int[2];
        System.out.println(x);
        System.out.println(x[0]);
        int[][][] arr=new int[2][][];
        arr[0]=new int[3][];
        arr[1]=new int[2][];
        arr[0][0]=new int[1];
        arr[0][1]=new int[2];
        arr[0][2]=new  int[3];
        arr[1][0]=new int[2];
        arr[1][1]=new  int[2];
    }

}
