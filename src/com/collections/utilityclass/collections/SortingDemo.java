package com.collections.utilityclass.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo
{
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        list.add("Z");
        list.add("A");
        list.add("K");
        list.add("L");
//        list.add(new Integer(10));//ClassCastException
//        list.add(null);//NullPointerException
        System.out.println("Before sorting:"+list);
        Collections.sort(list);
        System.out.println("After sorting:"+list);

    }
}
