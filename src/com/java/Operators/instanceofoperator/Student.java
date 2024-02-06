package com.java.Operators.instanceofoperator;

public class Student
{
    String name;
    int rollNo;
    public  Student()
    {

    }

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
