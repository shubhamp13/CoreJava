package com.newupdates.predefinedfunctionalinterfaces.supplier;

import java.util.Date;
import java.util.function.Supplier;

//Program To generate Date
public class SupplyDate
{
    public static void main(String[] args) {
        Supplier<Date>s=()->new Date();
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
