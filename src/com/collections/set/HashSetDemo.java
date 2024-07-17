package com.collections.set;

import java.util.HashSet;

public class HashSetDemo
{
    public static void main(String[] args)
    {
        HashSet h=new HashSet();
        h.add('S');
        h.add('H');
        h.add('U');
        h.add('B');
        h.add(null);
        h.add(10);
        System.out.println(h.add('H'));
        System.out.println(h);

    }
}
