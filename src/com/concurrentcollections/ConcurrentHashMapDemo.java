package com.concurrentcollections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo
{
    public static void main(String[] args)
    {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(101, "shubham");
        concurrentHashMap.put(102, "Shrikant");
        System.out.println(concurrentHashMap);
        System.out.println(concurrentHashMap.putIfAbsent(101, "shubham puri"));
        System.out.println(concurrentHashMap);
        System.out.println(concurrentHashMap.remove(102,"shubham"));
        System.out.println(concurrentHashMap);
        System.out.println(concurrentHashMap.remove(102,"Shrikant"));
        System.out.println(concurrentHashMap);
        concurrentHashMap.replace(101,"shubham","Shubham Puri");
        System.out.println(concurrentHashMap);

    }
}
