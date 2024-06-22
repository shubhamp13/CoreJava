package com.langpackage.wrapperclasses;

public class Constructors
{
    public static void main(String[] args)
    {
        //The Main Objective Of Wrapper class is to create object of primitive data types
        //It is used to wrap primitive to Object forms

        //Every Wrapper class mostly have two constructors
        //1.First is by passing its primitive data types
        //2.By passing String as an Argument

        //Float Have Three Constructors
            //1.By Passing float primitive value
            //2.by passing String
            //3.By Passing Double

        //Character wrapper class have only one constructor which takes
        //char as an argument


        //Boolean wrapper class have two constructors
        //1.First one which takes only true and false as argument
        //2.Second one takes String as argument in which
            //a.Here case and content does not matter
            //b.If case insensitive String of true is there then it will
            // return true otherwise returns false

        //Integer i1=new Integer("ten");
        //It will  throws RE:NumberFormatException

        //Constructors for Integer Wrapper class
        Integer i=new Integer(10);
        Integer i1=new Integer("10");
        System.out.println("Integer I: "+i);
        System.out.println("Integer I2: "+i1);
        System.out.println();

        //Constructors for Byte wrapper Class
        Byte b1=new Byte((byte)10);
        Byte b2=new Byte("10");
        System.out.println("Byte B1: "+b1);
        System.out.println("Byte B2: "+b2);
        System.out.println();



        //constructors of Short

        Short s1=new Short((short)10);
        Short s2=new Short("10");
        System.out.println("Short s1: "+s1);
        System.out.println("Short s2: "+s2);
        System.out.println();



        //Constructors Of Long
        Long l1=new Long(10L);
        Long l2=new Long("200");
        System.out.println("Long L1: "+l1);
        System.out.println("Long L2: "+l2);
        System.out.println();



        //Float Constructors

        Float f1=new Float(10.5f);
        Float f2=new Float("10.5F");
        Float f3=new Float(10.5);
        Float f4=new Float("20.5");
        System.out.println("Float f1 "+f1);
        System.out.println("Float F2: "+f2);
        System.out.println("Float F3: "+f3);
        System.out.println("Float f4: "+f4);
        System.out.println();


        //Double Constructors
        Double d1=new Double(10.55d);
        Double d2=new Double("44.55d");
        System.out.println("Double d1: "+d1);
        System.out.println("Double d2: "+d2);
        System.out.println();


        //Character Constructors
        Character ch1=new Character('a');
        System.out.println("Charcher ch1: "+ch1);
        System.out.println();



        //Boolean Constructors
        Boolean b11=new Boolean(true);
        Boolean b12=new Boolean(false);
        Boolean b13=new Boolean("true");
        Boolean b14=new Boolean("True");
        Boolean b15=new Boolean("TruE");
        Boolean b16=new Boolean("shubham");
        Boolean b17=new Boolean("puri");
        System.out.println("Boolean b11: "+b11);//true
        System.out.println("Boolean B12: "+b12);//false
        System.out.println("Boolean B13: "+b13);//true
        System.out.println("Boolean B14: "+b14);//true
        System.out.println("Boolean B15: "+b15);//true
        System.out.println("Boolean B16: "+b16);//false
        System.out.println("Boolean B17: "+b17);//false



    }
    //In wrapper class toString method is overridden to return the content
    //In all wrapper class .equals() method is overridden for content comparison
}
