package com.concurrentcollections;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo
{
    public static void main(String[] args)
    {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("B");
        System.out.println(list);
        list.addIfAbsent("D");
        list.addIfAbsent("D");
        System.out.println(list);
        list.clear();


        ArrayList<String> copy = new ArrayList<String>();
        copy.add("A");
        copy.add("B");
        copy.add("C");
        copy.add("A");
        copy.add("B");
        copy.add("C");
        list.addAll(copy);
        System.out.println(list);//[A,B,C,A,B,C]

        ArrayList copy2 = new ArrayList();
        copy2.add("A");
        copy2.add("B");
        copy2.add("C");
        copy2.add("D");
        copy2.add("E");

        list.addAllAbsent(copy2);
        System.out.println(list);//[A,B,C,A,B,C,D,E]
    }
}
