package com.java.variables;

public class LocalVar3
{
    public static void main(String[] args)
    {
        /* If  we are intializing local variable inside logical block then we
          will get CTE Varibale x might not have been intialize

          It is not recommended to intialize local variibale in logical block
          because its not confirm it will always execute
         */
        int x;
        if(args.length>0)
        {
            x=20;
        }
//        System.out.println(x);
    }
}

