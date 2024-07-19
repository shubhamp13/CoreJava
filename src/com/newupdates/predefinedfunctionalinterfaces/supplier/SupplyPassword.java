package com.newupdates.predefinedfunctionalinterfaces.supplier;

import java.util.function.Supplier;

//To Generate Random Password
//1.Length Must be 8 characters
//2.Digits at only 2,4,6,8 place
//3.Capital Uppercase characters and @,#,$at 1,3,5,7,
public class SupplyPassword
{
    public static void main(String[] args)
    {
        String symbols="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
        Supplier<String>supplier=()->
        {
            String password="";
            for(int i=1;i<=8;i++)
            {
                if(i%2==0)
                {
                    password+=(int)(Math.random()*10);
                }
                else
                {
                    int x=(int)(Math.random()*symbols.length());
                    password+=symbols.charAt(x);
                }
            }
            return password;
        };
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
