package com.langpackage.objectclass.equals;

import java.util.Objects;

public class Student
{
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return " name='" + name + '\'' +
                ", rollNo=" + rollNo;
    }

     @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }
        if(o instanceof Student)
        {
            Student s = (Student)o;
            return rollNo == s.rollNo && name.equals(s.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return rollNo;
    }

    public static void main(String[] args)
    {
        Student s1 = new Student("Shubham", 1);
        Student s2 = new Student("Shrikant", 2);
        Student s3 = new Student("Shubham", 1);
        Student s4 = s1;
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals("shubham"));
        System.out.println(s1.equals(null));
    }
}
