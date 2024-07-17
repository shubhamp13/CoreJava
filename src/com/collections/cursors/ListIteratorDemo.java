package com.collections.cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.add("shubham");
        list.add("pandit");
        list.add("puri");
        list.add("Latur");
        list.add("8793569633");
        list.add("413512");
        System.out.println(list);

        ListIterator listIterator=list.listIterator();
        while (listIterator.hasNext())
        {
            String s=(String) listIterator.next();
            if(s.equalsIgnoreCase("latur"))
            {
                listIterator.set("Pune");
            }
            else if(s.equalsIgnoreCase("8793569633"))
            {
                listIterator.set("8793569631");
            } else if (s.equalsIgnoreCase("413512"))
            {
                listIterator.remove();
                listIterator.add("411041");
                listIterator.add("Maharashtra");

            }
        }
        while (listIterator.hasPrevious())
        {
            String s=(String) listIterator.previous();
            System.out.println(s);
        }
        System.out.println(list);
    }
}
