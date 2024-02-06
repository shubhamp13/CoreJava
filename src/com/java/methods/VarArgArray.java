package com.java.methods;

public class VarArgArray
{
    public  static  void sum(int[]...x)
    {
        int sum=0;
        for(int[]a:x)
        {
            for(int b:a)
            {
                sum+=b;
            }
        }
        System.out.println("Sum Is "+sum);
    }

     public static void main(String...args)
    {
        int []a={1,2,3,4,5,6};
        int []b={7,8,9,10};
        sum(a,b);
    }
}
