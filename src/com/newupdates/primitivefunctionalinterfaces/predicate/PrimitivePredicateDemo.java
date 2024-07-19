package com.newupdates.primitivefunctionalinterfaces.predicate;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PrimitivePredicateDemo
{
    public static void main(String[] args)
    {
        IntPredicate i1=i->i%2==0;
        int a=10;
        System.out.println(i1.test(a));//true

        LongPredicate i2=l->l%5==0;
        long l=11L;
        System.out.println(i2.test(l));//false

        DoublePredicate d=i->i%10==0;
        double d1=10.00;
        System.out.println(d.test(d1));//true
    }
}
