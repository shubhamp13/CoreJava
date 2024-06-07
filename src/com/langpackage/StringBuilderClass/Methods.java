package com.langpackage.StringBuilderClass;

public class Methods
{
    public static void main(String[] args)

    //---------------------------------------------------------------------------------------
    {
        StringBuffer sb1=new StringBuffer("Shubham");
        //1.public int  length()
        //This Method is used to return length of the StringBuffer Object
        System.out.println(sb1.length());
        //---------------------------------------------------------------------------------------

        //2.public int capacity()
        //This method will return the capacity of StringBuffer object
        //How many Characters can accommodate the object
        //The Initial capacity Of StringBuffer object is String
        //If Object reaches its capacity then new capacity is
        //newCapacity=(currentCapacity+1)*2

        //If You are creating StringBuffer object py passing String then
        //the capacity of StringBuffer object is
        //capacity=s.length()+16
        String s="shubham";
        StringBuffer sb2=new StringBuffer(s);
        System.out.println(sb2.capacity());//23
        System.out.println(sb1.capacity());//16

        //---------------------------------------------------------------------------------------

        //---------------------------------------------------------------------------------------
         //3.public char charAt(int i)
        //This method will return the character present at i index Of StringBuffer Object

        StringBuffer sb3=new StringBuffer("Shubham");
        System.out.println(sb3.charAt(2));//u


        //---------------------------------------------------------------------------------------

        //---------------------------------------------------------------------------------------
            //4.public void setCharAt(int index,char ch)

        StringBuffer sb4=new StringBuffer("Shuaham");
        sb4.setCharAt(3,'b');
        System.out.println(sb4);

        //---------------------------------------------------------------------------------------

        //---------------------------------------------------------------------------------------
            //5.public StringBuffer append(String s)
            //5.public StringBuffer append(int i)
            //5.public StringBuffer append(double d)
            //5.public StringBuffer append(long l)
            //5.public StringBuffer append(char c)
            //5.public StringBuffer append(float f)
            //5.public StringBuffer append(boolean b)
            //5.public StringBuffer append(byte b)
            //5.public StringBuffer append(short s)

        //append() method will add the String with provided content
        //append() method is overloaded method
        StringBuffer sb5=new StringBuffer();
        int i=87;
        long l=93L;
        double d=56.0;
        float f=96.0f;
        byte b=3;
        short sh=1;
        char ch='S';
        boolean bool=true;
        sb5.append(ch);
        sb5.append(i);
        sb5.append(l);
        sb5.append(d);
        sb5.append(f);
        sb5.append(b);
        sb5.append(sh);
        sb5.append(bool);
        System.out.println(sb5);

        //---------------------------------------------------------------------------------------------------------------------------

        //---------------------------------------------------------------------------------------
        //insert() method is used to insert the given content at given index
        //6.public StringBuffer insert(int i,char c)
        //6.public StringBuffer insert(int i,int i)
        //6.public StringBuffer insert(int i,double d)
        //6.public StringBuffer insert(int i,float f)
        //6.public StringBuffer insert(int i,long l)
        //6.public StringBuffer insert(int i,byte b)
        //6.public StringBuffer insert(int i,short s)
        //6.public StringBuffer insert(int i,String s)
        //6.public StringBuffer insert(int i,boolean bool)

        StringBuffer sb6=new StringBuffer();
        sb6.insert(0,1);
        sb6.insert(0,89L);
        sb6.insert(0,90.0);
        sb6.insert(0,1.24f);
        sb6.insert(0,'d');
        sb6.insert(0,"shu");
        sb6.insert(0,(byte)23);
        sb6.insert(0,(short)10);

        System.out.println(sb6);
        //---------------------------------------------------------------------------------------

        //---------------------------------------------------------------------------------------
        //7.StringBuffer delete(int begin,int end)
        //This method will delete the content of String provided from begin to (end-1)

        StringBuffer sb7=new StringBuffer("shubhampuri123456789");
        sb7.delete(11,23);
        System.out.println(sb7);

        //---------------------------------------------------------------------------------------

        //8.public StringBuffer deleteCharAt(int index)
        //This method will delete the character at given index

        StringBuffer sb8=new StringBuffer("shuubham");
        sb8.deleteCharAt(3);
        System.out.println(sb8);

        //---------------------------------------------------------------------------------------

        //---------------------------------------------------------------------------------------
         //9.public void ensureCapacity(int capacity)

        //This method will set the capacity of StringBuffer object

        StringBuffer sb9=new StringBuffer();
        System.out.println(sb9.capacity());
        sb9.ensureCapacity(1000);
        System.out.println(sb9.capacity());
        //---------------------------------------------------------------------------------------

        //---------------------------------------------------------------------------------------
        //10.public void trimToSize()
        //This will free the empty space of StringBuffer Object

        StringBuffer sb10=new StringBuffer();
        sb10.append("shubham");
        System.out.println(sb10.capacity());
        sb10.ensureCapacity(1000);
        System.out.println(sb10.capacity());
        sb10.trimToSize();
        System.out.println(sb10.capacity());

        //--------------------------------------------------------------------------

        //--------------------------------------------------------------------------

        //11.public void setLength(int len)

        StringBuffer sb11=new StringBuffer("shubhampuri");
        sb11.setLength(7);
        System.out.println(sb11);

        //--------------------------------------------------------------------------

        //--------------------------------------------------------------------------

        //11.public StringBuffer reverse(String s)

        StringBuffer sb12=new StringBuffer("shubham");
        System.out.println(sb12.reverse());
        //--------------------------------------------------------------------------





    }
}
