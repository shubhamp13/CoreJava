package com.newupdates.predefinedfunctionalinterfaces.consumer;

import java.util.function.Consumer;

public class ConsumerChainDemo
{
    public static void main(String[] args)
    {
        Consumer<String>c1=s-> System.out.println("This Is "+s);
        Consumer<String>c2=s-> System.out.println(s+" got 84 percent in BCA");
        Consumer<String>c3=s-> System.out.println(s+" Is from latur");
        c1.andThen(c2).andThen(c3).accept("Shubham Puri");



    }
}
