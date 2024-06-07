package com.langpackage.String;

public class StringImmutable
{
    public static void main(String[] args)
    {
        String s=new String("hello");
        StringBuffer sb=new StringBuffer("hello");
        System.out.println("Before Modify:");
        System.out.println("String:---"+s);
        System.out.println("StringBuffer:---"+sb);
        sb.append("world");
        s.concat("world");
        System.out.println("\nAfter Modify:");

        System.out.println("String:---"+s);
        System.out.println("StringBuffer:---"+sb);


    }
}
