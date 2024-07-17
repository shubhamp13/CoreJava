package com.collections.list;

import java.util.LinkedList;

public class LinkedListDemo
{
    public static void main(String[] args)
    {
        LinkedList l=new LinkedList();
        l.add("Shubham");
        l.add(18);
        l.add(null);
        l.add("Shubham");
        l.set(0, "puri");
        l.add(0,"Shubham");
        l.removeLast();
        l.addFirst("Shubham");
        System.out.println(l);


        LinkedList l1=new LinkedList();
        l1.addFirst("shubham pandit puri");
        l1.add("Sejal Pravin Patankar");
        l1.add(8793569631L);
        l1.add(9579678375L);
        System.out.println(l1);
        Object o=l1.getFirst();
        System.out.println(o);
        o=l1.getLast();
        System.out.println(o);
        o=l1.removeFirst();
        System.out.println(o);
        o=l1.removeLast();
        System.out.println(o);
        System.out.println(l1);

    }
}
