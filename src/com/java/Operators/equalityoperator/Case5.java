package com.java.Operators.equalityoperator;

public class Case5
{
    public static void main(String[] args)
    {
        String s=new String("Shubham");
        System.out.println(s==null);//---->>>>false

        String p=null;
        System.out.println(p==null);//----->>>>true

        System.out.println(null==null);//---->>>>true
    }
}
