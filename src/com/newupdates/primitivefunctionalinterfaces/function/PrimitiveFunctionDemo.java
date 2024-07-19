package com.newupdates.primitivefunctionalinterfaces.function;

import java.util.function.*;

public class PrimitiveFunctionDemo
{
    public static void main(String[] args)
    {
        IntFunction<Integer>f1=i->i*i;
        System.out.println(f1.apply(15));
        LongFunction<Long>f2=l->l*l;
        long t=20L;
        System.out.println(f2.apply(t));
        DoubleFunction<Double>f3=d->d*d;
        double d=3.14;
        System.out.println(f3.apply(d));

        IntToLongFunction f4=i->i*i;
        long l=f4.applyAsLong(5);
        System.out.println(l);

        IntToDoubleFunction f5=i->i*i;
        double d1=f5.applyAsDouble(20);
        System.out.println(d1);
    }
}
