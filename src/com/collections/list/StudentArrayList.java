package com.collections.list;

import java.util.*;

public class StudentArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<Student>();
        Student s1=new Student("Shubham",121,25,"8793569631","Pune");
        Student s2=new Student("Sejal",122,22,"9375678375","Pune");
        Student s3=new Student("Shrikant",123,23,"7796277757","Pune");
        Student s4=new Student("Ashish",124,26,"8888555109","Pune");
        Student s5=new Student("Himanshu",125,27,"9595682721","Pune");

        students.add(s1);
        ArrayList <Student> temp=new ArrayList<Student>();
        temp.add(s2);
        temp.add(s3);
        students.addAll(1,temp);
        students.add(s4);
        students.add(s5);
        ListIterator listIterator=students.listIterator();
        while (listIterator.hasNext())
        {
            Object o=listIterator.next();
            Student s=(Student)o;
            System.out.println(s.getName());
        }
        Object o=students.remove(4);
        System.out.println(o);

    }



}
