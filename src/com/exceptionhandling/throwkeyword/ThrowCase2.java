package com.exceptionhandling.throwkeyword;

import java.io.IOException;

public class ThrowCase2
{
    public static void main(String[] args)
    {
        System.out.println("We Can throw unchecked exception directly but we can not throw\n" +
                "\t checked exception directly otherwise we will get compile time error");
//        throw new IOException();
    }
}
