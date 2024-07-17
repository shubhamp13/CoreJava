package com.collections.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2
{
    public static void main(String[] args)
    {
        TreeSet set = new TreeSet(new MyComparator2());
        set.add(10);
        set.add(0);
        set.add(15);
        set.add(5);
        set.add(20);
        set.add(20);
        System.out.println(set);
    }
}
class MyComparator2 implements Comparator
{
    public int compare(Object o1, Object o2)
    {
        Integer I1=(Integer)o1;
        Integer I2=(Integer)o2;
//        return I1.compareTo(I2);//Natural Ascending order [0,5,10,15,20]
//        return -(I1.compareTo(I2));//Descending Order [20,15,10,5,0]
//        return I2.compareTo(I1);//Descending Order [20,15,10,5,0]
//        return -I2.compareTo(I1);//Ascending Order [0,5,10,15,20]
//        return +1; //Insertion order [10,0,15,5,20,20]
//        return -1;//Reverse of Insertion order [20,20,5,15,0,10]
        return 0;//[10]
    }


}
