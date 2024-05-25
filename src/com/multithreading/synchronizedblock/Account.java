package com.multithreading.synchronizedblock;

public class Account
{
    public  void display(int amount)
    {
        System.out.println("Bank Name: State Bank Of India");
        System.out.println("IFSC Code:SBIN0006755");
        System.out.println("Address:Shivaji Nagar Omerga");
        synchronized (Account.class)
        {
            for(int i=0;i<10;i++)
            {
                System.out.print("Hello User.....");
                try
                {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){}
                System.out.println("Available balance is "+amount);


            }
        }


    }
}
