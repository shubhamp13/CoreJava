package com.newupdates.predefinedfunctionalinterfaces;

import com.newupdates.defaultstaticmethods.I1;
import com.newupdates.defaultstaticmethods.Interf;

import java.util.function.Predicate;

public class PredicateJoinDemo
{
    public static void main(String[] args)
    {
        int []x={1,11,22,5,10,15,20,25,35,40};
        Predicate<Integer> p1=i->i%2==0;
        Predicate<Integer>p2=i->i>10;
        System.out.println("The Numbers Which Are Even");
        m1(p1,x);
        System.out.println("The Numbers Which Are Odd");
        m1(p1.negate(),x);
        System.out.println("The Numbers which are even and greater than 10");
        m1(p1.and(p2),x);
        System.out.println("The Numbers which are odd or greater than 10");
        m1(p1.negate().or(p2),x);
    }
    public static void  m1(Predicate<Integer> p,int[]x)
    {
        for(int x1:x)
        {
            if(p.test(x1))
            {
                System.out.println(x1);
            }
        }
    }
}
