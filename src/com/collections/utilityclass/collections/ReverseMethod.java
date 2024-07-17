package com.collections.utilityclass.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReverseMethod
{
    public static void main(String[] args)
    {
        ArrayList l=new ArrayList();
        l.add(20);
        l.add(0);
        l.add(5);
        l.add(15);
        l.add(10);
        System.out.println(l);//[20,0,5,15,10]
        Collections.reverse(l);
        System.out.println(l);//[10,15,5,0,20]
        Comparator c1=Collections.reverseOrder(new Comparator<Integer>() {
            public int compare(Integer i1,Integer i2)
            {
                return i1.compareTo(i2);
            }
        });
        Collections.sort(l,c1);
        System.out.println(l);

    }
}
