package com.collections.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo
{
    public static void main(String[] args)
    {
        Vector v = new Vector();
        v.addElement('A');
        v.addElement('B');
        v.addElement('C');
        v.addElement('D');
        v.addElement('E');
        Enumeration e = v.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        System.out.println(v.elementAt(2));
        System.out.println(v.capacity());

        Vector v2 = new Vector(10,5);
        System.out.println(v2.capacity());
        for(int i=0;i<=10;i++)
        {
            v2.addElement(i);
        }
        System.out.println(v2.capacity());
        System.out.println(v2);
    }
}
