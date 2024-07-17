package com.collections.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        System.out.println(pq.peek());//null
//        System.out.println(pq.remove());//NoSuchElementException

        for(int i=1;i<=10;i++)
        {
            pq.offer(i);
        }
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
