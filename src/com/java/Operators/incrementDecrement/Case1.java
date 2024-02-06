package com.java.Operators.incrementDecrement;

public class Case1
{
    public static void main(String[] args)
    {
        int x=10;
        int y=++x;
//        int z=++10; Increment operators  can not be performed on constants
        // If We try then we will getCTE
        //Unexpected Types
        //found : value
        //required: variable
        System.out.println("X:-"+x+" Y:- "+y);
    }
}
