package com.collections.cursors;

import java.util.*;

public class CursorDemo
{
    public static void main(String[] args)
    {
        Vector<String> v = new Vector<String>();


        Enumeration e = v.elements();
        Iterator it = v.iterator();
        ListIterator lit = v.listIterator();
        System.out.println(e.getClass().getName());
        System.out.println(it.getClass().getName());
        System.out.println(lit.getClass().getName());
    }
}
