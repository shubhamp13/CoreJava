package com.collections.navigable;

import java.util.TreeMap;

public class NavigableMap
{
    public static void main(String[] args)
    {
        TreeMap treeMap=new TreeMap();
        treeMap.put("Z","Zebra");
        treeMap.put("A","Apple");
        treeMap.put("K","King");
        treeMap.put("G","Gun");
        treeMap.put("C","Cat");


        System.out.println(treeMap.ceilingKey("B"));
        System.out.println(treeMap.higherKey("B"));

        System.out.println(treeMap.floorKey("M"));
        System.out.println(treeMap.lowerKey("M"));

        System.out.println(treeMap.ceilingEntry("B"));
        System.out.println(treeMap.higherEntry("B"));

        System.out.println(treeMap.floorEntry("M"));
        System.out.println(treeMap.lowerEntry("M"));


        System.out.println(treeMap.pollFirstEntry() );
        System.out.println(treeMap.pollLastEntry());
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap);
    }
}
