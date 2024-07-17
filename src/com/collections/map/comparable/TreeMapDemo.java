package com.collections.map.comparable;

import java.util.TreeMap;

public class TreeMapDemo
{
    public static void main(String[] args)
    {
        String s="shubhamS";
        String s1=s.toLowerCase();
        char  []a=s1.toCharArray();
        TreeMap tm=new TreeMap();
        for(int i=0;i<a.length;i++)
        {
            Integer ct=0;
            if(tm.containsKey(a[i]))
            {
                ct=(Integer) tm.get(a[i]);
                tm.put(a[i],++ct);
            }
            else
            {
                tm.put(a[i],++ct);
            }
        }
        System.out.println(tm);
//        TreeMap<Integer, Character> map = new TreeMap<Integer, Character>();
//        for(int i=90;i>=65;i--)
//        {
//            map.put(i,(char)i);
//        }
//        System.out.println(map);
    }
}
