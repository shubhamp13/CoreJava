package com.java.Operators.logicaloperators;

public class Case2
{
    public static void main(String[] args)
    {
        /*
            In Below Scenario
            ++x<10 ---> false
            so second operand is not evaluated directly else part is executed
         */
        int x=10,y=15;
        if(++x<10 && y/0>19)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Hi");
        }
    }
}
