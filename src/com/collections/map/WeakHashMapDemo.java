package com.collections.map;

import java.util.HashMap;

public class WeakHashMapDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        HashMap hashMap = new HashMap();
        Test test = new Test();
        hashMap.put(test, 123456);
        test=null;
        System.gc();
        Thread.sleep(2000);
        System.out.println(hashMap);
    }
}
class Test
{
    public String toString()
    {
        return "Test";
    }
    public void finalize()
    {
        System.out.println("Garbage collected");
    }
}
