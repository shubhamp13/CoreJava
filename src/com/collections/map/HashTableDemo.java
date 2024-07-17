package com.collections.map;

import java.util.Hashtable;

public class HashTableDemo
{
    public static void main(String[] args)
    {
        Hashtable h=new Hashtable();
        h.put(new Temp(1), "A");//index=1
        h.put(new Temp(2), "B");//index=2
        h.put(new Temp(3), "C");//index=3
        h.put(new Temp(4), "D");//index=4
        h.put(new Temp(5), "E");//index =5
        h.put(new Temp(6), "F");//index =6
        h.put(new Temp(7), "G");//index =7
        h.put(new Temp(15), "H");//index = 15%11=4
        h.put(new Temp(17), "I");//index = 17%11=6
		h.put(new Temp(27), "J");// index = 27%11=5
        System.out.println(h);//7,17,6,27,5,4,3,2,1

    }
}
class Temp
{
    int i;

    public Temp(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return i+"";
    }

    @Override
    public int hashCode() {
        return i;
    }
}
