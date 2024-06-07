package com.multithreading.enhancements.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class PrimeNumbers implements Runnable
{
    static ReentrantLock lock = new ReentrantLock();
   private int range;
    String name;
    public PrimeNumbers(int range,String name)
    {
        Thread.currentThread().setName(name);
        this.range = range;
    }
    public void run()
    {
        lock.lock();
        System.out.println("\nThe Range Of Prime Numbers From 0 to "+range+" is Executed By "+Thread.currentThread().getName());
        for (int i=0;i<=range;i++)
        {
            boolean isPrime = false;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    isPrime = true;
                    break;
                }
            }
                if (!isPrime)
                {
                    System.out.print(i+" ");
                }
        }
        lock.unlock();
    }

}
public class ExecutorDemoPrimeNumbers
{
    public static void main(String[] args)
    {
        PrimeNumbers [] primeNumbers={new PrimeNumbers(10,"shubham"),
        new PrimeNumbers(20,"sejal"),
        new PrimeNumbers(30,"shrikant"),
        new PrimeNumbers(40,"Ajay"),
        new PrimeNumbers(50,"Himanshu")};

        ExecutorService service= Executors.newFixedThreadPool(3);
        for(PrimeNumbers primeNumber:primeNumbers)
        {
            service.submit(primeNumber);
        }
        service.shutdown();
    }
}
