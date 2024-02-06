package com.oops.abstraction;

public interface Loan
{
    double personalLoanROI=9.75;
    double carLoanROI=7.34;
    double houseLoanROI=8.75;

    double educationLoanROI=6.40;

    public double simpleIntrestCarLoan(double principal,double duration);
    public double simpleIntrestHouseLoan(double principal,double duration);
    public double simpleIntrestPersonalLoan(double principal,double duration);
    public double simpleIntrestEducationLoan(double principal,double duration);



}
