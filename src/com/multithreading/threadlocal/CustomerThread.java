package com.multithreading.threadlocal;

public class CustomerThread extends Thread
{
    private static Integer custId=0;
   private ThreadLocal t1=new ThreadLocal()
    {
        protected Integer initialValue()
        {
            ++custId;
            return custId;
        }
    };
    CustomerThread(String name)
    {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing  with customer id  "+t1.get());


    }
}
