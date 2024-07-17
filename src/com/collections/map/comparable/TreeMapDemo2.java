package com.collections.map.comparable;

import java.util.TreeMap;

public class TreeMapDemo2
{
    public static void main(String[] args)
    {
        TreeMap m=new TreeMap();
        m.put(101,"A");
        m.put(102,"B");
        m.put(110,"C");
        m.put(100,100);
        m.put(98,null);

//        m.put("c",55);//ClassCastException
//        m.put(null,88);//NullPointerException
        System.out.println(m);
    }
}
