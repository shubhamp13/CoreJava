package com.langpackage.String;

public class StringConstantPool
{
    public static void main(String[] args)
    {
        String s1=new String("Shubham Puri");
        //For This S1 One Object is created inside Heap and one is created inside SCP(String Constant Pool)
        String s2=new String("Shubham Puri");
        //For This s2 One Object is created inside heap only and no object is created inside SCP
        System.out.println("s1==s2 "+(s1==s2));
        //as s1 and s2 pointing to two different object inside heap s1==s2 results false

        String s3="Shubham Puri";
        //For s3 no new object is created.It will be pointed to the SCP  object
        System.out.println("s1==s3 "+(s1==s3));
        //as s3 is pointing to the SCP object and s1 is pointing to the heap object then result of s1==s3 is false

        String s4="Shubham Puri";
        //Now s4 is also pointing to the same object present inside SCP
        System.out.println("s3==s4 :"+(s3==s4));
        //As both s3 and s4 are pointing to the same object which is present inside SCP sos3==s4 results true

        String s5="Shubham"+" Puri";
        //Here in s5 first String constant get solved at compile time and this line becomes
        //String s5="Shubham Puri"
        //As This String literal is already present inside SCP it will be pointed to SCP literal directly
        //Without Creating an Object
        System.out.println("s3==s5 :"+(s3==s5));
        //So Both s3 and s5 are pointing towards same String literal present inside SCP so it returns true

        String s6="Shubham";
        //for this s6 new String object will be created inside SCP (String constant pool)
        String s7=s6+" Puri";
        //For s7  first new object is created inside SCP for "Puri" and as s6 is not String constant it will be
        // resolved at runtime and new object is created inside Heap memeory
        System.out.println("s3==s7 :"+(s3==s7));
        //So you can see as s3 will be pointing to an object which is present inside SCP and s7 will be pointing
        //to an object which is inside heap  so result will be false

        final String s8="Shubham";
        // for s8 as this String literal is already present inside SCP so it will pointed directly alongwith s6
        // So no new object will  be created
        String s9=s8+" Puri";
        //As s8 is constant and " Puri" is already present inside SCP so no new  object is created inside SCP for" Puri"
        //and this expression will be resolved at compile time to form String s9= "Shubham Puri"
        //As this literal is already present inside SCP so it will directly points to SCP object
        System.out.println("s3==s9 :"+(s3==s9));
        System.out.println("s8==s6 :"+(s8==s6));


    }
    //In Java Most used Object in the program is String Object
    // To utilize the memory and to increase performance SUN peoples implemented String Constant Pool for String Objects
    //In String Constant Pool if we require repeated String object then all reference will pointed to same object
    //In SCP String Object with Same Content is not possible.If Same String Object is creating then
    //It will directly points to the same object
    //The main disadvantage of this Approach is Multiple references are pointing to same String
    //object if one reference have to change their content then modification will be for all
    // referencess for this SUN people makes String Objects Are immutable
}
