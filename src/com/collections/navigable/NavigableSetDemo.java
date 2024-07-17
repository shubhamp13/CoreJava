package com.collections.navigable;

import java.util.TreeSet;

public class NavigableSetDemo
{
    public static void main(String[] args)
    {
        TreeSet <Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(1000);
        treeSet.add(2000);
        treeSet.add(3000);
        treeSet.add(4000);
        treeSet.add(5000);
        treeSet.add(6000);
        System.out.println(treeSet.floor(3000));
        System.out.println(treeSet.lower(3000));
        System.out.println(treeSet.ceiling(3000));
        System.out.println(treeSet.higher(3000));
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());
        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet);
    }
}
