package com.java.Operators.instanceofoperator;

import java.util.ArrayList;

public class Driver
{
    public static void main(String[] args)
    {
        ArrayList e=new ArrayList<>();
        Student s1=new Student("shubham",123);
        Teacher t1=new Teacher("Adityanath",789);
        e.add(s1);
        e.add(t1);
        Object o=e.get(0);
        if(o instanceof Teacher)
        {
            Teacher t2= (Teacher)o;
            System.out.println(t2);
        }
        else
        {
            Student s2=(Student)o;
            System.out.println(s2);
        }
    }
}
