package com.langpackage.String;

import java.lang.reflect.Method;

public class Case3
{
    //String s1=new String("Shubham");
    //1.When we create the String Object with new operator then two objects are created
    //one inside heap area and one inside SCP (String constant Pool)
    //For above example one object is created inside heap area and one object inside
    //String Constant Pool
    //In above example s1 is pointing to object which is present inside heap area but not in SCP
    //As SCP area is present inside Method area Garbage Collector is not available for GC as there is
    //no reference for object in SCP

//    String s="shubham";
    //2.When we create String object directly then that object is created inside SCP
    //String Constant Pool\
    //For above example one object is created inside SCP only (String constant pool)
    //and s is pointing to that object


    //Object creation in SCP(String constant pool) is optional if object is already present inside
    //SCP then new object will not be created it will be pointed to object present inside SCP

    //When we are creating object with new keyword then compulsory new object will be created
    //inside heap and inside SCP will be created if object is not already present

    //So we can say that Object creation in SCP(String constant Pool) is optional
    //And Object creation in heap area whenever we are creating object with new keyword then
    //it is created inside heap

    //In SCP(String Constant Pool) two String Objects with same content is not possible
    //but inside heap two objects with same content is possible




    public static void main(String[] args)
    {
        String s1=new String("shubham");
        String s2="shubham";
        s1=s1.intern();
        System.out.println(s1==s2);

    }
}
