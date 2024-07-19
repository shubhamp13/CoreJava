package com.newupdates.predefinedfunctionalinterfaces.consumer;
public class Student
{
    private String name;
    private int rollNo;
    private int marks;
    public Student(String name, int rollNo, int marks)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
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

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)return true;
        if(obj instanceof Student)
        {
            Student student=(Student)obj;
            if(rollNo == student.rollNo&&name.equals(student.name))
            {
                return true;
            }
            return false;
        }
        return false;
    }
    public int hashCode()
    {
        return rollNo+name.hashCode();
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
