package com.newupdates.predefinedfunctionalinterfaces.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateJoin
{
    public static void main(String[] args)
    {
        BiPredicate<Integer,Integer>f1=(a,b)->(a+b)%2==0;
        BiPredicate<Integer,Integer>f2=(a,b)->(a*b)%2==0;
        System.out.println(f1.and(f2).test(5,6));//false
        System.out.println(f1.or(f2).test(2,2));//true
        System.out.println(f1.negate().test(5,6));//true


    }
}
