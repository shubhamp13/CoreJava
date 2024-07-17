package com.collections.set.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class StringDesc
{
    public static void main(String[] args)
    {
        TreeSet t=new TreeSet(new MyComparator3());
        t.add("Shubham");
        t.add("Sejal");
        t.add("Shrikant");
        t.add("Avinash");
        t.add("Zebra");
        t.add("Xerox");
        System.out.println(t);
    }
}
class MyComparator3 implements Comparator
{
    public int compare(Object o1,Object o2)
    {
//        return -(o1.toString().compareTo(o2.toString()));//Descending Order
        return o2.toString().compareTo(o1.toString());
    }
}
