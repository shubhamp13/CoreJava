package com.collections.map.comparator;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapComparator
{
    public static void main(String[] args)
    {
        TreeMap t=new TreeMap(new MyComparator());
        for(int i=65;i<=90;i++)
        {
            t.put((char)i,i);
        }
        System.out.println(t);
    }
}
class MyComparator implements Comparator
{
    public int compare(Object o1,Object o2)
    {
        Character c1=(Character) o1;
        Character c2=(Character) o2;
        return -c1.compareTo(c2);
    }
}
