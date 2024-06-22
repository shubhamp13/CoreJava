package com.langpackage.wrapperclasses.methods;

import com.java.identifiersKeywords.Int;

public class primitiveValue
{
    public static void main(String[] args)
    {
        //The main purpose of this method is to convert wrapper object into
        //primitive type
        //Every Number wrapper class contains following six methods
        //public byte byteValue()
        //public short shortValue()
        //public int intValue()
        //public long longValue()
        //public float floatValue()
        //public double doubleValue()

        //If Wrapper object value is not compatible for primitive then internally
        //typecasting takes place

        Integer I=new Integer(130);
        int i=I.intValue();
        byte b=I.byteValue();
        short s=I.shortValue();
        long l=I.longValue();
        double d=I.doubleValue();
        float f=I.floatValue();
        System.out.println("Int "+i);
        System.out.println("Byte "+b);//Internally Type casting takes place
        System.out.println("Short "+s);
        System.out.println("Long "+l);
        System.out.println("Double "+d);
        System.out.println("Float "+f);

        //char charValue()
        //It is used to get char data from Character Wrapper object

        Character CH=new Character('a');
        char ch=CH.charValue();
        System.out.println("Char "+ch);


        //boolean booleanValue()
        //It is used to get boolean primitive value from Boolean wrapper object

        Boolean B1=new Boolean("trUe");
        Boolean B2=new Boolean("shubham");
        boolean b1=B1.booleanValue();
        boolean b2=B2.booleanValue();
        System.out.println(b1);//true
        System.out.println(b2);//false
    }
}
