package com.collections.set;

public class CompareToDemo
{
    public static void main(String[] args)
    {
        System.out.println("A".compareTo("Z"));//return negative as A comes before Z
        System.out.println("K".compareTo("B"));//returns positive as K comes after B
        System.out.println("A".compareTo("A"));// returns zero as both objects are same
    }
}
