package com.collections.utilityclass.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySearchDemo
{
    public static void main(String[] args)
    {
        int []arr = {100,-2,3,-40,5,6,7,8,9,10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[-40, -2, 3, 5, 6, 7, 8, 9, 10, 100]
        System.out.println(Arrays.binarySearch(arr,9));//7
        System.out.println(Arrays.binarySearch(arr,110));//-11

        String []s={"A","Z","B"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.binarySearch(s,"Z"));//2
        System.out.println(Arrays.binarySearch(s,"D"));//-3

        Arrays.sort(s,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(s));
       int c1= Arrays.binarySearch(s,"Z",new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });//0
        System.out.println(c1);//0
        int c2=Arrays.binarySearch(s,"Q",new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });//-2
        System.out.println(c2);//-2
    }
}
