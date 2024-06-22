package com.langpackage.wrapperclasses.autoboxing;

import com.java.identifiersKeywords.Int;

public class Conclusion1
{
    public static void main(String[] args)
    {
        //With the help of AutoBoxing and AutoUnboxing we can interchangeably use concept
        // of both Wrapper class and primitive types

        //1.With The help of new Keyword two new objects are created so their reference also different
        Integer I=new Integer(10);
        Integer I2=new Integer(10);
        System.out.println(I==I2);

        //2.With the help of autoboxing if object is already present then reference will be pointed
        // to same Object directly
        Integer x=10;//after compilation--->Integer x=Integer.valueOf(10);
        Integer y=10;//after compilation--->Integer y=Integer.valueOf(10);
        System.out.println(x==y);//true

        //3.After Compilation compiler will add below line so if Object is already present then reference
        //will be pointed to same object
        Integer z=10;//After Compilation-------->Integer z=Integer.valueOf(10);
        Integer z2=Integer.valueOf(10);
        System.out.println(z==z2);//true

        //4.When Wrapper class is loaded then Every Wrapper class loads the object of range -128 to 127
        //If the object is present in that range then it will be pointed to buffer object so no new object will be created
        //If Object is out of range then new Object will be created

        Integer A1=1000;//As 1000 is out of range from 127 new Object will be created
        Integer A2=1000;//As 1000 is out of range from 127 new Object will be created
        System.out.println(A1==A2);//False


        //5.Wrapper Objects are immutable.If we create wrapper Object then we can not perform any changes
        //if we tries to perform any changes then with that changes new Object will be created


    }
}
