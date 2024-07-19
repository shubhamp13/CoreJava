package com.newupdates.predefinedfunctionalinterfaces.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateDemo
{
    public static void main(String[] args)
    {
        Predicate <Integer>p1=i->i%2==0;
        System.out.println(p1.test(5));

        Predicate<Integer> p2=i->i>10;
        System.out.println(p2.test(15));

        String []s={"Dell","Lenovo","HP","Inspiron","EliteNotebook","Acer","Desktop","Keyboard"};
        Predicate<String> p3=s1->s1.length()>5;
        for(String s1:s)
        {
            if(p3.test(s1))
            {
                System.out.println(s1);
            }
        }
        Predicate< Collection> p4=c->c.isEmpty();
        ArrayList al=new ArrayList();
        System.out.println(p4.test(al));
    }
}
