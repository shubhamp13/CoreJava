package com.exceptionhandling.userdefined;

public class CustomizedException
{
    public static void main(String[] args)
    {
        int age=16;
        if(age<18)
        {
            throw  new TooYoungException("You are Young to get marriage");
        } else if (age>40)
        {
            throw new TooOldException("You are very old to get marriage");
        }
        else if(age>=18&&age<=40)
        {
            System.out.println("Welcome");
        }
        else
        {
            System.out.println("Unexpected age");
        }
    }
}
