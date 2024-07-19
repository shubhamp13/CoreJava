package com.newupdates.predefinedfunctionalinterfaces.supplier;

import java.util.function.Supplier;

public class SupplyRandomOtp
{
    public static void main(String[] args)
    {
        Supplier<String> supplier = () ->
        {
            String otp="";
            for(int i=0;i<6;i++)
            {
                otp+=(int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
