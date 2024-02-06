package com.java.Operators.Arithmatic;

public class Case1
{
    public static void main(String[] args)
    {
        /*

         1. When any arithmatic operator is applied on variable a and variable b
         then result type is always
         max(int,type of a,type of b)

         byte +byte=max(int,byte ,byte)---->int
         byte +short=max(int,byte,short)--->int
         byte +int=max(int,byte,int)----->int
         byte +char=max(int ,byte,char)--->int
         byte +long=max(int ,byte,long)---->long
         byte +float=max(int ,byte,float)---->float
         byte+double=max(int,byte,double)------>double


         short +byte=max(int,short,byte)---->int
         short +short=max(int,short,short)--->int
         short +int=max(int,short,int)----->int
         short +char=max(int ,short,char)--->int
         short +long=max(int ,short,long)---->long
         short +float=max(int ,short,float)---->float
         short+double=max(int,short,double)------>double

         char +byte=max(int,char,byte)---->int
         char +short=max(int,char,short)--->int
         char +int=max(int,char,int)----->int
         char +char=max(int ,char,char)--->int
         char +long=max(int ,char,long)---->long
         char +float=max(int ,char,float)---->float
         char + double=max(int,char,double)------>double
         */
        System.out.println('a'+'b');
        System.out.println('a'+0.12);
     

    }
}
