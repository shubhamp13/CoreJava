package com.collections.utilityclass.collections;

import  java.util.ArrayList;
import java.util.Collections;

public class SearchDemo
{
    public static void main(String[] args)
    {
        ArrayList l=new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("L");
        l.add("a");
        System.out.println("Before Sorting "+l);//[Z,A,K,L,a]
        Collections.sort(l);
        System.out.println("After Sorting "+l);//[A,K,L,Z,a]

        System.out.println(Collections.binarySearch(l,"Z"));//3
        System.out.println(Collections.binarySearch(l,"J"));//-2
    }
}
