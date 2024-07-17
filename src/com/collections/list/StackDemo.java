package com.collections.list;

import java.util.Stack;

public class StackDemo
{
    public static void main(String[] args)
    {
        Stack s=new Stack();
        s.push('A');
        s.push('B');
        s.push('C');
        s.push('D');
        Object o=s.pop();
        System.out.println(o);
        Object o1=s.peek();
        System.out.println(o1);
        s.push(o);
        System.out.println(s);

        System.out.println(s.search('A'));//4
        System.out.println(s.search('B'));//3
        System.out.println(s.search('C'));//2
        System.out.println(s.search('D'));//1
        System.out.println(s.search(10));//-1
    }
}
