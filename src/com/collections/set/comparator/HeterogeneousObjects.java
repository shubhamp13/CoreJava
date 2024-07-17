package com.collections.set.comparator;
//WAP to insert String And StringBuffer Objects into TreeSet Where Sorting order is
// increasing length order
// if two objects having same length then consider their alphabetical order
import java.util.Comparator;
import java.util.TreeSet;

public class HeterogeneousObjects
{
    public static void main(String[] args)
    {
        TreeSet set = new TreeSet(new MyComparator4());
        set.add("A");
        set.add(new StringBuffer("ABC"));
        set.add(new StringBuffer("AA"));
        set.add("XX");
        set.add("ABCD");
        set.add("A");
        System.out.println(set);
    }
}
class MyComparator4 implements Comparator
{
    public int compare(Object o1, Object o2)
    {
        String s1 = o1.toString();
        String s2 = o2.toString();
        int l1=s1.length();
        int l2=s2.length();
        if(l1<l2)
            return -1;
        else if (l1>l2)
        {
            return 1;
        }
        else
            return s1.compareTo(s2);
    }
}
