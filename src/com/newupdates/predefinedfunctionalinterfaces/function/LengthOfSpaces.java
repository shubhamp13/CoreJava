package com.newupdates.predefinedfunctionalinterfaces.function;

import java.util.function.Function;

public class LengthOfSpaces
{
    public static void main(String[] args)
    {
        Function<String,Integer>f=s->s.length()-s.replaceAll(" ","").length();
        System.out.println(f.apply("Shubham Pandit Puri"));
    }
}
