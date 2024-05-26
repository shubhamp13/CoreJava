package com.multithreading.enhancements.concurrentLock;
import java.util.concurrent.locks.ReentrantLock;
public class ReentrantLockDemo extends ReentrantLock
{
    public static void main(String[] args)
    {
        ReentrantLock l=new ReentrantLock();
        l.lock();
        l.lock();
        System.out.println("Is Thread Is Locked Or Not:--  "+l.isLocked());
        System.out.println("Number Of Locks On This Thread  "+l.getHoldCount());
        System.out.println("How Many Threads are waiting to get lock:--  "+l.getQueueLength());
        l.unlock();
        System.out.println("Is Thread Is Locked Or Not:-- "+l.isLocked());
        System.out.println("Number Of Locks On This Thread  "+l.getHoldCount());
        l.unlock();
        System.out.println("Is Thread Is Locked Or Not:--"+l.isLocked());
        System.out.println("Number Of Locks On This Thread:--  "+l.getHoldCount());
        System.out.println("Fair Policy:"+l.isFair());
    }
}
