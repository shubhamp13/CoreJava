package com.newupdates.lambdaexpressions.concrete;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo 
{
    public static void main(String[] args) 
    {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(110);
        list.add(1110);
        list.add(11110);
        list.add(111110);
        System.out.println(list);
//        Collections.sort(list,new MyComparator());
//        System.out.println(list);

        //With Lambda Expressions
//        Comparator <Integer>c=(a, b)->a>b?-1:a<b?1:0;
        Comparator <Integer>c=(a, b)->-a.compareTo(b);
        Collections.sort(list, c);
        System.out.println(list);
    }
}
class MyComparator implements Comparator
{
    public int compare(Object o1, Object o2)
    {
        Integer i1 = (Integer)o1;
        Integer i2 = (Integer)o2;
//        if(i1>i2)
//        {
//            return -1;
//        }
//        else if(i1<i2)
//        {
//            return 1;
//        }
//        return 0;
        return i1>i2?-1:i1<i2?1:0;
    }
}
