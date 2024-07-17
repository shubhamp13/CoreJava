package com.collections.list;


import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add('S');
        list.add("P");
        list.add(null);
        System.out.println(list);
        list.remove("P");
        System.out.println(list);
        list.remove(null);
        System.out.println(list);
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        list.addAll(c);
        System.out.println(list);
        list.removeAll(c);
        System.out.println(list);
    }
}
