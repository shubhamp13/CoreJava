package com.java.Operators.instanceofoperator;

public class Teacher
{
    String name;
    int id;
    public  Teacher()
    {

    }

    public Teacher(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
