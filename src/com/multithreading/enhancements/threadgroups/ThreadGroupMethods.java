package com.multithreading.enhancements.threadgroups;

public class ThreadGroupMethods
{
    public static void main(String[] args) throws InterruptedException
    {
//        ThreadGroup group1=new ThreadGroup("Parent Group");
//        ThreadGroup group2=new ThreadGroup(group1, "Child Group");
//        MyThread t1=new MyThread(group1, "Child Thread-1");
//        MyThread t2=new MyThread(group1, "Child Thread-2");
//        t1.start();
//        t2.start();
//        System.out.println(group1.activeCount());
//        System.out.println(group1.activeGroupCount());
//        group1.list();
//        Thread.sleep(20000);
//        System.out.println(group1.activeCount());
//        System.out.println(group1.activeGroupCount());

            //String getName()---->to get the name of current ThreadGroup
        System.out.println(Thread.currentThread().getThreadGroup().getName());

        //ThreadGroup getParent()----->To get The ParentGroup of current thread
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        //int getMaxPriority()------->To get The Maximum Priority of thread in Current ThreadGroup
        System.out.println(Thread.currentThread().getThreadGroup().getMaxPriority());

        //void setMaxPriority(int p)------>It is used to set maximum priority of current thread group
//        System.out.println(Thread.currentThread().getThreadGroup().getMaxPriority());
//        MyThread t3=new MyThread(Thread.currentThread().getThreadGroup(),"child thread 3");
//        t3.start();
//        System.out.println("T3 Priority"+t3.getPriority());
//        Thread.currentThread().getThreadGroup().setMaxPriority(2);
//        MyThread t4=new MyThread(Thread.currentThread().getThreadGroup(),"child thread 4");
//        System.out.println("T3 Priority After Setting max priority "+t3.getPriority());
//        System.out.println("T4 Priority:-"+t4.getPriority());


        //boolean isDeamon()
        System.out.println(Thread.currentThread().getThreadGroup().isDaemon());

        //void setDeamon(boolean b)
        Thread.currentThread().getThreadGroup().setDaemon(true);
        System.out.println(Thread.currentThread().getThreadGroup().isDaemon());

        //int activeCount()--------->It is used to return active Threads of ThreadGroup and its sub ThreadGroups
        int count=Thread.currentThread().getThreadGroup().activeCount();
        System.out.println("Current Active Threads In Main Thread Group is "+count);

        //int activeGroupCount():------->It returns the active sub ThreadGroups in current ThreadGroup
        int groupCount=Thread.currentThread().getThreadGroup().activeGroupCount();
        System.out.println("The Current Sub ThreadGroup active in main ThreadGroup is "+groupCount);
        //int enumerate(Thread[] t)----->It will store the thread reference present inside current threadgroup
        Thread [] threads=new Thread[count];
        Thread.currentThread().getThreadGroup().enumerate(threads);
        for(Thread thread:threads)
        {
            System.out.println(thread.getName());
        }

        //int enumerate(ThreadGroup[] groups)------>It will store all sub ThreadGroups in current ThreadGroup
        System.out.println("For Thread Groups::::\n\n\n\n");
        ThreadGroup [] groups=new ThreadGroup[groupCount];
        Thread.currentThread().getThreadGroup().enumerate(groups);
        for (ThreadGroup group : groups)
        {
            System.out.println(group.getName());
        }
    }
}
