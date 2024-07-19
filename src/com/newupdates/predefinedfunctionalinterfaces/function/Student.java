package com.newupdates.predefinedfunctionalinterfaces.function;

import java.util.Comparator;

public class Student
{
    private String name;
    private int marks;

    public Student( String name,int marks) {
        this.marks = marks;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
    public  boolean equals(Object o)
    {
        if (this == o) return true;
        if(o instanceof Student)
        {
            Student s = (Student)o;
            return s.marks == marks && s.name.equals(name);
        }
        return false;
    }
    public int hashCode()
    {
        return marks+name.hashCode();
    }
}
