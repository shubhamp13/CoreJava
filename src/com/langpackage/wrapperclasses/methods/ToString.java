package com.langpackage.wrapperclasses.methods;




public class ToString
{
    public static void main(String[] args)
    {
        //toString() method of wrapper class is used to convert wrapper object or primitive type into
        //String
        //toString() method in Wrapper class is overrided version of toString() method of object class
        //If we tries to print reference of Wrapper class object then internally toString() method is called
        //to display content of an Object
        Integer i=Integer.valueOf(10);
        System.out.println(i);//10 (Wrapper class object content)
       String s1=i.toString();
        System.out.println(s1);//String s1 value 10
        Boolean b=new Boolean("shubham");
        System.out.println(b);//false (Wrapper class Object Content)
        String s2=b.toString();
        System.out.println(s2);//false String printed

        //Form 2:
        //public static String toString(primitive p)
        //Every Wrapper class contains static toString() method which takes
        //primitive value as an argument and convert that primitive type into
        //String

        String s12=Integer.toString(121);
        System.out.println(s12);//121
        String s13=Boolean.toString(false);
        System.out.println(s13);//false

        //Form 3:
            //Only Integer and Long class contains one static String toString(int i,int radix)
        // which is used to convert primitive to specified radix string
        //public static String toString(int i,int radix);
        //public static String toString(long l,int radix);

        String s14=Integer.toString(15,2);
        System.out.println(s14);//1111
        String s15=Long.toString(15,8);
        System.out.println(s15);//17


        //Form 4:
        // Integer And Long Wrapper class contains toXXXString(primitive p) method
        //for conversions
//        public static String toBinaryString(int i);
//        public static String toOctalString(int i);
//        public static String toHexString(int i);
//        public static String toBinaryString(long l);
//        public static String toOctalString(long l);
//        public static String toHexString(long l);

        String s20=Integer.toBinaryString(15);
        System.out.println("Binary Form: "+s20);
        String s21=Integer.toOctalString(15);
        System.out.println("Octal Form: "+s21);
        String s22=Integer.toHexString(15);
        System.out.println("Hex Form: "+s22);
        String s23=Long.toBinaryString(20L);
        System.out.println("Binary Form: "+s23);
        String s24=Long.toHexString(20L);
        System.out.println("Hex Form: "+s24);
        String s25=Long.toOctalString(20L);
        System.out.println("Octal Form: "+s25);

    }
}
