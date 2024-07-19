package com.newupdates.predefinedfunctionalinterfaces.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo
{
    public static void main(String[] args)
    {
        BiConsumer<String,String>f=(s1,s2)-> System.out.println(s1+s2);
        f.accept("Shubham","Puri");

    }
}
