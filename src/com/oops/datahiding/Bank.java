package com.oops.datahiding;

public class Bank
{
    public String name;
    public long accountNo;
    private long phoneNo;
    private  double balance;

    public Bank()
    {

    }

    public Bank(String name, long accountNo, long phoneNo, double balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.phoneNo = phoneNo;
        this.balance = balance;
    }

    public long getPhoneNo()
    {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo)
    {
        this.phoneNo = phoneNo;
    }

    public double getBalance()
    {
        return balance;
    }
    public  void debit (double amount)
    {
        if(amount >0 && balance-amount>=2000)
        {
            balance-=amount;
            System.out.println("Your Account is debited "+amount+" Rs");
            System.out.println("Available Balance:"+balance);
        }
        else
        {
            System.out.println("Invalid Amount");
        }
    }
    public  void credit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Your Account is credited with "+amount+" Rs");
            System.out.println("Available Balance:"+balance);
        }
        else
        {
            System.out.println("Invalid Amount");
        }
    }
}
