package com.java.Arrays;

public class TwoDimensionalArrayCreation
{
    public static void main(String[] args)
    {
        int[][] arr=new int[2][];
        arr[0]=new int[2];
        arr[1]=new int[3];

        arr[0][0]=1;
        arr[0][1]=2;
        arr[1][0]=3;
        arr[1][1]=4;
        arr[1][2]=5;
//        for(int i=0;i<arr[1].length;i++)
//        {
//            System.out.println(arr[1][i]);
//        }
        for(int []x:arr)
        {
            for(int y:x)
            {
                System.out.println(y);
            }
        }
    }
}
