package com.oops.abstraction;

public class Bank implements  Loan
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

    @Override
    public double simpleIntrestCarLoan(double principal, double duration)
    {
        return principal *carLoanROI*duration/12;
    }

    @Override
    public double simpleIntrestEducationLoan(double principal, double duration) {
        return principal * educationLoanROI * duration/12;
    }

    @Override
    public double simpleIntrestPersonalLoan(double principal, double duration) {
        return principal*personalLoanROI*duration/12;

    }

    @Override
    public double simpleIntrestHouseLoan(double principal, double duration) {
        return principal*houseLoanROI*duration/12;
    }
}
