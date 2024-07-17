package com.collections.set;

import java.util.Comparator;
import java.util.TreeSet;

public class DescendingOrder
{
    public static void main(String[] args)
    {
        TreeSet set = new TreeSet(new MyComparator());
//        set.add(10);
//        set.add(0);
//        set.add(15);
//        set.add(5);
//        set.add(20);
//        set.add(20);
        set.add("Za");
        set.add("Zb");
        set.add("Zc");
        set.add("Zd");
        set.add("Ze");
        System.out.println(set);
        int i=3;
        int j=(--i)+(i++)-(++i);
        int k=(i--)-(j++)+(i--);
        int l=(i++)+(j--)+(--k)+(k++);
//        for(i=0;i<=8;i++);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);


    }
}
class MyComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
//        Integer i1 = (Integer)o1;
//        Integer i2 = (Integer)o2;
//        if(i1>i2)
//        {
//            return -1;
//        }
//        else if(i1<i2)
//        {
//            return 1;
//        }
//        else
//            return 0;
        return (o1.toString().compareToIgnoreCase(o2.toString()));
    }
}
