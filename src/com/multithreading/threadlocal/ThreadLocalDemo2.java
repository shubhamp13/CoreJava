package com.multithreading.threadlocal;

public class ThreadLocalDemo2
{
    public static void main(String[] args)
    {
        ThreadLocal tl = new ThreadLocal()
        {
            public Object initialValue()
            {
                return "Shubham Puri";
            }
        };
        System.out.println(tl.get());
        tl.set("Sejal");
        System.out.println(tl.get());
        tl.remove();
        System.out.println(tl.get());

    }
}
