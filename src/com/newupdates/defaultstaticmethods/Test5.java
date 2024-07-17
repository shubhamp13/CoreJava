package com.newupdates.defaultstaticmethods;
public class Test5 implements Left, Right
{
    @Override
    public void m1()
    {
        System.out.println("Overriding method m1 in Test5 Class");
        Left.super.m1();
        Right.super.m1();
    }
    public static void main(String[] args)
    {
        Test5 obj = new Test5();
        obj.m1();//This will call Overriding version of m2
    }
}
