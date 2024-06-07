package com.langpackage.String;

//String
//String class Object is immutable that means Once we creates  object of string then we can not
//modify an existing String object if we tries to modify an existing object then new object will be created
//this behaviour is known as immutability of string


//StringBuffer:
//StrinBuffer class object is mutable that means once we creates object of StringBuffer object then we can make
//modify an existing object that behaviour of an object is known as mutability of string
public class Case1
{
    public static void main(String[] args)
    {
        //String object is immutable that means we can not make any changes if we created
        //object immutable means we can not change existing object

        //StringBuffer is mutable that means we can make changes to an existing object
        //StringBuffer is mutable means we can make any changes to an existing object

        String s=new String("Shubham");
        s.concat("puri");
        System.out.println(s);

        StringBuffer sb=new StringBuffer("Shubham");
        sb.append("puri");
        System.out.println(sb);
    }
}
