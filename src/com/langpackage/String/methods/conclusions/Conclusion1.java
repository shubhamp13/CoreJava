package com.langpackage.String.methods.conclusions;

public class Conclusion1
{
    public static void main(String[] args)
    {

        //if by  runtime object if there is no change in the content then new object will
        //not be created it will be pointed to same object


        //Inside Heap
        String s1=new String("shubham");
        String s2=s1.toUpperCase();
        String s3=s1.toLowerCase();
        System.out.println(s1==s2);
        System.out.println(s1==s3);

        //Inside SCP
//        String s1="shubham";
//        String s2=s1.toUpperCase();
//        String s3=s1.toLowerCase();
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
    }
}
