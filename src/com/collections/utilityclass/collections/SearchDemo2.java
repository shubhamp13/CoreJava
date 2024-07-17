package com.collections.utilityclass.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SearchDemo2
{
    public static void main(String[] args)
    {
        ArrayList l=new ArrayList();
        l.add(20);
        l.add(0);
        l.add(5);
        l.add(15);
        l.add(10);
        System.out.println("Before Sorting "+l);//[20,0,5,15,10]

        Collections.sort(l,  new Comparator<Integer>() {
            public int compare(Integer i1,Integer i2)
            {
                return -i1.compareTo(i2);
            }
        });
        System.out.println("After Sorting"+l);//[20,15,10,5,0]

        System.out.println(Collections.binarySearch(l,5, new Comparator<Integer>() {
            public int compare(Integer i1,Integer i2)
            {
                return -i1.compareTo(i2);
            }
        }));//3
        System.out.println(Collections.binarySearch(l,18, new Comparator<Integer>() {
            public int compare(Integer i1,Integer i2)
            {
                return -i1.compareTo(i2);
            }
        }));//-2
    }
}
