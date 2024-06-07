package com.langpackage.objectclass.equals;

public class Important
{
    public static void main(String[] args)
    {
        String s1=new String("shubham");
        String s2=new String("shubham");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));


        StringBuffer sb=new StringBuffer("shubham");
        StringBuffer sb2=new StringBuffer("shubham");
        System.out.println(sb==sb2);
        System.out.println(sb.equals(sb2));
    }
}
