package com.oops.overriding;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class  P5
{
    public  void m1()
    {

    }
}
class C5 extends  P5
{
//    public void m1()throws FileNotFoundException, EOFException
//    {
//
//    }
}

public class Rule7
{
    public static void main(String[] args)
    {

        System.out.println("Rule 7:");
        System.out.println("\t1.If Child class method throwing unchecked exception then its parent class method\n" +
                "\t must throw same exception or its parent exception\n");
        System.out.println("\t2.If Child class method is not throwing any exception then its not necessary to\n" +
                "\t check about parent class method exception \n");
        System.out.println("\t3.We do not require to worry about unchecked exception");
    }
}
