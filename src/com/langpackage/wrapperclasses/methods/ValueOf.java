package com.langpackage.wrapperclasses.methods;

public class ValueOf
{
    //The Main Objective Of valueOf method of Wrapper class is to get Wrapper object
    //From Corresponding String or Primitive types
    public static void main(String[] args)
    {
        //We can use valueOf() method to get Wrapper Object from String or primitive
        //It is an static method

        Integer I=Integer.valueOf("100");
        System.out.println(I);

        Integer I2=Integer.valueOf(100);
        System.out.println(I2);

        Boolean B=Boolean.valueOf("true");
        System.out.println(B);
        Boolean B2=Boolean.valueOf("shubham");
        System.out.println(B2);

        //For Integral types there is valueOf(String s,int radix)

        //Range of Radix must be from 2 to 367 only

        Integer I1=Integer.valueOf("10",2);
        System.out.println(I1);



    }
}
