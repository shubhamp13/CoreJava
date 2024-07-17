package com.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo
{
    public static void main(String[] args)
    {
        LinkedHashSet set = new LinkedHashSet();
        set.add('A');
        set.add('B');
        set.add('C');
        set.add(null);
        set.add(10);
        set.add("Shubham");
        System.out.println(set);

        HashSet hashSet = new HashSet(set);
        System.out.println(hashSet);
    }
}
