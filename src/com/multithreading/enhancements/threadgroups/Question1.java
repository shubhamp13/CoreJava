package com.multithreading.enhancements.threadgroups;

//Write A program to Display names of all active threads of System ThreadGroup
public class Question1 {
    public static void main(String[] args) {
        ThreadGroup parent = Thread.currentThread().getThreadGroup().getParent();
        int activeCount = parent.activeCount();
        Thread[] threads = new Thread[activeCount];
        parent.enumerate(threads);
        for (Thread thread : threads) {
            System.out.println("Name: " + thread.getName() + " Thread Group Name:-" + thread.getThreadGroup().getName() + " Priority:-" + thread.getPriority());
        }
    }
}
