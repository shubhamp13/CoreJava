package com.langpackage.objectclass.clone;

public class Student implements Cloneable
{
    private String name;
    private int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) throws CloneNotSupportedException
    {
        Student s1 = new Student(1, "John");
        Student s2=(Student) s1.clone();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2)); 
    }
    public boolean equals(Object obj)
    {
        if(obj instanceof Student)
        {
            Student s1=(Student)obj;
            if(s1.name.equals(this.name)&&s1.age == this.age)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
}
