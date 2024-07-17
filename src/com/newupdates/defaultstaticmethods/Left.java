package com.newupdates.defaultstaticmethods;

interface Left
{
    public default void m1()
    {
        System.out.println("Left Interface M1()");
    }
}