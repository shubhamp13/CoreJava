package com.multithreading.enhancements.threadgroup;

public class ThreadGroupConstructors
{
    public static void main(String[] args)
    {
        ThreadGroup threadGroup=Thread.currentThread().getThreadGroup().getParent();
        ThreadGroup group = new ThreadGroup(threadGroup,"first group");
        System.out.println("The Parent of group: " + group.getParent().getName());
        ThreadGroup group2 = new ThreadGroup(group, "second group");
        System.out.println("The Parent of group2: " + group2.getParent().getName());
    }
}
