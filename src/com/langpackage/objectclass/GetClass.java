package com.langpackage.objectclass;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;

public class GetClass
{
    public static void main(String[] args) throws Exception
    {
//        int count=0;
//        Object obj = new String("Shubham");
//        Class c=obj.getClass();
//        System.out.println("Fully Qualified Name Of Class: "+c.getName());
//        Method[] methods=c.getMethods();
//        for(Method m:methods)
//        {
//            System.out.println(m.getName());
//            ++count;
//        }
//        System.out.println("No of Methods Present Inside Class Is "+count);

        int ct=0;
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
        Class c=connection.getClass();
        System.out.println(c.getName());
        Method[] methods2=c.getMethods();
        for(Method m1:methods2)
        {
            System.out.println(m1.getName());
            ++ct;
        }
        System.out.println("No Of Methods Present Inside Class:"+ct);

    }
}
