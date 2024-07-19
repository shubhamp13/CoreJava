package com.newupdates.predefinedfunctionalinterfaces.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentGrades
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();
        addStudents(students);
        Function<Student,String> d=s->
        {
            if(s.getMarks()>80 && s.getMarks()<=100)
            {
                return "O[Distiction]";
            } else if (s.getMarks()>70&& s.getMarks()<=80)
            {
                return "A[First Class]";
            } else if (s.getMarks()>60&&s.getMarks()<=70)
            {
                return "B[Second Class]";
            }
            else if(s.getMarks()>50&&s.getMarks()<=60)
            {
                return "C[Third Class]";
            } else if (s.getMarks()>35&&s.getMarks()<=50)
            {
                return "D[Fourth Class]";
            }
            else if(s.getMarks()<=35)
            {
                return "F[Fail]";
            }
            else
            {
                return "Invalid Marks";
            }
        };

        Predicate<Student>p=s->s.getMarks()>60;
        Consumer<Student>c=s->
        {
            System.out.println("Student Name: "+s.getName());
            System.out.println("Student Roll No: "+s.getRollNo());
            System.out.println("Student Marks: "+s.getMarks());
            System.out.println("Grade: "+d.apply(s));
            System.out.println();
        };
        for(Student s:students)
        {
            if(p.test(s))
            {
                c.accept(s);
            }
        }

    }
    public static void addStudents(ArrayList<Student> students)
    {
        students.add(new Student("Shubham", 101, 80));
        students.add(new Student("Sia", 102, 95));
        students.add(new Student("John", 103, 48));
        students.add(new Student("Alice", 104, 172));
        students.add(new Student("Bob", 105, 60));
        students.add(new Student("Charlie", 106, 58));
        students.add(new Student("David", 107, 36));
        students.add(new Student("Eve", 108, 25));
        students.add(new Student("Frank", 109, 22));
        students.add(new Student("Grace", 110, 10));

    }
}
