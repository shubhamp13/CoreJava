package com.collections.set.comparator.userdefined;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeDao
{
    public static void main(String[] args)
    {
        Employee employee1=new Employee("Shubham Puri", 101);
        Employee employee2=new Employee("Shrikant Surve", 105);
        Employee employee3=new Employee("Sejal Patankar", 102);
        Employee employee4=new Employee("Omkar Nagthane", 103);
        Employee employee5=new Employee("Ajay Kendre", 104);
        TreeSet<Employee> employees = new TreeSet<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        Iterator  iterator=employees.iterator();
        while (iterator.hasNext())
        {
            Employee employee=(Employee)iterator.next();
            System.out.println(employee);
        }

    }
}
