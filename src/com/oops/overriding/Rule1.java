package com.oops.overriding;
class  Parent
{
    public  Object m1()
    {
        System.out.println("This is parent class overridden method");
        return  null;
    }

}
class  Child extends Parent
{
    @Override
    public String  m1()
    {
        System.out.println("This Is Child class overriding method");
        return null;
    }
}
public class Rule1
{
    public static void main(String[] args)
    {
        System.out.println("Rule 1:");
        System.out.println("\t1.In Method overriding method name and type of formal argument must be\n" +
                "\t same that means Method signature should be same\n");
        System.out.println("\t2.In method overriding method return type should be same until JDK 1.4 Version\n" +
                "\tAfter JDK 1.4 Co-variant return type also allowed\n");
        System.out.println("\t3.Co-variant return type means child class method can have same return type\n" +
                "\t as parent class method or its child also allowed");

        Parent p1=new Parent();
        p1.m1();
        System.out.println("\t4.With the help of parent class reference and parent class object parent class method\n" +
                "\t only called\n");
         Child c1=new Child();
         c1.m1();
        System.out.println("\t5.With the help of child class reference and child class object child class m1 method will be\n" +
                "\t called\n");
        Parent p2=new Child();
        p2.m1();
        System.out.println("\t6.Withe the help of Parent class reference and child class object Now at run time JVM binds\n" +
                "\t the method according to object type as object is child type then child class m1 method is called\n");
        System.out.println("\t7.As we can see return type of parent overridden method is Object type and in child class\n" +
                "\t return type of overriding method is of String type this is co-variant return type\n");
        System.out.println("\t8.String is child of parent class which is Object so it is allowed as covariant but note that\n" +
                "\t we can not take String in parent class and object in child class it is not allowed");

        System.out.println("\t9.In co-variant return type only object type is allowed but not primitive data types\n");
        System.out.println("\t\t1.object------->String,StringBuffer (Allowed)\n");
        System.out.println("\t\t2.Number------->Integer,Float,Double,Byte (Allowed)\n");
        System.out.println("\t\t3.String------->Object (Invalid) (As String is child and object is parent)\n");
        System.out.println("\t\t4.double--------->int (Invalid) (primitive data types not allowed)\n");


    }
}
