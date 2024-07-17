package com.collections.set.comparator.userdefined;


import java.util.Comparator;

public class EmpComparator implements Comparator
{
    public int compare(Object o1, Object o2)
    {
        Employee emp1=(Employee)o1;
        Employee emp2=(Employee)o2;
        String name1=emp1.getName();
        String name2=emp2.getName();
        return name1.compareTo(name2);
    }
}
