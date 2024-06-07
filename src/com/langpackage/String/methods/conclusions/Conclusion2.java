package com.langpackage.String.methods.conclusions;

public class Conclusion2
{
    public static void main(String[] args)
    {
        String s1=new String("shubham");
        String s2=s1.toUpperCase();
        String s3=s1.toLowerCase();
        String s4=s2.toLowerCase();
        String s5=s4.toUpperCase();
        System.out.println(s1==s4);
        System.out.println(s5==s2);
    }
}
