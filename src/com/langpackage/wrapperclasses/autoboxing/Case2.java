package com.langpackage.wrapperclasses.autoboxing;

public class Case2
{
    public static void main(String[] args)
    {
        //Internally to provide support for autoboxing A group of buffer wrapper objects is created
        //At the time of class loading
        //By autoBoxing if Wrapper object is to create then JVM will first check whether the Object is
        //present or  not if present then reference will be pointed to Same Object
        //If Object is not present then only new object will be created

        //Buffer Concept is allowed for following Range and classes
        //the Range of Buffer Object is -128 to 127
        //The Buffer Object supports for
            //1.Byte--------->Complete(-128 to 127)
            //2.Short---------->(-128 to 127)---->(Beyond limit new Object will be created)
            //3.Integer-------->(-128 to 127)------>(Beyond limit new Object will be created)
            //4.Character------->(0  to 127)-------->(Beyond limit new object will be Created)
            //5.Boolean---------->(true,false)----->Complete Support

        //Buffer Objects are not possible for Double and Float  Wrapper classes as range between
        // 0 to 1 is only infinite so it is not possible

        Integer i=120;
        Integer i1=120;
        System.out.println(i==i1);

        Long l=1258L;
        Long l1=1258L;
        System.out.println(l==l1);//false

        //Internally autoboxing concept is applied by using valueOf() method so buffering concept
        //directly applicable for valueOf() method
        Integer X=10;
        Integer Y=Integer.valueOf(10);
        System.out.println(X==Y);//true
    }
}
