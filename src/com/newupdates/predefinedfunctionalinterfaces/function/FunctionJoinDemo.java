package com.newupdates.predefinedfunctionalinterfaces.function;

import java.util.function.Function;

public class FunctionJoinDemo
{
    public static void main(String[] args)
    {
        Function<String,String>f1=s->s.toUpperCase();
        Function<String,String>f2=s->s.replaceAll(" ","");
        System.out.println(f1.apply("shubham"));
        System.out.println(f2.apply("shubham pandit puri"));
        System.out.println(f1.andThen(f2).apply("shubham pandit puri"));
        System.out.println(f1.compose(f2).apply("shubham pandit puri"));

    }
}
