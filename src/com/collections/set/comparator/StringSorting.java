package com.collections.set.comparator;


import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class StringSorting
{
    public static void main(String[] args)
    {
//        TreeSet<String> set = new TreeSet<String>(new MyComparator6());
//        set.add("W");
//        set.add("V");
//        set.add("U");
//        set.add("A");
//        set.add("B");
//        set.add("C");
//        set.add("Z");
//        set.add("Y");
//        set.add("X");
//        set.add("D");
//        System.out.println(set);
        TreeSet<Integer> set2 = new TreeSet<Integer>() ;
        set2.add(100);
        set2.add(-2);
        set2.add(30);
        set2.add(-40);
        set2.add(500);
        System.out.println(set2);
    }
}
class MyComparator6 implements Comparator
{
  public int compare(Object o1, Object o2)
  {
      Integer i1 = (Integer)o1;
      Integer i2 = (Integer)o2;
      return -i1.compareTo(i2);
  }
}
