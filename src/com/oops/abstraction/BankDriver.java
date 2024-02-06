package com.oops.abstraction;
public class BankDriver
{
    public static void main(String[] args)
    {
        Bank b1=new Bank("Shubham",35637102910L,879356931L,700000.00);
        b1.debit(1000000);
        double SI=b1.simpleIntrestCarLoan(100000,12);
        System.out.println("Intrest"+SI);
    }
}
