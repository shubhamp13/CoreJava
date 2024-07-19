package com.newupdates.predefinedfunctionalinterfaces.bifunction;

import java.util.function.BiFunction;

public class BiFunctionDemo
{
    public static void main(String[] args)
    {
        BiFunction<Integer,Integer,Integer> biFunction =(a,b)->a*b;
        System.out.println(biFunction.apply(1,2));//2
        System.out.println(biFunction.apply(2,3));//5
        System.out.println(biFunction.apply(3,4));//12
        System.out.println(biFunction.apply(4,5));//20
    }
}
