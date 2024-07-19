package com.newupdates.predefinedfunctionalinterfaces.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo
{
    public static void main(String[] args) {
        BiPredicate<Integer,Integer>f=(a,b)->(a+b)%2==0;
        System.out.println(f.test(1,2));
        System.out.println(f.test(2,3));
        System.out.println(f.test(3,4));
        System.out.println(f.test(5,5));
        System.out.println(f.test(4,6));
        System.out.println(f.test(6,7));


    }
}
