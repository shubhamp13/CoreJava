package com.newupdates.predefinedfunctionalinterfaces.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeUtility
{
    public static void main(String[] args)
    {
        ArrayList<Employee>employees=new ArrayList<>();
        addEmployee(employees);

        Function<ArrayList<Employee>,Double>totalSalary= e->{
            double totalSal=0;
            for(Employee e1:e)
            {
                totalSal+=e1.getSalary();
            }
            return totalSal;

        };
        Predicate<Employee>p=e->e.getSalary()>50000;
        Function<Employee,Employee>bonus=e->{
           e.setSalary(e.getSalary()+100000);
            return e;
        };
        for(Employee e:employees)
        {
            if(p.test(e))
            {
                bonus.apply(e);
            }
        }
        Function<ArrayList<Employee>,Employee> maxSalary=e->
        {
//            Employee t=null;
//            double sal=e.get(0).getSalary();
//            for(Employee e1:e)
//            {
//                if(e1.getSalary()>sal)
//                {
//                    sal= e1.getSalary();
//                    t=e1;
//                }
//            }
//            return t;
//            Comparator<Employee>c=(e1,e2)->-Double.valueOf(e1.getSalary()).compareTo(e2.getSalary());
            Collections.sort(e,(e1,e2)->-Double.valueOf(e1.getSalary()).compareTo(e2.getSalary()));
            return e.get(0);
        };
        System.out.println("Total Salary Of employees "+totalSalary.apply(employees));
        System.out.println("Maximum Salary Of an Employee:"+maxSalary.apply(employees));


    }
    public static void addEmployee(ArrayList<Employee>e)
    {
        e.add(new Employee("Shubhamm",150000));
        e.add(new Employee("Shrikant",100000));
        e.add(new Employee("Sejal",300000));
        e.add(new Employee("Omkar",50000));
        e.add(new Employee("Narayani",15001));
    }
}
