package com.langpackage.objectclass.equals;

public class StudentEquals
{
    String name;
    int rollNo;

    public StudentEquals(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public static void main(String[] args)
    {
        StudentEquals s1 = new StudentEquals("Shubham Puri", 1);
        StudentEquals s2 = new StudentEquals("Shrikant", 2);
        StudentEquals s3 = new StudentEquals("Shubham Puri", 1);
        StudentEquals s4 = s1;

//        without overriding equals method
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals("durga"));
        System.out.println(s1.equals(null));
    }
    public boolean equals(Object obj)
    {
        try
        {
            StudentEquals s = (StudentEquals) obj;
            return name.equals(s.name) && rollNo == s.rollNo;
        }
        catch (ClassCastException | NullPointerException e)
        {
            return false;
        }

    }
}
