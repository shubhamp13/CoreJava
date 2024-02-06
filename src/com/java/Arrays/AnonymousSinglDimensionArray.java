package com.java.Arrays;

public class AnonymousSinglDimensionArray
{
    public  static void  sum(int []a)
    {
        int total=0;
        for(int x:a)
        {
            total+=x;
        }
        System.out.println("Sum "+total);
    }
    public  static  void  sum(int [][]a)
    {
        int total=0;
        for(int []x:a)
        {
            for(int y:x)
            {
                total =total +y;
            }
        }
        System.out.println("Total Sum "+total);
    }
    public static void main(String[] args)
    {
        sum(new int[]{10,20,30,40});
        sum(new int[][]{{10,20},{30,40,50}});
    }
}
