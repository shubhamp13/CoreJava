package com.java.Arrays;

public class Length
{
    public static void main(String[] args)
    {
        String []s={"A","AB","ABC"};
        System.out.println(s.length);
//        System.out.println(s.length());//CTE:Can Not Found Symbol
//        System.out.println(s[0].length);//CTE:-Can not found symbol
        System.out.println(s[0].length());
    }

}
