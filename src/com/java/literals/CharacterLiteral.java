package com.java.literals;

public class CharacterLiteral
{
    public static void main(String[] args)
    {
        char ch='a';
//        char ch2=a;//CTE:-Can not find a symbol
                   // Symbol:variable a
                   // location :class CharcterLiteral

//        char ch3="a";//CTE: incompatible types: java.lang.String can not be converted to char

//        char ch4='ab';//unclosed character literal
        /*
          Character literal can be represented in unicode format as follows:
         "\Uxxxx"====>(Where xxxx is four digit hexadecimal number)
         */

        char ch7='\u0061';
        System.out.println(ch7);
        char ch8='\u0062';
        System.out.println(ch8);
    }
}
