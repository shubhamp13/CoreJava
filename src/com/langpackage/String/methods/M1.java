package com.langpackage.String.methods;

public class M1
{
    public static void main(String[] args)
    {
        //************************************************************************************************
        //public char charAt(int index)
        //This method will return charter at specified index of given String
        //If Specified index is not present in corresponding String then we will get
        //RE:StringIndexOutOfBoundsException

        String s1="Shubham";
        System.out.println(s1.charAt(3));
//      System.out.println(s1.charAt(30));

        //************************************************************************************************



        //************************************************************************************************

        //public String concat(String s)
        //This method is used to concat two Strings and return the newly created String
        //The Overloaded + and += operator also meant for concatenation
        String s2="shubham";
        s2=s2.concat("puri");
//        s2=s2+"puri";
//        s2+="puri";
        System.out.println(s2);

        //************************************************************************************************

        //************************************************************************************************

        //public boolean equals(Object o)
        //it is overrided method of object class
        //This method is used to comapre contenet of string where case is important


        //public boolean equalIgnoreCase(String s)
        //It is used to compare content of string where case is not important

        String s3="java";
        System.out.println(s3.equals("JAVA"));//false
        System.out.println(s3.equalsIgnoreCase("JAVA"));//true

        //************************************************************************************************

        //************************************************************************************************

        //public String substring(int start)
        //This method will return subsb tring from Start index

        String s4="shubham";
        System.out.println(s4.substring(2));//ubham

        //public String substring(int start,int end)
        //It will return the substring from start index to (end-1) index

        System.out.println(s4.substring(2,5));//ubh
        //************************************************************************************************


        //************************************************************************************************

        //public int length()
        //This will return the number of characters present inside the String

        String s6="shubham";
//        System.out.println(s.length);:--->This will leads to CTE because no such variable length is present inside String class
        System.out.println("The Length of The String Is "+s6.length());


        //************************************************************************************************

        //public String replace(char oldCh,char newCh)
        //This method will replace old character with new character present inside string

        String s7="Java";
        System.out.println(s7.replace('a','s'));

        //************************************************************************************************

        //************************************************************************************************

        //public String toLowerCase()
        //It is used to convert entire String into lower case

        //public String toUpperCase()
        //It is used to convert entire String into upper case

        String s8="SHUBHAM";
        System.out.println(s8.toLowerCase());
        String s9="shubham";
        System.out.println(s9.toUpperCase());

        //************************************************************************************************

        //************************************************************************************************

            //public String trim()
        //It is used to remove blank spaces from beginning and end of String

        String s10="    Shubham Puri   ";
        System.out.println(s10);
        System.out.println(s10.length());
        s10=s10.trim();
        System.out.println(s10);
        System.out.println(s10.length());

        //************************************************************************************************

        //************************************************************************************************

            //public int indexOf(char ch)
            // This will return  index of first occurring char in given String

            //public int lastIndexOf(char ch)
            //This Will return index of last occurring char

            String s12="shubham";
            System.out.println(s12.indexOf('h'));//1
            System.out.println(s12.lastIndexOf('h'));//4

        //************************************************************************************************




    }
}
