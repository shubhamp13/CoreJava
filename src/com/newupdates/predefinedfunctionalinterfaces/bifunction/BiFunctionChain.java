package com.newupdates.predefinedfunctionalinterfaces.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionChain
{
    public static void main(String[] args)
    {
        BiFunction<Integer, Integer, Integer> biFunction1=(a,b)->a+b;
        BiFunction<Integer, Integer, Integer> biFunction2=(a,b)->a*b;
        Function<Integer,Integer>f=s->biFunction2.apply(s,s);
        System.out.println(biFunction1.andThen(f).apply(10,20));//900
    }
}
