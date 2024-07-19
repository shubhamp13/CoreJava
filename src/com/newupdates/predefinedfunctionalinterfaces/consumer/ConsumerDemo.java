package com.newupdates.predefinedfunctionalinterfaces.consumer;

import java.util.function.Consumer;

public class ConsumerDemo
{
    public static void main(String[] args)
    {
        Consumer<String> consumer = x-> System.out.println(x);
        consumer.accept("Hello");
        consumer.accept("World");
        consumer.accept("Shubham");
    }
}
