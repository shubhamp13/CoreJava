package com.langpackage.String;

//String class Overrides equals method for content comparison

//StringBuffer class does not override equals method so by default object class method is called
//Object class equals() method meant for reference comparison

public class Case2
{
    public static void main(String[] args)
    {
        //String class overrides equlas() method which is meant for content comparison
        String s1=new String("Shubham Puri");
        String s2=new String("Shubham Puri");
        System.out.println(s1.equals(s2));//true

        //As StringBuffer class does not override equals() method so by default Object class
        //equals() method is called which is meant for reference comparison
        StringBuffer sb=new StringBuffer("Shubham Puri");
        StringBuffer sb2=new StringBuffer("Shubham Puri");
        System.out.println(sb.equals(sb2));//false
    }
}
