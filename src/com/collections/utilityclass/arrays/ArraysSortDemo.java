package com.collections.utilityclass.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo
{
    public static void main(String[] args)
    {
        int []a={12,15,20,7,5};
        System.out.println("Before Sorting");
        for(int a1:a)
        {
            System.out.println(a1);
        }
        System.out.println("After Sorting");
        Arrays.sort(a);
        for(int a1:a)
        {
            System.out.println(a1);
        }

        String []s={"A","Z","B"};
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(s));


        Arrays.sort(s,new Comparator<String>() {
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println("After Sorting");
        System.out.println( Arrays.toString(s));


    }
}
