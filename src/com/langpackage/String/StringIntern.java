package com.langpackage.String;

public class StringIntern
{
    public static void main(String[] args)
    {
        //intern method is used to call if we want  the reference of the string which
        // is in the SCP then we can call intern() method

        //If we are calling intern() method on String object but that String literal is
        //not present inside SCP then intern() method will add that String literal in SCP and
        //returns the reference of that String


        String s1=new String("hello");
        String s2=s1.concat(" world");
        String s3=s2.intern();
        String s4="hello world";
        System.out.println(s3==s4);

    }
}
