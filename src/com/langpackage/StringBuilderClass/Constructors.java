package com.langpackage.StringBuilderClass;

public class Constructors
{
    public static void main(String[] args)
    {
        //If we are using same object repeatedly then we should use String class
        //if content is not fixed and everytime if we need to modify our content then repeatedly then it is not recommended to
        //go for String
        //Because for every modification String will create new object with modified content so this will cause performance issue

        //Instead of creating String Object it is recommended to create StringBuffer
        //As For every modification in Object StringBuffer will not create new Object it will modify current object only
        //So StringBuffer objects are mutable
        //We can modify content of StringBuffer object without creating new Object

        //The initial capacity of StringBuffer object is 16
        //If we tries to add 17 character then new StringBuffer object is created and all the content of old Object will
        // be copied to new Object and reference will be points to new object
        //The newCapacity of StringBuffer is calculated by using

        // newCapacity=(currentCapacity+1)*2


//        StringBuffer sb=new StringBuffer();
//        //This will create empty StringBuffer object with initial capacity of 16
//        System.out.println("The Initial Capacity Of StringBuffer Is "+sb.capacity());
//        sb.append("1234567891011121");
//        System.out.println("The Max Capacity Now is "+sb.capacity());
//        sb.append("17");
//        System.out.println("The New Capacity Of StringBuffer Is "+sb.capacity());



        StringBuffer sb2=new StringBuffer(25);
        //This will create StringBuffer object with capacity of 25
        System.out.println(sb2.capacity());


        String s="shubham";
        StringBuffer sb3=new StringBuffer(s);
        //This will create StringBuffer object by taking String as an input with capacity
        //capacity=s.length()+16
        System.out.println(sb3.capacity());//23

    }
}
