package com.oops.staticinstanceflow;
import  java.lang.Class;

public class Demo implements Cloneable

{
    static Demo d;
    private Demo()
    {

    }
    public static  Demo getDemo()
    {
        if(d==null)
        {
            d=new Demo();
            return  d;
        }
        else
        {
            System.out.println("object already created");
            return d;
        }
    }

    public static void main(String[] args) throws Exception
    {
        Demo d1=(Demo)(Class.forName("com.oops.staticinstanceflow.Demo").newInstance());
        System.out.println(d1);
        System.out.println("Five Ways To Create Object");
        System.out.println("\t1.With the help of new Operator");
        System.out.println("\t\t Test t= new Test();\n");
        System.out.println("\t2.With the help of newInstance() method");
        System.out.println("\t\t Test t= (Test)Class.forName(\"Test\").newInstance()\n");
        System.out.println("\t3.Wthe Help of Factory method");
        Runtime r=Runtime.getRuntime();
        System.out.println("\t\t Runtime r=Runtime.getRuntime();\n");
        System.out.println("\t4.With the Help of clone method\n");
        Demo d21=new Demo();
        Demo d31=(Demo) d21.clone();
        System.out.println("\t5.With the help of deserialization");
    }
}
