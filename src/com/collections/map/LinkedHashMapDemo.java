package com.collections.map;

import java.util.*;

public class LinkedHashMapDemo
{
    public static void main(String[] args)
    {
        LinkedHashMap map = new LinkedHashMap();
        map.put(101,"Shubham");
        map.put(102,"Sejal");
        map.put(103,"Shrikant");
        map.put(104,"Ajay");
        System.out.println(map);//Insertion order is preserved
        Set s=map.keySet();
        System.out.println(s);

        Collection c=map.values();
        System.out.println(c);
        Set c1=map.entrySet();
        Iterator i=c1.iterator();
        while (i.hasNext())
        {
            Map.Entry e=(Map.Entry)i.next();
            System.out.println(e.getKey()+"---------------------"+e.getValue());
            if(e.getKey().equals(101))
            {
                e.setValue("Shubham Pandit Puri");
            } else if (e.getKey().equals(102))
            {
                e.setValue("Sejal Pravin Patankar");
            } else if (e.getKey().equals(103))
            {
                e.setValue("Shrikant Navanath Surve");
            }
            else
            {
                e.setValue("Ajay Kendre");
            }
        }
        System.out.println(map);


    }
}
