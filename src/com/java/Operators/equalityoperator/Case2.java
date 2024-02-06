package com.java.Operators.equalityoperator;

public class Case2
{
    public static void main(String[] args)
    {
        Thread t1=new Thread();
        Thread t2=new Thread();
        Thread t3=t1;
        System.out.println(t1==t2);//false
        System.out.println("T1:-"+t1+" "+"T2:-"+t2);
        System.out.println(t1==t3);//true
        System.out.println("T1:-"+t1+" "+"T3:-"+t3);

    }
}
