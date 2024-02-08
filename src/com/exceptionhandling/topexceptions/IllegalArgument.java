package com.exceptionhandling.topexceptions;

public class IllegalArgument
{
    public static void main(String[] args) {
        Thread t1=new Thread();
        t1.setPriority(8);
        t1.setPriority(11);
    }
}
