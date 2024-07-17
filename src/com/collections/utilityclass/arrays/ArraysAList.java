package com.collections.utilityclass.arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysAList
{
    public static void main(String[] args)
    {
        String []a={"A","Z","B"};
        List l= Arrays.asList(a);
        System.out.println(l);
        a[0]="O";
        l.set(1,"P");
        System.out.println(l);
//        l.add("Q");//UnsupportedOperationException
//        l.set(1,new Integer(10));//ArrayStoreException
        l.remove("Q");
    }
}
