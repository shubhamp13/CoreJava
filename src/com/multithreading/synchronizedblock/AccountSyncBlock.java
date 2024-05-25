package com.multithreading.synchronizedblock;

class  MyThread1 extends Thread
{
    Account account;
    int amount;

    public MyThread1(Account account, int amount)
    {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run()
    {
        account.display(amount);
    }
}
public class AccountSyncBlock
{
    public static void main(String[] args)
    {
        Account account1=new Account();
        Account account2=new Account();
        MyThread1 thread1 = new MyThread1(account1,100000);
        MyThread1 thread2 = new MyThread1(account2,500000);
        thread1.start();
        thread2.start();
    }
}
