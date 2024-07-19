package com.newupdates.predefinedfunctionalinterfaces.function;

import java.util.function.Function;

public class LengthString
{
    public static void main(String[] args)
    {
        Function<String,Integer>f=s->s.length();
        System.out.println(f.apply("Shubham"));
    }
}
