package com.newupdates.predefinedfunctionalinterfaces.supplier;

import java.util.function.Supplier;

//Program to generate random name
public class SupplierRandomName
{
    public static void main(String[] args)
    {
        String []names={"Shubham","Sejal","Shrikant","Omkar","Ajay","Rahul"};
        Supplier<String>s=()->
        {
            int x=(int)(Math.random() * 6);
            System.out.println(x);
            return names[x];
        };
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());

    }
}
