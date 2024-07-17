package com.collections.set;

import java.util.TreeSet;

public class TreeSetDemo
{
    public static void main(String[] args)
    {
//        TreeSet set = new TreeSet();
//        set.add("A");
//        set.add("Z");
//        set.add("L");
//        set.add("D");
//        set.add("C");
//        System.out.println(set);
        TreeSet set = new TreeSet();
        set.add(new StringBuffer("A"));
        set.add(new StringBuffer("Z"));
        set.add(new StringBuffer("L"));
        set.add(new StringBuffer("D"));
        set.add(new StringBuffer("A"));
        System.out.println(set);
        //StringBuffer and StringBuilder implements Comparable interface from jdk11
    }
}
