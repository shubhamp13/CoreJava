package com.langpackage.String;

public class StringConstructor
{
    public static void main(String[] args)
    {
        //This will create String Object with empty String
        String s1=new String();
        System.out.println(s1.length());

        //This will create String Object by taking StringBuffer as input
        String s2=new String(new StringBuffer("Shubham"));
        System.out.println(s2);
        System.out.println(s2.getClass().getName());


        //This will create String object by taking Char [] array as input
        char[] ch={'s','h','u','b','h','a','m'};
        String s3=new String(ch);
        System.out.println(s3);


        //This will create String Object bu=y Taking byet [] array as an input
        byte [] b1={'s','h','u','b','h','a','m'};
        byte []b2={101,102,103,104};
        String s4=new String(b1);
        String s5=new String(b2);
        System.out.println(s4);
        System.out.println(s5);


    }
}
