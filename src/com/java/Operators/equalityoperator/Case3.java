package com.java.Operators.equalityoperator;

public class Case3
{
    public static void main(String[] args)
    {
        /*
            For Equality operator two objects must be of same type or they must have
            some relation between them either parent-child or child-parent
         */
        Thread t1=new Thread();
        String s=new String("Shubham");
        Object o=new Object();
        System.out.println(s==o);
        System.out.println(o==t1);
//        System.out.println(s==t1);//Incomparable types java.lanag.String and java.lang.thread
    }
}
