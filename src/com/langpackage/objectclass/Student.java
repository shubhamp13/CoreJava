package com.langpackage.objectclass;

public class Student
{
    private String name;
    private int rollNo;
    public Student(String name, int rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }
    public String toString()
    {
        return name+"....."+rollNo;
    }

    public static void main(String[] args)
    {
        Student s1=new Student("Shubham",1);
        Student s2=new Student("Sejal",2);
        Object o=new Student("Shrikant",3);
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s2);
        System.out.println(o);
    }
}
