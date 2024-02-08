package com.exceptionhandling.topexceptions;

public class IllegalState
{
    public static void main(String[] args)
    {
        Thread t=new Thread();
        t.start();
        t.setPriority(4);
        t.start();
    }
}
