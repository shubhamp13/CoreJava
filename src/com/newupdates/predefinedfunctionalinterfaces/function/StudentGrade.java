package com.newupdates.predefinedfunctionalinterfaces.function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class StudentGrade
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Shubham",75));
        students.add(new Student("Shrikant",55));
        students.add(new Student("Sejal",85));
        students.add(new Student("Omkar",25));
        students.add(new Student("Narayani",15));
        Comparator<Student>c=(s1,s2)-> -Integer.valueOf(s1.getMarks()).compareTo(s2.getMarks());
        Collections.sort(students,c);


        Function<Student,String>f=s->{
            int marks=s.getMarks();
            return marks>=80?"A[Distiction]":(marks>=60)?"B[First Class]":(marks>=50)?"C[Second Class]":(marks>=35)?"D[Third Class]":"E[Fail]";
        };
        for(Student s:students)
        {
            System.out.println("Name: "+s.getName());
            System.out.println("Marks: "+s.getMarks());
            System.out.println("Grade: "+f.apply(s));
            System.out.println("---------------------------------------------------------\n");
        }
    }


}
