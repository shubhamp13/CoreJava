package com.oops.datahiding;

public class BankDriver
{
    public static void main(String[] args)
    {
        Bank b1=new Bank("Shubham",35637102910l,879356931L,700000.00);
        b1.debit(1000000);
    }
}
