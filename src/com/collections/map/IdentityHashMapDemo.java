package com.collections.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo
{
    public void finalize()
    {
        System.out.println("finalize");
    }
    public static void main(String[] args)
    {
        new IdentityHashMapDemo();

        //In Normal HashMap JVM will call .equals() method for key comparison
       Integer I1=new Integer(10);
       Integer I2=new Integer(10);
        HashMap hashMap = new HashMap();
        hashMap.put(I1,"Shubham");
        hashMap.put(I2,"Shubham Puri");
        System.out.println(hashMap);


        //In IdentityHashMap JVM will use '==' operator for keys comparison
        IdentityHashMap identityHashMap = new IdentityHashMap();
        identityHashMap.put(I1,"Shubham");
        identityHashMap.put(I2,"Shubham Puri");
        System.out.println(identityHashMap);

    }
}
