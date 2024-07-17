package com.collections.utilityclass.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingDemo2
{
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        list.add("Z");
        list.add("A");
        list.add("K");
        list.add("L");
        list.add(new Integer(910));
//        list.add(null);//NullPointerException
        System.out.println("Before sorting:"+list);
        Collections.sort(list,new MyComparator());
        System.out.println("After sorting:"+list);
    }
}
class MyComparator implements Comparator
{
    public int compare(Object o1, Object o2)
    {
        return- o1.toString().compareTo(o2.toString());
    }
}
