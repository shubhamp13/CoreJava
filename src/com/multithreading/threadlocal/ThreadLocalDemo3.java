package com.multithreading.threadlocal;

public class ThreadLocalDemo3
{
    public static void main(String[] args)
    {
        CustomerThread c1=new CustomerThread("shubham");
        CustomerThread c2=new CustomerThread("sejal");
        CustomerThread c3=new CustomerThread("Shrikant");
        CustomerThread c4=new CustomerThread("Ajay");
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
