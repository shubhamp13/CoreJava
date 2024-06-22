package com.langpackage.wrapperclasses.methods;

import com.java.identifiersKeywords.Int;

public class parsePrimitive
{
    public static void main(String[] args)
    {
        //parseXXX(String s) is method used to convert String into respective primitive type
        //Except Character Wrapper class all Wrapper class Contains parseXXX(String s) method
        //parseXXX(String s) is static method
        //public static byte parseByte(String s);
        //public static short parseShort(String s);
//        public static  int parseInt(String s);
//        public static  long parseLong(String s);
//          public static  float parseFloat(String s);
//          public static  double parseDouble(String s);
//          public static  boolean parseBoolean(String s);

        int i=Integer.parseInt("8793");
        System.out.println("Int i: "+i);
        byte b=Byte.parseByte("125");
        System.out.println("Byte b: "+b);
        short s=Short.parseShort("8793");
        System.out.println("Short s: "+s);
        long l=Long.parseLong("8793");
        System.out.println("Long l: "+l);
        float f=Float.parseFloat("32769");
        System.out.println("Float f: "+f);
        double d=Double.parseDouble("8793");
        System.out.println("Double d: "+d);
        boolean b1=Boolean.parseBoolean("true");
        System.out.println("Boolean b1: "+b1);
        boolean b2=Boolean.parseBoolean("shubham");
        System.out.println("Boolean b2: "+b2);


        // For Integral Wrapper classes there is another nethod parseXXX(String s,int radix);
        //which is used to convert radix string into primitive type
        //Allowed values for radix is 2 to 36

        int i12= Integer.parseInt("1111",2);
        System.out.println(i12);
    }
}
