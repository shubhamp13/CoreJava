package com.newupdates.defaultstaticmethods;

interface Right
{
    public default void m1()
    {
        System.out.println("Right Interface M1()");
    }
}
