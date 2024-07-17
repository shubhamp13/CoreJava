package com.concurrentcollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

public class CopyOnWriteArrayListDemo3
{
    public static void main(String[] args)
    {
//        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext())
//        {
//            Integer i= (Integer)iterator.next();
//
//            if(i%2==0)
//            {
//                iterator.remove();
//            }
//        }
//        System.out.println(list);
        Function<Integer,Integer>f=i->i*i;
        System.out.println(f.apply(2));
        System.out.println(f.apply(10));
    }
}
