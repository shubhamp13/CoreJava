package com.collections.map;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class HashMapDemo
{
    public static void main(String[] args)
    {
        HashMap hashMap = new HashMap();
        hashMap.put("Shubham",101);
        hashMap.put("Sejal",102);
        hashMap.put("Shrikant",103);
        hashMap.put("Sham",104);
//        hashMap.entrySet().stream().forEach(System.out::println);
        
//        System.out.println(hashMap.put("Shubham",1010));
//
//        Set set = hashMap.keySet();
//        System.out.println(set);
//
//        Collection collection = hashMap.values();
//        System.out.println(collection);
//        System.out.println(collection.getClass().getName());
//
//        Set s1= hashMap.entrySet();
//        System.out.println(s1);
//        Iterator iterator = s1.iterator();
//        while (iterator.hasNext())
//        {
//            Map.Entry e=(Map.Entry)iterator.next();
//            System.out.println(e.getKey()+"..................."+e.getValue()) ;
//            if(e.getKey().equals("Shubham"))
//            {
//                e.setValue(1818);
//            }
//        }
//        System.out.println(hashMap);
        Function <Integer,Integer>f=i-> i*i;
        System.out.println(f.apply(20));

        Predicate <Integer>p=i->i%2==0;
        System.out.println(p.test(18));

    }
}
